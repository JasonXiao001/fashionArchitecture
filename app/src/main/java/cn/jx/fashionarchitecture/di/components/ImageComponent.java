package cn.jx.fashionarchitecture.di.components;


import cn.jx.fashionarchitecture.MainActivity;
import cn.jx.fashionarchitecture.di.PerActivity;
import cn.jx.fashionarchitecture.di.modules.ImageModule;
import cn.jx.fashionarchitecture.images.ImagesActivity;
import dagger.Component;

/**
 *
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ImageModule.class)
public interface ImageComponent {
    void inject(MainActivity mainActivity);
    void inject(ImagesActivity imagesActivity);
}
