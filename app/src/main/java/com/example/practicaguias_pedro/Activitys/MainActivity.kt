package com.example.practicaguias_pedro.Activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicaguias_pedro.databinding.ActivityMainBinding

enum class ProviderType{
    BASIC
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Llamas a los intent para que te lleven a un lugar u otro dependiendo de la imagen que se seleccione
        binding.IIglesias.setOnClickListener {
            val intent = Intent(this, IglesiasA::class.java)
            startActivity(intent)
        }

        binding.IMonumentos.setOnClickListener {
            val intent = Intent(this,Monumentos::class.java)
            startActivity(intent)
        }

        binding.IPlazas.setOnClickListener {
            val intent = Intent(this,Parques::class.java)
            startActivity(intent)
        }

        binding.IRestaurantes.setOnClickListener {
            val intent = Intent(this,Restaurantes::class.java)
            startActivity(intent)
        }

        binding.IOtros.setOnClickListener {
            val intent = Intent(this,Otros::class.java)
            startActivity(intent)
        }

        binding.IFoto.setOnClickListener {
            val intent = Intent(this,Fotos::class.java)
            startActivity(intent)
        }
    }
}