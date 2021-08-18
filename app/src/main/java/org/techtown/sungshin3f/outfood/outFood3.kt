package org.techtown.sungshin3f.outfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide

import com.example.foodcate.outFood3Review
import com.example.foodcate.outFood3ReviewAdapter
import org.techtown.sungshin3f.databinding.ActivityOutFood3Binding

class outFood3 : AppCompatActivity() {
    private var mBinding: ActivityOutFood3Binding? = null
    private val binding get() = mBinding!!

    private lateinit var adapter: outFood3ReviewAdapter
    lateinit var img0: String
    lateinit var img1: String
    lateinit var img2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityOutFood3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        // 식당 사진 클릭
        binding.leftBtn.setOnClickListener {
            slideImgLeft()

        }
        binding.rightBtn.setOnClickListener {
            slideImgRight()
        }

        if (intent != null) {
            processIntent(intent)
        }


        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.layoutManager = layoutManager // 1. 리싸이클러뷰의 레이아웃 매니저 할당

        val adapter = outFood3ReviewAdapter() // (어댑터 생성)

        adapter.items.add(outFood3Review("0", "익명", 4, "강추합니다! 근데 실내가 너무 덥습니다."))
        adapter.items.add(outFood3Review("1", "익명", 5, "굉장히 맛있어요! 사장님도 정말 착하십니다!"))
        adapter.items.add(outFood3Review("2", "익명", 3, "알바생이 부족해보입니다. 웨이팅도 길었구요. 맛은 소문대로 맛있었습니다."))
        adapter.items.add(
            outFood3Review(
                "3",
                "익명",
                4,
                "친구랑 갔는데 둘 다 너무 만족했습니다! 다음에 또 오고 싶어요! 특히 치즈가 맛있습니다~"
            )
        )
        // 2. 어댑터에 데이터 저장
        // 익명

        binding.recyclerView.adapter = adapter
        // 3. 데이터가 담긴 어댑터를 리싸이클러뷰에 할당


        Glide.with(this)
            .load(img0)
            .into(binding.slideImage)

    } //onCreate 닫음

    fun processIntent(data: Intent) {
        img0 = data.getStringExtra("img1").toString()
        img1 = data.getStringExtra("img2").toString()
        img2 = data.getStringExtra("img3").toString()

        binding.shopName.text = data.getStringExtra("name")
        binding.shopAddr.text = data.getStringExtra("address")
        binding.shopType.text = data.getStringExtra("type")
        binding.shopTime.text = data.getStringExtra("time")

        var starrate = data.getStringExtra("star")
        var star = starrate!!.toFloat()
        binding.outFoodStar.rating = star
        var heartrate = data.getStringExtra("heart")
        var heart = heartrate!!.toFloat()
        binding.outFoodHeart.rating = heart
    }

    var current: Int = 0

    fun slideImgLeft() {
        if (current == 0) { // Show img0
            Glide.with(this)
                .load(img2)
                .into(binding.slideImage)
            println("현재 페이지 $current, 클릭됨")
            current = 2
            println("전환된 페이지 $current")
        } else if (current == 1) {
            Glide.with(this)
                .load(img0)
                .into(binding.slideImage)
            println("현재 페이지 $current, 클릭됨")
            current = 0
            println("전환된 페이지 $current")

        } else if (current == 2) {
            Glide.with(this)
                .load(img1)
                .into(binding.slideImage)
            println("현재 페이지 $current, 클릭됨")
            current = 1
            println("전환된 페이지 $current")
        }
    }

    fun slideImgRight() {
        if (current == 0) { // Show img0
            Glide.with(this)
                .load(img1)
                .into(binding.slideImage)
            println("현재 페이지 $current, 클릭됨")
            current = 1
            println("전환된 페이지 $current")
        } else if (current == 1) {
            Glide.with(this)
                .load(img2)
                .into(binding.slideImage)
            println("현재 페이지 $current, 클릭됨")
            current = 2
            println("전환된 페이지 $current")
        } else if (current == 2) {
            Glide.with(this)
                .load(img0)
                .into(binding.slideImage)
            println("현재 페이지 $current, 클릭됨")
            current = 0
            println("전환된 페이지 $current")
        }
    }


}


