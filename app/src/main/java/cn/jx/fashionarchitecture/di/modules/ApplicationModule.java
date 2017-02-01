package cn.jx.fashionarchitecture.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import cn.jx.data.image.ImageRepositoryImpl;
import cn.jx.fashionarchitecture.MyApplication;
import cn.jx.fashionarchitecture.UIThread;
import cn.jx.fashionarchitecture.domain.executor.PostExecutionThread;
import cn.jx.fashionarchitecture.domain.image.ImageRepository;
import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class ApplicationModule {

    private final MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    @Provides
    @Singleton
    ImageRepository provideImageRepository(ImageRepositoryImpl imageRepository) {
        return imageRepository;
    }

    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }


}
