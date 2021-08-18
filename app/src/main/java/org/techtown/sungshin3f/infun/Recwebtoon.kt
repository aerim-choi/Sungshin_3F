package org.techtown.sungshin3f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import org.techtown.sungshin3f.databinding.ActivityRecwebtoonBinding

class Recwebtoon : AppCompatActivity() {
    private var mBinding: ActivityRecwebtoonBinding?=null
    private val binding get()=mBinding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding =  ActivityRecwebtoonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //페이저 만들기
        binding.pager.adapter =PagerAdapter(this)
        binding.pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.pager.offscreenPageLimit = 6

        binding.indicator.setViewPager(binding.pager)
        //indicator 3개만들고 첫번째꺼를 보여준다.
        binding.indicator.createIndicators(6,0)

        binding.pager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.indicator.animatePageSelected(position)
            }
        })
    }
    //질문 페이저 생성
    inner class PagerAdapter : FragmentStateAdapter {
        //생성자
        constructor(activity: FragmentActivity):super(activity)
        //아이템이 몇개있냐
        override fun getItemCount()=6

        override fun createFragment(position: Int): Fragment {
            return when(position){
                0->{
                    Question1Fragment()
                }
                1->{
                    Question2Fragment()
                }
                2->{
                    Question3Fragment()
                }
                3->{
                    Question4Fragment()
                }
                4->{
                    Question5Fragment()
                }
                5->{
                    QuestionresFragment()
                }
                else->{
                    QuestionresFragment()
                }
            }
        }
    }
}