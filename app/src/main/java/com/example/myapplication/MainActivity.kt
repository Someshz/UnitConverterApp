package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var editText:EditText
    private lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.editTextNumber)
        textView=findViewById(R.id.textView2)
    }

    fun clickToConvertKIloToPound(view: View) {
        var valueInKilo=editText.text.toString()
        if(valueInKilo.isNotEmpty()){
            val poundValue=valueInKilo.toInt()*2.2
            textView.text=poundValue.toString()
        }else{
            textView.text="null"
        }
    }
}
