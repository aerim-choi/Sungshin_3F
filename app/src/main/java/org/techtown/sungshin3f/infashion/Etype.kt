package org.techtown.sungshin3f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityEtypeBinding

class Etype : AppCompatActivity() {
    private var mBinding: ActivityEtypeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityEtypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}