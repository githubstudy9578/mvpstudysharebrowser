package ch.com.mvpdemo.m;

import javax.inject.Inject;

/**
 * Created by admin on 2017/9/16.
 */

public class DataManager {

    @Inject
    public DataManager() {

    }

    public String getDataTest() {
        return "data test";
    }
}
