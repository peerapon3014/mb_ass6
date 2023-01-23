package com.example.lab6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lab6menufragment.databinding.FragmentSecondBinding
import com.example.lab6menufragment.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var bindingThirdFrag : FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingThirdFrag = FragmentThirdBinding.inflate(layoutInflater)
        bindingThirdFrag.btnClickThirdFrag.setOnClickListener(){
            var toast = Toast.makeText(context,"click on fragment three", Toast.LENGTH_SHORT)
            toast.show()
        }
        return bindingThirdFrag.root
    }
}