package com.vanshika.relativelayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private var btnNumber : Button?=null
    private var btnMul : Button?=null
    private var btnDiv : Button?=null
    private var btnMinus : Button?=null
    private var btnAdd : Button?=null
    private var btnNext : Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnNumber = findViewById(R.id.btnNumber)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        btnMinus = findViewById(R.id.btnMinus)
        btnAdd = findViewById(R.id.btnAdd)
        btnNext = findViewById(R.id.btnNext)

     /*   btnMul?.setOnClickListener{
            (btnNumber?.text.toString().trim().toInt())*2
        }
        btnDiv?.setOnClickListener{
            (btnNumber?.text.toString().trim().toInt())/2
        }
        btnMinus?.setOnClickListener{
            (btnNumber?.text.toString().trim().toInt())-2
        }
        btnAdd?.setOnClickListener{
            (btnNumber?.text.toString().trim().toInt())+2
        }*/
        btnNext?.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "on Start called", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "on Resume called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "on Pause called", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "on Stop called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "on Destroy called", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "on Restart called", Toast.LENGTH_LONG).show()
    }
}