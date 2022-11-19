package com.udacity.shoestore.ui.shoes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding


class ShoeListFragment : Fragment() {
    private var _binding: FragmentShoeListBinding? = null

    private val binding get() = _binding!!

    private lateinit var viewModel: ShoeListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentShoeListBinding.inflate(inflater, container, false)


        binding.shoeFAB.setOnClickListener {view:View ->
            Navigation.findNavController(view).navigate(R.id.action_shoeListFragment_to_shoeDescriptionFragment)
        }


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /// setup observer
        /// This crash the application, why ??

        /// TODO: Uncomment this part
//        viewModel.shoesList.observe(viewLifecycleOwner,Observer{
//                newList ->
//
//
//            if(newList.isNotEmpty()){
//                val lastShoe = newList.last()
//
//                /// adding new TextView each time list is updated
//                val rootLayout: ViewGroup = binding.shoesListView
//                val myTextView = TextView(context)
//                myTextView.layoutParams = LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.MATCH_PARENT,
//                    LinearLayout.LayoutParams.MATCH_PARENT,
//                )
//                myTextView.text="${lastShoe.name},${lastShoe.description},${lastShoe.size},${lastShoe.company}"
//                rootLayout.addView(myTextView)
//
//            }
//
//        })
        /// Add one item to the list just to test if it is working
//        viewModel.add(Shoe(name = "Example Shoe", description = "Example Shoe Description", company = "Example company", size = 42))

    }

}