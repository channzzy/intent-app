package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//      1. Intent tanpa result
//        binding.btnGo.setOnClickListener {
//            var intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)
//        }

        binding.btnWrite.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivityForResult(intent,100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100){
            if(resultCode == 200){
                var message = data?.getStringExtra("msg");
                binding.tvResult.text = message
            }
        }
    }
}