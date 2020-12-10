package com.example.photogallery;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.photogallery.Response;

public interface FlickRecent {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=b0fbba1dd1d7d33193ed5f8d5ca567da&extras=url_s&per_page=2&page=2&format=json&nojsoncallback=1&auth_token=72157717234606003-954e086e13bf7e57&api_sig=fb19dc9fe76bf4abee3047d49220bfd8")
    Call<Response> getRecent();

    @GET("services/rest/?method=flickr.photos.search&api_key=b0fbba1dd1d7d33193ed5f8d5ca567da&extras=url_s&per_page=2&page=2&format=json&nojsoncallback=1&auth_token=72157717234606003-954e086e13bf7e57&api_sig=fb19dc9fe76bf4abee3047d49220bfd8")
    Call<Response> getSearchPhotos(@Query("text") String keyWord);
}
