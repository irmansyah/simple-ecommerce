package com.irmansyah.myecommerce.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.irmansyah.myecommerce.R
import com.irmansyah.myecommerce.extention.loadImage
import com.irmansyah.myecommerce.model.Suggestion
import kotlinx.android.synthetic.main.item_toy.view.*

class SuggestionAdapter(private val dataList: MutableList<Suggestion>) :
    RecyclerView.Adapter<SuggestionAdapter.SuggestionViewHolder>()  {

    private lateinit var mListener: (Suggestion) -> Unit

    fun setOnItemCLickListener(listener: (Suggestion) -> Unit) {
        this.mListener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SuggestionViewHolder = SuggestionViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_toy, parent, false))

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: SuggestionViewHolder, position: Int) {
        holder.clear()
        holder.onBind(position)
    }

    inner class SuggestionViewHolder(view: View): RecyclerView.ViewHolder(view) {

        fun clear() {
            itemView.toy_img.setImageDrawable(null)
            itemView.title_tv.text = ""
            itemView.price_tv.text = ""
            itemView.author_tv.text = ""
        }

        fun onBind(position: Int) {
            dataList[position].imageUrl?.let { itemView.toy_img.loadImage(it) }
            itemView.title_tv.text = dataList[position].title
            itemView.price_tv.text = dataList[position].price.toString()
            itemView.author_tv.text = dataList[position].author

            itemView.suggestion_container.setOnClickListener { mListener(dataList[position]) }

        }
    }
}