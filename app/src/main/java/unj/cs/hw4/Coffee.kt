package unj.cs.hw4

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Coffee(
    val imgCoffee: Int,
    val nameCoffee: String,
    val descCoffee: String,
    val detCoffee: String
) : Parcelable
