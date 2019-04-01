package com.android.basecomment;

public interface BasePresenter<T extends BaseView> {
    void  attachView(T attachView);
    void detachView();
}
