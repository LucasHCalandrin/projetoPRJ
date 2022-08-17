package com.example.projetoprj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.projetoprj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var amb : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        amb.logarBtn.setOnClickListener {
            
            if(amb.usuarioEt.text.toString() == "lucas@email.com" && amb.senhaEt.text.toString() == "senha123"){
                val logarTelaInicial = Intent(this, TelaInicial::class.java)
                startActivity(logarTelaInicial)   
            }
            else if (amb.usuarioEt.text.toString() == "" || amb.senhaEt.text.toString() == ""){
                Toast.makeText(this, "Digite Seu Usuário e Senha !!", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Usuário Não Encontrado !! \n Tente Novamente", Toast.LENGTH_SHORT).show()
            }
        }
    }
}