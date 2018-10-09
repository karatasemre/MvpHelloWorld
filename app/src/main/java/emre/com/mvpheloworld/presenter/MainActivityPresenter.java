package emre.com.mvpheloworld.presenter;

import emre.com.mvpheloworld.contract.MainActivityContract;
import emre.com.mvpheloworld.contract.MainActivityContract.View;
import emre.com.mvpheloworld.model.MainActivityModel;
import emre.com.mvpheloworld.view.MainActivity;

/**
 * Created by Emre.Karatas on 9.10.2018.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private View mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivity view) {
        this.mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view) {
        String data = mModel.getData();
        mView.setViewData(data);

    }
}
