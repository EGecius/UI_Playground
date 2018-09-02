package com.egecius.ui_playground.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.view.inputmethod.InputMethodManager
import com.egecius.ui_playground.R

class MyFragmentActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_fragment)

        showFragment1()
    }

    private fun showFragment1() {
        showFragment(Fragment1())
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.placeholder, fragment)
                .commit()
    }

    fun showFragment2() {
        hideKeyboard()
        showFragment(Fragment2())
    }


    private fun hideKeyboard() {
        val view = currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}
