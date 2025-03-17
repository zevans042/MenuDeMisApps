package com.zevans.menudemisapps.imccalculator

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.zevans.menudemisapps.R


class ImcCalculatorActivity : AppCompatActivity() {


    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false
    private var currentWeight:Int = 60
    private var currentAge:Int = 30
    private var currentHeight = 120

    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight:RangeSlider
    private lateinit var btnSubtractWeight:FloatingActionButton
    private lateinit var btnPlusWeight:FloatingActionButton
    private lateinit var tvWeigth:TextView
    private lateinit var btnSubtracage:FloatingActionButton
    private lateinit var btnPlusage:FloatingActionButton
    private lateinit var tvage:TextView
    private lateinit var btnCalculate:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
       initListeners()
        initUI()

    }

    private fun initListeners() {
      viewMale.setOnClickListener {
          setGenderColor()
          changeGender()

      }

        viewFemale.setOnClickListener {
            setGenderColor()
            changeGender()
        }
        rsHeight.addOnChangeListener { _,value,_->
            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "currentHeight cm"

        }
        btnPlusWeight.setOnClickListener {
            currentWeight += 1
            setWeight()
        }
        btnSubtractWeight.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }
        btnPlusage.setOnClickListener {
            currentAge += 1
            setAge()
        }
        btnSubtracage.setOnClickListener {
            currentAge -= 1
            setAge()

        }

        btnCalculate.setOnClickListener {
             calculateIMC()
        }

    }

    private fun calculateIMC() {
        val imc = currentWeight/ (currentHeight * currentHeight)
        Log.i("zevans", " el imc es $imc")
    }


    private fun setWeight(){
           tvWeigth.text = currentWeight.toString()

       }

    private fun setAge(){
        tvage.text = currentAge.toString()
    }



    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }



    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))

    }



    private fun getBackgroundColor(isSelectedComponet:Boolean):Int{


        val colorReference = if(isSelectedComponet){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }

        return ContextCompat.getColor(this, colorReference)

    }


    private fun initComponents(){
          viewMale = findViewById(R.id.viewMale)
          viewFemale = findViewById(R.id.viewFemale)
          tvHeight = findViewById(R.id.tvHeight)
          rsHeight = findViewById(R.id.rsHeight )
        btnSubtractWeight = findViewById(R.id.btnSubtractWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        tvWeigth = findViewById(R.id.tvWeigth)
        btnCalculate = findViewById(R.id.btnCalculate)

    }
    private fun initUI(){

        setGenderColor()
        setWeight()
        setAge()
    }

}