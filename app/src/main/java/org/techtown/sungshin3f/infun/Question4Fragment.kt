package org.techtown.sungshin3f

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.techtown.sungshin3f.databinding.FragmentQuestion4Binding

class Question4Fragment : Fragment() {
    private var mBinding: FragmentQuestion4Binding?=null
    private val binding get()=mBinding!!
    companion object{
        var question4:Boolean?=null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        mBinding= FragmentQuestion4Binding.inflate(inflater,container,false)
        //답변받기
        binding.question4tbtn.setOnClickListener {
            NewRecMainActivity.checkbool[3]=true
            binding.question4fbtn.setBackgroundColor(Color.WHITE)
            question4=true
            binding.question4tbtn.setBackgroundColor(Color.GRAY)
        }
        binding.question4fbtn.setOnClickListener {
            NewRecMainActivity.checkbool[3]=true
            binding.question4tbtn.setBackgroundColor(Color.WHITE)
            question4=false
            binding.question4fbtn.setBackgroundColor(Color.GRAY)
        }
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onDestroyView(){
        mBinding=null
        super.onDestroyView()
    }

}