package org.techtown.sungshin3f
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityPage11Binding

class page11 : AppCompatActivity() {
    private var mBinding: ActivityPage11Binding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityPage11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //yes: Ctype, no:12p

        binding.yesButton11.setOnClickListener {
            val intent = Intent(this, Ctype::class.java)
            startActivity(intent)
            finish()
        }

        binding.noButton11.setOnClickListener {
            val intent = Intent(this, page12::class.java)
            startActivity(intent)
            finish()
        }
    }
}