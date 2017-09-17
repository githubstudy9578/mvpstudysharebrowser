package ch.com.mvpdemo.dagger;

import ch.com.mvpdemo.MainPresenter;
import dagger.Component;

/**
 * Created by admin on 2017/9/16.
 */

@Component(modules = {AppModule.class, DataModule.class})
public interface AppComponent {
    ViewComponent.Builder taskViewComponent();

    void inject(MainPresenter presenter);
}
