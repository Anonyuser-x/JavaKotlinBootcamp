package com.kimbirli.myfirstkotlinapp.nesne_tabanli_programlama

class Fonksiyonlar {

    //void sadece işlem yapan fonksiyon anlamına geliyor
    fun selamla1(){  //  swift dilinde fun -> func olarak yazlıyor
        val sonuc =  "Hello world"
        println(sonuc)
    }

    //return - hem işlem yapan hem de veri transferi yapan fonksiyonlara denir
    fun selamla2() : String{  //  swift dilinde fun -> func olarak yazlıyor
        val selam =  "Hello world"
        return selam
    }

    //parametre
    fun selamla3(isim : String, soyisim : String, yas : Int){  //  swift dilinde fun -> func olarak yazlıyor
        val hello =  "Hello $isim $soyisim , You are $yas years old"
        println(hello)
    }

    //overloading
    //bir sınıf içerisinde ki aynı isimdeki fonksiyonları tekrar tekrar kullanabilmek için kullanırız.
    fun topla(sayi1:Int,sayi2: Int){
        println("toplama : ${sayi1 +sayi2}")
    }

    // eğer aynı isimdeki iki fonksiyonu kullanmak istersek türleri değiştirebiliriz.
    // diğer bir çözüm olarakta türleri değiştirmeden sonuna extra bir değişken ekleyerek kullanabiliriz.

    fun topla(sayi1:Int,sayi2: Int,isim: String ){
        println("toplama : ${sayi1 +sayi2} and its ur age $isim")
    }


}