package com.udacity.shoestore.ui.shoes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDescriptionBinding
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import kotlinx.android.synthetic.main.fragment_shoe_description.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [ShoeDescriptionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoeDescriptionFragment : Fragment() {
    private var _binding: FragmentShoeDescriptionBinding? = null

    private val binding get() = _binding!!
    private lateinit var viewModel: ShoeListViewModel
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
        _binding= FragmentShoeDescriptionBinding.inflate(inflater, container, false)

        binding.addNewShoe.setOnClickListener {view:View ->
            viewModel.add(Shoe(
                name = binding.shoeName.text.toString(),
                description = binding.shoeName.descriptionLabel.toString(),
                size = binding.shoeSize.text.toString().toInt(),
                company = binding.shoeCompany.text.toString()
            ))
        }
        return binding.root

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