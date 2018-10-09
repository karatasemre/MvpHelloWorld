package emre.com.mvpheloworld.model;

import emre.com.mvpheloworld.contract.MainActivityContract;

/**
 * Created by Emre.Karatas on 9.10.2018.
 */

public class MainActivityModel implements MainActivityContract.Model {

    @Override
    public String getData() {
        return "Hello World";
    }
}
