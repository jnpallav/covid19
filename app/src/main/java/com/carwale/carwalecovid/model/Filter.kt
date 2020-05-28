package com.carwale.carwalecovid.model

data class Filter(
        var TotalConfirmed: Int?=null,
        var isTotalConfirmGreater:Boolean?=null,
        var Deaths: Int?=null,
        var isDeathGreater:Boolean?=null,
        var Recovered: Int?=null,
        var isRecoveredGreater:Boolean?=null
    )