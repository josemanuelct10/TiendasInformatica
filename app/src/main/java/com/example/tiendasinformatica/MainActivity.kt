package com.example.tiendasinformatica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listacompra.adapter.ListaAdapter
import com.example.tiendasinformatica.BBDD.Listatiendas
import com.example.tiendasinformatica.BBDD.MiListaApp
import com.example.tiendasinformatica.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ActivityWithMenus() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var ListaTiendas: MutableList<Listatiendas>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        val manager = LinearLayoutManager(this)

        binding.recycler.layoutManager = manager
        // binding.recycler.adapter = ListaAdapter()


    }

    private fun insertarTienda(){

        val extras = intent.extras
        val nombreT = extras?.getString("nombre")
        val direccionT = extras?.getString("direccion")
        val telefonoT = extras?.getString("telefono")

        CoroutineScope(Dispatchers.IO).launch {
            var tienda = { Listatiendas(nombre = nombreT, direccion = direccionT, telefono = telefonoT) }

            ListaTiendas.add(tienda)
        }




    }
}