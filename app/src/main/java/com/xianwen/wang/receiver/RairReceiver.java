package com.xianwen.wang.receiver;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.xianwen.wang.R;
import com.xianwen.wang.utils.RairUtils;
import com.xianwen.wang.base.RairApp;
import com.xianwen.wang.constant.Constants;
import com.xianwen.wang.ui.MainActivity;

import java.util.Calendar;

/**
 * 通信卓越151
 * 王先文
 * Email:wangxianwenup@gmail.com
 * 20181112
 *
 */

//设置提醒写日记


public class RairReceiver extends BroadcastReceiver {

    private Calendar calendar = Calendar.getInstance();

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Constants.REMIND_RECEIVER)) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            int h = calendar.get(Calendar.HOUR_OF_DAY);
            int m = calendar.get(Calendar.MINUTE);
            String setTime = RairApp.getRairApp().getSpUtils().getString("setTime");
            if ((RairUtils.format(h) + RairUtils.format(m)).equals(setTime)) {
                showNotification(context);
                return;
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void showNotification(Context context) {
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent notificationIntent = new Intent(context, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);
        Notification notification = new Notification.Builder(context)
                .setContentTitle("提醒")
                .setContentText("时间到了，该写日记了哦")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(contentIntent)
                .build();
        // 指定通知可以清除
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        // 指定通知不能清除
//        notification.flags |= Notification.FLAG_NO_CLEAR;
        // 通知显示的时候播放默认声音
        notification.flags |= Notification.FLAG_SHOW_LIGHTS;
        //设置声音
        notification.defaults |= Notification.DEFAULT_SOUND;
        //设置LED灯
        notification.defaults |= Notification.DEFAULT_LIGHTS;
        manager.notify(1, notification);
    }
}
