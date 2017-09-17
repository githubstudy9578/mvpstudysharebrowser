package ch.com.mvpdemo;

import android.content.Context;

import javax.inject.Inject;

import ch.com.mvpdemo.core.App;
import ch.com.mvpdemo.core.IBasePresenter;
import ch.com.mvpdemo.m.DataManager;

/**
 * Created by admin on 2017/9/17.
 */

public class MainPresenter implements IBasePresenter {

    private IMainView view;

    @Inject
    DataManager dataManager;

    @Inject
    Context appContext;

    public MainPresenter(IMainView view) {
        this.view = view;
        ((App) ((MainActivity) view).getApplication())
                .getAppComponent().inject(this);
    }

    public void getData() {
        String data = dataManager.getDataTest();
        view.refresh(data + appContext.toString());
    }
}
