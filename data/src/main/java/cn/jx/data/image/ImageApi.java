package cn.jx.data.image;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 *
 */

public interface ImageApi {

    @GET("HPImageArchive.aspx")
    Observable<ImageListEntity> images(@QueryMap Map<String, String> options);
}
