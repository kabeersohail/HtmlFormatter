package com.example.htmlformatter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import com.example.htmlformatter.Constants.SAMPLE_HTML_WITH_VIDEO
import com.example.htmlformatter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.htmlTextView.text = HtmlCompat.fromHtml(SAMPLE_HTML_WITH_VIDEO, 0)

        

    }
}