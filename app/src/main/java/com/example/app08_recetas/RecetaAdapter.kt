package com.example.app08_recetas
//Miembros del equipo:
//Coronel Meza Sergio Daniel
//Sanchez Cruz Sergio Antonio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecetaAdapter(private val listaRecetas: MutableList<Receta>) :
    RecyclerView.Adapter<RecetaAdapter.RecetaViewHolder>() {

    /**
     * Clase interna que representa un elemento de la lista (ViewHolder).
     *
     * @property itemView La vista del elemento individual de la lista.
     */
    class RecetaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // TextView para mostrar el nombre de la receta.
        val textViewNombre: TextView = itemView.findViewById(R.id.textViewNombre)
    }

    /**
     * Crea una nueva vista para un elemento de la lista (ViewHolder).
     *
     * @param parent El ViewGroup padre al que se agregará la nueva vista.
     * @param viewType El tipo de vista del nuevo elemento (no se utiliza en este caso).
     * @return Un nuevo RecetaViewHolder que contiene la vista del elemento.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaViewHolder {
        // Infla el layout del elemento individual de la lista (item_receta.xml).
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_receta, parent, false)
        // Crea y devuelve un nuevo RecetaViewHolder con la vista inflada.
        return RecetaViewHolder(itemView)
    }

    /**
     * Vincula los datos de una receta a la vista de un elemento de la lista (ViewHolder).
     *
     * @param holder El RecetaViewHolder que se actualizará con los datos.
     * @param position La posición del elemento en la lista.
     */
    override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        // Obtiene la receta de la lista en la posición especificada.
        val receta = listaRecetas[position]
        // Establece el texto del TextView con el nombre de la receta.
        holder.textViewNombre.text = receta.nombre
    }

    /**
     * Devuelve el número total de elementos en la lista.
     *
     * @return El número de elementos en la lista.
     */
    override fun getItemCount(): Int {
        // Devuelve el tamaño de la lista de recetas.
        return listaRecetas.size
    }
}