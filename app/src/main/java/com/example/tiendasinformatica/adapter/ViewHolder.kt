package com.example.listacompra.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendasinformatica.database.Listatiendas
import com.example.tiendasinformatica.databinding.ElementoBinding


class ListaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ElementoBinding.bind(view)

    fun bind(elemento: Listatiendas, deleteTienda: (Listatiendas) -> Unit) {
        binding.nombretienda.text= elemento.nombre
        binding.direccion.text=elemento.direccion
        binding.tlf.text=elemento.tlf

    }
}