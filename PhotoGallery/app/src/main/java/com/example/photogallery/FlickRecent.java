package com.example.photogallery;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.photogallery.Response;

public interface FlickRecent {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=175dd32e0e961580b542862dd3823e95&extras=url_s&per_page=2&page=2&format=json&nojsoncallback=1")
    Call<Response> getRecent();

    @GET("services/rest/?method=flickr.photos.search&api_key=175dd32e0e961580b542862dd3823e95&extras=url_s&per_page=2&page=2&format=json&nojsoncallback=1")
    Call<Response> getSearchPhotos(@Query("text") String keyWord);
}
