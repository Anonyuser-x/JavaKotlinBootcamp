package com.kimbirli.myfirstkotlinapp.standart_programlama


fun main() {
    val yas = 19

    println(yas >= 18)

    if (yas >= 18){
        println("reşitsiniz")
    }else{
        println("reşit değilsiniz")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10



    if(ka == "admin" && s == 123456){ // && = and(ve), true && true ise true olur diğer durumlarn hepsinde bu false 'dur.
        println("hoşgeldiniz")

    }else{
        println("hatalı giriş")
    }


    if(sayi== 9 || sayi == 10){
        println("sayi 9 veya 10 idir")

    }else{
        println("sayi 9 veya 10 değildir")
    }



// when diğer dillerde switch olarak geçebilir.. çoğunlukla menülerde

    val number = 5

    when(number){
        1 -> println("sayi 1'dir")
        2 -> println("sayi 2'dir")
        else -> println("tanımlanmayan sayı")
    }






























}