package ssa.abc.alrais.basekotlin.service.network

import ssa.abc.alrais.basekotlin.model.requestmodel.BaseChartModel
import ssa.abc.alrais.basekotlin.model.responsemodel.ResponseChartModel
import ssa.abc.alrais.basekotlin.model.requestmodel.DashboardRequestBean
import retrofit2.Callback;



/**
 * Created by saoud on 10/6/17.
 */
interface NetworkServices {

    fun getBarcharts(dashboardRequestBean: DashboardRequestBean, callback: Callback<ResponseChartModel<BaseChartModel>>)
}