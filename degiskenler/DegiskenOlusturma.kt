package com.kimbirli.myfirstkotlinapp.degiskenler

fun main(){
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4.500
    var stokdurum = true

    println("id : $id")
    println("ad : $ad")
    println("resim : $resim")
    println("puan : $puan")
    println("fiyat : $puan")
    println("stokdurum : $stokdurum")

    // Sabitler  -  Constant
    val numara = 50 // burada yani val ile değeri sabitliyoruz ve değeri aşağıda değiştiremiyoruz
    var sayi = 30  // bu şekilde tanımlarsak aşağıda bu değeri değiştirebiliriz eğer değer değişmeyecekse val ile tanımlamak daha işlevsel bir kod yazmış olacaz
    sayi = 100
    println(sayi)
    println(numara)

    // Tür Dönüşümü
    // 1  - sayısaldan sayısala dönüşüm  --- ama çok risklidir yani mesela 89.56'yı 89 olarak yazdırıyor bu da bize sıkıntı yaratabilir

    val d = 89.56
    val i = 34
    val sonuc1 = d.toInt()
    val sonuc2 = i.toFloat()
    println(sonuc1)
    println(sonuc2)


    // 2  -  saysısaldan Metine dönüşüm  ---  Arayüzde gösterilmesi gereken bir sayı var ise bunu stringe çevirip yazarız bütün sistemlerde aynıdır
    // girilen inputlar işlemlere göre int değerlerini string yapıp tekrardan int yapıp işlem yapıp arayüze de string olarak yazıyoruz.

    val sayisal = 45
    var sonuc3 = sayisal.toString() // "45"
    println(sonuc3)


    // 3  -   Metinden Sayısala dönüşüm  ---  Buradada önemli olan int olarak aldığımız değer içerisinde tam sayı dan farklı bir şey olur ise hata alırız.

    val yazi = "48"
    val sonuc4 = yazi.toIntOrNull()
    if(sonuc4 != null){
        println(sonuc4)

    }else{
        println("Sonuc Hatalidir")
    }


}