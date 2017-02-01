package cn.jx.data.image;

import java.util.List;

import rx.Observable;

/**
 *
 */

public abstract class ImageStore {

    /**
     * Get an {@link rx.Observable} which will emit a List of {@link ImageEntity}.
     */
    abstract Observable<ImageListEntity> imageEntityList();
}
