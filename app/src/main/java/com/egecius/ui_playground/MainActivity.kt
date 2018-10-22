package com.egecius.ui_playground

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var image2: ImageView
    private val mUtils = ImageUtils()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createListener()
        image2 = findViewById(R.id.image_2)

        applyTinting()
        applyDrawableToTextView()
    }

    private fun createListener() {
        findViewById<View>(R.id.to_detail_activity).setOnClickListener { showDetailActivity() }
    }

    private fun showDetailActivity() {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }

    private fun applyTinting() {
        val context = applicationContext
        val drawable = mUtils.toTintedDrawable(context, R.drawable.ic_dog_barking,
                R.color.active_hub_hive_greyscale_25)
        image2.setImageDrawable(drawable)
    }

    private fun applyDrawableToTextView() {
        val textView = findViewById<TextView>(R.id.text_view_1)
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_dog_barking, 0, 0, 0)
        textView.text = "Dog next to R.drawable.ic_dog_barking"
    }

}
