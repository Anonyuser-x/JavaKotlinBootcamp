package com.kimbirli.myfirstkotlinapp.nesne_tabanli_programlama

data class Yemekler(var id:Int, var ad:String, var fiyat:Int) {
    // class'ın başına "data" keywordü eklersek get set falan hepsini otomatik olarak oluşturuyor veri tabanı ile çalışmak istersek kullanmalıyız.

    // Constructor - init fonksiyonu
    // Bu sınıftan nesne oluştuduğunda çalışsın
    init {
        println("*****Nesne oluştu")
    }


    fun bilgiAl(){
        println("------------------")
        println("Id      : ${id}")
        println("ad      : ${ad}")
        println("fiyat   : ${fiyat}")
    }
    //this : bulunduğu sınıfı temsil eder. Swift dilinde self olarak kullanılır.
    //super : Kalıtım ile bir üst sınıfı temsil eder.
}