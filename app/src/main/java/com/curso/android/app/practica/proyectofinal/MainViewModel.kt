package com.curso.android.app.practica.proyectofinal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val comparador: LiveData<Comparador> get() = _comparador
    private var _comparador = MutableLiveData<Comparador>(Comparador("","", "Compara textos" ))


    fun comparar() {

        val text1 = (_comparador.value?.cadena1 ?: "")
        val text2 = (_comparador.value?.cadena2 ?: "")

        if(text1 == text2) { // Si los textos de ambos cuadros son iguales
            val text3 = "Los textos son iguales"
            updateComparador(text1, text2, text3)
        }
        else { // Si los textos de los cuadros son diferentes
            val text3 = "Los textos son diferentes"
            updateComparador(text1, text2, text3)
        }
    }

    private fun updateComparador(text1: String, text2: String, text3: String) {
        _comparador.value = Comparador(text1, text2, text3)
    }
}