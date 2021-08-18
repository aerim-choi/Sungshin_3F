package org.techtown.sungshin3f.outfood.outFood2_hye

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import org.techtown.sungshin3f.databinding.Outfood2RecyclerviewBinding
import org.techtown.sungshin3f.outfood.FoodAdapter
import org.techtown.sungshin3f.outfood.outfood2_profile

class outfood2_hye_vegan : Fragment() {

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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/463709_1511568404381218.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","굿데이 서울", "서울 성북구 동소문로2길 17", "friday: 13-20, sunday: 13-19", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA2MThfMjY1%2FMDAxNTI5Mjg1ODQ2ODU5.tO47d0A0vVtwXwWpXfs008kVG0N8quLezJGiJBmxqd8g.N5E6S-a-28by0xjT72_MRT1dRAkx31ChJsQU97MUQzMg.JPEG.hyope%2F20180617_135144.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20201207_190%2F160731893423596exH_JPEG%2Fupload_d9d5ce915d735a278c3a42f827fcd09d.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20200816_163%2F15975662334164qTuL_JPEG%2Fupload_4c077a5cd903e7c889399fad9e9e27f5.jpeg", "카페,디저트"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/sources/web/restaurants/409190/1042666_1599554512263?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","샐러드온", "서울 종로구 성균관로5길 9", "weekdays: 10:30-20, weekend: 10:30-20", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAzMzBfMTg4%2FMDAxNTg1NTQxNzU2MzA4.2-vmxGkXt0g8iza4nEOuPZLk2wvGfLXjuyUGJPQUBpEg.jDq5BLcgRaPKxtx5YF2ZD9SXU8P0PGB8eY-4txupzp8g.JPEG.goldencavia%2FIMG_4255.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA3MTdfMjUg%2FMDAxNTYzMjk1NDQ1NDQ0.8_dZXwC_CUBzXTJu8XE4g6K6OC02E_JQJ9VMrgoRw9kg.l0nQziHxDwb9ziEGCiD2jBv-bWBLtaNTOFl2x-wzpMog.JPEG.ariteo%2F20190605_110041.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210514_293%2F1620975935784c2gBh_JPEG%2Fupload_e6bb74266e0934f6e9a075f33c7c8ea1.jpg", "다이어트,샐러드"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/540911_1471765098272721.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","그린볼", "서울 종로구 새문안로5가길 28 광화문플래티넘빌딩 B1층 114호", "weekdays: 9-16, weekend: X", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20210128_31%2F1611795039996P3dRU_JPEG%2Fimage.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20210426_184%2F1619406246703dtQtK_JPEG%2Fimage.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210318_214%2F1616065821472d7VNl_JPEG%2Fupload_d0e68be6b18cad55188a75ee2e6ddcee.jpg","다이어트,샐러드"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/27940_1466402637931447.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","맞이한", "서울 성북구 혜화로 88 1층", "weekdays: 10-21, weekend: 10-20", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTEyMTVfMTIx%2FMDAxNTc2NDIxOTM0MTEw.r2o2Xd1AL6YJSjm6cvGxULquycDtsjirzEv81SPOObAg.7WWjykwyFgPvJxil_7vntVloFbgI1bum3YyV0jhPP3Ug.JPEG.pandassi_%2F20191215_134738.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20200729_234%2F1596018578044gACC3_JPEG%2Fupload_ba812f0a452a94de30dfc4b309a572c7.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAxMTVfNDMg%2FMDAxNTc5MDg2MTg4NDcy._z-K2GKExghZAl3UdUOHCUs0j6jvppX8izggcq4d2zcg.Fc_puXaGzUnhbUdqHtNxulysEL8SwtLJhkxWuQXipvMg.JPEG.gp981130%2FIMG_8166.jpg", "카페,디저트"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/242283_1472538782372369.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","더 테라스 카페", "서울 종로구 창경궁로35길 40 지하 1층", "weekdays: 9:30-20, weekend: 9:30-20", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDZfNSAg%2FMDAxNjI1NTM2ODM5OTYw.XKpexhkqK2sFHTveGLDMpX1dBUHYw3GH86OvDHlRbuUg.HdmddMRgNpr4sj2En6NjILfWND2R1QIPLVYMFlypWoUg.JPEG.kb_equal%2F2021-07-04-00-00-50-747.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210725_182%2F1627146084344eTR95_JPEG%2Fupload_8ee89741e3e4044147a41bd3a2c2f573.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210301_194%2F16146031551484u77a_JPEG%2Fupload_a2434d6ab9a870134065c398a48d5387.jpg", "카페,디저트"))

        binding.recyclerView.adapter = adapter

    }
}