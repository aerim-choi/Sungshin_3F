package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityInfun1Binding


class Infun1 : AppCompatActivity() {
    private var mBinding: ActivityInfun1Binding?=null
    private val binding get()=mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityInfun1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newrecbtn.setOnClickListener{
            var newrecIntent=Intent(this, NewRecMainActivity::class.java)
            startActivity(newrecIntent)
        }
        binding.romancebtn.setOnClickListener {
            var romanceIntent= Intent(this, Romancewebtoon::class.java)
            startActivity(romanceIntent)
        }
        binding.actionbtn.setOnClickListener {
            var actionIntent=Intent(this,Actionwebtoon::class.java)
            startActivity(actionIntent)
        }
        binding.thrillerbtn.setOnClickListener {
            var thrillerIntent=Intent(this, Thrillerwebtoon::class.java)
            startActivity(thrillerIntent)

        }
        binding.periodbtn.setOnClickListener {
            var periodIntent=Intent(this, Periodwebtoon::class.java)
            startActivity(periodIntent)
        }
        binding.fantasybtn.setOnClickListener {
            var fantasyIntent=Intent(this,Fantasywebtoon::class.java)
            startActivity(fantasyIntent)
        }

    }


}