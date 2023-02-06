package com.example.random_image

import kotlin.random.Random

class MainViewModel {
  fun randomImgUrl(random: Int): String{
    return "https://picsum.photos/200?random=$random"
  }

  fun pickRandomOption(): Int = Random.nextInt(0, 10)
}