package dev.afdal.tvapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import java.util.List;

import dev.afdal.tvapp.R;
import dev.afdal.tvapp.data.TvResponse;
import dev.afdal.tvapp.data.TvService;
import dev.afdal.tvapp.databinding.ActivityMainBinding;
import dev.afdal.tvapp.ui.adapter.TVAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private TVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        activityMainBinding.rvTv.setLayoutManager(layoutManager);
        activityMainBinding.pbTv.setVisibility(View.VISIBLE);
        getTV();
    }

    private void getTV() {
        TvService.getAPI().getTV("e88b2c06ed7e7674f2f912d812290a70")
                .enqueue(new Callback<TvResponse>() {
                    @Override
                    public void onResponse(Call<TvResponse> call, Response<TvResponse> response) {
                        List<TvResponse.ResultsTV> tv = response.body().getResults();
                        adapter = new TVAdapter(tv, MainActivity.this);
                        activityMainBinding.rvTv.setAdapter(adapter);
                        activityMainBinding.pbTv.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onFailure(Call<TvResponse> call, Throwable t) {

                    }
                });
    }
}
