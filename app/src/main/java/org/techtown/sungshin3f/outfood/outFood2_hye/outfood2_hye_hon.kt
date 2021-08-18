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


class outfood2_hye_hon : Fragment() {

    private var mBinding: Outfood2RecyclerviewBinding? = null
    private val binding get() = mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        mBinding=Outfood2RecyclerviewBinding.inflate(inflater,container,false)
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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/39287_1437047745396.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","삼숙이라면", "서울 종로구 종로11길 30", "weekdays: 9-21, weekend: 9-21", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210521_67%2F1621530131241tSPuI_JPEG%2Fupload_db4ed7916db4525edac620a6ea192b4b.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210521_126%2F1621530123325F3k6g_JPEG%2Fupload_5b4a7bac2894627acd4e4e74b09f5c3c.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210521_284%2F162153012346652QQa_JPEG%2Fupload_bc764d97ad0885046db85f7b2c963bbb.jpg"
            ,"일식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/471840_1575009495717242.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","신주쿠카레", "서울 종로구 삼일대로 390 1층", "weekdays: 10:30-22, weekend: 10:30-22", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210811_191%2F1628686423301e9u7u_JPEG%2Fupload_d773d91d08b676fb519724663bc5ce3a.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20201018_121%2F1603006025527DPK8T_JPEG%2Fupload_9f2e94d6166d4c369a166a10f7dfd211.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA2MDdfMjc1%2FMDAxNTI4MzQzOTI5NTAw.RKpEglDjPwm6CwdwO_MXHVPxPmSL5qrqgI62wFtbysMg.6ThwyGDgEhZNQQ9QyTjjG24ityJftowd9U3tF-f2BmQg.JPEG.d_hye97%2FDSC02800.JPG"
            ,"일식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/345963/965277_1620343851926_35619?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","타스카페", "서울 종로구 동숭길 117", "weekdays: 12-22, weekend: 12-22", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTAxMjFfMjgw%2FMDAxNTQ4MDAzOTgwMjYw.3sYVHcgCeytyz1Jla1zngTBimRzSAFRjqYtaiOgRhQEg.NqvQYeKKmQOy1nczy_aJAalgsUjc1yWZdFMyAbxvPxYg.JPEG.jaeeun9809%2FIMG_5994.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20201018_121%2F1603006025527DPK8T_JPEG%2Fupload_9f2e94d6166d4c369a166a10f7dfd211.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA2MDdfMjc1%2FMDAxNTI4MzQzOTI5NTAw.RKpEglDjPwm6CwdwO_MXHVPxPmSL5qrqgI62wFtbysMg.6ThwyGDgEhZNQQ9QyTjjG24ityJftowd9U3tF-f2BmQg.JPEG.d_hye97%2FDSC02800.JPG"
            ,"카페"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/1899154_1615004065716488.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","신장군마라탕", "서울 종로구 성균관로 26", "weekdays: 11-22, weekend: 11-22", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20191210_70%2F1575971491035ODKGU_JPEG%2F-NMaObzt8nW-6WcST5OxIqMA.jpeg.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA2MTJfMTAw%2FMDAxNTkxOTM3ODE2NzQ5.V5mx5yfi9cF10Lo8IQkrJQkWIE863e0vlb1RnJamT3Yg.sGEapBXoj0dgTsuXScTkYztmlsnGlTQHCLGadulQ7E0g.JPEG.2020biospace%2FIMG_6434.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210712_235%2F1626039052100vGx2b_JPEG%2Fupload_08e89caaaf01b9efa6d952b9fad8fe3a.jpeg"
            ,"중식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/1156665_1614706627616641.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","칸다소바", "서울 종로구 대학로 131-1", "weekdays: 11:30-21:30, weekend: 11:30-21:30", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAzMDZfMTA1%2FMDAxNjE1MDI3ODYxMjY1.DCa3IMT3u7fBKRDONY0X1fkJk2yhZvFmSJfkPQJAgyog.MLsqIs-IAgDIlPe1qCD1gm4asDTtZgoEjdsjcpdm1lgg.JPEG.dong2miya%2FIMG_0762.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210814_221%2F1628921214646WiLWB_JPEG%2Fupload_dbba0b63b0274fe18c057842ec364b24.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTEwMzFfMjg2%2FMDAxNTcyNDg2MTQyNTg2.ILrHf7-WwHkt47x5SUeXbAjINjRunXnjD6renWwoyekg.bHmCF9oUZS9uS-wKCZn9NS5fRvXK1OVEdGY8B40BqRUg.JPEG.jine21221%2F%25C4%25AD%25B4%25D9%25BC%25D2%25B9%25D9_%25BC%25B3%25B8%25ED_%25BB%25F3%25BC%25BC.jpg"
            ,"일식"))
binding.recyclerView.adapter = adapter


    }
}