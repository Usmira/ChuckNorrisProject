package com.example.chucknorrisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Jokes>
    lateinit var jokesText : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        jokesText = arrayOf(
            "If you type \"Chuck Norris\" into your GPS, it says, \"Recaclulating...Chuck Norris is arriving at your location...you're dead...Good-bye!\"",
            "Chuck Norris recently created a new genre of music, by fusing country music with East Coast gansta rap and Swedish death metal while incorporating elements of Tibetian throat-singing. He calls it Norrisound.",
            "A guy at the grocery store told Chuck Norris \"I think I may just cut in front of you in this line\". Chuck told him \"I think I may just punch your nose out the back of your skull'.",
            "Chuck Norris is also known as Donkey Dong Norris!",
            "Chuck Norris doesn't have a shadow anymore because he roundkicks a wall if it appears",
            "every time Chuck Norris has a beer 17 people die"
        )

        newRecyclerView=findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList= arrayListOf()
        getUserdata()
    }

    private fun getUserdata(){
        for(i in jokesText.indices){
            val joke = Jokes(jokesText[i])
            newArrayList.add(joke)
        }

        newRecyclerView.adapter = JokeAdapter(newArrayList)

    }
}