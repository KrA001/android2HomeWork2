package com.example.android2homework2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android2homework2.databinding.FragmentAddltemBinding

class AddItemFragment : Fragment() {
    private var _binding: FragmentAddltemBinding? = null
    private val binding: FragmentAddltemBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddltemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToHomeFragment()
    }

    private fun goToHomeFragment() = with(binding) {
        btnAp.setOnClickListener {
            val image = R.drawable.nature
            val descriptionText = tvNature.text.toString()
            val model = Nature(
                natureImage = image,
                descriptionOfNature = descriptionText
            )
            findNavController().navigate(
                AddItemFragmentDirections.actionAddItemFragmentToHomeFragment(
                    model
                )
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}