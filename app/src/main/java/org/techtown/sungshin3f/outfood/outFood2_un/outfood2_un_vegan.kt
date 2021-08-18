package org.techtown.sungshin3f.outfood.outFood2_un

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import org.techtown.sungshin3f.databinding.Outfood2RecyclerviewBinding
import org.techtown.sungshin3f.outfood.FoodAdapter
import org.techtown.sungshin3f.outfood.outfood2_profile

//import org.techtown.pager.R

class outfood2_un_vegan : Fragment() {

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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/43645/87116_142824402207841290?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","올드델리", "서울 강북구 도봉로 355", "weekdays: 11-22, weekend: 11-22", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTEyMDFfMjAg%2FMDAxNTc1MTkzNjE4MzI2.A2Al5b5bnL7Ew9BK0r2Z1BBtfy44scXLWHsNS1zXxuAg.tieuQZ69Gl8EzDs2CzYqB9FWAtAvyWaZwoqEQHue4NUg.JPEG.dlgkdis2%2FDSC_0600.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210427_215%2F16194818590409orsN_JPEG%2Fupload_7a88d48c34f326813d01e9356a4ce368.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAxMDlfMjMw%2FMDAxNTc4NTM2NDIxOTI5.LYH-lU-uJjGypSxbgrFWLLbDdHjGYoWa73gW5HhKBKEg.mXqqLrZacHavmepl-IJagCSf0BHMuZwINnn1xwCj15Ug.JPEG.tti4242%2F20191229_124205.jpg", "인도음식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/383561/627630_1552672686129_231126?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","김밥은", "서울 강북구 한천로 1016", "weekdays: 8-20:30, weekend: 8-20:30", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDExMjZfMTA5%2FMDAxNjA2MzY0NTkwNjMz.wkGQv-gUFVI-bdbOq9xb3R1ZbxyJ1aNdGeeRAXNsVgMg.mo4WKS_DXX7XSbmtEdOwJ7UqJsO5eFJ76KaqQkU7c2cg.JPEG.rmfkd6064%2FIMG_2353.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20201119_158%2F1605786190008kEAzg_JPEG%2Fupload_b2dfa9b3db56f5005499500800aa4144.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20200910_140%2F1599714463181MkEb6_JPEG%2Fupload_478274ff6b580956cae55f56230f4e9e.jpg", "김밥"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/411704_1465630789334562.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","샐러디", "서울 강북구 도봉로 353-1 1층", "weekdays: 9-21, weekend: 10-21", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MjRfMzkg%2FMDAxNjI0NTEwOTM5MDY4.1aQVe2GzaaBYI2c2IwPR6b_C9FEphlaNr7pp-W8WnJQg.EGts_wFBHCvw1D4zCYafXOQhJC-d5WMajdtHf-58R_Eg.JPEG.teenie1107%2F%25BB%25F8%25B7%25AF%25B5%25F0_%25BC%25F6%25C0%25AF%25BF%25AA%25C1%25A1_%25281%2529.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20210802_224%2F1627878854524PNACK_JPEG%2Fimage.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210716_81%2F16264152687064xpid_JPEG%2Fupload_af7d1b9a9f1905754cf11a9f6b6a7101.jpg", "다이어트, 샐러드"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/32408_1623847487430270.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","그리너프", "서울 강북구 한천로143길 40 1층 그리너프", "weekdays: 10:40-19:30, weekend: 11-3:30", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MThfMjE1%2FMDAxNjI0MDI2NTEwMjQ2.5n8kN2VWGu0ccCA77T9CazvwI_jWfpHfkBtfvTLEd1Ug.EeqtweoW0-g1j-zgJef_4vx3xsepVx1re-2UtSP02ecg.JPEG.zz__ni%2F1624026507602.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210626_258%2F1624718092290730kp_JPEG%2Fupload_f77fcfcbd455e886cc289e50e4f6a0ab.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210626_252%2F1624718092002A1Yc6_JPEG%2Fupload_96f6c5dfab9ba18005e8ca1603ed3a68.jpeg", "다이어트, 샐러드"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/549779_1537191218245119.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","인피니티 샐러드", "서울 강북구 한천로131길 35 1층", "weekdays: 10-20, weekend: 10-20", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA0MDhfMTcg%2FMDAxNjE3ODY4MDExMzE2.vSjLbpjpD80xT7DFjMYv1ovix_D9pTmkCm_IU8VfE_Ag.FN7pNEq2J0Ya2lH12Y96yD-SQCGqIOiOJ6GTJslilmog.JPEG.hnjkil%2F30.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210324_298%2F1616553033312i34Qa_JPEG%2Fupload_5d2a5db26caf8e44263d8daae8ed3f63.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA0MjBfMjc5%2FMDAxNjE4OTAzMzMwMjMz.irp8zI3Y5_p8reBcu6hiS3FoLYRSnsjGMaY6_ZWvhBEg.gVd9ZohKa-zUOo7I-LZEsdIXFcq7nTTVLrPQlz_c_XQg.JPEG.2e5wflaiu74%2F30.jpg", "다이어트,샐러드"))

        binding.recyclerView.adapter=adapter

    }
}
