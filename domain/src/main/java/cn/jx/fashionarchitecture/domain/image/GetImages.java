package cn.jx.fashionarchitecture.domain.image;

import java.util.List;

import javax.inject.Inject;

import cn.jx.fashionarchitecture.domain.UseCase;
import cn.jx.fashionarchitecture.domain.executor.PostExecutionThread;
import rx.Observable;
import rx.functions.Func1;

/**
 * This class is an implementation of {@link UseCase} that represents a use case for
 * retrieving a collection of {@link Image}.
 */

public class GetImages extends UseCase{

    private final ImageRepository repository;

    @Inject
    public GetImages(PostExecutionThread postExecutionThread, ImageRepository repository) {
        super(postExecutionThread);
        this.repository = repository;
    }

    /**
     * Builds an {@link Observable} which will be used when executing the current {@link UseCase}.
     */
    @Override
    protected Observable buildUseCaseObservable() {
        return repository.images();
    }
}
