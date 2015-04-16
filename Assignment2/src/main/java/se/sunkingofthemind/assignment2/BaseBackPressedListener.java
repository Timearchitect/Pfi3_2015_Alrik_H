package se.sunkingofthemind.assignment2;

import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Alrik on 2015-04-16.
 */

public class BaseBackPressedListener implements OnBackPressedListener {
    private final FragmentActivity activity;

    public BaseBackPressedListener(FragmentActivity activity) {
        this.activity = activity;
    }

    @Override
    public void doBack() {
        activity.getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}