package com.example.meituanlogin

import android.view.View
import androidx.databinding.BindingAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

@BindingAdapter("setVisibility")
fun FloatingActionButton.setVisibility(state: Boolean?){
    visibility = if (state == null){
        View.VISIBLE
    }else {
        if (state) {
            View.INVISIBLE
        } else {
            View.VISIBLE
        }
    }
}