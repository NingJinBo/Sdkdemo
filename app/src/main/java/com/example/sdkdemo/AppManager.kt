package com.example.sdkdemo

import android.content.Context

/**
 * @auth: njb
 * @date: 2024/3/28 13:06
 * @desc: 描述
 */
interface AppManager {
  fun init(context: Context)

  fun startGame(userId:Int,ip:String,playTime:Long,apkName:String,appId:String)
}