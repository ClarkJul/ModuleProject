package com.mobiledrivetech.main;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mobiledrivetech.base.BaseActivity;

@Route(path = "/main/MainActivity")
public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEventAndData() {
        super.initEventAndData();

        findViewById(R.id.btn_module_first).setOnClickListener(this);
        findViewById(R.id.btn_module_second).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btn_module_first){
            goToNextActivity("/first/FirstMainActivity");
        }else if (view.getId()==R.id.btn_module_second){
            goToNextActivity("/second/SecondMainActivity");
        }
    }

    private void goToNextActivity(String activityFlag){
        ARouter.getInstance()
                .build(activityFlag)
                .navigation();
    }
}
