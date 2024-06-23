package code.with.ar.myfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import code.with.ar.myfoodapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private val binding: ActivitySignInBinding by lazy {
        ActivitySignInBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.alreadyHaveAccount.setOnClickListener {
            val intent= Intent(this, loginActivity::class.java)
           startActivity(intent)
        }
        binding.createAccount.setOnClickListener {
            Toast.makeText(this, "Account Created Successfully!!", Toast.LENGTH_SHORT).show()
            android.os.Handler().postDelayed({
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 1500)

        }
    }
}