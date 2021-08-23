package com.shankasur.view

import android.content.Context
import android.widget.Toast

class ToasterMessage(private val context:Context) {
    fun short(msg:String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}