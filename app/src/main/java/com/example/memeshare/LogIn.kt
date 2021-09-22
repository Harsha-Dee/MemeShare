package com.example.memeshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memeshare.databinding.ActivityLogInBinding
import com.sawolabs.androidsdk.Sawo

class LogIn : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.loginbutton.setOnClickListener {
            Sawo(
                this,
                "5484a487-6e03-4559-88b5-d7307ad2f27b", // your api key
                "614b708b09e2ab2081566863Rlrz4uIMgZcTXOkZYH3E0ZXs"  // your api key secret
            ).login(
                "phone_number_sms", // can be one of 'email' or 'phone_number_sms'
                MainActivity::class.java.name // Callback class name
            )
        }
    }
}