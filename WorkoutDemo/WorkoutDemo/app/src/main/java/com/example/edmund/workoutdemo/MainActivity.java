package com.example.edmund.workoutdemo;
import android.app.Activity;
import android.os.Bundle;
import android.app.FragmentTransaction;

import com.example.edmund.workoutdemo.R;
import com.example.edmund.workoutdemo.Workout;
import com.example.edmund.workoutdemo.WorkoutDetailFragment;
import com.example.edmund.workoutdemo.WorkoutListFragment;

public class MainActivity extends Activity
        implements WorkoutListFragment.WorkoutListListener {

    private String[] title;
    private String[] details;

    private Workout[] workout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void itemClicked(long id) {
        WorkoutDetailFragment details = new WorkoutDetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setWorkout(id);
        ft.replace(R.id.fragment_container, details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}