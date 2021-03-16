package com.example.navbar
/*
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Selectbus: AppCompatActivity() {

lateinit var recyclerSelectbus:RecyclerView
lateinit var layoutManager:RecyclerView.LayoutManager

val busList= arrayListOf<String>(
        "bus 1",
        "bus 2",
        "bus 3",
"bus 4",
        "bus 5",
        "bus 6"
        )
    lateinit var recyclerAdapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_bus)

recyclerSelectbus=findViewById(R.id.bookurbus)
        layoutManager=LinearLayoutManager(this)


recyclerAdapter= RecyclerAdapter(this,busList)
        recyclerSelectbus.adapter=recyclerAdapter
        recyclerSelectbus.layoutManager=layoutManager
}


}
*/




import android.content.Intent
import android.os.Bundle
import android.widget.Button

import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navbar.CustomAdapter

class Selectbus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_bus)

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("manipur", "Nagaland","3.00","19.00"))
        users.add(User("Delhi", "Imphal","18.00","18.00"))
        users.add(User("Hyderabad", "vijayawada","20.00","10.00"))
        users.add(User("vijayawada", "Hyd","23.00","20.00"))
        users.add(User("warangal", "Hyderabad","16.00","12.00"))
        users.add(User("vijayawada", "guntur","10.00","15.00"))
        users.add(User("eluru", "Vizag","1.00","16.00"))
        users.add(User("vijayawada", "Vizag","2.00","22.00"))
        users.add(User("vizag", "Hyd","3.00","23.00"))






        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter

    }
}









