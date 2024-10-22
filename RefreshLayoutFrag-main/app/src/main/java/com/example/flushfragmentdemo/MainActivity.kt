package com.example.flushfragmentdemo



import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flushfragmentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            binding.textView.text = "Welcome Developer ViewBinding"
        }
        binding.buttonNext.setOnClickListener {
            startActivity(
                Intent(this, SecondActivity::class.java)
            )
        }
    }

}
