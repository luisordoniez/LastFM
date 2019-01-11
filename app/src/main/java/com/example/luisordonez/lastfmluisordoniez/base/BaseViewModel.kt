package com.example.luisordonez.lastfmluisordoniez.base

import android.arch.lifecycle.ViewModel
import com.example.luisordonez.lastfmluisordoniez.injection.component.DaggerViewModelInjector
import com.example.luisordonez.lastfmluisordoniez.injection.component.ViewModelInjector
import com.example.luisordonez.lastfmluisordoniez.injection.module.NetworkModule
import com.example.luisordonez.lastfmluisordoniez.ui.main.PostListViewModel

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */

abstract class BaseViewModel: ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}