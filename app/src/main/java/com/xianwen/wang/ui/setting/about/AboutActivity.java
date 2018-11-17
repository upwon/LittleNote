package com.xianwen.wang.ui.setting.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.xianwen.wang.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;
/**
 * 通信卓越151
 * 王先文
 * Email:wangxianwenup@gmail.com
 * 20181112
 *
 */
public class AboutActivity extends AppCompatActivity {


    TextView aboutTvSupport;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        unbinder = ButterKnife.bind(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
