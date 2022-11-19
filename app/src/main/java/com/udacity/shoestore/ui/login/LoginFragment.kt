package com.udacity.shoestore.ui.login


import androidx.fragment.app.Fragment
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.udacity.shoestore.databinding.FragmentLoginBinding

import com.udacity.shoestore.R

class LoginFragment : Fragment() {


    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.login.setOnClickListener {view:View ->
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_welcomeFragment)


        }
        binding.register.setOnClickListener {view:View ->
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_welcomeFragment)


        }
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}