package ssa.abc.alrais.basekotlin.intractor.base





import android.util.Log
import ssa.abc.alrais.basekotlin.presenter.base.BaseActivityPresenter
import ssa.abc.alrais.basekotlin.service.network.ServiceHolder
import ssa.abc.alrais.basekotlin.model.base.BaseResponseModel
import java.net.UnknownHostException
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

/**
 * Created by saoud on 10/6/17.
 */

abstract class BaseActivityInteractor <APRESENTER : BaseActivityPresenter<*>> {

    val USER_JWT_TOKEN = "USER_JWT_TOKEN"

    private val SUCCESS = "success"
    private val INTERNET_CONNECTION_ISNT_WORKING = "No network connection!"
    private val AUTH_TOKEN_FORMAT = " JWT %s"

    private var mPresenter: APRESENTER? = null

    private var mServiceHolder: ServiceHolder? = null
    private var mServiceHolder2: ServiceHolder? = null

    constructor (presenter: APRESENTER) {
        mPresenter = presenter
        mServiceHolder = ServiceHolder.getInstance(presenter.getContext()!!)
    }

    /**
     * @return [APRESENTER] - for interactors to invoke methods in presenter
     */
    fun getPresenter(): APRESENTER? {
        return mPresenter
    }

    /**
     * @return [ServiceHolder] instance for Interactors to access services
     */
    protected fun getServices(): ServiceHolder? {
        return mServiceHolder
    }

    /**

     * @param response Response from the API of type [BaseResponseModel]
     * *
     * @return [Boolean] - whether the api request is success or failure
     */
    protected fun isSuccess(response: BaseResponseModel): Boolean {

        return response.status == SUCCESS
    }

    /**
     * Method that converts an internal [Exception] to displayable message for API errors
     * @param throwable - value obtained from network callback
     * *
     * @return [String] message that is to be displayed to the user
     */
    protected fun getErrorMessage(throwable: Throwable): String? {
        var errorMessage: String? = null
        if (throwable is UnknownHostException) {
            errorMessage = INTERNET_CONNECTION_ISNT_WORKING
        }
        return errorMessage
    }

    /**
     * Returns the Authorization token in required format for API calls
     * @return [String] authorization token required for API calls
     */
  /*  protected fun getAuthToken(): String {
        return String.format(AUTH_TOKEN_FORMAT, getServices().getPersistenceServices().getString(USER_JWT_TOKEN))
    }*/

    /**
     * @param collection
     * *
     * @param <T>
     * *
     * @return [Boolean] whether the collection is empty or not
    </T> */
    protected fun <T> isEmptyCollection(collection: Collection<T>?): Boolean {
        return null == collection || collection.size == 0
    }

    /*protected fun getAuthKey(): String {

        return getServices().getPersistenceServices().getString(GlobalConstants.USER_AUTH_KEY)
    }*/

}