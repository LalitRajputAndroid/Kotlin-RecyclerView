package com.example.demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_row.view.*

class MyAdapter(val context : Context,val list: ArrayList<Modal>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val Name = itemView.name_id
        val Email = itemView.email_id
        val Password = itemView.pass_id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(context);
        var view  = layoutInflater.inflate(R.layout.single_row,parent,false);

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.Name.text = list[position].name
        holder.Email.text = list[position].email
        holder.Password.text = list[position].password
    }
}