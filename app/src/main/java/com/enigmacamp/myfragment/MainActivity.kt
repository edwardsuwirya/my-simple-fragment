package com.enigmacamp.myfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentA = FragmentA.newInstance()
        val fragmentB = FragmentB.newInstance()

        var bundleName = Bundle()
        bundleName.putString("name", "Enigma")
        fragmentB.arguments = bundleName

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentA_container, fragmentA)
            replace(R.id.fragmentB_container, fragmentB)
            commit()
        }
    }
}