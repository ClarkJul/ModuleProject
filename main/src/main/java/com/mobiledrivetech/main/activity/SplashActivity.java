package com.mobiledrivetech.main.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mobiledrivetech.base.BaseActivity;
import com.mobiledrivetech.main.R;

public class SplashActivity extends BaseActivity {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEventAndData() {
        super.initEventAndData();
        gotoMainActivity();
    }

    private void gotoMainActivity() {
        ARouter.getInstance().build("/main/MainActivity").navigation();
        finish();
    }
}
