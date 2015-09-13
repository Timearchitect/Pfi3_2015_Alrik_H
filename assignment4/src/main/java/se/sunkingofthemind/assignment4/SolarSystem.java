package se.sunkingofthemind.assignment4;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class SolarSystem extends Fragment {

    public SolarSystem() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_solar_system,
                container, false);
        return view;
    }

    /*public void openInfo(View v){
        Toast mytoast=new Toast(v.getContext());

        mytoast.setView(v);
        mytoast.setText("yeiyafod");
        mytoast.setDuration(Toast.LENGTH_LONG);
        mytoast.show();
    }*/

}
