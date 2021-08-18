package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage7Binding

class page7 : AppCompatActivity() {
    private var mBinding: ActivityPage7Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //yes: 11p, no:8p
        binding.yesButton7.setOnClickListener {
            val intent = Intent(this, page11::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton7.setOnClickListener {
            val intent = Intent(this, page8::class.java)
            startActivity(intent)
            finish()
        }
    }
}