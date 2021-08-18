package org.techtown.sungshin3f

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.techtown.sungshin3f.databinding.FragmentQuestion1Binding

class Question1Fragment : Fragment() {
    private var mBinding: FragmentQuestion1Binding?=null
    private val binding get()=mBinding!!
    companion object{
        var question1:Boolean?=null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //답변받기
        mBinding= FragmentQuestion1Binding.inflate(inflater,container,false)
        binding.question1yesbtn.setOnClickListener {
            NewRecMainActivity.checkbool[0]=true
            binding.question1nobtn.setBackgroundColor(Color.WHITE)
            question1=true
            binding.question1yesbtn.setBackgroundColor(Color.GRAY)
        }
        binding.question1nobtn.setOnClickListener {
            NewRecMainActivity.checkbool[0]=true
            binding.question1yesbtn.setBackgroundColor(Color.WHITE)
            question1=false
            binding.question1nobtn.setBackgroundColor(Color.GRAY)
        }
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onDestroyView(){
        mBinding=null
        super.onDestroyView()
    }


}