package ssa.abc.alrais.basekotlin.intractor.interactorimpl

import android.util.Log
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ssa.abc.alrais.basekotlin.intractor.base.BaseActivityInteractor
import ssa.abc.alrais.basekotlin.model.requestmodel.BaseChartModel
import ssa.abc.alrais.basekotlin.presenter.activity.presenterimpl.MainActivityPresenterImpl

import ssa.abc.alrais.basekotlin.model.requestmodel.DashboardArguments
import ssa.abc.alrais.basekotlin.model.requestmodel.DashboardRequestBean
import ssa.abc.alrais.basekotlin.model.responsemodel.ResponseChartModel


/**
 * Created by saoud on 10/6/17.
 */


class MainActivityIntractor : BaseActivityInteractor<MainActivityPresenterImpl> {


    constructor(mainActivityPresenterImpl: MainActivityPresenterImpl) : super(mainActivityPresenterImpl)

    fun setMessage(){

        val dashboardRequestBean = DashboardRequestBean()
        val dashboardArguments = DashboardArguments()
        dashboardRequestBean.dashboardId =2
        dashboardArguments.userId = 3
        dashboardArguments.chartTermId = 15502
        dashboardRequestBean.args = dashboardArguments


        getServices()?.getNetworkServices()?.getBarcharts(dashboardRequestBean, object : Callback<ResponseChartModel<BaseChartModel>> {
            override fun onFailure(call: Call<ResponseChartModel<BaseChartModel>>, t: Throwable?) {
                Toast.makeText(getPresenter()?.getContext(),"failed"+t?.message,Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<ResponseChartModel<BaseChartModel>>, response: Response<ResponseChartModel<BaseChartModel>>?) {
               Toast.makeText(getPresenter()?.getContext(),"success",Toast.LENGTH_SHORT).show()
                  if(response?.body()==null){
                      if(response?.body()?.content==null){
                          if(response?.body()?.content?.chartContent==null){
                              Toast.makeText(getPresenter()?.getContext(),"Tab",Toast.LENGTH_SHORT).show()
                          }else{
                              Toast.makeText(getPresenter()?.getContext(),"not",Toast.LENGTH_SHORT).show()
                          }
                      }else{
                          //content null
                      }
                  }else{
                      //body null
                  }
            }


        })

    }





}
