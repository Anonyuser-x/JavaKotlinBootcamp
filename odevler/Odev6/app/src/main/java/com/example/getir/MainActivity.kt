package com.example.getir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getir.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val kategoriList = listOf(
        AppModel("Marvel", R.drawable.marvel_logo),
        AppModel("Disney", R.drawable.disney_logo),
        AppModel("Pixar", R.drawable.pixar_logo),
        AppModel("Star Wars", R.drawable.starwars_logo)
    )

    private val filmList = listOf(
        AppModel("Spider-Man", R.drawable.spiderman),
        AppModel("Avengers", R.drawable.avengers),
        AppModel("Black Panther", R.drawable.blackpanther),
        AppModel("Toy Story", R.drawable.toystory),
        AppModel("Star Wars", R.drawable.starwars4),
        AppModel("Iron Man", R.drawable.ironman)
    )

    private val kampanyaList = listOf(
        AppModel("Aladdin", R.drawable.alladin),
        AppModel("hobbit an unexpected journey ", R.drawable.hobbit),
        AppModel("The Lion King", R.drawable.king),
        AppModel("Doctor Strange", R.drawable.doctor),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Kampanya Slider Adapter ve bağlama
        val kampanyaAdapter = KampanyaSliderAdapter(kampanyaList)
        binding.kampanyaSlider.adapter = kampanyaAdapter

        // Kategori RecyclerView (yatay)
        val kategoriAdapter = AppAdapter(kategoriList)
        binding.kategoriRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.kategoriRecyclerView.adapter = kategoriAdapter

        // Film RecyclerView (grid, 3 kolon)
        val filmAdapter = AppAdapter(filmList)
        binding.filmRecyclerView.layoutManager = GridLayoutManager(this, 3)
        binding.filmRecyclerView.adapter = filmAdapter
    }
}
