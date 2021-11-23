package com.yelek.yemektariflerisqlite

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyler_row.view.*

class ListeRecylerAdapter(val yemekListesi: ArrayList<String>,val idListesi : ArrayList<Int>):RecyclerView.Adapter<ListeRecylerAdapter.YemekHolder>() {
  class YemekHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: YemekHolder, position: Int) {
         holder.itemView.recyler_row_text.text = yemekListesi[position]
        holder.itemView.setOnClickListener {
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment("recylerdangeldim",idListesi[position])
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return yemekListesi.size
    }
}