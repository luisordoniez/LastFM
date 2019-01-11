package com.example.luisordonez.lastfmluisordoniez.injection.component

import com.example.luisordonez.lastfmluisordoniez.injection.module.NetworkModule
import com.example.luisordonez.lastfmluisordoniez.ui.main.PostListViewModel
import dagger.Component
import javax.inject.Singleton

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}