package com.example.luisordonez.lastfmluisordoniez.di

import android.app.Application
import com.example.luisordonez.lastfmluisordoniez.BaseApplication
import com.example.luisordonez.lastfmluisordoniez.ui.main.PostListViewModel
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */

@Singleton
@Component(modules = [AndroidInjectionModule::class, NetworkModule::class, ActivitiesModule::class])
interface AppComponent : AndroidInjector<BaseApplication>{
//    /**
//     * Injects required dependencies into the specified PostListViewModel.
//     * @param postListViewModel PostListViewModel in which to inject the dependencies
//     */
    fun inject(postListViewModel: PostListViewModel)

    fun inject(app: Application)

//    @Override
//    abstract fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        fun networkModule(networkModule: NetworkModule): Builder

        @BindsInstance
        fun application(application: Application): Builder
    }
}
