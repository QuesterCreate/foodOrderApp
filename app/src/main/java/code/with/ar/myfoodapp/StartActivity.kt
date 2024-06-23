package code.with.ar.myfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import code.with.ar.myfoodapp.databinding.ActivityStartBinding


class StartActivity : AppCompatActivity() {
    private val binding: ActivityStartBinding by lazy{
        ActivityStartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.nextbutton.setOnClickListener {
            val intent= Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
    }
}