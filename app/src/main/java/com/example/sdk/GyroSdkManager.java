package com.example.sdk;

import android.content.Context;
import android.content.Intent;

import com.example.DataMonitor;

public class GyroSdkManager {

    private static GyroSdkManager instance = null;
    private GyroDataCallback callback;
    private Context context;


    private GyroSdkManager() {

    }

    public static GyroSdkManager getInstance() {
        if (instance == null) {
            synchronized (GyroSdkManager.class) {
                if (instance == null) instance = new GyroSdkManager();
            }
        }
        return instance;
    }

    public void startBluetoothActivity(Context context) {
        Intent intent = new Intent(context, DataMonitor.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }

    public void setGyroDataCallback(GyroDataCallback callback) {
        this.callback = callback;
    }

    public GyroDataCallback getCallback() {
        return callback;
    }

}
