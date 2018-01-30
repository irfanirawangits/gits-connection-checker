package id.gits.connectivitymonitoring

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast


class MainActivity : AppCompatActivity(), ConnectivityReceiver.ConnectivityReceiverListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        checkConnectivityFirstTime()

    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {

        connectivityStatuss(isConnected)

    }

    override fun onResume() {
        super.onResume()

        GitsApp().setConnectivityListener(this@MainActivity)
    }

    private fun checkConnectivityFirstTime() {

        val isConnected = ConnectivityReceiver.isConnected

        connectivityStatuss(isConnected)

    }

    private fun connectivityStatuss(status: Boolean) {

        Toast.makeText(this@MainActivity, status.toString(), Toast.LENGTH_SHORT).show()

    }
}
