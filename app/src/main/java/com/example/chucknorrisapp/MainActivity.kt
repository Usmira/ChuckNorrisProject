package com.example.chucknorrisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Joke>
    private lateinit var jokesText : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        jokesText = arrayOf()

        newRecyclerView=findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList= arrayListOf()

        val joke = Joke(emptyList(),"2020-01-05 13:42:26.766831", "https://assets.chucknorris.host/img/avatar/chuck-norris.png","pyNXTV7WThiNLRykGsQmrg","2020-01-05 13:42:26.766831","https://api.chucknorris.io/jokes/pyNXTV7WThiNLRykGsQmrg","The hills are alive with the sound of Chuck Norris' dong slapping against his legs while he walks.")
        newArrayList.add(joke)
        newRecyclerView.adapter = JokeAdapter(newArrayList)

    }



}