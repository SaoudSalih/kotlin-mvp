package ssa.abc.alrais.basekotlin.service.network




import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import ssa.abc.alrais.basekotlin.model.requestmodel.BaseChartModel
import ssa.abc.alrais.basekotlin.model.requestmodel.DashboardRequestBean
import ssa.abc.alrais.basekotlin.model.responsemodel.ResponseChartModel


/**
 * Created by saoud on 10/6/17.
 */
interface ApiServices {

    @POST("/getDashlet")
    fun getBarcharts(@Body dashboardRequestBean: DashboardRequestBean): Call<ResponseChartModel<BaseChartModel>>


}