package com.example.databindingpractice.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.databindingpractice.databinding.FragmentTextInputBinding

class TextInputFragment : Fragment() {

    private lateinit var binding: FragmentTextInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     // 通常
     // return inflater.inflate(R.layout.fragment_football, container, false)
     // Bindingのinflateメソッドでインスタンス化している
        binding = FragmentTextInputBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 直接値を代入できる
        binding.buttonText = "Bind, Set!"
    }
}