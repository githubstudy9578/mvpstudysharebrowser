package ch.com.mvpdemo.dagger;

import ch.com.mvpdemo.m.DataManager;
import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/9/16.
 */

@Module
public class DataModule {

    @Provides
    DataManager provideDataManager() {
        return new DataManager();
    }
}
