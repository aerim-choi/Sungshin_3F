package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage12Binding


class page12 : AppCompatActivity() {
    private var mBinding: ActivityPage12Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //yes: Dtype, no:Gtype
        binding.yesButton12.setOnClickListener {
            val intent = Intent(this, Dtype::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton12.setOnClickListener {
            val intent = Intent(this, Gtype::class.java)
            startActivity(intent)
            finish()
        }
    }
}