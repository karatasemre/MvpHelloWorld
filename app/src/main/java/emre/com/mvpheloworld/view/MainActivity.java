package emre.com.mvpheloworld.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import emre.com.mvpheloworld.R;
import emre.com.mvpheloworld.contract.MainActivityContract;
import emre.com.mvpheloworld.contract.MainActivityContract.Presenter;
import emre.com.mvpheloworld.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private Presenter presenter;
    public TextView mTextView;
    public Button mButtonRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        mTextView = findViewById(R.id.text_view);
        mButtonRun = findViewById(R.id.button_run);

        mButtonRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onClick(v);
            }
        });
    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}
