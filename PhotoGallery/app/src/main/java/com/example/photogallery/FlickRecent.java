package com.example.photogallery;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.photogallery.Response;

public interface FlickRecent {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=9b12e8d1e5d3f351c01fedbc4433a97c&extras=url_s&per_page=2&page=2&format=json&nojsoncallback=1&auth_token=72157717209142746-16888f699c3cf0d8&api_sig=f7abf94d7b94336a611a9d52b5901786")
    Call<Response> getRecent();

    @GET("services/rest/?method=flickr.photos.search&api_key=9b12e8d1e5d3f351c01fedbc4433a97c&extras=url_s&per_page=2&page=2&format=json&nojsoncallback=1&auth_token=72157717209142746-16888f699c3cf0d8&api_sig=f7abf94d7b94336a611a9d52b5901786")
    Call<Response> getSearchPhotos(@Query("text") String keyWord);
}
