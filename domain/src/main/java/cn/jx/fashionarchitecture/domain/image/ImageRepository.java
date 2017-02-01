package cn.jx.fashionarchitecture.domain.image;

import java.util.List;

import rx.Observable;

/**
 * Interface that represents a Repository for getting {@link Image} related data.
 */

public interface ImageRepository {

    /**
     * Get an {@link rx.Observable} which will emit a List of {@link Image}.
     */
    Observable<List<Image>> images();

}
