package se.sunkingofthemind.assignment3;


import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.Spinner;

import java.util.ArrayList;

import se.sunkingofthemind.assignment3.model.Journey;
import se.sunkingofthemind.assignment3.view.TestActivity;
import se.sunkingofthemind.assignment3.xmlparser.MyAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class JourneyPlanner extends Fragment implements AdapterView.OnItemSelectedListener{
    private ArrayList<Journey> myItems = new ArrayList<Journey>();
    private MyAdapter myAdapter;
    public JourneyPlanner() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_journey_planner, container, false);
        ///Do whatever
        ExpandableListView ev = (ExpandableListView) v.findViewById(R.id.expandableListView);
        myAdapter = new MyAdapter(getActivity(),myItems);
        ev.setAdapter(myAdapter);
        //MyAsyncTask myAsyncTask = new MyAsyncTask();
        //myAsyncTask.execute("KD323B-20151-K3522");
        Spinner sp = (Spinner)v.findViewById(R.id.spinner); // spinner2 på fragmnt
        sp.setOnItemSelectedListener(this);
        return v;
    }

    ///Listens to meny selection.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Log.i("ExpFragment", "MenuSelection. " + id);
        if (id == R.id.refresh) {
            Spinner sp = (Spinner)getView().findViewById(R.id.spinner2);
            int i = sp.getSelectedItemPosition();
            String[] sa = getActivity().getResources().getStringArray(R.array.stations);
            String station = sa[i];
            MyAsyncTask myAsyncTask = new MyAsyncTask();
            myAsyncTask.execute(station);
            return true;
        }else {
            return super.onOptionsItemSelected(item);
        }
    }

    //Listens to the spinner
   // @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Log.i("onItemSelected","item id");
        String[] stations = getActivity().getResources().getStringArray(R.array.stations);
        String station = stations[position];
        Log.i("ExpFragment", "station. " + station);
        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute(station);
    }
    //@Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    //And the thread
    private class MyAsyncTask extends AsyncTask<String,Void,Void> {

        @Override
        protected Void doInBackground(String... params) {
            String param1 =  params[0];
            myItems.clear();
            //myItems.addAll(Parser.getJourney(params[0])); // new functin returns arraylist
            myItems.addAll(TestActivity.journeyList);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            myAdapter.notifyDataSetChanged();
            for (Journey si :myItems){
                Log.i("ExpFragment", "moment" + si.getStartStation());
            }
        }
    }
}
