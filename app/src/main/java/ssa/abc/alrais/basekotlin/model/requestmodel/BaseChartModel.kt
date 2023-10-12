package ssa.abc.alrais.basekotlin.model.requestmodel


import com.google.gson.annotations.SerializedName
import ssa.abc.alrais.kotlindemo.spprt.ListItem


/**
 * Created by saoud on 12/6/17.
 */
class BaseChartModel {

    var selectedId: Int? = null
    var chartMeasures: List<ListItem>? = null
    var chartContent: List<*>? = null
    var userInteraction: Boolean? = null
    @SerializedName("multitabEnabled")
    open var isMultitabEnabled: Boolean = false
}