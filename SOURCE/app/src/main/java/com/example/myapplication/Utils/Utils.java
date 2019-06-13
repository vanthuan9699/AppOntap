package com.example.myapplication.Utils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class Utils {
    public static String loadJson(Context context, String json) {

        String str = null;
        try {
            InputStream is = context.getAssets().open(json);
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
