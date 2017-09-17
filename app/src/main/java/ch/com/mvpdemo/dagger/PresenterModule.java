package ch.com.mvpdemo.dagger;

import ch.com.mvpdemo.IMainView;
import ch.com.mvpdemo.MainPresenter;
import ch.com.mvpdemo.core.IBaseView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/9/17.
 */

@Module
public class PresenterModule {

    @Provides
    public MainPresenter provideMainPresenter(IBaseView view) {
        return new MainPresenter(((IMainView) view));
    }
}
