package cn.jx.fashionarchitecture.di.modules;

import javax.inject.Named;


import cn.jx.data.image.ImageRemoteStore;
import cn.jx.data.image.ImageStore;
import cn.jx.fashionarchitecture.di.PerActivity;
import cn.jx.fashionarchitecture.domain.UseCase;
import cn.jx.fashionarchitecture.domain.image.GetImages;
import dagger.Module;
import dagger.Provides;

/**
 *
 */

@Module
public class ImageModule {


    public ImageModule() {

    }


    @Provides @PerActivity @Named("images")
    UseCase provideGetImagesUseCase(GetImages getImages) {
        return getImages;
    }

    @Provides
    ImageStore provideImageStore(ImageRemoteStore store) {
        return store;
    }
}
