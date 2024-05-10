package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentactivity.databinding.ActivityMainBinding
import com.example.intentactivity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val message = binding.edMessage.text.toString()
            val intent = Intent()
            intent.putExtra("msg",message)
            setResult(200,intent)
            finish()
        }
    }
}