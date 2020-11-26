package com.luftsoft.examandroid.Utils;

import android.content.SharedPreferences;

public class Utils {

    public  static String BASE_URL="localhost/api";
    public static String getUserMailPrefs(SharedPreferences pref){
        return pref.getString("email","");//
    }




}
