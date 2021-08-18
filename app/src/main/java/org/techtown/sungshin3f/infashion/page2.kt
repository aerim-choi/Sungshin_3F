package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage2Binding


class page2 : AppCompatActivity() {
    private var mBinding: ActivityPage2Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        //yes: 3p, no:6p

        binding.yesButton2.setOnClickListener {
            val intent = Intent(this, page3::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton2.setOnClickListener{
            val intent = Intent(this, page6::class.java)
            startActivity(intent)
            finish()
        }

    }
}