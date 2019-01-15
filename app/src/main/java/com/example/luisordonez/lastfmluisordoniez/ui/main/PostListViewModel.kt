package com.example.luisordonez.lastfmluisordoniez.ui.main

import android.arch.lifecycle.MutableLiveData
import android.view.View
import com.example.luisordonez.lastfmluisordoniez.base.BaseViewModel
import com.example.luisordonez.lastfmluisordoniez.R
import com.example.luisordonez.lastfmluisordoniez.model.Response
import com.example.luisordonez.lastfmluisordoniez.network.PostApi
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver

import javax.inject.Inject

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */
class PostListViewModel: BaseViewModel() {
    @Inject
    lateinit var postApi: PostApi

    private lateinit var subscription: Disposable
    val loadingVisibility: MutableLiveData<Int> = MutableLiveData()

    val errorMessage:MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { loadPosts() }

    val postListAdapter: PostListAdapter = PostListAdapter()

    init{
        loadPosts()
    }

    private fun loadPosts(){
        val options : HashMap<String, String> = hashMapOf("query" to "matrix")

        subscription = postApi.getPosts(options)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { onRetrievePostListStart() }
            .doOnTerminate { onRetrievePostListFinish() }
            .subscribe(
                { result -> onRetrievePostListSuccess(result) },
                { onRetrievePostListError() }
            )
    }

    private fun onRetrievePostListStart(){
        loadingVisibility.value = View.VISIBLE
        errorMessage.value = null
    }

    private fun onRetrievePostListFinish(){
        loadingVisibility.value = View.GONE
    }

    private fun onRetrievePostListSuccess(postList: Response){
        postListAdapter.updatePostList(postList.results)
    }

    private fun onRetrievePostListError(){
        errorMessage.value = R.string.post_error
    }

    override fun onCleared() {
        super.onCleared()
        subscription.dispose()
    }
}