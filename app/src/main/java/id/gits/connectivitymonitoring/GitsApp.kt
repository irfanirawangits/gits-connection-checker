package id.gits.connectivitymonitoring

import android.app.Application

/**
 * Created by irfanirawansukirman on 30/01/18.
 */

class GitsApp : Application() {

    override fun onCreate() {
        super.onCreate()

        instance = this
    }

    fun setConnectivityListener(listener: ConnectivityReceiver.ConnectivityReceiverListener) {

        ConnectivityReceiver.connectivityReceiverListener = listener

    }

    companion object {

        @get:Synchronized
        var instance: GitsApp? = null
            private set

    }
}
