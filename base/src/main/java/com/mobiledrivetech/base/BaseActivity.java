package com.mobiledrivetech.base;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;

    @Override
    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        mContext = this;
        initView();
        initEventAndData();
    }

    protected abstract int getLayoutResId();

    protected abstract void initView();

    protected void initEventAndData() {

    }
}
