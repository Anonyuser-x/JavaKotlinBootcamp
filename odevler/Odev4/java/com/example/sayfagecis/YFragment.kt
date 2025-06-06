package com.example.sayfalararasigecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfalararasigecis.databinding.FragmentYBinding

class YFragment : Fragment() {
    private lateinit var binding:FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYBinding.inflate(inflater,container,false)
        binding.buttongeri.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_YFragment_to_anasayfaFragment)
        }
        return binding.root

    }
}