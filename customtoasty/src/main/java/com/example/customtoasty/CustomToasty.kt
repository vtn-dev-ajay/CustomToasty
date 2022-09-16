package com.example.customtoasty

import android.content.Context
import android.widget.Toast

object CustomToasty {

    @JvmStatic
    fun showToaster(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}