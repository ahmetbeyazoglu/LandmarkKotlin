package com.herpestes.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.herpestes.landmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //casting
        val selectedLandmark  = intent.getSerializableExtra("Landmark") as Landmark
        binding.nametext.text = selectedLandmark.name
        binding.countryname.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)


    }
}