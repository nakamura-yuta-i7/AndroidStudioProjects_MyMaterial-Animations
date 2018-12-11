package com.nkmr.mymaterial_animations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tappedNextButton(v: View) {
        val i = Intent(this, SecondActivity::class.java)
        startActivity(i)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}
