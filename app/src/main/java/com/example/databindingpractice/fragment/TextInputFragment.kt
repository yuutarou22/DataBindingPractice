package com.example.databindingpractice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.example.databindingpractice.viewmodel.TextInputViewModel
import com.example.databindingpractice.databinding.FragmentTextInputBinding

class TextInputFragment : Fragment() {

    private lateinit var binding: FragmentTextInputBinding
    private val viewModel = TextInputViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTextInputBinding.inflate(inflater, container, false)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.inputText.addTextChangedListener { text ->
            viewModel.updateButtonText(text.isNullOrBlank())
        }
        binding.submitButton.setOnClickListener {
            val text = binding.inputText.text.toString()
            viewModel.submitText(text)
        }
    }
}