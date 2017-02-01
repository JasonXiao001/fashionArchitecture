package cn.jx.fashionarchitecture;

import android.app.Application;

import cn.jx.fashionarchitecture.di.components.ApplicationComponent;
import cn.jx.fashionarchitecture.di.components.DaggerApplicationComponent;
import cn.jx.fashionarchitecture.di.modules.ApplicationModule;


/**
 *
 */

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }


}
