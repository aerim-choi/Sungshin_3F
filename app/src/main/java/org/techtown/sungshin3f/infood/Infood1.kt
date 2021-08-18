package org.techtown.sungshin3f


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sungshin3f.databinding.ActivityInfood1Binding

class Infood1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityInfood1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inFood1SingleBtn.setOnClickListener{
            var intent= Intent(this,Infood2Single::class.java)
            startActivity(intent)
        }
        binding.inFood1HomeBtn.setOnClickListener{
            var intent= Intent(this,Infood2Home::class.java)
            startActivity(intent)
        }
        binding.inFood1PartyBtn.setOnClickListener{
            var intent= Intent(this,Infood2Party::class.java)
            startActivity(intent)
        }
        binding.inFood1VeganBtn.setOnClickListener{
            var intent= Intent(this,Infood2Vegan::class.java)
            startActivity(intent)
        }
    }
}