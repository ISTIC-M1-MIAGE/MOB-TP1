package com.example.mob_tp1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mob_tp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // Starting point
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Button initialization
        binding.btn0.setOnClickListener {
            if (binding.bottomScreen.text != "0") {
                binding.bottomScreen.text = "${binding.bottomScreen.text}0"
            }
        }

        binding.btn1.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "1"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}1"
            }
        }

        binding.btn2.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "2"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}2"
            }
        }

        binding.btn3.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "3"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}3"
            }
        }

        binding.btn4.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "4"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}4"
            }
        }

        binding.btn5.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "5"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}5"
            }
        }

        binding.btn6.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "6"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}6"
            }
        }

        binding.btn7.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "7"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}7"
            }
        }

        binding.btn8.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "8"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}8"
            }
        }

        binding.btn9.setOnClickListener {
            if (binding.bottomScreen.text == "0") {
                binding.bottomScreen.text = "9"
            } else {
                binding.bottomScreen.text = "${binding.bottomScreen.text}9"
            }
        }
        
    }
}