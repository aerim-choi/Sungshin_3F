package org.techtown.sungshin3f
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage1Binding


class page1 : AppCompatActivity() {
    private var mBinding:ActivityPage1Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.yesButton.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton.setOnClickListener{
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
            finish()
        }
    }
}