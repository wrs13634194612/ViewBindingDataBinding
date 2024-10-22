package com.example.flushfragmentdemo


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.flushfragmentdemo.R
import com.example.flushfragmentdemo.databinding.ItemMovieLayoutBinding
import com.example.flushfragmentdemo.MovieModelView

/**
 * Created by Bobby.Hardian on 16/04/2020.
 */
class MovieAdapter(private val movieList: MutableList<MovieModelView>) :
    RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_movie_layout,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList[position])
    }
}

class MovieViewHolder(private val binding: ItemMovieLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(movieModelView: MovieModelView) {
        binding.movieItem = movieModelView
    }
}