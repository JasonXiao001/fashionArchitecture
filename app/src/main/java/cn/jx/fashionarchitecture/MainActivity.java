package cn.jx.fashionarchitecture;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cn.jx.fashionarchitecture.di.components.DaggerImageComponent;
import cn.jx.fashionarchitecture.di.components.ImageComponent;
import cn.jx.fashionarchitecture.di.modules.ImageModule;
import cn.jx.fashionarchitecture.domain.UseCase;
import cn.jx.fashionarchitecture.domain.image.Image;
import cn.jx.fashionarchitecture.domain.image.ImageRepository;
import rx.Subscriber;
import rx.observers.SafeSubscriber;


public class MainActivity extends BaseActivity {

//
//    @Inject @Named("images")
//    UseCase useCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageComponent build = DaggerImageComponent.builder()
//                .applicationComponent(getApplicationComponent())
//                .imageModule(new ImageModule())
//                .build();
//        build.inject(this);
//        useCase.execute(new Subscriber<List<Image>>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.d("", "");
//            }
//
//            @Override
//            public void onNext(List<Image> images) {
//                Log.d("", "");
//
//            }
//        });
    }
}
