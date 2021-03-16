package com.example.navbar



import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.navbar.R
import com.example.navbar.User


class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_selectbus, parent, false)
        return ViewHolder( v )
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
        holder.itemView.setOnClickListener(View.OnClickListener {
           // Toast.makeText(holder.itemView.getContext(),"Copy Button Clicked", Toast.LENGTH_SHORT).show()
        val intent=Intent(holder.itemView.context,Select_seat::class.java)
            holder.itemView.context.startActivity(intent)
        })
    }



    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: User) {
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress  = itemView.findViewById(R.id.textViewAddress) as TextView
            val starttime  = itemView.findViewById(R.id.starttime) as TextView
            val destinationtime  = itemView.findViewById(R.id.destinationtime) as TextView

            textViewName.text = user.From
            textViewAddress.text = user.To
            starttime.text=user.stime
            destinationtime.text=user.dtime
        }
       // val information1:LinearLayout=itemView.findViewById(R.id.information1)


    }
    }


