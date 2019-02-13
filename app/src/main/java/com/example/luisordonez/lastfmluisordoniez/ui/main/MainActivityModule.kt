package com.example.luisordonez.lastfmluisordoniez.ui.main

import com.example.luisordonez.lastfmluisordoniez.di.scopes.PerActivity
import dagger.Binds
import dagger.Module


/**
 * Created by luisordonez on 11,febrero,2019
 * Bogotá, Colombia.
 */


@Module
abstract class MainActivityModule {

    @Binds
    @PerActivity
    abstract fun view(mainActivity: MainActivity): MainActivity
}