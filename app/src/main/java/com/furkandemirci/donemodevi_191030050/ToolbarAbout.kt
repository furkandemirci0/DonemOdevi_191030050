package com.furkandemirci.donemodevi_191030050

import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toolbar_about.*
import kotlinx.android.synthetic.main.activity_toolbar_about.*

class ToolbarAbout : AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_about)
        aboutMe.movementMethod = ScrollingMovementMethod()
    }
}