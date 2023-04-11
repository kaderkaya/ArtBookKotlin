package com.kaderkayaarslan.artbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kaderkayaarslan.artbookkotlin.databinding.RecyclerroowBinding

class ArtAdapter(val artlist : ArrayList<Art>) : RecyclerView.Adapter<ArtAdapter.ArtHolder>(){
    class ArtHolder(val binding : RecyclerroowBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtHolder {
      val binding = RecyclerroowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ArtHolder(binding)
    }

    override fun onBindViewHolder(holder: ArtHolder, position: Int) {
      holder.binding.recyclerViewTextView.text = artlist.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,ArtActivity::class.java)
            intent.putExtra("info","old")
            intent.putExtra("id",artlist.get(position).id)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
       return artlist.size
    }
}