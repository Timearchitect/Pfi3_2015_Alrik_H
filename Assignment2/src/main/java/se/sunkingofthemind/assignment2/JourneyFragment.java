package se.sunkingofthemind.assignment2;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class JourneyFragment extends Fragment {
    private final static String TAG_FRAGMENT = "TAG_FRAGMENT";

  /* public void onBackPressed() {

       // Log.i("sadasd","back btn");
     //  Toast t = Toast.makeText(getActivity(), "back", Toast.LENGTH_SHORT);
      //  t.show();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        StartFragment sf= new StartFragment();
        // byt layout till fragment2
        ft.replace(R.id.StartScreen,sf);
        ft.commit();


        //    FragmentManager fm = getActivity().getSupportFragmentManager();
        //  fm.popBackStack();

   }*/

    public JourneyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
      //  FragmentActivity activity = (FragmentActivity) getActivity();
      // ((MainActivity)activity).setOnBackPressedListener(new BaseBackPressedListener(activity));


        final View view=inflater.inflate(R.layout.fragment_journeyplanner, container, false);

        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        radioGroup.clearCheck();


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if(null!=rb && checkedId > -1){
                   // Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(container.getContext(), rb.getText(), Toast.LENGTH_SHORT).show();
                    Log.i("yoyy","works radiobtn");
                }

            }
        });


        // Inflate the layout for this fragment

        return view;
    }



}
