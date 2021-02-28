package com.dirror.music.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dirror.music.databinding.ActivitySplashBinding
import com.dirror.music.ui.base.BaseActivity

/**
 * 启动页 Activity
 */
class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun initBinding() {
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}