package com.potis.honorsmobileapps.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pointA=findViewById<TextView>(R.id.scoreA)
        val pointB=findViewById<TextView>(R.id.scoreB)
        val a3=findViewById<Button>(R.id.pa3)
        val b3=findViewById<Button>(R.id.pb3)
        val a2=findViewById<Button>(R.id.pa2)
        val b2=findViewById<Button>(R.id.pb2)
        val a1=findViewById<Button>(R.id.pa1)
        val b1=findViewById<Button>(R.id.pb1)
        val reset=findViewById<Button>(R.id.reset)
        var scoreA=0
        var scoreB=0
        a3.setOnClickListener{
            scoreA+=3
            pointA.text=scoreA.toString()
            Snackbar.make(findViewById(R.id.snack), R.string.a,Snackbar.LENGTH_SHORT).show()
        }
        a2.setOnClickListener{
            scoreA+=2

            pointA.text=scoreA.toString()
        }
        a1.setOnClickListener{
            scoreA+=1
            pointA.text=scoreA.toString()
        }
        b3.setOnClickListener{
            scoreB+=3
            pointB.text=scoreB.toString()
            Snackbar.make(findViewById(R.id.snack), R.string.b,Snackbar.LENGTH_SHORT).show()
        }
        b2.setOnClickListener{
            scoreB+=2
            pointB.text=scoreB.toString()
        }
        b1.setOnClickListener{
            scoreB+=1
            pointB.text=scoreB.toString()
        }
        reset.setOnClickListener{
            pointB.text="0"
            pointA.text="0"
            scoreB=0
            scoreA=0
        }
    }
}