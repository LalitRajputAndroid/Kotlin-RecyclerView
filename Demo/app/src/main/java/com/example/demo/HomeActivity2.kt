package com.example.demo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home2.*

class HomeActivity2 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)


         var name :String = intent.getStringExtra("n").toString()
         var email: String = intent.getStringExtra("e").toString()
         var pass : String = intent.getStringExtra("p").toString()


        recyclerview_id.layoutManager = LinearLayoutManager(this)

        val list = ArrayList<Modal>()

        list.add(Modal(name,email,pass))

        val myAdapter = MyAdapter(this,list)

        recyclerview_id.adapter = myAdapter
    }
}