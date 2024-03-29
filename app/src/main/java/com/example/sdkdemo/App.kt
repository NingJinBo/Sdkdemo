package com.example.sdkdemo

import android.app.Application

/**
 * @auth: njb
 * @date: 2024/3/28 13:06
 * @desc: 描述
 */
class App:Application() {
    companion object{
        val instance: App by lazy { App() }
    }
}