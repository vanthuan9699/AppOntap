package com.example.myapplication.Utils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class Utils {
    public static String loadJsonContact(Context context){

        String str = null;
        try {
            InputStream is = context.getAssets().open("Contact.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            str = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return str;
    }
    public static String loadJsonPlace(Context context){

        String str = null;
        try {
            InputStream is = context.getAssets().open("Place.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            str = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return str;
    }

    public static String loadJsonPromo(Context context){

        String str = null;
        try {
            InputStream is = context.getAssets().open("Promotion.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            str = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return str;
    }
}
