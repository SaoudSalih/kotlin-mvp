package ssa.abc.alrais.basekotlin.service.network

import android.content.Context
import android.util.Log


/**
 * Created by saoud on 10/6/17.
 */
class ServiceHolder {



    var mNetworkServices: NetworkServices? = null
//    private var networkSerivice:NetworkServicesImpl? = null
companion object {
    @Volatile private var sInstance: ServiceHolder? = null
    fun getInstance(context: Context): ServiceHolder? {
        if (null == sInstance) {
            synchronized(ServiceHolder::class.java) {
                sInstance = ServiceHolder(context)
            }
        }

        return sInstance!!


    }
}

    constructor(context: Context){
        mNetworkServices = NetworkServicesImpl().getInstance()
        //        mSharedPreferanceService = PreferenceServiceImpl.getInstance(context)
        //        mDbServiceInterface = DbSeviceImplementation.getInstance(context);
    }




    fun getNetworkServices(): NetworkServices? {
        Log.i("msgggg",mNetworkServices.toString())
        return mNetworkServices
    }

    /**
     * @return Singleton instance of the {@Link IPersistenceServices} for interactors to use storage and retrieval methods
     */
  /*  fun getPersistenceServices(): SharedPrefService {
        return mSharedPreferanceService
    }
*/

}