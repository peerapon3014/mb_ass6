package com.example.lab6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lab6menufragment.databinding.ActivityMainBinding
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
//            var toast = Toast.makeText(context,"click on fragment Patchara", Toast.LENGTH_SHORT)
//            toast.show()
            replaceFragment(FirstFragment())
        }
        return bindingThirdFrag.root
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