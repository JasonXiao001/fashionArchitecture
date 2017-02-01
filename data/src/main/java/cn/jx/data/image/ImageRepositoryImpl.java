package cn.jx.data.image;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import cn.jx.fashionarchitecture.domain.image.Image;
import cn.jx.fashionarchitecture.domain.image.ImageRepository;
import rx.Observable;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 *
 */

public class ImageRepositoryImpl implements ImageRepository {


    private static ImageRepositoryImpl INSTANCE = null;

    private ImageStore remoteStore;
    private ImageStore localStore;


    @Inject
    ImageRepositoryImpl() {
        remoteStore = ImageRemoteStore.getInstance();
    }



    /**
     * Get an {@link Observable} which will emit a List of {@link Image}.
     */
    @Override
    public Observable<List<Image>> images() {
        return remoteStore.imageEntityList()
                .map(new Func1<ImageListEntity, List<Image>>() {

                    @Override
                    public List<Image> call(ImageListEntity imageListEntity) {
                        List<Image> ret = new ArrayList<>();
                        for (ImageEntity item : imageListEntity.images) {
                            Image image = new Image();
                            image.setUrl(item.url);
                            ret.add(image);
                        }
                        return ret;
                    }
                });

    }
}
