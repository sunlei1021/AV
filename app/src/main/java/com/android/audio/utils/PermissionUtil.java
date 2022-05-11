package com.android.audio.utils;

import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;

public class PermissionUtil {

    public static final String[] permissions = {
            "android.permission.WRITE_EXTERNAL_STORAGE"
            ,"android.permission.READ_EXTERNAL_STORAGE"
            ,"android.permission.RECORD_AUDIO"};

    public static void checkPermissions(Context context){
        for (String permission : permissions){

            if (!isPermissionGranted(context,permission)){

            }
        }

    }

    private static boolean isPermissionGranted(Context context, String permission){
        if (ContextCompat.checkSelfPermission(context,permission)
                == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }

    }
}
