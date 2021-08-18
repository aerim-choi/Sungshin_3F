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

class outfood2_hye_hyodo : Fragment() {

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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/616583_1497519629783529.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","아시안테이블", "서울 종로구 성균관로3길 11 아시안테이블", "weekdays: 11:30-22, weekend: 11:30-22", "5.0", "5.0","https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA4MDNfMTU2%2FMDAxNjI3OTg2MDg3NjM5.prA-KQWJjWI5uLI0Gmnp-zaBVxOV96I_MpNXSZKNiSMg.mZMrO91omtA62QsUfKV07kVCUDXbVWpyxXc4LO5h0uIg.JPEG.vbmoney%2F20210730_184448.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210612_175%2F1623507803742lNvWS_JPEG%2Fupload_cad522da27951909efb36279969b9b7e.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210612_161%2F1623507804191vWMFl_JPEG%2Fupload_66ddd98ad5db0f19a316a3c553c74c09.jpeg", "아시아음식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/780556_1510893318777321.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
            "도토리편백집", "서울 종로구 창경궁로34길 26", "weekdays: 11:30-23:30, weekend: 11:30-23:30", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA1MDlfMTQz%2FMDAxNTU3MzMwMDExODU1.FqhVCh79GKs3753KsbTqwVtDRf8E-P5k4VgFeiX3fxog.MDKr6dgknPmLpQRDquihHw1L7D3cccrLCGcrT_TPdUAg.JPEG.sktldrk%2FDSC02126.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA1MTNfNTQg%2FMDAxNTI2MjE1MzUyMTQ4.9ZgA3XLl-gvEv0aXqgwf8vsT0TFrwpjKqOCXgmiPGG4g.S9xBgrViSo-iQvK-dtuRqDpwX-F-1MzvkHl6XL-fky0g.JPEG.jy11188%2FIMG_4470.JPG",
            "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA2MjdfMTUz%2FMDAxNTYxNjA3OTg1NDU3.wpYDk6rqa4Q7jTzVsHX342Clm79XNzSHwH_E1YmNBlAg.EaY_tQjLQRxOasDHMwOibm1AxB1VYcw8TmjqAf0guUcg.JPEG.jb_open_book%2FIMG_1916.jpg", "돼지고기구이"))
        adapter.items.add(outfood2_profile( "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/636184_1479201066665951.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80","호호식당 대학로", "서울 종로구 대학로9길 35", "weekdays: 11-22, weekend: 11-22", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODExMjZfMTI4%2FMDAxNTQzMjEzMjQ3MDM0.nS1YqZGZKpIlmVgyfyEUQWQv1bbiJzLx4CaAZf4lv14g.XoUTC13ZnDMwdq2h_cIaN5aGMkn1fkZkwT6AMAKrwsYg.JPEG.hyunah5994%2F1543212678337.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20210808_147%2F1628414633773Sn48F_JPEG%2Fimage.jpg" , "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210801_291%2F1627790240406LM0lf_JPEG%2Fupload_5d774e2bc69452560537536eb66389ed.jpg" , "일식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/357621/1993656_1624532868328_2471?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","쪼리375", "서울 종로구 대학로11길 16", "weekdays: 11-21:50, weekend: 11-21:50", "5.0", "5.0" , "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210613_52%2F1623589708578f59nR_JPEG%2Fupload_88a8fa7049dccae0f4fe146189be380e.jpg" , "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA4MjVfMjkz%2FMDAxNTY2NzI4Mzc1Mzc1.ie3743plU-pHwHzrk_1hU5IXe8LaXrMFUYvXjoi4pWsg.NFW2Lz2_rdoDc44D3K2nwAxttJ3Yfy6GV0mWjRMZMRkg.JPEG.joyone3%2FIMG_9681.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210523_249%2F1621777293031Opaui_JPEG%2Fupload_c1ee1ba841d7482f024f60de1a7a0df7.jpg", "닭요리"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/999105_1561794251944603.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","128pan", "서울 종로구 대학로11길 16", "weekdays: 12-22, weekend: 12-22", "5.0", "5.0" ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDEyMDlfOSAg%2FMDAxNjA3NTIzNDUwMjUx.9HcKxR6PJ5JImHCjM00uJfzwW6He-oByq4T98HffxdIg.ud1E58OvYHFDAjT1tr1Vt348-068bx8klYoZXDhW6NIg.JPEG.ahil03084%2F1.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20191217_129%2F1576588000459nCVRT_JPEG%2Fupload_cfa1c95a3c73c202223229db5522f8b7.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODAxMjVfMjMg%2FMDAxNTE2ODgyNDY3MTQw.IsHl8XEkCwsgiO_P2ZqoknCLo7cdB06yItXc7cR9pOMg.9ESv7j-OivAw-GfDRtu_ggk7iE1vOctOkVi6GfPztzMg.JPEG.jane1005kr%2FIMG_9776.jpg", "이탈리아음식" ))

        binding.recyclerView.adapter = adapter

    }
}