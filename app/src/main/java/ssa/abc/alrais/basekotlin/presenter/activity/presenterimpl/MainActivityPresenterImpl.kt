package ssa.abc.alrais.basekotlin.presenter.activity.presenterimpl

import ssa.abc.alrais.basekotlin.intractor.interactorimpl.MainActivityIntractor
import ssa.abc.alrais.basekotlin.presenter.activity.presenter.MainActivityPresenter
import ssa.abc.alrais.basekotlin.presenter.base.BaseActivityPresenter
import ssa.abc.alrais.basekotlin.view.avtivity.view.MainActivityView


/**
 * Created by saoud on 10/6/17.
 */
class MainActivityPresenterImpl : BaseActivityPresenter<MainActivityView>,MainActivityPresenter {

   var intractor:MainActivityIntractor?=null
    override fun setMessage(message: String) {
          getView()!!.setMessage(message)

    }

    override fun onAttached() {

    }

    override fun showPopUp() {

    }

    constructor(mainActivityView: MainActivityView){
        attachView(mainActivityView)
        intractor= MainActivityIntractor(this)
        intractor?.setMessage()

    }

}