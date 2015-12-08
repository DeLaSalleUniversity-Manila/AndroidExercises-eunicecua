package com.example.edmund.pickerfragement;

/**
 * Created by Edmund on 12/8/2015.
 */
import android.widget.TextView;

public interface ActivityInterface {

    // Displays the date picker and day
    public void pickDateDisplayDay();

    // Sets the TextView to message
    public void setText(String message);

    // Adds fade animation to the text
    public void fadeAnimation(TextView tv);

}