package com.herpestes.landmarkbook

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.herpestes.landmarkbook.databinding.ActivityDetailsBinding
import com.herpestes.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarklist : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarklist = ArrayList<Landmark>()
        //DATA
        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val collesium = Landmark("Colloseum", "Italy", R.drawable.collesium)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "UK", R.drawable.londonbridge)



        landmarklist.add(pisa)
        landmarklist.add(collesium)
        landmarklist.add(eiffel)
        landmarklist.add(londonBridge)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarklist)
        binding.recyclerView.adapter = landmarkAdapter
        /*
        //Adapter : Layout & Data
        
        //Mapping
        
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarklist.map { landmark ->  landmark.name })
        binding.listview.adapter = adapter

        binding.listview.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(MainActivity@this, DetailsActivity::class.java)
            intent.putExtra("Landmark", landmarklist.get(position))
            startActivity(intent)
        }
*/
    }
}