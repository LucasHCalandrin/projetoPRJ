package com.example.projetoprj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoprj.databinding.ActivityTelaProdutoBinding

class TelaProduto : AppCompatActivity() {

    private lateinit var atpb : ActivityTelaProdutoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        atpb = ActivityTelaProdutoBinding.inflate(layoutInflater)
        setContentView(atpb.root)

        atpb.voltarBtn.setOnClickListener {
            val voltarInicio = Intent(this, TelaInicial::class.java)
            startActivity(voltarInicio)
        }
    }
}