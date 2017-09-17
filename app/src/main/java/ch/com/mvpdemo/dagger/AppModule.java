package ch.com.mvpdemo.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/9/16.
 */

@Module(subcomponents = {ViewComponent.class})
public class AppModule {

    private Context appContent;

    public AppModule(Context appContent) {
        this.appContent = appContent;
    }

    @Provides
    public Context provideContent() {
        return appContent;
    }

}
