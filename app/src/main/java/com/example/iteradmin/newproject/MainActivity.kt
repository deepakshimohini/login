package com.example.iteradmin.newproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View) {
when(v.id){
    R.id.login ->{
    Toast.makeText(applicationContext,"login",Toast.LENGTH_LONG).show()

}
        R.id.forget ->{
            Toast.makeText(applicationContext,"forget",Toast.LENGTH_LONG).show()
        }

        }
    }
    val a:Int =12
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<Button>(R.id.login)
        val forget= findViewById<Button>(R.id.forget)

        login.setOnClickListener(this);
        forget.setOnClickListener(this);

    }


}
