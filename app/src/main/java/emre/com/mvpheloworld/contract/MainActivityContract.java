package emre.com.mvpheloworld.contract;

/**
 * Created by Emre.Karatas on 9.10.2018.
 */

public interface MainActivityContract {

    interface View {
        void initView();
        void setViewData(String data);
    }

    interface Model {
        String getData();
    }

    interface Presenter {
        void onClick(android.view.View view);
    }
}
