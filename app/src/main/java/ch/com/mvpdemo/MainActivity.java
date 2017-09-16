package ch.com.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ch.com.mvpdemo.dagger.DaggerDataComponent;
import ch.com.mvpdemo.m.DataManager;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.text)
    TextView text;

    @Inject
    DataManager dataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerDataComponent.create().inject(this);
        ButterKnife.bind(this);

        text.setText(dataManager.getDataTest());
    }
}
