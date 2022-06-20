package com.hefei.kotlin.module.main

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.hefei.kotlin.R
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.countLiveData.observe(this, { t ->
            Timber.e("livedata onChanged: value = $t")
        })

        findViewById<TextView>(R.id.tv_title).setOnClickListener {
            viewModel.updateTitlePost("Java")
            viewModel.updateTitlePost("Kotlin")
        }



    }
}