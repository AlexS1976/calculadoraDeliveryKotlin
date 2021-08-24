package com.example.calculadoraprecodelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var valorProduto: String = ""
    var porcentagemDelivery : String = ""
    var valorIdeal : String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valorProduto = findViewById<View>(R.id.text_valor_produto).toString()
        porcentagemDelivery = findViewById<View>(R.id.text_porcrentagem_delivery).toString()
        valorIdeal = findViewById<View>(R.id.text_valor_ideal).toString()

        val botaoCalcular : Button = findViewById(R.id.button_calcular)


        }

        fun calcular(){
            val valor = valorProduto.toDouble()
            val porcentagem = porcentagemDelivery.toDouble()
            val resultado = valor/(1 - (porcentagem/100))


        }







}