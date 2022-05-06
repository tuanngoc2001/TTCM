package com.example.ttcm.data;

import android.content.Context;
import android.widget.Toast;

public class ShowLienHe {
    public static void Notify(Context context, String notify) {
        Toast.makeText(context, notify, Toast.LENGTH_SHORT).show();
    }
}
