package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persona = Programador().getProgrammerData()
        Log.d(":::tag","Mi nombre es ${persona.name}")
        Log.d(":::tag","Tengo ${persona.age} años")
        Log.d(":::tag","Estoy aprendiendo ${persona.language}")
    }

    class Programador(): ProgramadorInterface{
       private fun nombre():String{
           val name: String = "Estefanía"
            return name
        }

        private fun edad():Int{
            val age: Int = 31
            return age
        }

        private fun lenguaje():String{
            val lenguage: String = "Kotklin"
            return lenguage
        }


     override fun getProgrammerData():ProgrammerData{
           val solucion = ProgrammerData(nombre(),edad(),lenguaje())
         return solucion
     }

    }

    interface ProgramadorInterface{
       fun getProgrammerData():ProgrammerData
    }

    data class ProgrammerData(val name: String, val age:Int, val language:String){
    }
}