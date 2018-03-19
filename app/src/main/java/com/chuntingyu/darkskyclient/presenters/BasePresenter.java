package com.chuntingyu.darkskyclient.presenters;

import android.content.Context;

import com.chuntingyu.darkskyclient.models.DataManager;
import com.chuntingyu.darkskyclient.views.MvpView;

/**
 * Created by Kevin on 2018/3/14.
 */
public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;


    public BasePresenter(DataManager dataManager){
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}