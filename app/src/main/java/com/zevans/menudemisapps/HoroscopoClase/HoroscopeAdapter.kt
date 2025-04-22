package com.zevans.menudemisapps.HoroscopoClase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zevans.menudemisapps.R

class HoroscopeAdapter(var items: List<Horoscope>, val onItemClick: (Int) -> Unit) : RecyclerView.Adapter<HoroscopeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false)
        return HoroscopeViewHolder(view)
    }


    override fun getItemCount(): Int {
        return items.size
    }


    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        val horoscope = items[position]
        holder.render(horoscope)
        holder.itemView.setOnClickListener {
            onItemClick(position)
        }
    }

    fun updateItems(items: List<Horoscope>) {
        this.items = items
        notifyDataSetChanged()
    }
}

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    val datesTextView: TextView = view.findViewById(R.id.datesTextView)
    val iconImageView: ImageView = view.findViewById(R.id.iconImageView)
    val favoriteImageView: ImageView = view.findViewById(R.id.favoriteImageView)

    fun render(horoscope: Horoscope) {
        nameTextView.setText(horoscope.name)
        datesTextView.setText(horoscope.dates)
        iconImageView.setImageResource(horoscope.icon)

        val session = SessionManager(itemView.context)
        if (session.getFavoriteHoroscope() == horoscope.id) {
            favoriteImageView.visibility = View.VISIBLE
        } else {
            favoriteImageView.visibility = View.GONE
        }
    }
}