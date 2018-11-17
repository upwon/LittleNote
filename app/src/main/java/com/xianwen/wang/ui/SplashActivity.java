package com.xianwen.wang.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.xianwen.wang.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
/**
 * 通信卓越151
 * 王先文
 * Email:wangxianwenup@gmail.com
 * 20181112
 *
 */


//启动页

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.splash_tv_tip)
    TextView splashTvTip;
    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bind = ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        String[] tips = {
                "空山新雨后，天气晚来秋。",
                "人生如逆旅，我亦是行人。",
                "知之知之名知音，知音知音兰契深。",
                "有美人兮，见之不忘，一日不见兮，思之如狂。",
                "凄凉别後两应同，最是不胜清怨月明中。",
                "似此星辰非昨夜，为谁风露立中宵。",
                "落花人独立，微雨燕双飞。",
                "一往情深深几许。深山夕照深秋雨。",
                "谁念西风独自凉，萧萧黄叶闭疏窗，沉思往事立残阳。被酒莫惊春睡重，赌书消得泼茶香，当时只道是寻常。",
                "明月多情应笑我，笑我如今。辜负春心，独自闲行独自吟。近来怕说当年事，结遍兰襟。月浅灯深，梦里云归何处寻?"
        };
        int random = new Random().nextInt(tips.length);
        splashTvTip.setText(tips[random]);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();
            }
        }, 4000);  //启动页延时4秒
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}
