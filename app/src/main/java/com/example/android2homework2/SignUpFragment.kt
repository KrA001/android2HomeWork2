package com.example.android2homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android2homework2.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    private var _binding: FragmentSignUpBinding? = null
    private val binding: FragmentSignUpBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val preferenceHelper = PreferenceHelper(requireContext())
        goClick(preferenceHelper)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun goClick(preferenceHelper: PreferenceHelper) = with(binding) {
        btnToComeIn.setOnClickListener{
            preferenceHelper.text = etName.text.toString().trim()
            preferenceHelper.email = etEmail.text.toString().trim()
            preferenceHelper.password = etPassword.text.toString().trim()
            findNavController().navigate(R.id.action_signUpFragment_to_homeFragment)
        }
    }
}