package cn.jx.fashionarchitecture.images;

import java.util.List;

import cn.jx.fashionarchitecture.BasePresenter;
import cn.jx.fashionarchitecture.BaseView;

/**
 *
 */

interface ImagesContract {

    interface View extends BaseView {
        void showImages(List<ImagesViewModel> images);
    }

    interface Presenter extends BasePresenter<View> {

    }
}
