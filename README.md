[![](https://jitpack.io/v/irfanirawangits/gits-connection-checker.svg)](https://jitpack.io/#irfanirawangits/gits-connection-checker)

# GITS Connection Checker

Simple library for android real-time connection checking.

### Installing

Add it in your root build.gradle at the end of repositories:  

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency:

```
implementation 'com.github.irfanirawangits:gits-connection-checker:1.0.2'
```

### How to use it?

```
class SingleActivity : AppCompatActivity(), ConnectivityReceiver.ConnectivityReceiverListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.single_activity)

        checkConnectivityFirstTime()
    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {

        Toast.makeText(this@SingleActivity, isConnected.toString(), Toast.LENGTH_SHORT).show()

    }

    private fun checkConnectivityFirstTime() {

        val isConnected = ConnectivityReceiver.isConnected

        onNetworkConnectionChanged(isConnected)

    }

    override fun onResume() {
        super.onResume()

        GitsApp().setConnectivityListener(this)
    
    }
}
```

## Author

- Email : dadang.kotz@gmail.com
- Call/WhatsApp : 089531183668
- [LinkedIn][1]
- [Instagram][2]


[1]: https://www.linkedin.com/in/irfan-irawan-sukirman-9096bba7/
[2]: https://www.instagram.com/ir.rawasukma/