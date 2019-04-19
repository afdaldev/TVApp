package dev.afdal.tvapp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.afdal.tvapp.R;
import dev.afdal.tvapp.data.ReviewResponse;
import dev.afdal.tvapp.databinding.TvReviewItemBinding;

public class TVReviewAdapter extends RecyclerView.Adapter<TVReviewAdapter.ViewHolder> {

    private List<ReviewResponse.ResultsReview> reviewList;

    public TVReviewAdapter(List<ReviewResponse.ResultsReview> reviewList) {
        this.reviewList = reviewList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_review_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ReviewResponse.ResultsReview review = reviewList.get(position);
        holder.tvReviewItemBinding.tvAuthor.setText(review.getAuthor());
        holder.tvReviewItemBinding.tvReview.setText(review.getContent());
    }

    @Override
    public int getItemCount() {
        return reviewList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TvReviewItemBinding tvReviewItemBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvReviewItemBinding = DataBindingUtil.bind(itemView);
        }
    }
}
