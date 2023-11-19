package com.example.practice15

import android.os.Parcel
import android.os.Parcelable

class Pet() : Parcelable {
    private var kind:String = ""
    private var year: Int = 1
    private var month: Int = 1

    constructor(parcel: Parcel) : this() {
        kind = parcel.readString().toString()
        year = parcel.readInt()
        month = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
       parcel?.writeString(kind)
       parcel?.writeInt(year)
       parcel?.writeInt(month)
    }

    constructor(_kind:String, _year:Int, _month:Int) : this(){
        kind = _kind
        year = _year
        month = _month
    }

    fun getKind() : String{
        return kind
    }
    fun getYear() : Int{
        return year
    }

    fun getMonth() : Int{
        return month
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pet> {
        override fun createFromParcel(parcel: Parcel): Pet {
            return Pet(parcel)
        }

        override fun newArray(size: Int): Array<Pet?> {
            return arrayOfNulls(size)
        }
    }
}