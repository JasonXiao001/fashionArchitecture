package cn.jx.data.image;

import rx.Observable;

/**
 *
 */

public class ImageLocalStore extends ImageStore {

    /**
     * Get an {@link Observable} which will emit a List of {@link ImageEntity}.
     */
    @Override
    Observable<ImageListEntity> imageEntityList() {
        return null;
    }
}
