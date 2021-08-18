package org.techtown.sungshin3f

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import org.techtown.sungshin3f.databinding.ActivityGuideBinding

// 다운로드한 후 처음 실행하면 뜨는 어플 메뉴얼화면입니다.
class GuideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityGuideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pager.adapter = PagerAdapter(this)
        binding.pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.pager.offscreenPageLimit = 3

        binding.indicator.setViewPager(binding.pager)
        binding.indicator.createIndicators(3, 0)

    }

    inner class PagerAdapter : FragmentStateAdapter {
        //생성자
        constructor(activity: FragmentActivity) : super(activity)

        //아이템이 개수
        override fun getItemCount() = 3

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> {
                    GuideFragment1()
                }
                1 -> {
                    GuideFragment2()
                }
                2 -> {
                    GuideFragment3()
                }
                else -> {
                    GuideFragment1()
                }
            }
        }
    }

}
