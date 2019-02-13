package com.example.luisordonez.lastfmluisordoniez

import android.app.Activity
import android.app.Application
import com.example.luisordonez.lastfmluisordoniez.di.DaggerAppComponent
import dagger.android.*
import javax.inject.Inject

/**
 * Created by luisordonez on 11,febrero,2019
 * Bogotá, Colombia.
 */


class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .application(this)
                .build()
    }

    override fun onCreate() {
        super.onCreate()
//        if (BuildConfig.HAS_CRASHLYTICS) {
//            Fabric.with(this, Crashlytics())
//        }
//        DaggerAppComponent.builder()
//                .application(this)
//                .build()
//                .inject(this)
    }
}