package ssa.abc.alrais.basekotlin.service.network


import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ssa.abc.alrais.basekotlin.BuildConfig
import ssa.abc.alrais.basekotlin.app.GlobalConstants
import ssa.abc.alrais.basekotlin.model.requestmodel.BaseChartModel
import ssa.abc.alrais.basekotlin.model.requestmodel.DashboardRequestBean
import ssa.abc.alrais.basekotlin.model.responsemodel.ResponseChartModel
import ssa.abc.alrais.basekotlin.util.AlraisStegnoGraphy


/**
 * Created by saoud on 10/6/17.
 */
class NetworkServicesImpl : AlraisStegnoGraphy,NetworkServices{
    override fun getSteganoWord(stegano: String) {

    }

    override fun getText(stegano: String) {
        mRetrofit = Retrofit.Builder().baseUrl(BuildConfig.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        mAPIServices = mRetrofit?.create<ApiServices>(ApiServices::class.java!!)
    }


    override fun getBarcharts(dashboardRequestBean: DashboardRequestBean, callback: Callback<ResponseChartModel<BaseChartModel>>) {
        val call = mAPIServices?.getBarcharts(dashboardRequestBean)
        call?.enqueue(callback)

    }

    @Volatile private var sInstance: NetworkServicesImpl? = null

    private var mRetrofit: Retrofit? = null

    var mAPIServices: ApiServices? = null

    /**
     * Singleton pattern implementation
     */

    fun getInstance(): NetworkServices? {

        if (null == sInstance) {
            synchronized(NetworkServicesImpl::class.java) {
                sInstance = NetworkServicesImpl()

            }
        }

        return sInstance
    }


      constructor() : super(GlobalConstants.WEB_APP_URL,true, GlobalConstants.URL_PATTERN)


}