package com.example.baseproject.view.common.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.baseproject.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


/**
 * Created by akash on 19,02,2021
 */
abstract class BaseModalBottomSheet():BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var parent = inflater.inflate(R.layout.base_modal_bottom_sheet, null) as ViewGroup
        return setLayoutId()?.let {
            inflater.inflate(it, parent, true)
        } ?: inflater.inflate(R.layout.base_modal_bottom_sheet, container, false)
    }

    abstract fun setLayoutId():Int?
}