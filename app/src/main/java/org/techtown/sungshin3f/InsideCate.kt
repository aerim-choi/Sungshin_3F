package org.techtown.sungshin3f

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import org.techtown.sungshin3f.databinding.ActivityInsidecateBinding
import org.techtown.sungshin3f.presentation.OutFun1

class InsideCate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityInsidecateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.InsideCate1Fbtn.setOnClickListener {
            val InFun1Intent = Intent(this, Infun1::class.java)
            startActivity(InFun1Intent)
        }
        binding.InsideCate2Fbtn.setOnClickListener{
            val InFood1Intent=Intent(this,Infood1::class.java)
            startActivity(InFood1Intent)
        }
        //패션인텐트 할자리
       binding.InsideCate3Fbtn.setOnClickListener {
           val InFashion1Intent=Intent(this,page1::class.java)
           startActivity(InFashion1Intent)
       }


        //토글 만드는방법
        setSupportActionBar(binding.toolbar)

        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    val InFun1Intent = Intent(this, Infun1::class.java)
                    startActivity(InFun1Intent)
                }
                R.id.item2 -> {
                    val InFood1Intent=Intent(this,Infood1::class.java)
                    startActivity(InFood1Intent)
                }
                R.id.item3 -> {
                    val InFashion1Intent=Intent(this,page1::class.java)
                    startActivity(InFashion1Intent)
                }
            }
            //바로가기 메뉴 닫기
            binding.drawerLayout.closeDrawer(GravityCompat.START)

            return@setNavigationItemSelectedListener true
        }
    }

    override fun onBackPressed() {
        var binding = ActivityInsidecateBinding.inflate(layoutInflater)
        if(binding.drawerLayout.isDrawerOpen((GravityCompat.START))){
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }else{
            finish()
            super.onBackPressed()
        }
    }
}
