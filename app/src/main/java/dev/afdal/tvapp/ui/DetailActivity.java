package dev.afdal.tvapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.bumptech.glide.Glide;

import java.util.List;

import dev.afdal.tvapp.R;
import dev.afdal.tvapp.data.BaseURL;
import dev.afdal.tvapp.data.ReviewResponse;
import dev.afdal.tvapp.data.TvResponse;
import dev.afdal.tvapp.data.TvService;
import dev.afdal.tvapp.data.VideoResponse;
import dev.afdal.tvapp.databinding.ActivityDetailBinding;
import dev.afdal.tvapp.ui.adapter.TVReviewAdapter;
import dev.afdal.tvapp.ui.adapter.TVVideoAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding activityDetailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        TvResponse.ResultsTV tv = getIntent().getParcelableExtra("tv_intent");
        getDetail(tv);
        videoRecyclerView();
        displayVideo(tv.getId());
        reviewRecyclerView();
        displayReview(tv.getId());
    }

    private void getDetail(TvResponse.ResultsTV tv){
        Double ratingBarValue = tv.getVoteAverage() / 2;

        activityDetailBinding.cvTv.tvTitle.setText(tv.getName());
        activityDetailBinding.cvTv.tvRating.setRating(Float.parseFloat(String.valueOf(ratingBarValue)));
        Glide.with(this)
                .load(BaseURL.POSTER_URL + tv.getPosterPath())
                .into(activityDetailBinding.cvTv.tvPoster);
        Glide.with(this)
                .load(BaseURL.BACKDROP_URL + tv.getBackdropPath())
                .into(activityDetailBinding.imgBackdrop);
        activityDetailBinding.tvOverview.setText(tv.getOverview());
    }

    private void videoRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        activityDetailBinding.rvTv.setLayoutManager(layoutManager);
    }

    private void reviewRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        activityDetailBinding.rvReview.setLayoutManager(layoutManager);
    }

    private void displayVideo(final int tvId){
        TvService.getAPI().getVideoById(tvId, "e88b2c06ed7e7674f2f912d812290a70")
                .enqueue(new Callback<VideoResponse>() {
                    @Override
                    public void onResponse(Call<VideoResponse> call, Response<VideoResponse> response) {
                        List<VideoResponse.ResultsVideo> videos = response.body().getResults();
                        TVVideoAdapter adapter = new TVVideoAdapter(videos);
                        activityDetailBinding.rvTv.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<VideoResponse> call, Throwable t) {

                    }
                });
    }

    private void displayReview(final int tvId){
        TvService.getAPI().getReviewById(tvId, "e88b2c06ed7e7674f2f912d812290a70")
                .enqueue(new Callback<ReviewResponse>() {
                    @Override
                    public void onResponse(Call<ReviewResponse> call, Response<ReviewResponse> response) {
                        List<ReviewResponse.ResultsReview> reviews = response.body().getResults();
                        TVReviewAdapter adapter = new TVReviewAdapter(reviews);
                        activityDetailBinding.rvReview.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<ReviewResponse> call, Throwable t) {

                    }
                });
    }
}