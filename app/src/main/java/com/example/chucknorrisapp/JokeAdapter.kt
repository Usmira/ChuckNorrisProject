package com.example.chucknorrisapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class JokeAdapter (private val jokesList : ArrayList<Joke>): RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list ,parent,false)
        return JokeViewHolder(view)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.textView.text = jokesList[position].value
    }

    override fun getItemCount()= jokesList.size


    inner class JokeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.text_Joke)
    }

}