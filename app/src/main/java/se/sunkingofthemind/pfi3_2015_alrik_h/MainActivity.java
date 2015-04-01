package se.sunkingofthemind.pfi3_2015_alrik_h;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.util.Random;


public class MainActivity extends ActionBarActivity {
    public int citatIndex=0;
    public Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Button Btn = new Button(this);
        setContentView(R.layout.activity_main);

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


    public void generateQuote(View v){
        String[] quotes = getResources().getStringArray(R.array.quotes);
        TextView myText = (TextView) findViewById(R.id.textView3);
        TextView myText2 = (TextView) findViewById(R.id.textView2);
        myText2.setText(R.string.clickmore);
        myText.setText(quotes[citatIndex]);
        citatIndex=r.nextInt(quotes.length);

        Log.i("assignmet_1","test");


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("assignmet_1","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("assignmet_1","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("assignmet_1","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("assignmet_1","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("assignmet_1","onDestroy");
    }



}
