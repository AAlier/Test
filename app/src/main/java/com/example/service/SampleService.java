package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.LinkedList;
import java.util.Queue;

public class SampleService extends Service {
    private final String TAG = SampleService.class.getSimpleName();
    private Queue<String> queue = new LinkedList<>();

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String url = intent.getStringExtra("url");
        queue.add(url);
        startDownloadingImage();
        return super.onStartCommand(intent, flags, startId);
    }

    // 5 6
    private void startDownloadingImage() {
        if (queue.isEmpty()) {
            Log.i(TAG, "empty list");
            stopSelf();
            return;
        }
        String url = queue.poll();
        Log.i(TAG, "start loading " + url);
        try {
            // Ожидание в 5 секунд
            Thread.sleep(5000);
            Log.i(TAG, "stop loading " + url);
            startDownloadingImage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}