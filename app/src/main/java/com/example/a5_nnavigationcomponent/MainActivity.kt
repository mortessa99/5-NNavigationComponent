package com.example.a5_nnavigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.a5_nnavigationcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    lateinit var appBarConfiguration: AppBarConfiguration //برای ایجاد دسترسی ها به appbar متل نام و عنوان و...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            navController = findNavController(R.id.navHost)

            //برای ایجاد دسترسی ها به appbar متل نام و عنوان و...
            appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment,R.id.detailFragment))
            setupActionBarWithNavController(navController,appBarConfiguration)
            //
        }
    }

    //برای هندل کردن back در فرگمنت ها
    override fun onNavigateUp(): Boolean {
        return navController.navigateUp() || super.onNavigateUp()
    }
    //
}