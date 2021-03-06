package com.example.luisordonez.lastfmluisordoniez.ui.main

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.luisordonez.lastfmluisordoniez.R
import com.example.luisordonez.lastfmluisordoniez.databinding.ItemPostBinding
import com.example.luisordonez.lastfmluisordoniez.model.Movie

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */
class PostListAdapter: RecyclerView.Adapter<PostListAdapter.ViewHolder>() {


    private lateinit var postList:List<Movie>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostListAdapter.ViewHolder {
        val binding: ItemPostBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_post, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostListAdapter.ViewHolder, position: Int) {
        holder.bind(postList[position])
    }

    override fun getItemCount(): Int {
        return if(::postList.isInitialized) postList.size else 0
    }

    fun updatePostList(movieList: List<Movie>){
        if(::postList.isInitialized){
            var temp = postList.size
            this.postList += movieList
            notifyItemInserted(temp)
        }else{
            this.postList = movieList
            notifyDataSetChanged()
        }
    }


    class ViewHolder(private val binding: ItemPostBinding):RecyclerView.ViewHolder(binding.root){
        private val viewModel = PostViewModel()
        fun bind(post: Movie){
            viewModel.bind(post)
            binding.viewModel = viewModel
        }
    }
}