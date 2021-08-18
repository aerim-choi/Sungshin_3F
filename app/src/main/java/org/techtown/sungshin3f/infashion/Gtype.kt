package org.techtown.sungshin3f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityGtypeBinding

class Gtype : AppCompatActivity() {
    private var mBinding: ActivityGtypeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityGtypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}