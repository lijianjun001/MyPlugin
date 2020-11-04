package com.antelope.pluginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.antelope.pluginframework.BaseActivity;

/**
 * @author lijianjun
 * @description:
 * @date :2020/11/4 11:14 AM
 */
public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //这里是启动第二个activity
        findViewById(R.id.mBtnStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(that, SecondActivity.class);
                //这里其实调用父类的 最终会调用宿主里面的startActivity方法，下面会对其进行重写
                startActivity(intent);
            }
        });
    }
}
