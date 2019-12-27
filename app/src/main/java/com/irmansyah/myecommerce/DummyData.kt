package com.irmansyah.myecommerce

import com.irmansyah.myecommerce.model.Product
import java.text.SimpleDateFormat
import java.util.*

const val detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
        " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
        "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure " +
        "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
        "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
        "anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
        "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
        "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor " +
        "in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
        "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est " +
        "laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
        "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
        "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
        "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

fun getProductList() = arrayListOf(
    Product(R.drawable.toys1, "Toy 1", 20000, "Toko 1", Calendar.getInstance().timeInMillis, 10, true, detail),
    Product(R.drawable.toys2, "Toy 2", 30000, "Toko 2", Calendar.getInstance().timeInMillis, 3, true, detail),
    Product(R.drawable.toys3, "Toy 3", 45000, "Toko 3", Calendar.getInstance().timeInMillis, 11, true, detail),
    Product(R.drawable.toys4, "Toy 4", 70000, "Toko 4", Calendar.getInstance().timeInMillis, 12, true, detail),
    Product(R.drawable.toys5, "Toy 5", 80000, "Toko 5", Calendar.getInstance().timeInMillis, 42, true, detail),
    Product(R.drawable.toys6, "Toy 6", 24000, "Toko 6", Calendar.getInstance().timeInMillis, 55, true, detail),
    Product(R.drawable.toys1, "Toy 1", 20000, "Toko 1", Calendar.getInstance().timeInMillis, 10, true, detail),
    Product(R.drawable.toys2, "Toy 2", 30000, "Toko 2", Calendar.getInstance().timeInMillis, 3, true, detail),
    Product(R.drawable.toys3, "Toy 3", 45000, "Toko 3", Calendar.getInstance().timeInMillis, 11, true, detail),
    Product(R.drawable.toys4, "Toy 4", 70000, "Toko 4", Calendar.getInstance().timeInMillis, 12, true, detail),
    Product(R.drawable.toys5, "Toy 5", 80000, "Toko 5", Calendar.getInstance().timeInMillis, 42, true, detail),
    Product(R.drawable.toys6, "Toy 6", 24000, "Toko 6", Calendar.getInstance().timeInMillis, 55, true, detail),
    Product(R.drawable.toys1, "Toy 1", 20000, "Toko 1", Calendar.getInstance().timeInMillis, 10, true, detail),
    Product(R.drawable.toys2, "Toy 2", 30000, "Toko 2", Calendar.getInstance().timeInMillis, 3, true, detail),
    Product(R.drawable.toys3, "Toy 3", 45000, "Toko 3", Calendar.getInstance().timeInMillis, 11, true, detail),
    Product(R.drawable.toys4, "Toy 4", 70000, "Toko 4", Calendar.getInstance().timeInMillis, 12, true, detail),
    Product(R.drawable.toys5, "Toy 5", 80000, "Toko 5", Calendar.getInstance().timeInMillis, 42, true, detail),
    Product(R.drawable.toys6, "Toy 6", 24000, "Toko 6", Calendar.getInstance().timeInMillis, 55, true, detail)
)