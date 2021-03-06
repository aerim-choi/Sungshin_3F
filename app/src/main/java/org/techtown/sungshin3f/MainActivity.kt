package org.techtown.sungshin3f

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.sungshin3f.databinding.ActivityMainpageBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //처음실행시 뜨는 메뉴얼확인 여부
        //true면 봤으니 실행시키지 않음 false면 실행시킴

        val pref=getSharedPreferences("checkFirst", Activity.MODE_PRIVATE)
        val checkFirst:Boolean=pref.getBoolean("checkFirst",false)

        if(checkFirst==false){
            //앱 최초 실행시 하고 싶은작업
            val editor:SharedPreferences.Editor=pref.edit()
            editor.putBoolean("checkFirst",true)
            editor.commit()

            val guideIntent=Intent(this,GuideActivity::class.java)
            startActivity(guideIntent)

            finish()


        }else{
            //앱 최초 실행이 아닌 경우

        }
        //외부버튼
        binding.Image1.setOnClickListener {
            val outsideIntent= Intent(this,OutsideCate::class.java)
            startActivity(outsideIntent)
        }
        //외부버튼
        binding.Image2.setOnClickListener{
            val insideIntent= Intent(this,InsideCate::class.java)
            startActivity(insideIntent)
        }
    }
}