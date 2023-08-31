package com.curso.android.app.practica.proyectofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.curso.android.app.practica.proyectofinal.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        mainViewModel.comparador.observe(  this) {
            // = binding.editTextText4.text
            //it.cadena2.plus(binding.editTextText5.text)
            binding.textView.text = it.cadena3
        }

        binding.button3.setOnClickListener {
            mainViewModel.comparar()
        }
    }
}