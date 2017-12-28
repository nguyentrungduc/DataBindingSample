package com.example.sony.databindingsample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sony.databindingsample.data.model.Movie;
import com.example.sony.databindingsample.databinding.ItemViewMovieBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sony on 12/28/2017.
 */

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    List<Movie> movieList = new ArrayList<>();
    private static final String TAG = Adapter.class.toString();
    Context context;
    private ItemViewMovieBinding itemViewMovieBinding;

    public Adapter(Context context, List<Movie> movieList){
        this.movieList = movieList;
        this.context = context;
        Log.d(TAG, "contrustor adapter");
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         itemViewMovieBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.item_view_movie, parent, false);
        return new MovieViewHolder(itemViewMovieBinding);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        itemViewMovieBinding.setViewholder((MovieViewHolder) holder);
        MovieViewHolder movieViewHolder = (MovieViewHolder) holder;
        ((MovieViewHolder) holder).binding(movieList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{

        public ObservableField<String> image = new ObservableField<>();
        public ObservableField<String> background = new ObservableField<>();
        public ObservableField<String> title = new ObservableField<>();
        private ItemViewMovieBinding itemViewMovieBinding;
        Movie movie;
        public MovieViewHolder(ItemViewMovieBinding itemViewMovieBinding) {
            super(itemViewMovieBinding.getRoot());
            this.itemViewMovieBinding = itemViewMovieBinding;

        }

        public void binding(Movie movie, int position){
            if(itemViewMovieBinding.getViewholder()==null){
                itemViewMovieBinding.setViewholder(this);
            }
            this.movie = movie;
            image.set(movie.getLink());
            background.set(movie.getLink());
            title.set(movie.getTitle());

        }
    }
}
