package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage9Binding


class page9 : AppCompatActivity() {
    private var mBinding: ActivityPage9Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //yes: Atype, no:10p
        binding.yesButton9.setOnClickListener {
            val intent = Intent(this, Atype::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton9.setOnClickListener {
            val intent = Intent(this, page10::class.java)
            startActivity(intent)
            finish()
        }
    }
}