package com.example.photogallery;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.photogallery.Response;

public interface FlickRecent {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=2429f208737a3d16d5b6118bd2b75378&extras=url_s&per_page=4&page=1&format=json&nojsoncallback=1")
    Call<Response> getRecent();

    @GET("services/rest/?method=flickr.photos.search&api_key=2429f208737a3d16d5b6118bd2b75378&extras=url_s&per_page=4&page=1&format=json&nojsoncallback=1")
    Call<Response> getSearchPhotos(@Query("text") String keyWord);
}
