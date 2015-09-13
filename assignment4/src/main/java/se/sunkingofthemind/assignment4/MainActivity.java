package se.sunkingofthemind.assignment4;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
   public static int currentPlanet;
     public static ArrayList<Planet> planets = new ArrayList<Planet>(

    );
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.fragment_solar_system);
         setContentView(R.layout.activity_main);
        Drawable[] image=new Drawable[8];
        image[0] =getResources().getDrawable(R.drawable.mars);
        String[] name = getResources().getStringArray(R.array.planets);
        for(int i =0; i<8; i++) {
            planets.add(new Planet(name[i], 60, 1000, image[0],
            i));
        }



     /*  if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.solar_system, null)
                    .commit();
        }*/
      /*  FragmentManager fm = getFragmentManager();
      // FragmentTransaction ft = (Fragment) getSupportFragmentManager().beginTransaction();
        FragmentTransaction ft = fm.beginTransaction();



        ft.replace(R.id.solar_system, sf);
        ft.commit();*/


        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        SolarSystem sf = new SolarSystem();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.startScreen, sf);

        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openInfo(View v){
       int ID =v.getId();
       // String ID =R.id.ID.
        TextView tv = (TextView) findViewById(ID);
        Toast.makeText(MainActivity.this,"Planets name "+tv.getText(), Toast.LENGTH_SHORT).show();
        Log.i("FragmentWithList", "Clicked on position: "+tv.getText());

      //  currentPlanet= ID;

       // Bundle b = new Bundle();
       // b.putSerializable("book",books.get(position));
        // fd.setArguments(b);
        // fd.show(fm,"Dialog");

         //title.setText("asdadfssdfd");
        //  radius.setText("asdasd");
        // temp.setText("asasd");
        FragmentManager fm = getFragmentManager();
         PlanetInfo pi = new PlanetInfo();
        pi.currentplanet=planets.get(3);



        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.startScreen, pi);
        fragmentTransaction.commit();
    }




}
