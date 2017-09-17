package ch.com.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ch.com.mvpdemo.core.App;
import ch.com.mvpdemo.m.DataManager;

public class MainActivity extends AppCompatActivity implements IMainView {


    @BindView(R.id.text)
    TextView text;

    @Inject
    MainPresenter mPresenter;

    @Inject
    DataManager manager;
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((App) getApplication()).getAppComponent()
                .taskViewComponent()
                .view(this)
                .build()
                .inject(this);

        String dataTest = manager.getDataTest();
        Log.e(TAG, "onCreate: " + dataTest);
        mPresenter.getData();
    }

    @Override
    public void refresh(String data) {
        text.setText(data);
        Log.e(TAG, "refresh: " + data );
    }
}
