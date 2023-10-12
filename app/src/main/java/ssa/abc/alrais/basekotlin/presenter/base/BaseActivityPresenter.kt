package ssa.abc.alrais.basekotlin.presenter.base

import android.support.v4.app.FragmentActivity
import android.widget.Toast
import android.os.Bundle
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import ssa.abc.alrais.basekotlin.view.base.BaseActivityView



/**
 * Created by saoud on 10/6/17.
 */

abstract class BaseActivityPresenter<AVIEW : BaseActivityView> {

    private val ACTIVITY_BUNDLE_EXTRA = "ACTIVITY_BUNDLE_EXTRA"
    val KEY_MOBILE_NUMBER = "KEY_MOBILE_NUMBER"

    private var mContext: Context? = null

    private var mView: AVIEW? = null

    /**
     * Attaches a view to its presenter class
     * @param view - View to be attached
     */
    fun attachView(view: AVIEW) {
        this.mView = view
        this.mContext = view.activity
        onAttached()
    }

    /**
     * Does nothing. other presenters extending it can {@link Override} this to listen {@link #attachView(BaseActivityView)} completion
     */
    abstract fun onAttached()

    /**

     * @return the current view attached to the presenter
     */
    fun getView(): AVIEW? {
        return mView
    }

    /**
     * A shortcut method to use [Activity] directly than VIEW.getActiviy()
     * @return [AppCompatActivity] - reference to current [Activity]
     */
    protected fun getActivity(): AppCompatActivity {
        return mView!!.activity
    }

    /**
     * A shortcut method to use [Context] directly than calling VIEW.getContext()
     * @return [Context]
     */
    fun getContext(): Context? {
        return mContext
    }

    /**
     * Method to show next scree/activity
     * @param activity - Class to be displayed - shoule extend activity
     * *
     * @param activityExtra - bunble to be passed through the intent
     */
    protected fun <T : Activity> showNextScreenByFinish(activity: Class<T>, activityExtra: Bundle) {
        val intent = Intent(mContext, activity)
        intent.putExtra(ACTIVITY_BUNDLE_EXTRA, activityExtra)
        getActivity().startActivity(intent)
        getActivity().finish()
    }

    protected fun <T : Activity> showNextScreen(activity: Class<T>, activityExtra: Bundle) {
        val intent = Intent(mContext, activity)
        intent.putExtra(ACTIVITY_BUNDLE_EXTRA, activityExtra)
        getActivity().startActivity(intent)
    }

    /**

     * @param activity
     * *
     * @param activityExtra
     * *
     * @param a1 - entering new activity animation
     * *
     * @param a2 - exiting old activity  animation
     * *
     * @param <T>
    </T> */
    protected fun <T : Activity> showAnimatedNextScreen(activity: Class<T>, activityExtra: Bundle, a1: Int, a2: Int) {
        val intent = Intent(mContext, activity)
        intent.putExtra(ACTIVITY_BUNDLE_EXTRA, activityExtra)
        getActivity().startActivity(intent)
        getActivity().overridePendingTransition(a1, a2)
    }

    /**
     * @return [Bundle] - which is passed through intent to current [Activity]
     */
    protected fun getBundle(): Bundle {
        return getActivity().intent.getBundleExtra(ACTIVITY_BUNDLE_EXTRA)
    }

    /**
     * Shows general errors and warnings
     * @param errorMsgResId - String resource id of error message to be shown
     */
    protected fun showError(errorMsgResId: Int) {
        Toast.makeText(mContext, errorMsgResId, Toast.LENGTH_SHORT).show()
    }

    /**
     * Shows general errors and warnings
     * @param errorMsgResId - String error message to be shown
     */
    protected fun showError(errorMsgResId: String) {
        Toast.makeText(mContext, errorMsgResId, Toast.LENGTH_SHORT).show()
    }

    protected fun showToast(message: String) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show()
    }

    protected abstract fun showPopUp()

    /**
     * Changing the fragment from an Activity
     * @param activity
     * *
     * @param containerId
     * *
     * @param fragment
     * *
     * @param <T>
    </T> */
    fun <T : FragmentActivity> replaceContentFragment(activity: T?, containerId: Int, fragment: Fragment?) {
        if (activity != null && !activity.isFinishing && fragment != null) {
            val beginTransaction = activity.supportFragmentManager.beginTransaction()
            // beginTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
            // beginTransaction.replace(containerId, fragment).commitAllowingStateLoss();
        }
    }
}