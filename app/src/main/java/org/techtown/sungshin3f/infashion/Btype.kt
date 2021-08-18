package org.techtown.sungshin3f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityBtypeBinding

class Btype : AppCompatActivity() {
    private var mBinding: ActivityBtypeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityBtypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}