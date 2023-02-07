package com.example.practicaguias_pedro.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practicaguias_pedro.R

//Clase para dar valores a la Iglesia
class IglesiaAdapter(val listaIglesias: List<IglesiasR>): RecyclerView.Adapter<IglesiaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IglesiaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return IglesiaViewHolder(layoutInflater.inflate(R.layout.view_iglesias_single,parent,false))
    }

    override fun getItemCount(): Int {
       return listaIglesias.size
    }

    override fun onBindViewHolder(holder: IglesiaViewHolder, position: Int) {
        val item = listaIglesias[position]
        holder.render(item)
    }
}