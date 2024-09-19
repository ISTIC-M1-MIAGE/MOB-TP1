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

        // NB: Faire une boucle pour configurer tous les boutons
        binding.btn9.setOnClickListener {
            onButtonClick(binding.btn9.text.toString())
        }
        
    }

    fun onButtonClick(btnText: String?){
        if (binding.bottomScreen.text == "0") {
            binding.bottomScreen.text = btnText
        }else{
            binding.bottomScreen.text = "${binding.bottomScreen.text}${btnText}"
        }

    }
}