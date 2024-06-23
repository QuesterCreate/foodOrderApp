package code.with.ar.myfoodapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        android.os.Handler().postDelayed({
            val intent= Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}