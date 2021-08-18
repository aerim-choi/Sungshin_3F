package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage6Binding


class page6 : AppCompatActivity() {
    private var mBinding: ActivityPage6Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //yes: 7p, no:9p
        binding.yesButton6.setOnClickListener {
            val intent = Intent(this, page7::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton6.setOnClickListener {
            val intent = Intent(this, page9::class.java)
            startActivity(intent)
            finish()
        }
    }
}