package com.example.testbluetoothdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.sdk.BluetoothData;
import com.example.sdk.GyroDataCallback;
import com.example.sdk.GyroSdkManager;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {


        GyroSdkManager.getInstance().setGyroDataCallback(new GyroDataCallback() {
            @Override
            public void onConnected(String s) {
                Log.e(TAG, "onConnected: ");
            }

            @Override
            public void onConnecting() {
                Log.e(TAG, "onConnecting: ");
            }

            @Override
            public void onDisconnect() {
                Log.e(TAG, "onDisconnect: ");
            }

            @Override
            public void onData(BluetoothData bluetoothData) {
                Log.e(TAG, "onData: ");
            }

            @Override
            public void onSelectedButton(int i) {
                Log.e(TAG, "onSelectedButton: ");
            }
        });

        GyroSdkManager.getInstance().startBluetoothActivity(this);

    }
}