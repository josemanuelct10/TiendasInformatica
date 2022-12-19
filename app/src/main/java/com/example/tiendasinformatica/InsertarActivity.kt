package com.example.tiendasinformatica

import android.content.Intent
import android.graphics.Insets.add
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tiendasinformatica.BBDD.Listatiendas
import com.example.tiendasinformatica.BBDD.MiListaApp
import com.example.tiendasinformatica.databinding.ActivityInsertarBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class InsertarActivity : ActivityWithMenus() {
    private lateinit var binding:ActivityInsertarBinding
    lateinit var listaTiendas: MutableList<Listatiendas>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInsertarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listaTiendas = ArrayList()
        val nombre = binding.nombretienda.toString()
        val direccion = binding.direcciontienda.toString()
        val telefono = binding.telefonotienda.toString()
        binding.botonanadir.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("nombre",binding.nombretienda.text.toString())
                putExtra("direccion",binding.direcciontienda.text.toString())
                putExtra("telefono",binding.telefonotienda.text.toString())
            }
            startActivity(intent)

            }
        }

}