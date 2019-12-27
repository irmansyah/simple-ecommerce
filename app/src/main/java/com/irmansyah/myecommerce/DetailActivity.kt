package com.irmansyah.myecommerce

import android.content.DialogInterface
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.irmansyah.myecommerce.model.Product
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.bottom_sheet_dialog.view.*
import java.time.LocalDateTime
import java.util.*


class DetailActivity : AppCompatActivity() {

    companion object {
        const val SUGGESTION_INTENT = "SUGGESTION_INTENT"
        const val TAG = "DetailActivity"
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        val product = intent.getParcelableExtra(SUGGESTION_INTENT) as Product

        toolbar.title = product.price.toString()
        product.image?.let { product_img.setImageResource(it) }
        name_tv.text = product.name
        like_tv.text = "${product.like.toString()} Likes"
        isused_tv.text = if (product.isUsed!!) "Used" else "New"
        detail_tv.text = product.detail

        val c: Calendar = Calendar.getInstance()
        c.timeInMillis = product.time!!
        val mDay = c.get(Calendar.DAY_OF_MONTH)
        val dayNow = LocalDateTime.now().dayOfMonth

        time_tv.text = "${(dayNow - mDay)} Hari yang lalu"

        offer_btn.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)

            view.make_offer_btn.setOnClickListener {
                AlertDialog.Builder(this)
                    .setTitle("Anda yakin ingin membeli product ini?")
                    .setPositiveButton("OK") { _, i ->
                        Toast.makeText(applicationContext, "Anda berhasil membeli", Toast.LENGTH_SHORT).show()
                    }
                    .setNegativeButton("Cancel") { _, i ->
                        Toast.makeText(applicationContext, "Anda gagal membeli!!", Toast.LENGTH_SHORT).show()
                    }
                    .show()
            }

            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }


    }
}
