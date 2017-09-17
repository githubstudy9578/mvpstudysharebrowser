package ch.com.mvpdemo.dagger;

import ch.com.mvpdemo.MainActivity;
import ch.com.mvpdemo.core.IBaseView;
import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by admin on 2017/9/17.
 */

@Subcomponent(modules = {PresenterModule.class})
public interface ViewComponent {

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder view(IBaseView view);

        ViewComponent build();
    }
}
