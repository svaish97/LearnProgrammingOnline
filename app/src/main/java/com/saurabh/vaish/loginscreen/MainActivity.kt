package com.saurabh.vaish.loginscreen

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signUp.setOnClickListener {
            val intent=Intent(this@MainActivity,SignUp::class.java)
            val options=ActivityOptions.makeSceneTransitionAnimation(this, Pair.create(signUp,"signUpTransition"))
            startActivity(intent,options.toBundle())
        }
    }
}
