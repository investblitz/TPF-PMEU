package com.example.weatherapp
import android.app.Application
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "c214259f-43c3-434e-a5ba-d563a0e5eda0"


class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        // TODO: Add OneSignal initialization here

        // Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}