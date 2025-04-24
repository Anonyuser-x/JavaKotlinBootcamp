package com.kimbirli.myfirstkotlinapp.odevler.odev2

class Odev2Class(){


    // 1. soru
    fun DerecetoFahre(derece : Int) : Double{
        return (derece * 1.8) + 32
    }

    //2. soru
    fun CevreDikdortgen(kısakenar:Int,uzunkenar:Int){

        var cevre = (kısakenar + uzunkenar) * 2
        println("Dikdörtgenin cevresi  :  $cevre")
    }

    //3. soru
    fun FaktoriyelHesaplama(sayi:Int) : Int{
        if(sayi == 0){
            return 1
        }


        return sayi * FaktoriyelHesaplama(sayi-1)
    }

    //4. soru

    fun aharfibulucu(kelime:String){
        val sayi = kelime.count { it == 'a' || it == 'A' }
        println("Kelimenin içinde $sayi adet 'a' harfi var")

    }
}