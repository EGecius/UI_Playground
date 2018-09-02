package com.egecius.ui_playground.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.egecius.ui_playground.R

class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_1, container, false)
        setOnClickListener(rootView)

        return rootView
    }

    private fun setOnClickListener(rootView: View) {
        rootView.findViewById<View>(R.id.to_fragment_2).setOnClickListener {
            (activity as MyFragmentActivity).showFragment2()
        }
    }


}
