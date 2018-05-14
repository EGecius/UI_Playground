package com.egecius.ui_playground

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var image2: ImageView? = null
    private val mUtils = ImageUtils()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createListener()
        image2 = findViewById(R.id.image_2) as ImageView

        applyTinting()
    }

    private fun createListener() {
        findViewById(R.id.to_detail_activity).setOnClickListener { showDetailActivity() }
    }

    private fun showDetailActivity() {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }

    private fun applyTinting() {
        val context = applicationContext
        val drawable = mUtils.toTintedDrawable(context, R.drawable.ic_dog_barking,
                R.color.active_hub_hive_greyscale_25)
        image2!!.setImageDrawable(drawable)
    }

}
