package cn.jx.fashionarchitecture.di.components;

import android.content.Context;

import javax.inject.Singleton;

import cn.jx.fashionarchitecture.BaseActivity;
import cn.jx.fashionarchitecture.di.modules.ApplicationModule;
import cn.jx.fashionarchitecture.domain.executor.PostExecutionThread;
import cn.jx.fashionarchitecture.domain.image.ImageRepository;
import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseActivity baseActivity);

    Context context();
    ImageRepository provideImageRepository();
    PostExecutionThread postExecutionThread();

}
