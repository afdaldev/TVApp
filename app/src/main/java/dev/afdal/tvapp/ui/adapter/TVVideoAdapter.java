package dev.afdal.tvapp.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import dev.afdal.tvapp.R;
import dev.afdal.tvapp.data.VideoResponse;
import dev.afdal.tvapp.databinding.TvVideoListItemBinding;

public class TVVideoAdapter extends RecyclerView.Adapter<TVVideoAdapter.ViewHolder> {

    private List<VideoResponse.ResultsVideo> videos;
    private Context context;

    public TVVideoAdapter(List<VideoResponse.ResultsVideo> videos) {
        this.videos = videos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.tv_video_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final VideoResponse.ResultsVideo video = videos.get(position);
        Glide.with(context)
                .load("https://i2.ytimg.com/vi/" + video.getKey() + "/0.jpg")
                .into(holder.listItemBinding.imgVideo);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.youtube.com/watch?v=" + video.getKey()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TvVideoListItemBinding listItemBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            listItemBinding = DataBindingUtil.bind(itemView);
        }
    }
}
