package com.example.sayfalararasigecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfalararasigecis.databinding.FragmentBBinding

class BFragment : Fragment() {
    private lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBBinding.inflate(inflater,container,false)
        binding.buttony.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_BFragment_to_YFragment)
        }
        return binding.root

    }
}