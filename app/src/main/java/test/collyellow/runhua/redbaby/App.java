package test.collyellow.runhua.redbaby;

import android.app.Application;
import android.content.Context;

/**
 * Created by collyellow on 2016/12/8.
 */

public class App extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
