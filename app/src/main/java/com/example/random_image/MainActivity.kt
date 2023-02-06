package com.example.random_image

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
  private lateinit var mainImageView: AppCompatImageView
  private val viewModel = MainViewModel()

  private fun initComponents() {
    mainImageView = findViewById(R.id.img_main)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    initComponents()
    setupGlide()
  }

  override fun onStart() {
    setupGlide()
    super.onStart()
  }

  override fun onResume() {
    setupGlide()
    super.onResume()
  }

  private fun setupGlide() {
    val imgUrl = viewModel.randomImgUrl(viewModel.pickRandomOption())
    Glide.with(this).load(imgUrl).placeholder(R.drawable.placeholder).into(mainImageView)
  }

}