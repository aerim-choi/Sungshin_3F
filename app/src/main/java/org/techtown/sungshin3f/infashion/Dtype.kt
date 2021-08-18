package org.techtown.sungshin3f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityDtypeBinding

class Dtype : AppCompatActivity() {
    private var mBinding: ActivityDtypeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityDtypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}