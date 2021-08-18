package org.techtown.sungshin3f
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.techtown.sungshin3f.databinding.Guidefragment3Binding

class GuideFragment3 : Fragment() {
    private var mBinding:Guidefragment3Binding?=null
    private val binding get()=mBinding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding= Guidefragment3Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.entrancebtn.setOnClickListener {
            activity?.let{
                var intent=Intent(context,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}