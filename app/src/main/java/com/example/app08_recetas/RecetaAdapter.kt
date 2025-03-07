package com.example.app08_recetas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecetaAdapter(private val listaRecetas: MutableList<Receta>) :
    RecyclerView.Adapter<RecetaAdapter.RecetaViewHolder>() {
    class RecetaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewNombre: TextView = itemView.findViewById(R.id.textViewNombre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecetaViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_receta, parent, false)
        return RecetaViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        val receta = listaRecetas[position]
        holder.textViewNombre.text = receta.nombre
    }

    override fun getItemCount(): Int {
        return listaRecetas.size
    }
}