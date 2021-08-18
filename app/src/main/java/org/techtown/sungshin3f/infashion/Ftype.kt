package org.techtown.sungshin3f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityFtypeBinding

class Ftype : AppCompatActivity() {
    private var mBinding: ActivityFtypeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityFtypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}