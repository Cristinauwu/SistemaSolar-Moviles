package com.cristina.sistemasolar

import android.animation.ValueAnimator
import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mer = findViewById<ImageView>(R.id.mercurio)
        val ven = findViewById<ImageView>(R.id.venus)
        val tie = findViewById<ImageView>(R.id.tierra)
        val mar = findViewById<ImageView>(R.id.marte)
        val jup = findViewById<ImageView>(R.id.jupiter)
        val sat = findViewById<ImageView>(R.id.saturno)
        val ura = findViewById<ImageView>(R.id.urano)
        val nep = findViewById<ImageView>(R.id.neptuno)

        val animator= ValueAnimator.ofInt(0, 359)
        animator.addUpdateListener { value ->
            val animateValue = value.animatedValue as Int

            val layoutParamsMer = mer.layoutParams as ConstraintLayout.LayoutParams
            layoutParamsMer.circleAngle =animateValue.toFloat()
            val layoutParamsVen = ven.layoutParams as ConstraintLayout.LayoutParams
            layoutParamsVen.circleAngle =animateValue.toFloat()
            val layoutParamsTie = tie.layoutParams as ConstraintLayout.LayoutParams
            layoutParamsTie.circleAngle =animateValue.toFloat()
            val layoutParamsMar = mar.layoutParams as ConstraintLayout.LayoutParams
            layoutParamsMar.circleAngle =animateValue.toFloat()
            val layoutParamsJup = jup.layoutParams as ConstraintLayout.LayoutParams
            layoutParamsJup.circleAngle =animateValue.toFloat()
            val layoutParamsSat = sat.layoutParams as ConstraintLayout.LayoutParams
            layoutParamsSat.circleAngle =animateValue.toFloat()
            val layoutParamsUr = ura.layoutParams as ConstraintLayout.LayoutParams
            layoutParamsUr.circleAngle =animateValue.toFloat()
            val layoutParamsNep = nep.layoutParams as ConstraintLayout.LayoutParams
            layoutParamsNep.circleAngle =animateValue.toFloat()

            mer.layoutParams = layoutParamsMer
            ven.layoutParams = layoutParamsVen
            tie.layoutParams = layoutParamsTie
            mar.layoutParams = layoutParamsMar
            jup.layoutParams = layoutParamsJup
            sat.layoutParams = layoutParamsSat
            ura.layoutParams = layoutParamsUr
            nep.layoutParams = layoutParamsNep
        }

        animator.repeatMode = ValueAnimator.RESTART
        animator.repeatCount = ValueAnimator.INFINITE
        animator.interpolator = LinearInterpolator()
        animator.duration = 3500

        animator.start()
    }
}