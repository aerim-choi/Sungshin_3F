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

class outfood2_un_flex : Fragment() {


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


        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/334471/810572_1549773677935_91143?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80", "라공방", "서울 강북구 한천로139길 42 영남빌딩 103호 라공방 수유점", "weekdays: 0-24, weekend: 0-24", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA5MDNfMjgg%2FMDAxNTY3NTE2NTAyMTMy.CnuOHPdL-u6L0bTHkYTx04oIBC5ervVVXMgy9w5CXeEg.u_s1VKsKruqxt5KoYzFZiRwYdgX08fbFjGPmqJlHA2Qg.JPEG.mystic_rose91%2FIMG_2652.JPG"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA5MDJfMjA3%2FMDAxNTY3Mzg5MTYxODMw.ZnjD7guKKBi98zxs0fLh0subXvcxr1gFSf4IHHB9yQog.Ho4NJU_1wEc-QAKJR8D4dJw6SVCSQc6tExouZLKhnIgg.JPEG.90okkyung%2F20190826_190115.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210217_62%2F1613489189251Fy4u5_JPEG%2Fupload_04c8417a7dd7fd490c1544979c2661ce.jpg"
            ,"중식"))

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/237128/487724_1455628961614_14700?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80", "천회초밥", "서울 강북구 노해로 69", "weekdays: 11:30-22, weekend: 11:30-22", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2F20160611_54%2Fpearlpark11_1465636690398lT4kl_JPEG%2FattachImage_38309058.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA3MjVfNDgg%2FMDAxNTk1NjI2Nzg5MjM5.7t9VRBc1Y0V3WpnCw9XUaqR5MKqGTq5C65xNPEeZvjcg.3VsbPg4cmnXtiezd68PN-ZTyGAhpVFN30Sh_FfV7uiMg.JPEG.uytu123%2F1595626788169.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210210_17%2F1612957354651jtbFi_JPEG%2Fupload_2daffe1a2598594f02854c70b83dca5f.jpeg"
            ,"일식"))

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/202140/23274_1444258053224234329?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80", "수유342", "서울 강북구 삼양로113길 17", "weekdays: 11-19:30, weekend: 11-20:30", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA0MTFfMjIg%2FMDAxNTg2NjAxMTYyMTcx.atQNkIEhse05Ib03jRAL6ZB6fPVnuP0xCG5w5vkZsM0g.90GyuRFFMA_j02SI7trJuUV_1TjywizUcFyJIkE2O4gg.JPEG.bosul101%2F14.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA0MDRfMjcx%2FMDAxNjE3NTQ2OTMxMTQ4.3EYzdRpkZKJ9oQRpby3BOuEA8r4NWm2WyAG4Y6F218Mg.HQ_Uwr0C1MpeH4D7q-OQgqmWSSiSZ9Y02lmCep5BgB0g.JPEG.1123ksg%2FIMG_7567.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210417_126%2F1618638035714e865P_JPEG%2Fupload_6bff89ecebb4e02ae6152120efacb31f.jpg"
            ,"카페"))

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/47880/reviews/6e583e1ec188.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80", "치치", "서울 강북구 도봉로87길 6", "weekdays: 17:30-5, weekend: 17:30-5", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA2MDRfMTgg%2FMDAxNTkxMjQxODk3MTIy.Mpwsp3jT5TwLXCiXdD12NSYE7wEdOVR7dW5b4WetSEkg._e5WU3gXN0zKEJi2lC640b1ZQcC-2GsEgefY2kGuWZog.JPEG.daram2511%2FIMG_6443.JPG"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA1MjlfNDIg%2FMDAxNTkwNzYyMTk0OTY4.CDd9JZxMzj35ejRuN0OGdsSYbMXqm0aiuvuqUxejRFIg.ueflJ2GbpcNVu1ARhs6nZwllKhRrI4AIRNpu2s8uNGEg.JPEG.kgskgs1108%2FKakaoTalk_20200529_225202166_19.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA1MTRfMTQz%2FMDAxNTg5NDUyMTIzODM0.P-j-0QBNZGRqRmTqWp_E6pTFPCcMjVtuwP7-Lj-0aG8g.tsec43ys-ayCNpnfc6MhlWxB5HpGMYCOScFVpt9GVQYg.JPEG.sihun4015%2FADSC_0153_%25282%2529.jpg"
            ,"요리주점"))

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/340164/663007_1514092517401_16337?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80", "펠리즈", "서울 강북구 도봉로89길 5-15 지하 1층 지상 1층", "weekdays: 17-4, weekend: 17-4", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAxMjBfMjYw%2FMDAxNjExMDk5MTkzNjQ4.qv2rqpOE6ow2ArF8yaizwQVAp1cqKJb5UsL43EEVF0Eg.HMQNPjalzBYl5dG7DfzcpqnzFU2Mbs-7rH4Lz5-THhUg.JPEG.ye0nique%2Fimage2.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDExMDZfMTcx%2FMDAxNjA0NjQ4NjM1NTI3.omuo375egAnyazPi9pjFyit6_14JlpmooIXwY_dz4kkg.0aYKl9sFDoBTlE5OTtvm5JtdvvMl5Rku72GGHVVjJbYg.JPEG.rabbitchuuu%2FKakaoTalk_20201027_230458880_12.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20200519_65%2F15898934547255pSq3_JPEG%2Fupload_ad5dcbb00014c9c5904d4ef86e7522c3.jpeg"
            ,"바(BAR)"))


        binding.recyclerView.adapter=adapter
    }
}
