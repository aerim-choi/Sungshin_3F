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

class outfood2_un_hon : Fragment() {

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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/341098_1449681460982.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","봉쭈", "서울 강북구 솔매로 97-1 봉쭈 미아점", "weekdays: 10-22, weekend: 10-22", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA4MDNfMjMy%2FMDAxNTk2NDU2NzE1MTM1.0LvQcq59bgG-T_qsTfcb4ZjkPSC4Emtv0oLqI9OopVkg.q3pPsL_KD3t_fitWL3olYILoUbr9UfCT7YGOwahgjLcg.JPEG.mho2020%2F1596364367782.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA4MjBfMTIw%2FMDAxNTk3OTI4ODg3OTQw.pDRukYgsO9VbCYHrtiXKK6K_XeXPVBVBeiFZMlODFEkg.xlLEsAQ6J4YAf7tPM8MC3JN3_MrzWfg8kZCvYxh-OPkg.JPEG.g1230love%2F08200034.JPG"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA4MDJfMTU3%2FMDAxNTk2MzY0MzgzODgw.rdx7SbuhF6x2oW3KrFH0Lt1oAIRa2g0s8LmnYVftl98g.CKdlAOG-nJ0oZinjgz67CvuA6xzI0nFrs4gB2KdeHEgg.JPEG.mho2020%2F1596364382166.jpg"
            ,"한식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/sources/web/restaurants/284356/1062290_1547432896633?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","신일김밥", "서울 강북구 도봉로72길 17-4", "weekdays: 10-22, weekend: 10-22", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210624_118%2F1624506411463VzAwa_JPEG%2Fupload_affb5f83113b7d4d78843c180c649132.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210624_265%2F1624506424608O4Vhp_JPEG%2Fupload_f62ddfb9afb8036d65183eee0436d607.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA2MTZfMjU4%2FMDAxNTYwNjg4MTgyNTY2.lhOzgrOY1pbd9XVYsriSoCvlXGqR19MdXRtmOxyqKgEg.yaDDUVulvaCJ_-UodBj7FXOA3Kf1i9EeNCqZ3Gi58S0g.JPEG.hhjj8673%2F2019-06-16-17-42-09.jpg"
            ,"김밥,분식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/49397/reviews/6e546dcd9e2c.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","골목냉면", "서울 강북구 솔매로45길 92", "weekdays: 11-21, weekend: 11-21", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2F20140514_82%2Fbosom86_1400052312759STSLF_JPEG%2FIMG_3053.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA1MDdfODYg%2FMDAxNTg4ODYyMjA1OTA5.FYyYr_MbPi2Yp8pFlntuTzQZUlLyjAT1PRy0_0HYxYkg.egLKhp1LC1siZV97KNQ1tisAjTW50T9vFveQ2b7kPBwg.JPEG.rkd94124%2FIMG_9134.JPG"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA2MTZfMjU4%2FMDAxNTYwNjg4MTgyNTY2.lhOzgrOY1pbd9XVYsriSoCvlXGqR19MdXRtmOxyqKgEg.yaDDUVulvaCJ_-UodBj7FXOA3Kf1i9EeNCqZ3Gi58S0g.JPEG.hhjj8673%2F2019-06-16-17-42-09.jpg"
            ,"냉면"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/(null)_1440406311445?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","카페인", "서울 강북구 4.19로 88-1 카페인 카페", "weekdays: 11-23, weekend: 10-24", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxNzExMDZfMjE0%2FMDAxNTA5OTU2NzQ3ODI5.-yWNXNjnFW9NDfDCw_6uujtWtVGNZUIJAvSA4Jf78XYg.Ji8ajVH3Mu8UBCEUHMzn4HW_JtXxHZ8XjSMt2EvHpr4g.JPEG.keun84%2FDSC066831.JPG"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2F20140707_32%2Fcotton_h_1404740422806udT7f_JPEG%2F20140707_190739.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20190525_188%2F1558770389825wYgry_JPEG%2F94af7119-25dc-4a78-8499-18e87cadea19.jpeg"
            , "카페"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/211136/879264_1509085140181_19069?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","본도시락", "서울 강북구 한천로 1023", "weekdays: 10-20, weekend: 10-14", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxNzEwMjRfMjEx%2FMDAxNTA4ODQwOTM3Mzg2.18IvgxcKVTKEzLK2_6FCrTd_dwRq8T7U0lAaCQDVDKMg.2cNxQjJngPOys0qQSSQwPwKGCbv8ITPvrD0N2qDqH6wg.JPEG.ara7367%2FLRG_DSC08710.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2F20140707_32%2Fcotton_h_1404740422806udT7f_JPEG%2F20140707_190739.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxNzEwMjNfMTEw%2FMDAxNTA4NzY1MDQwMTkx.Lod3nFBmVXpWJSY2oog9k78F2A91oSZhU8wQXwqFm-kg.Dn6LZiMKpa7ocDLai4h16b3HnArxpUFh6rF-G5MkTY8g.JPEG.pangdoo%2FIMG_4836.JPG"
            ,"도시락"))
    binding.recyclerView.adapter=adapter

    }
}
