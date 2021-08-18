package org.techtown.sungshin3f.outfood.outFood2_su

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import org.techtown.sungshin3f.databinding.Outfood2RecyclerviewBinding
import org.techtown.sungshin3f.outfood.FoodAdapter
import org.techtown.sungshin3f.outfood.outfood2_profile

class outfood2_su_hyodo : Fragment() {

    private var mBinding: Outfood2RecyclerviewBinding? = null
    private val binding get() = mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        mBinding= Outfood2RecyclerviewBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.layoutManager = layoutManager

        val adapter = FoodAdapter()

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/83589/803078_1567755986261_17112?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","원조 한방 삼계탕", "서울 성북구 고려대로1길 92", "?", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA4MTZfMzcg%2FMDAxNTk3NTg3NzA4MzUz.kfeE7aBgL9bxn5NC-XTJn2xB1r6yjcDfhQDsBcdReoYg.pIEvtOMo9ePPf3ENt4ywKy7Upecz8cvlOK0kyozlCVUg.JPEG.wwwwny%2Foutput_487464695.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAzMTZfMjk1%2FMDAxNjE1OTA1Mjc0ODkw.DlScNepO3zJv7w-XP0zsczSERdt_IbK-uQmCnjd_aLsg.3XSf3f0yH_erTcimpx0-PO5FkcH8qIjeOACxsSQ2UT8g.JPEG.wkdb6649%2FIMG_0089.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20200710_290%2F1594354108936VAGcY_JPEG%2Fupload_d821f4421a554f779b43e07fd26fdfc8.jpeg", "백숙, 삼계탕"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/459252/1205377_1622733959102_62428?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","언앨리셰프", "서울 성북구 동소문로24가길 21 1층", "week days: 11:30 to 22, weekend: 12 to 22", "4.0", "4.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA0MjFfMjM1%2FMDAxNjE4OTg4NDQyMjc5.KkoerVB0yT4oQia-zglincXFAr5nhj5RwVT9UbKsY6kg.Sl8Jjvfq9D76vNqC0ZBeaXNi0k6tIJmLCXyle07XirEg.JPEG.0424hsy%2FKakaoTalk_20210421_155331530.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210816_200%2F1629089131402vjnWi_JPEG%2Fupload_59deb6466e1885ba6b61b4fd5656d4fc.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MjZfMjc3%2FMDAxNjI3MjY0NjIxMjIy.3dYeh0h7FAEoHtAZGJt6roqo2OAG11TrTyVvQ_hfS8Mg.Rn8vipDeq4jfmgHIqF51iw4XuoynrcAJAPKq1ghPx3cg.JPEG.leenayoungd%2FIMG_5042.jpg", "양식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/394407_1471587251026716.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","스시미", "서울 성북구 보문로30길 84", "week days: 11 to 22:30, weekend: 11 to 22:30", "3.0", "3.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA0MzBfMTUg%2FMDAxNTI1MDY5MzQ4NDIx.td1se7gw06ya3s8Lb4YNkI6BrSw2rdc_lljSWOTAC5Yg.-us3uX5oAbipqOU4GwZPeQ5aWfEEN9A4zSIPYwz3qbsg.JPEG.skql7373%2F20180427_182825.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210722_138%2F162695457451778haS_JPEG%2Fupload_a81368d64ebdf1a6c6450dc5a9f9f89c.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTEyMTBfNyAg%2FMDAxNTc1OTg4NjkxMzUy.k3CVtEz-n-GzlzlJeE6jo5ShKqrabU4X41Wgom-IqCwg.8EvoesZ-Jw1WRPKK3sFBVkLHjQIEW8TJGKq71BAVcoUg.JPEG.kr_tina%2F%25BC%25BA%25BD%25C5%25BF%25A9%25B4%25EB_%25BD%25BA%25BD%25C3%25B9%25CC_%25285%2529.jpg", "초밥, 롤"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/76195/abraxasblog__425533__p1223375.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","옛골", "서울 성북구 동소문로22길 60 1층 옛골", "?", "2.0", "2.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA2MDlfMjYg%2FMDAxNTYwMDA3OTk2NzAy.kywfXSg1xUji0WZgX48aLYUK74kvY-x6etVyP_JYwuIg.ULnHjETbjOX5QeiPoXXM1x_kpvdzXvlAAYgzCDLJ6psg.JPEG.kimbhora%2FIMG_1890.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAzMjJfMjI2%2FMDAxNTg0ODEzMTIxODAw.XwTm7dy6oDX62tE_2XCtDO9KPvqyc5KOO0dusYUBvGog.f3xFfCpMS-7Zi1t6Sk7hfvwhJfBlC2PxUcNTHdF4Wb0g.JPEG.dean0723%2Foutput_3311166560.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTExMDhfMzUg%2FMDAxNTczMTg0OTc3MjE4.s0EGNjv8UTNF0k5WQNCpq7lZVo0mYfvHf1Wlj2tfT-0g.teoj6re3D9J0gJEUZud5yYvWXyBLoyInaaIdyuBtuowg.JPEG.jeremy0082%2F1573184975521.jpg", "육류, 고기요리"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/365877/1601611_1580881025165_20835?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","방이 샤브샤브", "서울 성북구 동소문로20가길 56 명기빌딩", "week days: 10 to 22, weekend: 10 to 22", "1.0", "1.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA0MTFfMjc0%2FMDAxNTIzNDQ0ODgzMjcz.KRuKdsFxu2NOVXsS5mRs3dDMzYvEDpAdKz0WNsBJJWEg.YH6eLiKFpUZEWsgQ_TRgbg5xmyBF8_CmNwL0wO_YaNYg.JPEG.jungjinyee%2F20180306_205237.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxNzA4MDVfMjk3%2FMDAxNTAxODYwMDQ1Mzg5.G3LK6InjwEHXNNT-cicY2VjERax5H_nJpy6RD9Xv7xQg.qPE7SkewjquHCaHqjpI9S3CDmzbSg73ML0BUzip7VcYg.JPEG.llflyingll%2FDSC_6355.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210506_116%2F1620274661864vDyTg_JPEG%2Fupload_3e19a1cab7c5e8d6cec27e870790059d.jpg", "샤브샤브"))

        binding.recyclerView.adapter=adapter

    }

}
