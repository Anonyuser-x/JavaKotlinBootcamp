package com.kimbirli.myfirstkotlinapp.standart_programlama

fun main() {

    for (i in 1..3){//swift dilinde bu 1...3 oluyor

        println("Döngü 1 : $i")
    }



    for (x in 10..20 step 5){//swift dilinde bu 1...3 oluyor

        println("Döngü 2 : $x")
    }



    for (k in 20 downTo 10 step 5){//swift dilinde bu 1...3 oluyor

        println("Döngü 3 : $k")
    }



    var sayac = 1

    while (sayac < 4){

        println("Döngü 4 : $sayac")
        sayac +=1
    }

    var sayac2 = 10

    while (sayac2 < 21){

        println("Döngü 5 : $sayac2")
        sayac2 +=5
    }

    var sayac3 = 20

    while (sayac3 >= 10){

        println("Döngü 6 : $sayac3")
        sayac3 -=5
    }

    for (a in 1..5){
        if(a == 3){
            break
        }

        println("Döngü 7 : $a")
    }

    for (a in 1..5){
        if(a == 3){
            continue
        }
        println("Döngü 7 : $a")
    }







}