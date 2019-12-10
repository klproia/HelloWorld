/*It can be used to write all sort of applications and those application can run wherever we have*/
// a JVM  which basically means everywhere, and even in the browser. Also means that it can reuse Java
// 'libraries' or JavaScript libraries

package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class
MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

