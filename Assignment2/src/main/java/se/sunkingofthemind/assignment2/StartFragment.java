package se.sunkingofthemind.assignment2;

import android.animation.AnimatorSet;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class StartFragment extends Fragment {


    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_start, container, false);

        final View layout =view.findViewById(R.id.journeyPlanner);
        final View layout2 =view.findViewById(R.id.timetables);
        final View layout3 =view.findViewById(R.id.departures);
        final View layout4 =view.findViewById(R.id.tickets);

        layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("sadasd","layout");
                Toast t = Toast.makeText(getActivity(), "Journey planner", Toast.LENGTH_SHORT);
                t.show();

                JourneyFragment jf= new JourneyFragment();
                FragmentManager fm = getFragmentManager();


                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.StartScreen,jf);
                ft.addToBackStack(null);
                ft.commit();


            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("sadasd", "layout2");
                Toast t = Toast.makeText(getActivity(), "Timetables", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("sadasd","layout3");
                Toast t = Toast.makeText(getActivity(), "Departures", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("sadasd","layout4");
                Toast t = Toast.makeText(getActivity(), "Tickets", Toast.LENGTH_SHORT);
                t.show();
            }
        });









        return view;
    }





}
