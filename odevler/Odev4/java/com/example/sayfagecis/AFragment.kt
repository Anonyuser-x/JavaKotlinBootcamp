package com.example.sayfalararasigecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfalararasigecis.databinding.FragmentABinding


class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater,container,false)

        //Butona tıklama olayı
        binding.buttonB.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_AFragment_to_BFragment)
        }
        return binding.root
    }
}