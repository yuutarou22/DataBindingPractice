package com.example.databindingpractice.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TextInputViewModel {

    // 出力文字
    private val _submittedText: MutableLiveData<String> =
        MutableLiveData<String>().also { mutableLiveData ->
            mutableLiveData.value = "出力先"
        }
    val submittedText: LiveData<String>
        get() = _submittedText


    // ボタンテキスト
    private val _buttonText: MutableLiveData<String> =
        MutableLiveData<String>().also { mutableLiveData ->
            mutableLiveData.value = "Ready"
        }
    val buttonText: LiveData<String> // 値が入った時検知する
        get() = _buttonText

    // 押せるかどうか
    private val _isEnabled: MutableLiveData<Boolean> =
        MutableLiveData<Boolean>().also { mutableLiveData ->
            mutableLiveData.value = false
        }
    val isEnabled: LiveData<Boolean>
        get() = _isEnabled

    /**
     * LiveDataの更新メソッド
     */
    fun updateButtonText(isBlank: Boolean) {
        _isEnabled.value = !isBlank

        if (!isBlank) {
            _buttonText.value = "Set!!"
        } else {
            _buttonText.value = "Ready"
        }
    }

    /**
     * 出力テキスト更新メソッド
     */
    fun submitText(text: String) {
        _submittedText.value = text
    }
}