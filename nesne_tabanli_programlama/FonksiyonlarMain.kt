package com.kimbirli.myfirstkotlinapp.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void olan - sonda unit yazıyor unit = void demek
    f.selamla1()

    //return olan fonksiyon sonunda string yazıyor
    val gelensonuc = f.selamla2()
    println("gelen sonuc : $gelensonuc")

    //parametre
    f.selamla3("zerda","baz",35)

    //overloading
    f.topla(10,20)
    f.topla(20,30,"zerda")


}