package com.example.fragments3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//define logic
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  first create an instance
        val firstBtn: Button = findViewById(R.id.btnFragment1)
         val secondBtn: Button = findViewById(R.id.btnFragment2)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        //replace the content of frame layout with first or second fragment by
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FLfragment, firstFragment)
            commit()
        }

            //click button to change the content to corresponding fragment
            firstBtn.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    //replace container which is frame layout
                    replace(R.id.FLfragment, firstFragment)
                    //must call commit to apply those changes
                    commit()
                    addToBackStack(null)
                }
            }

            secondBtn.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    //replace container which is frame layout
                    replace(R.id.FLfragment, secondFragment)
                    //must call commit to apply those changes
                    commit()
                    addToBackStack(null)
                }
            }
        }
    }
