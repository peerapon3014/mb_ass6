package com.example.lab6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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
            var toast = Toast.makeText(context,"click on second fragment", Toast.LENGTH_SHORT)
            toast.show()
        }
        return bindingSecondFrag.root
    }
}