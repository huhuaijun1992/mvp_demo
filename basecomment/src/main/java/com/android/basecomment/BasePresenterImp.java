package com.android.basecomment;

public class BasePresenterImp <T extends BaseView> implements BasePresenter<T> {
   protected T view;

    @Override
    public void attachView(T view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }
}