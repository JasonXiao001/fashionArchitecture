package cn.jx.data.image;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 *
 */

public class ImageRemoteStore extends ImageStore {

    private static ImageRemoteStore instance = new ImageRemoteStore();


    private ImageApi api;
    private CallAdapter.Factory rxJavaCallAdapterFactory = RxJavaCallAdapterFactory.create();
    private Converter.Factory gsonConverterFactory = GsonConverterFactory.create();
    private final int pageSize = 5;
    private int pageIndex = 0;

    public static ImageRemoteStore getInstance() {
        return instance;
    }

    private ImageRemoteStore() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.bing.com/")
                .addConverterFactory(gsonConverterFactory)
                .addCallAdapterFactory(rxJavaCallAdapterFactory)
                .build();
        api = retrofit.create(ImageApi.class);
    }



    /**
     * Get an {@link Observable} which will emit a List of {@link ImageEntity}.
     */
    @Override
    Observable<ImageListEntity> imageEntityList() {
        Map<String, String> param = new HashMap<>();
        param.put("format", "js");
        param.put("idx", String.valueOf(pageIndex));
        param.put("n", String.valueOf(pageSize));
        return api.images(param);
    }
}
