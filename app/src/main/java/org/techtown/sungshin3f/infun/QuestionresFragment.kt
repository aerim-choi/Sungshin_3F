package org.techtown.sungshin3f

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import org.techtown.sungshin3f.databinding.FragmentQuestionresBinding


class QuestionresFragment : Fragment() {
    private var mBinding: FragmentQuestionresBinding?=null
    private val binding get()=mBinding!!

    private var checkres:Int=0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        mBinding= FragmentQuestionresBinding.inflate(inflater,container,false)
        //모든답변을 받았는지 확인
        binding.resentrancebtn.setOnClickListener {
            checkres=0//초기화
            for(i in 0..4) {
                when (NewRecMainActivity.checkbool[i]) {
                    true->
                        checkres=checkres+1
                }
            }
            when(checkres){
                //5가지 답변을 모두 받았다면 다음화면이
                5->{
                    var intent=Intent(getActivity(),Recwebtoonres::class.java)
                    startActivity(intent)
                }
                //답변을 받지 않은것이 있다면 토스트메세지 전달
                else->{
                    for (i in 0..4){
                        when(NewRecMainActivity.checkbool[i]){
                            false ->{
                                showToast("${i + 1}번째 질문에 대답해 주세요.")
                            }
                        }
                    }
                }
            }
        }
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onDestroyView(){
        mBinding=null
        super.onDestroyView()
    }
    fun showToast(message:String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}