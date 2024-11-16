package com.example.yemek_tarifi_kitabi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.yemek_tarifi_kitabi.model.Tarif
import com.example.yemek_tarifi_kitabi.view.ListeFragmentDirections
import com.example.yemek_tarifi_kitabi.databinding.RecylerRowBinding


class TarifAdapter(var tarifList: List<Tarif>) : RecyclerView.Adapter<TarifAdapter.TarifHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarifHolder {
        val recyclerRowBinding: RecylerRowBinding = RecylerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TarifHolder(recyclerRowBinding)
    }

    override fun onBindViewHolder(holder: TarifHolder, position: Int) {
        holder.recyclerRowBinding.recyclerViewTextView.text = tarifList[position].isim
        holder.itemView.setOnClickListener {
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment(bilgi = "eski", id = tarifList[position].id.toLong())
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return tarifList.size
    }

    class TarifHolder(val recyclerRowBinding: RecylerRowBinding) : RecyclerView.ViewHolder(recyclerRowBinding.root) {

    }
}