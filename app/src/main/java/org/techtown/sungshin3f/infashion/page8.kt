package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage8Binding


class page8 : AppCompatActivity() {
    private var mBinding: ActivityPage8Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //yes: Ftype, no: Etype
        binding.yesButton8.setOnClickListener {
            val intent = Intent(this, Ftype::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton8.setOnClickListener {
            val intent = Intent(this, Etype::class.java)
            startActivity(intent)
            finish()
        }
    }
}