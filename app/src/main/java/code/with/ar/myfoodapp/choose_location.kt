package code.with.ar.myfoodapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import code.with.ar.myfoodapp.databinding.ActivityChooseLocationBinding

class choose_location : AppCompatActivity() {



    private val binding:ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)

    }



    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    val locationlist= arrayOf("Jaipur" , "Kathmandu" , "Rajasthan" , "Odhisa" )
        val adapter= ArrayAdapter(this, android.R.layout.simple_list_item_1,locationlist)
        val autoCompleteTextView=binding.listoflocation
           autoCompleteTextView.setAdapter(adapter)




    }
}