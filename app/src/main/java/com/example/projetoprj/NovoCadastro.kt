package com.example.projetoprj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoprj.databinding.ActivityNovoCadastroBinding

class NovoCadastro : AppCompatActivity() {

    private lateinit var ancb : ActivityNovoCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ancb = ActivityNovoCadastroBinding.inflate(layoutInflater)
        setContentView(ancb.root)

        ancb.voltarBtn.setOnClickListener {
            val voltarTelaLogin = Intent(this, MainActivity::class.java)
            startActivity(voltarTelaLogin)
        }
    }
}