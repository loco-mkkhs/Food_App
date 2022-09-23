package com.example.food_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val bottomnav = findViewById<BottomNavigationItemView>(R.id.bottomnav)
        val navController = findNavController(R.id.host_fragment)

        bottomnav.setupWithNavController(navController)
        
        
    }

}

private fun BottomNavigationItemView.setupWithNavController(navController: NavController) {

}





