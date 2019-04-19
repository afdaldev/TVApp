package dev.afdal.tvapp.data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TvService {

    public static APIEndPoint getAPI(){
        final Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BaseURL.BASE_URL)
                .build();
        return retrofit.create(APIEndPoint.class);
    }

}
