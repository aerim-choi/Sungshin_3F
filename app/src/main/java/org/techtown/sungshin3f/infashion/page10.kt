package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage10Binding

class page10 : AppCompatActivity() {
    private var mBinding: ActivityPage10Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //yes: Btype, no: 8p
        binding.yesButton10.setOnClickListener {
            val intent = Intent(this, Btype::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton10.setOnClickListener{
            val intent = Intent(this, page8::class.java)
            startActivity(intent)
            finish()
        }
    }
}