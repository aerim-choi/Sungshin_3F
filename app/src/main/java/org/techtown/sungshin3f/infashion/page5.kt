package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage5Binding


class page5 : AppCompatActivity() {
    private var mBinding: ActivityPage5Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //yes: 6p, no:9p
        binding.yesButton5.setOnClickListener {
            val intent = Intent(this, page6::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton5.setOnClickListener {
            val intent = Intent(this, page9::class.java)
            startActivity(intent)
            finish()
        }
    }
}