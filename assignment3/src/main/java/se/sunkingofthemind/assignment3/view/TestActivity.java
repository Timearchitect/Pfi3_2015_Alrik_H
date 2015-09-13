package se.sunkingofthemind.assignment3.view;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import se.sunkingofthemind.assignment3.JourneyPlanner;
import se.sunkingofthemind.assignment3.R;
import se.sunkingofthemind.assignment3.control.Constants;
import se.sunkingofthemind.assignment3.model.Journey;
import se.sunkingofthemind.assignment3.model.Journeys;
import se.sunkingofthemind.assignment3.xmlparser.Parser;


public class TestActivity extends Activity { // ActionBarActivity
    private List<Journey> foundItem = new ArrayList<Journey>();
    public static ArrayList<Journey> journeyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     /*   setContentView(R.layout.activity_test);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.StartScreen, new JourneyPlanner());
        ft.commit();*/


        setContentView(R.layout.fragment_journey_planner);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        JourneyPlanner sf = new JourneyPlanner();
        ft.commit();



     /*   journeyList = new ArrayList<Journey>();
        View v = findViewById(R.id.btn_search);
        v. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onClick_BTN", "search");
                String searchURL = Constants.getURL("80000", "93070", 10); //Malmö C = 80000,  Malmö GAtorg 80100, Hässleholm C 93070
                new DoInBackground().execute(searchURL);
            }
        });*/


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar
        Log.i("main", "inflate. ");
        getMenuInflater().inflate(R.menu.menu_test, menu);

        return true;
    }
    ///Listens to meny selection.
    //@Override
    /*public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Log.i("ExpFragment", "MenuSelection. " + id);
        if (id == R.id.refresh) {
            Spinner sp = (Spinner)getView().findViewById(R.id.spinner);
            int i = sp.getSelectedItemPosition();
            String[] sa = getActivity().getResources().getStringArray(R.array.courses);
            String course = sa[i];
            MyAsyncTask myAsyncTask = new MyAsyncTask();
            String searchURL = Constants.getURL("80000", "93070", 10); //Malmö C = 80000,  Malmö GAtorg 80100, Hässleholm C 93070
            myAsyncTask.execute(course);
            return true;
        }else {
            return super.onOptionsItemSelected(item);
        }
    }*/


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();
        Log.i("hejsan", "menu " + id);
        //noinspection SimplifiableIfStatement

        if (id == R.id.refresh) {
            Log.i("hejsan", "refresh");
            return true;
        }
        if (id == R.id.item3) {
            Log.i("hejsan", "search");
            return true;
        }
        if (id == R.id.action_settings) {
            Log.i("hejsan", "settigs ");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
/*
   private void searchFinished(){
        Log.i("hejsan","yeas");
       TextView tw = (TextView)findViewById(R.id.textView);
        tw.setText("");
        for (Journey j: journeyList){
            tw.append("From"+ j.getStartStation().getStationName()
                    +" To: "+ j.getEndStation()
                    + " leaves : "+j.getTimeToDeparture()+ "\n");

        }
    }

//This is a AsyncTask Thread built for Android
    private class DoInBackground extends AsyncTask<String,Void,Long> {
        @Override
        protected Long doInBackground(String... params) {
             //Search
            Log.i("hejsan","Fire");
            Journeys journeys = Parser.getJourneys(params[0]); //There can be many in the params Array
            //And put the Journeys in our list.
            journeyList.clear();
            journeyList.addAll(journeys.getJourneys());
            return null;
        }

        @Override
        protected void onPostExecute(Long result) { //Called when the AsyncTask is all done
            searchFinished();
        }
    }
}*/
