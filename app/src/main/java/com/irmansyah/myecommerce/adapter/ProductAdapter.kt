package com.irmansyah.myecommerce.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.irmansyah.myecommerce.R
import com.irmansyah.myecommerce.extention.loadImage
import com.irmansyah.myecommerce.model.Product
import kotlinx.android.synthetic.main.item_toy.view.*

class ProductAdapter(private val dataList: MutableList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>()  {

    private lateinit var mListener: (Product) -> Unit

    fun setOnItemCLickListener(listener: (Product) -> Unit) {
        this.mListener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductViewHolder = ProductViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_toy, parent, false))

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.clear()
        holder.onBind(position)
    }

    inner class ProductViewHolder(view: View): RecyclerView.ViewHolder(view) {

        fun clear() {
            itemView.toy_img.setImageDrawable(null)
            itemView.title_tv.text = ""
            itemView.price_tv.text = ""
            itemView.author_tv.text = ""
        }

        fun onBind(position: Int) {
            dataList[position].image?.let { itemView.toy_img.loadImage(it) }
            itemView.title_tv.text = dataList[position].name
            itemView.price_tv.text = dataList[position].price.toString()
            itemView.author_tv.text = dataList[position].seller

            itemView.suggestion_container.setOnClickListener { mListener(dataList[position]) }

        }
    }
}