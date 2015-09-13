package se.sunkingofthemind.assignment3.xmlparser;


import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import java.util.ArrayList;

import se.sunkingofthemind.assignment3.R;
import se.sunkingofthemind.assignment3.model.Journeys;
import se.sunkingofthemind.assignment3.view.TestActivity;
import se.sunkingofthemind.assignment3.model.Journey;


/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class ExpFragment extends Fragment implements AdapterView.OnItemSelectedListener{

    private ArrayList<Journey> myItems = new ArrayList<Journey>();
    private MyAdapter myAdapter;
    public ExpFragment() {
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
        Spinner sp = (Spinner)v.findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);
        return v;
    }

    ///Listens to meny selection.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Log.i("ExpFragment", "MenuSelection. " + id);
        if (id == R.id.refresh) {
            Spinner sp = (Spinner)getView().findViewById(R.id.spinner);
            int i = sp.getSelectedItemPosition();
            String[] sa = getActivity().getResources().getStringArray(R.array.courses);
            String course = sa[i];
            MyAsyncTask myAsyncTask = new MyAsyncTask();
            myAsyncTask.execute(course);
            return true;
        }else {
            return super.onOptionsItemSelected(item);
        }
    }

    //Listens to the spinner
  @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String[] courses = getActivity().getResources().getStringArray(R.array.courses);
            String course = courses[position];
            Log.i("ExpFragment", "Course. " + course);
            MyAsyncTask myAsyncTask = new MyAsyncTask();
            myAsyncTask.execute(course);
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Log.i("asyncTask","nothing");
    }

    //And the thread
    private class MyAsyncTask extends AsyncTask<String,Void,Void>{

        @Override
        protected Void doInBackground(String... params) {
            Log.i("asyncTask","doinbackground");
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
