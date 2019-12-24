package com.irmansyah.myecommerce

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.irmansyah.myecommerce.adapter.ProductTypeAdapter
import com.irmansyah.myecommerce.adapter.SuggestionAdapter
import com.irmansyah.myecommerce.model.ProductType
import com.irmansyah.myecommerce.model.Suggestion
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val promoList = intArrayOf(
        R.drawable.promo1,
        R.drawable.promo2,
        R.drawable.promo3,
        R.drawable.promo4
    )

    val toyList = arrayListOf(
        Suggestion(R.drawable.toys1, "Mainan 1", 20000, "Toko 1"),
        Suggestion(R.drawable.toys2, "Mainan 2", 30000, "Toko 2"),
        Suggestion(R.drawable.toys3, "Mainan 3", 40000, "Toko 3"),
        Suggestion(R.drawable.toys4, "Mainan 4", 50000, "Toko 4"),
        Suggestion(R.drawable.toys5, "Mainan 5", 60000, "Toko 5"),
        Suggestion(R.drawable.toys6, "Mainan 6", 70000, "Toko 6"),
        Suggestion(R.drawable.toys1, "Mainan 1", 20000, "Toko 1"),
        Suggestion(R.drawable.toys2, "Mainan 2", 30000, "Toko 2"),
        Suggestion(R.drawable.toys3, "Mainan 3", 40000, "Toko 3"),
        Suggestion(R.drawable.toys4, "Mainan 4", 50000, "Toko 4"),
        Suggestion(R.drawable.toys5, "Mainan 5", 60000, "Toko 5"),
        Suggestion(R.drawable.toys6, "Mainan 6", 70000, "Toko 6"),
        Suggestion(R.drawable.toys1, "Mainan 1", 20000, "Toko 1"),
        Suggestion(R.drawable.toys2, "Mainan 2", 30000, "Toko 2"),
        Suggestion(R.drawable.toys3, "Mainan 3", 40000, "Toko 3"),
        Suggestion(R.drawable.toys4, "Mainan 4", 50000, "Toko 4"),
        Suggestion(R.drawable.toys5, "Mainan 5", 60000, "Toko 5"),
        Suggestion(R.drawable.toys6, "Mainan 6", 70000, "Toko 6")
    )

    val productTypeList = arrayListOf(
        ProductType(R.drawable.ic_mens_fashion, "Men's Fashion"),
        ProductType(R.drawable.ic_mens_fashion, "Health & Beauty"),
        ProductType(R.drawable.ic_mens_fashion, "Electronics"),
        ProductType(R.drawable.ic_mens_fashion, "Mobile Phone"),
        ProductType(R.drawable.ic_mens_fashion, "Book"),
        ProductType(R.drawable.ic_mens_fashion, "Babies & Kids"),
        ProductType(R.drawable.ic_mens_fashion, "Fashion"),
        ProductType(R.drawable.ic_mens_fashion, "Luxury"),
        ProductType(R.drawable.ic_mens_fashion, "Photography"),
        ProductType(R.drawable.ic_mens_fashion, "Video Gaming"),
        ProductType(R.drawable.ic_mens_fashion, "Food & Drinks"),
        ProductType(R.drawable.ic_mens_fashion, "Design & Craft"),
        ProductType(R.drawable.ic_mens_fashion, "Sports"),
        ProductType(R.drawable.ic_mens_fashion, "Men's Fashion"),
        ProductType(R.drawable.ic_mens_fashion, "Health & Beauty"),
        ProductType(R.drawable.ic_mens_fashion, "Electronics"),
        ProductType(R.drawable.ic_mens_fashion, "Mobile Phone"),
        ProductType(R.drawable.ic_mens_fashion, "Book"),
        ProductType(R.drawable.ic_mens_fashion, "Babies & Kids"),
        ProductType(R.drawable.ic_mens_fashion, "Fashion"),
        ProductType(R.drawable.ic_mens_fashion, "Luxury"),
        ProductType(R.drawable.ic_mens_fashion, "Photography"),
        ProductType(R.drawable.ic_mens_fashion, "Video Gaming"),
        ProductType(R.drawable.ic_mens_fashion, "Food & Drinks"),
        ProductType(R.drawable.ic_mens_fashion, "Design & Craft"),
        ProductType(R.drawable.ic_mens_fashion, "Sports"),
        ProductType(R.drawable.ic_mens_fashion, "Toys")
    )

    private var productTypeAdapter = ProductTypeAdapter(productTypeList)
    private var suggestionAdapter = SuggestionAdapter(toyList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carouselView.pageCount = promoList.size
        carouselView.setImageListener(imageListener)

        setProductTypeAdapter()
        setSuggestionAdapter()
    }

    private fun setProductTypeAdapter() {
        product_type_rv.layoutManager = GridLayoutManager(
            applicationContext,
            2,
            LinearLayoutManager.HORIZONTAL,
            false)
        product_type_rv.itemAnimator = DefaultItemAnimator()
        product_type_rv.adapter = productTypeAdapter

        productTypeAdapter.setOnItemCLickListener {

        }

        suggestionAdapter.setOnItemCLickListener {
            val intent = Intent(applicationContext, DetailActivity::class.java)
            intent.putExtra(DetailActivity.SUGGESTION_INTENT, it)
            startActivity(intent)
        }
    }

    private fun setSuggestionAdapter() {
        suggestion_rv.layoutManager = GridLayoutManager(applicationContext, 2)
        suggestion_rv.addItemDecoration(GridSpacingItemDecoration(2, dpToPx(10), true))

        suggestion_rv.itemAnimator = DefaultItemAnimator()
        suggestion_rv.adapter = suggestionAdapter
    }

    var imageListener = ImageListener { position, imageView ->
        imageView.setImageResource(promoList[position]) }

    fun dpToPx(dp: Int): Int {
        val r = resources
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r.displayMetrics))
    }
}
