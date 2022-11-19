package com.udacity.shoestore.ui.shoes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.udacity.shoestore.R


/**
 * A simple [Fragment] subclass.
 * Use the [ShoeDescriptionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoeDescriptionFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shoe_description, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ShoeDescriptionFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}