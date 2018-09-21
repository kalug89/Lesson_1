package com.example.dkaluzny.lesson1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello_world.text = getString(R.string.some_text)



        hello_world.setOnClickListener { view ->
            val toast = Toast.makeText(this, R.string.some_text, Toast.LENGTH_LONG)
            toast.duration = 5
            toast.show()
        }
        val context = this
        hello_world.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(context, R.string.some_text, Toast.LENGTH_LONG).show()
            }
        }
        )

        val toast
    }
}
