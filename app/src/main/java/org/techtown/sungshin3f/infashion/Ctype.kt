package org.techtown.sungshin3f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityCtypeBinding


class Ctype : AppCompatActivity() {
    private var mBinding: ActivityCtypeBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityCtypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}