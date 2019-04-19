package dev.afdal.tvapp.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import dev.afdal.tvapp.R;
import dev.afdal.tvapp.data.BaseURL;
import dev.afdal.tvapp.data.TvResponse;
import dev.afdal.tvapp.databinding.TvListItemBinding;
import dev.afdal.tvapp.ui.DetailActivity;

public class TVAdapter extends RecyclerView.Adapter<TVAdapter.ViewHolder> {

    private List<TvResponse.ResultsTV> TVList;
    private Context context;

    public TVAdapter(List<TvResponse.ResultsTV> resultsTV, Context context) {
        this.TVList = resultsTV;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tv_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final TvResponse.ResultsTV tv = TVList.get(position);
        Double ratingBarValue = tv.getVoteAverage() / 2;

        holder.listItemBinding.tvTitle.setText(tv.getName());
        Glide.with(context)
                .load(BaseURL.POSTER_URL + tv.getPosterPath())
                .into(holder.listItemBinding.tvPoster);
        holder.listItemBinding.tvRating.setRating(Float.parseFloat(String.valueOf(ratingBarValue)));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("tv_intent", tv);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return TVList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TvListItemBinding listItemBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            listItemBinding = DataBindingUtil.bind(itemView);
        }
    }
}
