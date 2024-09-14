package com.amefure.mylibrary

import android.content.Context
import android.widget.Toast

class MyLibraryClass {
    companion object {
        public fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}