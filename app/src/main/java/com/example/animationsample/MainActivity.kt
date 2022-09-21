package com.example.animationsample

import android.animation.Animator
import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import android.view.animation.LinearInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.animationsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val noOp: () -> Unit = {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        startAnimation()
    }

    private fun startAnimation() {
        binding.imageView.animate().rotation(360f).apply {
            interpolator = LinearInterpolator()
            duration = 5000L
            setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(p0: Animator?) {
                    noOp()
                }

                override fun onAnimationEnd(p0: Animator?) {
                    startTextAnimation()
                }

                override fun onAnimationCancel(p0: Animator?) {
                    noOp()
                }

                override fun onAnimationRepeat(p0: Animator?) {
                    noOp()
                }
            })
        }
    }

    private fun startTextAnimation() {
        binding.text1.animate().alpha(1.0f).apply {
            duration = 2000L
            interpolator = AccelerateInterpolator()
            setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(p0: Animator?) {
                    noOp()
                }

                override fun onAnimationEnd(p0: Animator?) {
                    noOp()
                }

                override fun onAnimationCancel(p0: Animator?) {
                    noOp()
                }

                override fun onAnimationRepeat(p0: Animator?) {
                    noOp()
                }

            })
        }
    }
}