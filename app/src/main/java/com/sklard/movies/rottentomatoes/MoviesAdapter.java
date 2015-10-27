package com.sklard.movies.rottentomatoes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sklard on 10/26/15.
 */

// 1. Inflate the view.
    // convert the xml into views
// 2. Populate the views.
// 3. Use ViewHolder

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    ArrayList<Movie> movies;

    public MoviesAdapter(ArrayList<Movie> entries) {
        movies = entries;
    }

    // This is auto-called by the system.
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent,
                                              // viewType is used if different types of rows in the table/list;
                                              // here we have only one type of row (movie-description) so we ignore.
                                              int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View movieItemView = inflater.inflate(R.layout.item_movie, parent, false);

        // Return a new holder instance
        MovieViewHolder viewHolder = new MovieViewHolder(movieItemView);
        return viewHolder;
    }



    // This is auto-called by the system.
    // Here we populate a virgin or recycled item viewtree to hold
    // the dynamic data for this particular list item.
    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie m = movies.get(position);
        holder.tvTitle.setText(m.title);
        holder.tvScore.setText(m.getCriticScore());
    }


    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public TextView tvScore;

        public MovieViewHolder(View layoutView) {
            super(layoutView);
            tvTitle = (TextView) layoutView.findViewById(R.id.tvTitle);
            tvScore = (TextView) layoutView.findViewById(R.id.tvScore);
        }
    }

}
