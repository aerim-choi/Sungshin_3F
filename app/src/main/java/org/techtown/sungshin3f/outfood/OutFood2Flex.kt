package org.techtown.sungshin3f.outfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import org.techtown.sungshin3f.OutFashion1
import org.techtown.sungshin3f.R
import org.techtown.sungshin3f.databinding.ActivityOutfood2flexBinding
import org.techtown.sungshin3f.outfood.outFood2_hye.outfood2_hye_flex
import org.techtown.sungshin3f.outfood.outFood2_su.outfood2_su_flex
import org.techtown.sungshin3f.outfood.outFood2_un.outfood2_un_flex
import org.techtown.sungshin3f.presentation.OutFun1


class OutFood2Flex : AppCompatActivity() {

    private var mBinding : ActivityOutfood2flexBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityOutfood2flexBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.pager.adapter = PagerAdapter(this)
        binding.pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.pager.offscreenPageLimit = 3
        binding.pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
//                showToast("페이지 선택: ${position}")
            }
        })
        binding.outFood2LocSuBtn.setOnClickListener {
            binding.pager.currentItem = 0
        }
        binding.outFood2LocUnBtn.setOnClickListener {
            binding.pager.currentItem = 1
        }
        binding.outFoodLocHyeBtn.setOnClickListener {
            binding.pager.currentItem = 2
        }

        setSupportActionBar(binding.toolbar)

        val toggle =
            ActionBarDrawerToggle(
                this,
                binding.drawerLayout,
                binding.toolbar,
                R.string.open,
                R.string.close
            )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    val outsideIntent = Intent(this, OutFun1::class.java)
                    startActivity(outsideIntent)
                }
                R.id.item2 -> {
                    val outsideIntent = Intent(this, outFood1::class.java)
                    startActivity(outsideIntent)
                }
                R.id.item3 -> {
                    val outsideIntent = Intent(this, OutFashion1::class.java)
                    startActivity(outsideIntent)
                }
            }
            //바로가기 메뉴 닫기
            binding.drawerLayout.closeDrawer(GravityCompat.START)

            return@setNavigationItemSelectedListener true
        }
    }


    inner class PagerAdapter : FragmentStateAdapter {
        constructor(activity: FragmentActivity) : super(activity)

        override fun getItemCount() = 3
        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> {
                    outfood2_su_flex()
                }
                1 -> {
                    outfood2_un_flex()
                }
                2 -> {
                    outfood2_hye_flex()
                }
                else -> {
                    outfood2_su_flex()
                }
            }
        }
    }

    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy() }

}









