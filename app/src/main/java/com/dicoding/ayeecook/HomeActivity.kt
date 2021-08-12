package com.dicoding.ayeecook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }

    fun onSaveButtonClick(view: View){
        val name = nametxt.text.toString()
        val pass = passtxt.text.toString()

        val intent = Intent(this@HomeActivity, MainActivity::class)
        intent.putExtra("nama", name)
        startActivity(intent)
    }
}
