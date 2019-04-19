package dev.afdal.tvapp.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIEndPoint {

    @GET("tv/airing_today")
    Call<TvResponse> getTV(
            @Query("api_key") String apiKey
    );

    @GET("tv/{tv_id}/videos")
    Call<VideoResponse> getVideoById(
            @Path("tv_id") int tvId,
            @Query("api_key") String apiKey
    );

    @GET("tv/{tv_id}/reviews")
    Call<ReviewResponse> getReviewById(
            @Path("tv_id") int tvId,
            @Query("api_key") String apiKey
    );
}
