package com.zevans.menudemisapps

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zevans.menudemisapps.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val BtnSaludApp = findViewById<Button>(R.id.BtnSaludApp)
        val BtnImcApp = findViewById<Button>(R.id.BtnImcApp)


        BtnSaludApp.setOnClickListener {
            navigateToSaludApp() }

        BtnImcApp.setOnClickListener { navigatetoImcApp() }


    }

    private fun navigatetoImcApp() {
     val intent = Intent(this,ImcCalculatorActivity::class.java)
        startActivity(intent)


    }


    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)

    }

}
