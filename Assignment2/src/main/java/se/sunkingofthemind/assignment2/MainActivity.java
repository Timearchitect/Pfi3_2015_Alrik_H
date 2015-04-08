package se.sunkingofthemind.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final View layout =findViewById(R.id.imageView);
        final View layout2 =findViewById(R.id.imageView2);
        final View layout3 =findViewById(R.id.imageView3);
        final View layout4 =findViewById(R.id.imageView4);

        layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("sadasd","layout");
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("sadasd","layout2");
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("sadasd","layout3");
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("sadasd","layout4");
            }
        });
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

    public void onclick(){

    }
}
