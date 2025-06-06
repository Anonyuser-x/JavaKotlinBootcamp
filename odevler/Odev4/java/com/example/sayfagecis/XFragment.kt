package com.example.sayfalararasigecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfalararasigecis.databinding.FragmentXBinding

class XFragment : Fragment() {
    private lateinit var binding:FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXBinding.inflate(inflater,container,false)
        binding.buttonyy.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_XFragment_to_YFragment)
        }
        return binding.root
    }

}