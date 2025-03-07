package com.example.app08_recetas

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
    private lateinit var recyclerViewRecetas: RecyclerView
    private lateinit var fabAgregarReceta: FloatingActionButton
    private lateinit var listaRecetas: MutableList<Receta>
    private lateinit var adaptador: RecetaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewRecetas = findViewById(R.id.recyclerViewRecetas)
        fabAgregarReceta = findViewById(R.id.fabAgregarReceta)

        listaRecetas = mutableListOf()
        adaptador = RecetaAdapter(listaRecetas)
        recyclerViewRecetas.layoutManager = LinearLayoutManager(this)
        recyclerViewRecetas.adapter = adaptador
        fabAgregarReceta.setOnClickListener {

        }
    }
}
