package com.example.projetoprj

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import androidx.core.view.isVisible
import com.example.projetoprj.databinding.ActivityNovoCadastroBinding
import java.text.SimpleDateFormat
import java.util.*


class NovoCadastro : AppCompatActivity() {

    var calendario = Calendar.getInstance()
    private lateinit var ancb : ActivityNovoCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ancb = ActivityNovoCadastroBinding.inflate(layoutInflater)
        setContentView(ancb.root)

        supportActionBar?.hide()

        var dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(p0: DatePicker?, ano: Int, mes: Int, dia: Int) {
                calendario.set(Calendar.YEAR, ano)
                calendario.set(Calendar.MONTH, mes)
                calendario.set(Calendar.DAY_OF_MONTH, dia)

                val formatador = SimpleDateFormat("dd/MM/yyyy", Locale.ITALY)
                ancb.showDataTv.text = formatador.format(calendario.time)

                if(ancb.showDataTv.text != null && ancb.showDataTv.text != "" ){
                    ancb.showDataTv.visibility = View.VISIBLE
                }
            }
        }

        ancb.dataNascimentoBt.setOnClickListener {
            DatePickerDialog(this, dateSetListener, calendario.get(Calendar.YEAR),
                calendario.get(Calendar.MONTH), calendario.get(Calendar.DAY_OF_MONTH)).show()
        }

        ancb.voltarBtn.setOnClickListener {
            val voltarTelaLogin = Intent(this, MainActivity::class.java)
            startActivity(voltarTelaLogin)
        }
    }
}