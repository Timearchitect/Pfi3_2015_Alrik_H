package se.sunkingofthemind.assignment4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import se.sunkingofthemind.assignment4.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlanetInfo extends Fragment {
    TextView title;
    TextView radius;
    TextView temp;
    ImageView  image ;
    Planet currentplanet;
    public PlanetInfo() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_planet_info, container, false);

        title = (TextView) v.findViewById(R.id.planetTitle_TV);
        radius = (TextView) v.findViewById(R.id.radius_TV);
        temp = (TextView) v.findViewById(R.id.temp_TV);
        image = (ImageView) v.findViewById(R.id.planetProfile);

        title.setText(currentplanet.getTitle());
        radius.setText(currentplanet.getRadie()+" km");
        temp.setText(currentplanet.getTemp()+" °C");
        image.setImageResource(R.drawable.mars);
        return v;
    }


}
