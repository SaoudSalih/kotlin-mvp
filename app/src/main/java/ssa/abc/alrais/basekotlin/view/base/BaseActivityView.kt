package ssa.abc.alrais.basekotlin.view.base

import android.content.Context
import android.support.v7.app.AppCompatActivity



/**
 * Created by saoud on 10/6/17.
 */
interface BaseActivityView {

    fun getContext(): Context
    val activity: AppCompatActivity
}