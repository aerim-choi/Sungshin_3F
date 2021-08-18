package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage3Binding


class page3 : AppCompatActivity() {
    private var mBinding: ActivityPage3Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)

    //yes: 4p, no:7p
        binding.yesButton3.setOnClickListener {
            val intent = Intent(this, page4::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton3.setOnClickListener{
            val intent = Intent(this, page7::class.java)
            startActivity(intent)
            finish()
        }
    }
}