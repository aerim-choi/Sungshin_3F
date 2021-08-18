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

class outfood2_su_flex : Fragment() {

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


        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/1213308_1581218090913051.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","라라면가", "성북구 동선동 동소문로22길 57-25", "week days: 11 to 21, weekend: 11:30 to 21", "4.0", "4.0"
                                        ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAzMjFfOTQg%2FMDAxNjE2MzM2NDk2NDI0.b4WBik3snMqod0vJXYsDxssBCMlszSaofK8i9pVLtYAg._abJreU2jHVZI6GtFyIYAzN6e4FO7lYZZW4EtQnPbIwg.JPEG.choiyuri103%2F20210320_172126.jpg"
                                        ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTExMThfODEg%2FMDAxNTc0MDYzNDAwMzY3.lSZgwXUlXAR2leJYaiOOam3c8ScdFBLia-Kn7dn5wEAg.nJSG1wt3ZX9wsUKwHjYfcqCq2xdyRTNkCeYbsZQyY7wg.JPEG.wodnclsdofj%2FIMG_2795.JPG"
                                        ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210717_237%2F1626526329965uwCdp_JPEG%2Fupload_2eaabbd30438ce156c96d4008f0d50c3.jpg"
                                        ,"중식"))

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/422153/1993656_1624537438085_532?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","스위즐", "서울 성북구 동소문로20길 37-13 2층", "week days: 17 to 3, weekend: 17 to 5", "5.0", "5.0"
                                        ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA4MjVfMTUy%2FMDAxNTY2NzQ1MDU2MDU0.C7aaG1-OV2btxOgFaZSBbFvnhw7KXQ5Xo8M0-X15OTog.cW_1vZ6eUPWF26n73egoxJxBrEJjH6n1kVqzf5dZEyUg.JPEG.cielo_tw%2F20190814_184451.jpg"
                                        ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA4MDdfMTI3%2FMDAxNTk2ODA2ODc4MDMx.cljRBWyWZgP9eM16_eLxezFbwUnUqAlncHor-qXZemQg.5X8SX9jGkukInEXv5bPBArSuq6WLOokNb4hPZl1brKkg.PNG.tpfus44%2F%25BC%25BA%25BD%25C5%25BF%25A9%25B4%25EB%25C4%25AC%25C5%25D7%25C0%25CF%25B9%25AB%25C1%25A6%25C7%25D1%25BD%25BA%25C0%25A7%25C1%25F1%25B0%25A1%25B0%25DD14.png"
                                        ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210509_133%2F16205504423735O6tC_JPEG%2Fupload_2da028eac7333048dc364a14971b1b45.jpg"
                                        ,"바(BAR)"))

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/404403/26737_1571958281115_30107?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","리틀하우스", "서울 성북구 동소문로24길 45", "week days: 11 to 21, weekend: 11 to 21", "4.0", "4.0"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MjhfODgg%2FMDAxNjI3NDU3NTY4NTY5.2hopcluMG6n9xtHHHO-H-VXYu_Y7CzrjN8JkzhzlUK0g.F47pBT5qQLjVeYX1giwrnkpXZP2CizJ14qwoYbjXzYsg.JPEG.dayoun08%2F20210727%25A3%25DF192233.jpg"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MjhfMjE1%2FMDAxNjI3NDU3NTY5MjYw.v7HQu7ru2mBQloyKFzJsSv865ILNP99h9S2rspekJW8g.ZeKdcRaXlFUndGL2jCqcibvB0KW1qmPo_zB3OG8l9Lsg.JPEG.dayoun08%2F20210727%25A3%25DF192250.jpg"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAyMjdfMTAz%2FMDAxNjE0NDMyMTM3MjE4.fTx9MknyM8tHkx8OK-T4l-JbjU17P90Y8I10BQ_NkJAg.9-m98sQW9VBLOvUaFlJHjnwb6TAfqAPiw2P6xshtLigg.JPEG.expenditure%2FIMG_9975.JPG"
                                            ,"한식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/1322515_1554916565075974.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","돈덩어리", "서울 성북구 동소문로 53", "week days: 1 to 23, weekend: 1 to 23", "3.0", "3.0"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAzMDRfMjY0%2FMDAxNjE0ODM1NzQ4NTgy.gW4gWBCrURXYB7a1X-iCgr15n4HF-LKMHBwXAcvmnhMg.MRoi4FRReVCtxjajOcODeflmILN44RG0iu5ZJPW5zpIg.JPEG.jungks89%2F1614835699711%25A3%25AD5.jpg"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAyMjdfMjA1%2FMDAxNjE0NDMyMDc5MjI3.e7guRIMCvNy4F-fM3OC9G3ph5lkaDme1PNCIZwtmG80g.ielve9JC5q2_wJyHVxKUGTgS9vE_x8VAO0uh2SpojJ0g.JPEG.expenditure%2FIMG_9913.JPG"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAyMjdfMTAz%2FMDAxNjE0NDMyMTM3MjE4.fTx9MknyM8tHkx8OK-T4l-JbjU17P90Y8I10BQ_NkJAg.9-m98sQW9VBLOvUaFlJHjnwb6TAfqAPiw2P6xshtLigg.JPEG.expenditure%2FIMG_9975.JPG"
                                            ,"한식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/518765_1615293679281201.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","예술미각", "서울 성북구 삼선교로24길 38", "week days: 12 to 22, weekend: 12 to 22", "2.0", "2.0"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDEwMjZfMjY5%2FMDAxNjAzNzAxMDgzNjkw.IpO0wcajiwJSZGP25zjSTR22BAf5wqsaUBu5VzdPIsgg.GS-lIndIHWiwy3rSRNE8Qk0H_sbUrL9aKLgvinbVn8cg.JPEG.jjj_triplelife%2FJJ051110.JPG"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA5MjBfNjcg%2FMDAxNjAwNTk2NjMwMzg0.9jmP-EAqxT6YnGUbobxAvk1yYjskGTFL29DLWGWG13Eg.mzkmvaTPM3tOe174ZuVrOpD_03Muf0u_pYRs4F5e7_Ug.JPEG.papillon-bleu%2FIMG_3354.jpg"
                                            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210729_166%2F16275600450826ohse_JPEG%2Fupload_e91e23471452108e08f4746b3dba3cb1.jpg"
                                            ,"양식"))

        binding.recyclerView.adapter=adapter

    }

}
