package com.kimbirli.myfirstkotlinapp.nesne_tabanli_programlama

fun main() {

    val sonuc = 5 carp 2 //5.carp(2)
    println(sonuc)

}

// extension varolan kullanılan fonksiyonları genişletmek anlamına gelir yani int sınıfı var biz buna bir fonksiyon ekleyebiliriz böylelikle
infix fun Int.carp(sayi1 : Int) : Int{

    return this * sayi1//this(Int)

}