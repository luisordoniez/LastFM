package com.example.luisordonez.lastfmluisordoniez.utils.extension

import android.content.ContextWrapper
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */

fun View.getParentActivity(): AppCompatActivity?{
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}