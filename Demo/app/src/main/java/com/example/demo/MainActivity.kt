package com.example.demo

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editor = getSharedPreferences("login", MODE_PRIVATE).edit()
        editor.putBoolean("data",false);
        editor.apply()
        
        var Name: String
        var Email: String
        var Password: String



        donebtn_id.setOnClickListener {

            Name = name_edittext.text.toString()
            Email = email_edittext.text.toString()
            Password = pass_edittext.text.toString()

            when {

                Name == "" || Email == "" || Password == "" -> {

                    name_edittext.setError("")
                    email_edittext.setError("")
                    pass_edittext.setError("")
                }
                Password.length <= 8 -> {
                    pass_edittext.setError("Password must be 8 character")
                }
                else -> {

                    val inext = Intent(this, HomeActivity2::class.java)
                    inext.putExtra("n", Name)
                    inext.putExtra("e", Email)
                    inext.putExtra("p", Password)

                    startActivity(inext)
                }
            }
        }
    }
}