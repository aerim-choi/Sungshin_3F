package org.techtown.sungshin3f

import android.app.Application
import androidx.viewbinding.BuildConfig
import org.techtown.sungshin3f.di.appModule
import org.techtown.sungshin3f.di.dataModule
import org.techtown.sungshin3f.di.domainModule
import org.techtown.sungshin3f.di.presenterModule
import org.techtown.sungshin3f.utility.MovieDataGenerator
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MovieReviewApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(
                if (BuildConfig.DEBUG) {
                    Level.DEBUG
                } else {
                    Level.NONE
                }
            )
            androidContext(this@MovieReviewApplication)
            modules(appModule + dataModule + domainModule + presenterModule)
        }
        // MovieDataGenerator().generate()
    }
}
