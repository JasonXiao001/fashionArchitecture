package cn.jx.fashionarchitecture.images;

import android.util.Log;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cn.jx.fashionarchitecture.domain.UseCase;
import cn.jx.fashionarchitecture.domain.image.Image;
import rx.Subscriber;

/**
 *
 */

class ImagesPresenter implements ImagesContract.Presenter {

    private ImagesContract.View mView;
    private UseCase imagesUseCase;

    @Inject
    ImagesPresenter(@Named("images") UseCase imagesUseCase) {
        this.imagesUseCase = imagesUseCase;
    }


    @Override
    public void start() {
        imagesUseCase.execute(new Subscriber<List<Image>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.d("", "");
            }

            @Override
            public void onNext(List<Image> images) {
                List<ImagesViewModel> list = new LinkedList<>();
                for (Image item : images) {
                    ImagesViewModel model = new ImagesViewModel();
                    model.url = item.getUrl();
                    list.add(model);
                }
                mView.showImages(list);
            }
        });
    }

    @Override
    public void setView(ImagesContract.View view) {
        mView = view;
    }


}
