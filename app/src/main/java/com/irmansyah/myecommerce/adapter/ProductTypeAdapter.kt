package com.irmansyah.myecommerce.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.irmansyah.myecommerce.R
import com.irmansyah.myecommerce.extention.loadImage
import com.irmansyah.myecommerce.model.ProductType
import kotlinx.android.synthetic.main.item_product_type.view.*

class ProductTypeAdapter(private val dataList: MutableList<ProductType>) :
    RecyclerView.Adapter<ProductTypeAdapter.ProductTypeViewHolder>()  {

    private lateinit var mListener: (ProductType) -> Unit

    fun setOnItemCLickListener(listener: (ProductType) -> Unit) {
        this.mListener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductTypeViewHolder = ProductTypeViewHolder(LayoutInflater.from(parent.context)
        .inflate(R.layout.item_product_type, parent, false))

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ProductTypeViewHolder, position: Int) {
        holder.clear()
        holder.onBind(position)
    }

    inner class ProductTypeViewHolder(view: View): RecyclerView.ViewHolder(view) {

        fun clear() {
            itemView.product_type_img.setImageDrawable(null)
            itemView.product_type_txt.text = ""
        }

        fun onBind(position: Int) {
            dataList[position].image?.let { itemView.product_type_img.loadImage(it) }
            itemView.product_type_txt.text = dataList[position].name

            itemView.product_type_container.setOnClickListener { mListener(dataList[position]) }
        }
    }
}