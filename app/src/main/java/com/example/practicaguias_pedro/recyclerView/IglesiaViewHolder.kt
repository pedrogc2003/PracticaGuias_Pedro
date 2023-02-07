package com.example.practicaguias_pedro.recyclerView

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.practicaguias_pedro.databinding.ViewIglesiasSingleBinding

//Valores que se cogen dentro del Holder y dar valores dentro del Layout
class IglesiaViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ViewIglesiasSingleBinding.bind(view)
    fun render(IglesiaModel: IglesiasR){
        binding.TVNombreIglesia.text = IglesiaModel.nombre
        binding.TVDirec.text= IglesiaModel.direccion
        binding.TVEnlace.text = IglesiaModel.enlace
        binding.TVHorario.text = IglesiaModel.horario
    }
}