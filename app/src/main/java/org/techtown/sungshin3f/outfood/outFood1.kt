package org.techtown.sungshin3f.outfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import org.techtown.sungshin3f.databinding.ActivityOutoutfoodBinding


class outFood1 : AppCompatActivity() {

    private var mBinding: ActivityOutoutfoodBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityOutoutfoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.outFood1SingleBtn.setOnClickListener {
            println("버튼 클릭됨")
            val intent = Intent(this, OutFood2Sing::class.java)
            startActivity(intent)
            println("화면 전환")
        } // (혼밥 버튼 클릭시) 화면 전환 소스코드

        binding.outFood1ParBtn.setOnClickListener {
            val intent = Intent(this, OutFood2Par::class.java)
            startActivity(intent)
            println("잘 클릭됨")
        } // (플렉스 버튼 클릭시) 화면 전환 소스코드

        binding.outFood1FlexBtn.setOnClickListener {
            println("버튼 클릭됨")
            val intent = Intent(this, OutFood2Flex::class.java)
            startActivity(intent)
            println("화면 전환")

        } // (부모님 버튼 클릭시) 화면 전환 소스코드

        binding.outFood1VegBtn.setOnClickListener {
            val intent = Intent(this, OutFood2Vegan::class.java)
            startActivity(intent)

        }
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }


}


