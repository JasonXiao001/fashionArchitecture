package cn.jx.fashionarchitecture.images;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import javax.inject.Inject;

import cn.jx.fashionarchitecture.BaseActivity;
import cn.jx.fashionarchitecture.R;
import cn.jx.fashionarchitecture.di.components.DaggerImageComponent;
import cn.jx.fashionarchitecture.di.components.ImageComponent;
import cn.jx.fashionarchitecture.di.modules.ImageModule;
import cn.jx.fashionarchitecture.domain.image.Image;

public class ImagesActivity extends BaseActivity implements ImagesContract.View {

    @Inject
    ImagesPresenter presenter;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ImagesAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        initializeInjector();
        initRecyclerView();
        presenter.setView(this);
        presenter.start();
    }

    private void initializeInjector() {
        ImageComponent build = DaggerImageComponent.builder()
                .applicationComponent(getApplicationComponent())
                .imageModule(new ImageModule())
                .build();
        build.inject(this);
    }

    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }


    @Override
    public void showImages(List<ImagesViewModel> images) {
        mAdapter = new ImagesAdapter(images);
        mRecyclerView.setAdapter(mAdapter);
    }
}
