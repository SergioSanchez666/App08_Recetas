package com.example.app08_recetas
//Miembros del equipo:
//Coronel Meza Sergio Daniel
//Sanchez Cruz Sergio Antonio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app08_recetas.ui.theme.App08_RecetasTheme
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : ComponentActivity() {
    // Declaración de variables para elementos de la interfaz de usuario y datos
    private lateinit var recyclerViewRecetas: RecyclerView // RecyclerView para mostrar la lista de recetas
    private lateinit var fabAgregarReceta: FloatingActionButton // FloatingActionButton para agregar nuevas recetas
    private lateinit var listaRecetas: MutableList<Receta> // Lista mutable para almacenar objetos Receta
    private lateinit var adaptador: RecetaAdapter // Adaptador para el RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Establece el layout de la actividad

        // Inicialización de los elementos de la interfaz de usuario
        recyclerViewRecetas = findViewById(R.id.recyclerViewRecetas)
        fabAgregarReceta = findViewById(R.id.fabAgregarReceta)

        // Inicialización de la lista de recetas y el adaptador
        listaRecetas = mutableListOf() // Inicializa la lista mutable de recetas
        adaptador = RecetaAdapter(listaRecetas) // Crea una instancia del adaptador con la lista de recetas
        recyclerViewRecetas.layoutManager = LinearLayoutManager(this) // Establece el LayoutManager para el RecyclerView (LinearLayoutManager en este caso)
        recyclerViewRecetas.adapter = adaptador // Asigna el adaptador al RecyclerView

        // Listener para el FloatingActionButton de agregar recetas
        fabAgregarReceta.setOnClickListener {
            // Aquí se implementará la lógica para agregar una nueva receta
            // Por ejemplo, abrir un diálogo o una nueva actividad para ingresar los datos de la receta
        }
    }
}
