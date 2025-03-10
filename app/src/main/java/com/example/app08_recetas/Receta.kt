package com.example.app08_recetas
//Miembros del equipo:
//Coronel Meza Sergio Daniel
//Sanchez Cruz Sergio Antonio

data class Receta(
    val nombre: String,
    val ingredientes: String,
    val instrucciones: String)

//val nombre: String:
//Esto declara una propiedad llamada nombre de tipo String. La palabra clave val significa que esta propiedad es de solo lectura (inmutable). Representa el nombre de la receta.
//val ingredientes: String:
//Esto declara una propiedad llamada ingredientes de tipo String. Esta propiedad contendrá la lista de los ingredientes necesarios para realizar la receta.
//val instrucciones: String:
//Esto declara una propiedad llamada instrucciones de tipo String. Esta propiedad contendrá los pasos a seguir para realizar la receta.
