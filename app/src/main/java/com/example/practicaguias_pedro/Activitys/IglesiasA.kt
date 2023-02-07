package com.example.practicaguias_pedro.Activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicaguias_pedro.databinding.ActivityIglesiasBinding
import com.example.practicaguias_pedro.recyclerView.IglesiaAdapter
import com.example.practicaguias_pedro.recyclerView.IglesiasR
import com.google.firebase.firestore.FirebaseFirestore

class IglesiasA : AppCompatActivity() {
    //Variables
    lateinit var binding: ActivityIglesiasBinding

    //Lista por la cual se puede ir incrementando
    lateinit var ListaIglesias: MutableList<IglesiasR>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIglesiasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RVIglesias.layoutManager = LinearLayoutManager(this)

        //Llamada al método creado
        datos()

        //Intent para ir a la pantalla de insertar la iglesia
        binding.BInsertarIglesia.setOnClickListener {
            val intent = Intent(this,Insertar_Iglesia::class.java)
            startActivity(intent)
        }
    }
    public fun datos(){
        //Llamada al método de FireStore para obtener todos los datos
        val db = FirebaseFirestore.getInstance()
        ListaIglesias = ArrayList<IglesiasR>()

        //Llamas a la colección para mostrar
        db.collection("iglesias").get().addOnSuccessListener {
            //Lo recorres mientras siga habiendo iglesias
            for(iglesia in it){
                var Info = IglesiasR(
                    nombre = iglesia["Nombre"].toString(),
                    direccion = iglesia["direccion"].toString(),
                    enlace = iglesia["enlace"].toString(),
                    horario = iglesia["horario"].toString()
                )
                ListaIglesias.add(Info)
            }
            //Llamas al adapter
            binding.RVIglesias.adapter = IglesiaAdapter(ListaIglesias)
        }
    }

}