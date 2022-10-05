package com.example.projetoprj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoprj.databinding.ActivityTelaInicialBinding

class TelaInicial : AppCompatActivity() {

    private lateinit var atib: ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        atib = ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(atib.root)

        atib.sairBtn.setOnClickListener {
            val voltarLogin = Intent(this, MainActivity::class.java)
            startActivity(voltarLogin)
        }

        atib.visualizarBtn.setOnClickListener {
            val paginaProduto = Intent(this, TelaProduto::class.java)
            startActivity(paginaProduto)
        }

    }
}