package org.techtown.sungshin3f

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import org.techtown.sungshin3f.databinding.ActivityOutsidecateBinding
import org.techtown.sungshin3f.outfood.outFood1
import org.techtown.sungshin3f.presentation.OutFun1

class OutsideCate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityOutsidecateBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.OutsideCate1Fbtn.setOnClickListener {
            val outFun1Intent = Intent(this, OutFun1::class.java)
            startActivity(outFun1Intent)
        }
        binding.OutsideCate2Fbtn.setOnClickListener {
            val outFood1Intent = Intent(this, outFood1::class.java)
            startActivity(outFood1Intent)
        }
        binding.OutsideCate3Fbtn.setOnClickListener {
            val outFashion1Intent = Intent(this, OutFashion1::class.java)
            startActivity(outFashion1Intent)
        }


        //토글 만드는방법(개발자가 이렇게 쓰라고 한거임 )
        setSupportActionBar(binding.toolbar)

        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.toolbar,
            R.string.open,
            R.string.close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    val outsideIntent = Intent(this, OutFun1::class.java)
                    startActivity(outsideIntent)
                }
                R.id.item2 -> {
                    val outsideIntent = Intent(this, outFood1::class.java)
                    startActivity(outsideIntent)
                }
                R.id.item3 -> {
                    val outsideIntent = Intent(this, OutFashion1::class.java)
                    startActivity(outsideIntent)
                }
            }
            //바로가기 메뉴 닫기
            binding.drawerLayout.closeDrawer(GravityCompat.START)

            return@setNavigationItemSelectedListener true
        }
    }

    override fun onBackPressed() {
        var binding = ActivityOutsidecateBinding.inflate(layoutInflater)
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            finish()
            super.onBackPressed()
        }
    }
}


