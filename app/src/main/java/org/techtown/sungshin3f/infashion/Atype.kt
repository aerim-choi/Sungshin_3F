package org.techtown.sungshin3f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityAtypeBinding


class Atype : AppCompatActivity() {
    private var mBinding: ActivityAtypeBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityAtypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}