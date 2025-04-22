package com.zevans.menudemisapps

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import com.zevans.androidmaster.todoapp.TodoActivity
import com.zevans.menudemisapps.HoroscopoClase.ZodiacActivity
import com.zevans.menudemisapps.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val BtnSaludApp = findViewById<Button>(R.id.BtnSaludApp)
        val BtnImcApp = findViewById<Button>(R.id.BtnImcApp)
        val BtnTODO = findViewById<Button>(R.id.BtnTODO)


        BtnSaludApp.setOnClickListener { navigateToSaludApp() }
        BtnTODO.setOnClickListener { navigateToTODO() }
        BtnImcApp.setOnClickListener { navigatetoImcApp() }





    }

    private fun navigateToTODO() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)

    }

    private fun navigatetoImcApp() {
     val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)


    }


    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)

    }






}
