package com.carwale.carwalecovid.services

import com.carwale.carwalecovid.model.Summary
import com.carwale.carwalecovid.utils.Constant
import io.reactivex.Single
import retrofit2.http.GET

interface ApiInterface {


    @GET(Constant.SubUrl.SUMMARY)
    fun getSummary(): Single<Summary>

    /* @POST(Constant.SubUrl.DEVICE)
     fun sendDeviceDetail(@Body device: Device): Call<Device>

     @POST(Constant.SubUrl.DOSES)
     fun sendDeviceDoses(@Body doses: Doses): Call<ResponseBody>

     @POST(Constant.SubUrl.ASTHMA_DIARIES)
     fun sendAsthmaDiaryRecord(@Body asthmaDiaryRecord: AsthmaDiaryRecord): Call<ResponseBody>*/

}