package com.irmansyah.myecommerce.model

import android.os.Parcel
import android.os.Parcelable

class Suggestion(var imageUrl: Int? = null,
                 var title: String? = null,
                 var price: Int? = null,
                 var author: String? = null): Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(imageUrl)
        parcel.writeString(title)
        parcel.writeValue(price)
        parcel.writeString(author)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Suggestion> {
        override fun createFromParcel(parcel: Parcel): Suggestion {
            return Suggestion(parcel)
        }

        override fun newArray(size: Int): Array<Suggestion?> {
            return arrayOfNulls(size)
        }
    }
}