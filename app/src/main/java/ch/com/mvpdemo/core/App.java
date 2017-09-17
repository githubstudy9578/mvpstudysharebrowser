package ch.com.mvpdemo.core;

import android.app.Application;

import ch.com.mvpdemo.dagger.AppComponent;
import ch.com.mvpdemo.dagger.AppModule;
import ch.com.mvpdemo.dagger.DaggerAppComponent;
import ch.com.mvpdemo.dagger.DataModule;

/**
 * Created by admin on 2017/9/16.
 */

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .dataModule(new DataModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
