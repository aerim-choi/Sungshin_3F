package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage4Binding


class page4 : AppCompatActivity() {
    private var mBinding: ActivityPage4Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //yes: Etype, no:8p
        binding.yesButton4.setOnClickListener {
            val intent = Intent(this, Etype::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton4.setOnClickListener {
            val intent = Intent(this, page8::class.java)
            startActivity(intent)
            finish()
        }
    }
}