package ssa.abc.alrais.basekotlin.view.avtivity.viewimpl

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import ssa.abc.alrais.basekotlin.R
import ssa.abc.alrais.basekotlin.presenter.activity.presenter.MainActivityPresenter
import ssa.abc.alrais.basekotlin.presenter.activity.presenterimpl.MainActivityPresenterImpl
import ssa.abc.alrais.basekotlin.view.avtivity.view.MainActivityView
import ssa.abc.alrais.basekotlin.view.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : BaseActivity(),MainActivityView {

    var presenter: MainActivityPresenter? = null


    override fun getContext(): Context {
        return this
    }

    override fun setMessage(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override val activity: AppCompatActivity
        get() {
         return this
        }





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter=MainActivityPresenterImpl(this)

    }
}
