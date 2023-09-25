package com.imranmelikov.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.imranmelikov.navigationkotlin.databinding.FragmentSecondBinding

class SecondFragment() : Fragment() {
    lateinit var binding:FragmentSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSecondBinding.inflate(inflater,container,false)
        val view=binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val userName=SecondFragmentArgs.fromBundle(it).username
            binding.Textview2.text=userName
        }
        binding.button2.setOnClickListener {
            val action=SecondFragmentDirections.actionSecondFragment2ToFirstFragment23()
            Navigation.findNavController(it).navigate(action)
        }
    }
}