package com.example.luisordonez.lastfmluisordoniez.di

import com.example.luisordonez.lastfmluisordoniez.ui.main.MainActivity
import com.example.luisordonez.lastfmluisordoniez.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by luisordonez on 11,febrero,2019
 * Bogotá, Colombia.
 */

@Module
abstract class ActivitiesModule {
@ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun contributeActivityAndroidInjector(): MainActivity

}