package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentRedBinding
import com.google.android.material.snackbar.Snackbar


class RedFragment : Fragment() {
    private var _binding : FragmentRedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arg = RedFragmentArgs.fromBundle(requireArguments()).argumentoRed
        // TODO: utilizar lazy delegation para recuperar args directamente

       Snackbar.make(binding.root, "$arg", Snackbar.LENGTH_SHORT).show()

    }

}