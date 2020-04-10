package com.example.navdrawerissue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheet : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_gallery, container, false)


    }
    companion object {
        const val TAG = "BottomSheet"
        private lateinit var fragment: MyBottomSheet

        fun createAndShow(activity: MainActivity) {

            MyBottomSheet().apply {
                show(activity.supportFragmentManager, TAG)
            }
        }
    }
}