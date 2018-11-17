package com.xianwen.wang.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.xianwen.wang.constant.Constants;

/**
 * 通信卓越151
 * 王先文
 * Email:wangxianwenup@gmail.com
 * 20181112
 *
 */

public class RemindService extends Service {

    private static RemindService remindService;

    @Override
    public void onCreate() {
        super.onCreate();
        remindService = this;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        sendBroadcast(new Intent(Constants.SET_RECEIVER));
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(60000);
                        sendBroadcast(new Intent(Constants.REMIND_RECEIVER));
                    } catch (Exception e) {
                    }
                }
            }
        }).start();
        return super.onStartCommand(intent, flags, startId);
    }
}
