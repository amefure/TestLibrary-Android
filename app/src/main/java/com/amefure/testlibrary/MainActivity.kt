package com.amefure.testlibrary

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.amefure.mylibrary.MyLibraryClass


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            MyLibraryClass.showToast(this, "Test")
        }
    }
}
