package app.beelabs.com.pandora

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        demoTitle.setText("Demo App Dynamic Library")
        val splitInstallManager = SplitInstallManagerFactory.create(this)

        val request = SplitInstallRequest.newBuilder()
            .addModule("sdk_auth")
            .addModule("sdk_core")
            .build()

        splitInstallManager.startInstall(request)

    }
}
