package com.example.edmund.workoutdemo;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.edmund.workoutdemo.R;

public class WorkoutDetailFragment extends Fragment {

    private long workoutId;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        String[] title_txt = getActivity().getResources().getStringArray(R.array.the_workout);
        String[] details_txt = getActivity().getResources().getStringArray(R.array.the_details);

        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            title.setText(title_txt[(int) workoutId]);
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(details_txt[(int) workoutId]);
        }
    }
    public void setWorkout(long id) {
        this.workoutId = id;
    }
}
