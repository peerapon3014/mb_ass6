package com.example.lab6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lab6menufragment.databinding.ActivityMainBinding
import com.example.lab6menufragment.databinding.FragmentFirstBinding
import com.example.lab6menufragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var bindingSecondFrag : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingSecondFrag = FragmentSecondBinding.inflate(layoutInflater)
        bindingSecondFrag.btnClickSecondFrag.setOnClickListener(){
            replaceFragment(FirstFragment())

        }
        return bindingSecondFrag.root
    }
    fun replaceFragment(someFragment:Fragment){
        var binding: ActivityMainBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        var transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(binding.frameLayout.id, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}