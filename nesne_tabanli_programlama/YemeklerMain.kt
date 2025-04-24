package com.kimbirli.myfirstkotlinapp.nesne_tabanli_programlama

fun main() {
    //nesne oluşturma

    val y1 = Yemekler(id = 100, ad = "Kofte", fiyat = 249)

    y1.bilgiAl()
    y1.fiyat= 350
    y1.bilgiAl()


    val y2 = Yemekler(id = 200, ad = "Baklava", fiyat = 349)

    y2.bilgiAl()
    y2.ad= "soguk baklava"
    y2.bilgiAl()



}