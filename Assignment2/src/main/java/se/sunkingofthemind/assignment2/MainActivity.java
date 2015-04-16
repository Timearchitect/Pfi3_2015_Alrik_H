package se.sunkingofthemind.assignment2;

import android.animation.AnimatorSet;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    StartFragment sf = new StartFragment();
  /*  protected OnBackPressedListener onBackPressedListener;
    public void setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
    }
    @Override
    public void onBackPressed() {
        if (onBackPressedListener != null)
            onBackPressedListener.doBack();
        else
            super.onBackPressed();
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Skapa fragmentmanager
        FragmentManager fm = getFragmentManager();
        // skapa fragmenttransaction
        FragmentTransaction ft = fm.beginTransaction();
        // StartFragment sf = new StartFragment();

        ft.addToBackStack(null);
        ft.replace(R.id.StartScreen, sf);
        ft.commit();


    }
  /*  public Void onCreateOptionsMenu(){


      return
    }*/

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
      /*  if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    public void onclick(){

    }





    /*



    public void onBackPressed() {
        if(sf.getView().isShown()){
            Log.i("sadasd","layout4");
           // Toast t = Toast.makeText(this, "Tickets", Toast.LENGTH_SHORT);
      //      t.show();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        StartFragment sf= new StartFragment();
        // byt layout till fragment2
        ft.replace(R.id.StartScreen,sf);
        ft.commit();

    }*/
}
