package com.luftsoft.examandroid.Utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.luftsoft.examandroid.App.App;


public class SharedPreferencesManager {
    private static final String APP_SETTINGS_FILE = "Exam_SETTINGS";

    private SharedPreferencesManager() {}

    private static SharedPreferences getSharedPreferences() {
        return App.getContext()
                .getSharedPreferences(APP_SETTINGS_FILE, Context.MODE_PRIVATE);
    }

    public static void setSomeStringValue(String dataLabel, String dataValue) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(dataLabel, dataValue);
        editor.commit();
    }

    public static void setSomeintValue(String dataLabel, int dataValue) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(dataLabel, dataValue);
        editor.commit();
    }

    public static void setSomeBooleanValue(String dataLabel, boolean dataValue) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putBoolean(dataLabel, dataValue);
        editor.commit();
    }

    public static String getSomeStringValue(String dataLabel) {
        return getSharedPreferences().getString(dataLabel, null);
    }

    public static int getSomeIntValue(String dataLabel) {
        return getSharedPreferences().getInt(dataLabel, 0);
    }

    public static boolean getSomeBooleanValue(String dataLabel) {
        return getSharedPreferences().getBoolean(dataLabel, false);
    }

}
