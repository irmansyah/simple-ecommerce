package com.irmansyah.myecommerce.model

import android.os.Parcel
import android.os.Parcelable

class Product(
    var image: Int? = null,
    var name: String? = null,
    var price: Long? = null,
    var seller: String? = null,
    var time: Long? = null,
    var like: Int? = null,
    var isUsed: Boolean? = null,
    var detail: String? = null) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readValue(Long::class.java.classLoader) as? Long,
        parcel.readString(),
        parcel.readValue(Long::class.java.classLoader) as? Long,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(image)
        parcel.writeString(name)
        parcel.writeValue(price)
        parcel.writeString(seller)
        parcel.writeValue(time)
        parcel.writeValue(like)
        parcel.writeValue(isUsed)
        parcel.writeString(detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }
}