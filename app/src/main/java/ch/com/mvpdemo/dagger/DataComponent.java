package ch.com.mvpdemo.dagger;

import ch.com.mvpdemo.MainActivity;
import dagger.Component;

/**
 * Created by admin on 2017/9/16.
 */

@Component
public interface DataComponent {
    void inject(MainActivity mainActivity);
}
