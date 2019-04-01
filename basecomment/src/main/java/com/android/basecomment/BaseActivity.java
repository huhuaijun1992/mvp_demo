package com.android.basecomment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

public abstract class BaseActivity <T extends BasePresenter> extends FragmentActivity implements BaseView {
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (0!=getContentViewId()){
           setContentView(getContentViewId());
        }
        setPresenter();
        if (presenter!=null) presenter.attachView(this);
        initView();
        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public abstract void initData();

    public abstract void initView();

    public abstract int getContentViewId();


}











