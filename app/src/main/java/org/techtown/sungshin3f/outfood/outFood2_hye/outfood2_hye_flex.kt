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

class outfood2_hye_flex : Fragment() {

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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/2004386_1628039390255048.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80", "홉슈", "서울 중구 다산로42길 12", "weekdays: 9-21, weekend: 12-21", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA0MTlfMzQg%2FMDAxNjE4ODA5NjExMTI3.P9jkWiASyif9Tj0PHpu60RFqrukPHDlDOWaDLAyfKpgg.yauoDvQSd-PK0_fN6Gbo0Ipl2HaDyk3tXba7x-EsHswg.JPEG.changahpark%2FIMG_2952_Original.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20200706_5%2F1594002999794BunCu_JPEG%2Fupload_c10d1a2471d997e508ffc8b6ac5a9841.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210807_186%2F16283425011186M5aV_JPEG%2Fupload_a81f4da54050b71a97eb8dbe3c40796a.jpeg"
            ,"카페,디저트"
        ))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/684068_1491887775836152.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80", "하쿠나마타타", "서울 성동구 마조로3가길 3 1층", "weekdays: 10:30-21, weekend: 10:30-21", "5.0", "5.0"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190919_272%2F15688946128138xbVm_JPEG%2F7.jpg"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA1MjdfMzgg%2FMDAxNTU4OTQ2NTkxOTM1.mMNt7nvXG64UGJ4rbBCx609IzslvXDOB-s3mLnA_Kp8g.UQrGAbXAxIfYa-bMfwAS-JVwCjmc0wbLTBsn8jnKjuwg.PNG.kos2211%2Fimage.png"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA1MTRfMTU0%2FMDAxNjIwOTczODU0OTcx.-2E_FhsGvaVERnurw8Jt3aJZAiD-l5MKFe-sqI1Zw2Yg.HgZrz6H8-Q9xUvuircf1SuR5nhMTP15WdyGpUoQUR0Eg.JPEG.toqha215%2FIMG_8273.jpg"
                ,"일식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/361694/570405_1575047648307_16792?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80", "달빛자전거", "서울 성북구 보문로32길 49", "weekdays: 11-22, weekend: 11-22", "5.0", "5.0"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210703_59%2F1625313363170B4wYF_JPEG%2Fupload_0360613cc05a3c49d46aa4e17ccf8ed2.jpg"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210703_59%2F1625313363170B4wYF_JPEG%2Fupload_0360613cc05a3c49d46aa4e17ccf8ed2.jpg"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210703_59%2F1625313363170B4wYF_JPEG%2Fupload_0360613cc05a3c49d46aa4e17ccf8ed2.jpg"
                ,"요리주점"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/40805/897636_1616654241482_41284?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80", "고물상", "서울 종로구 대학로11길 38-6", "weekdays: 16-1, weekend: 16-1", "5.0", "5.0"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTEyMTFfNjAg%2FMDAxNTc2MDM5NDA1MDUz.zzrbfOFhGqBRZ2Mx7JDh0m42ppRzbKDNYLMqzFDXF0og.ijfEnIbLI7Qp73s87-03BNT7pJ-ePyZiXG7fTZ-cJmYg.JPEG.qkrrkgp1122%2FIMG_0676.jpg"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210307_118%2F16151009697619tceV_JPEG%2Fupload_78ed43f06d4930ffb346c4abc09c2830.jpeg\")\n"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210202_286%2F1612268184919wwVVa_JPEG%2Fupload_d7cb9d562d1c6350d658d83de4424e86.jpeg\")\n"
                ,"카페"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/729747_1550330485319368.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80", "산쪼메라면", "서울 중구 서애로1길 26", "weekdays: 10:30-21:30, weekend: 11-21", "5.0", "5.0"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200403_215%2F1585910320843faqdp_JPEG%2FNUMsBFkngwcj1Ctng1r4gUta.jpeg.jpg"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210407_137%2F16177692816444Fjnq_JPEG%2Fupload_1ccc17805170184128f148c17de66f4d.jpeg"
                ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxNzEwMThfMTc4%2FMDAxNTA4MzE5MTMzNzYz.uAr0YJ_9BdYJlmK6JG0yFyjftL9y4sOX0PRynCj1otAg.R6hUthWCQt7ftvWdWGK6u2WVGLVA7FWgnHC9QklzZ4Eg.JPEG.songcoolsu%2FIMG_7213.jpg"
                ,"일식"))


        binding.recyclerView.adapter = adapter


    }
}