package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

// (1) Create a class called ReminderTasks
public class    ReminderTasks{

// (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT
    public static final String ACTION_INCREMENT_WATER_COUNT = "action_water_increment";

// (6) Create a public static void method called executeTask
    public static void executeTask(Context context, String action){
        if (ACTION_INCREMENT_WATER_COUNT.contentEquals(action))
            incrementWaterCount(context);
    }

    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
    }
// (7) Add a Context called context and String parameter called action to the parameter list

// (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount

// (3) Create a private static void method called incrementWaterCount
// (4) Add a Context called context to the argument list
// (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count

}

