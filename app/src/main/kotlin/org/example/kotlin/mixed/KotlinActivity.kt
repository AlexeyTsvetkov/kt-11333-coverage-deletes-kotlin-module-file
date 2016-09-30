package org.example.kotlin.mixed

import android.os.Bundle
import android.app.Activity
import com.example.mylibrary.extension

class KotlinActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resources.extension()
    }
}
