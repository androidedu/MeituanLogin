package com.example.meituanlogin

import android.view.View
import android.widget.TextView
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

@BindingAdapter("showText")
fun TextView.showText(state: Boolean?){
    text = if (state == null){
        "请点击登录"
    }else {
        if (state) {
            "已登录"
        } else {
            "请点击登录"
        }
    }
}