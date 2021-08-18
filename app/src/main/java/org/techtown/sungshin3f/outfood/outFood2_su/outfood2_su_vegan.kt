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

class outfood2_su_vegan : Fragment() {

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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/272878/878700_1550244039195_38746?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","샐러디", "서울 성북구 동소문로 115", "week days: 8:30 to 21, weekend: 9 to 20:30", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAzMTRfMjg0%2FMDAxNjE1NzE3ODgzNDkw.DMQJKL1thwSayh0P1KbjJmUP3t6FilXQNeEtoSzj61gg.1X7DgY_dTb7mKM6GJIto01_hZ5sv48JCVOqohC1X-6og.JPEG.splendid-market%2FIMG_0218.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210717_172%2F1626509493004oO4mn_JPEG%2Fupload_2cf52f22fccc76abfbf11d535efd0bda.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDdfMTYy%2FMDAxNjI1NjYzMzgzNjg1.3STunFxreRLm7B5g9DUO23G8TPgB-re6h-Ok8ljJbTsg.7Eo1m1vhgtYiTJX8hpYKZ2VOr7SLL2usk0zaqx23xpAg.JPEG.luv880530%2Fcobb%25A3%25ADsalad%25A3%25AD5622724%25A3%25DF640.jpg", "다이어트, 샐러드"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/1874282_1611499562463056.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","그린벨리", "서울 성북구 성북로 31 1층 그린벨리", "week days: 12 to 20, weekend: 12 to 20", "4.0", "4.0", "https://postfiles.pstatic.net/MjAyMDAzMzFfMjAx/MDAxNTg1NjEzNTkxNjY1.vZwOuPrlS6E3_E0ujdEC1G9BB0UfGLPx-wpaZAE5QJUg.WNKecOjVzIXH-rMNn_Uwk4lW-lawo-l93epc20NUjw4g.JPEG.ecolife3/20200319_161131.jpg?type=w966", "https://postfiles.pstatic.net/MjAyMTA3MDVfMTU5/MDAxNjI1NDYxOTMyMTYx.n6ylHq996F1J5a9RpVaTH5AyKUfDbZhihtfTAaNA7gEg.5XRALJfuzUB1hNTjHR_HrY27hqxaGJ4ZgerDywkVLrIg.JPEG.green_velly/IMG_7405.JPG?type=w773", "https://postfiles.pstatic.net/MjAyMTA3MDVfMTU5/MDAxNjI1NDYxOTMyMTYx.n6ylHq996F1J5a9RpVaTH5AyKUfDbZhihtfTAaNA7gEg.5XRALJfuzUB1hNTjHR_HrY27hqxaGJ4ZgerDywkVLrIg.JPEG.green_velly/IMG_7405.JPG?type=w773", "베이커리"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/405162/513273_1597229296822_10244?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","카레 경반", "서울 성북구 동소문로20다길 2 2층", "week days: 11:30 to 21, weekend: 11:30 to 21", "3.0", "3.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAxMTdfMjc2%2FMDAxNjEwODgzMzk2OTI2.T9XXaDAOvNUe9MjWawzCg1dgGD2DRNFmqyZmEmwqbRAg.RBcfa7MgmoIJvOUZc7WY5sp7quQBzMGGM15kdHECfA8g.JPEG.yschonsa%2Foutput_3818973786.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210303_146%2F16147548755721U1OE_JPEG%2Fupload_9a350e85a3ba0d3a5336d5f2b8e2ed66.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210421_199%2F1619015792721jTIxh_JPEG%2Fupload_3811fa7cb618e129b2ba21d0cb70bf30.jpeg", "카레" ))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/463709_1511568404381218.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","굿데이서울", "서울 성북구 동소문로2길 17", "friday: 13-20, sunday: 13 to 19:30", "2.0", "2.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA2MThfMjY1%2FMDAxNTI5Mjg1ODQ2ODU5.tO47d0A0vVtwXwWpXfs008kVG0N8quLezJGiJBmxqd8g.N5E6S-a-28by0xjT72_MRT1dRAkx31ChJsQU97MUQzMg.JPEG.hyope%2F20180617_135144.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20201030_156%2F1604054310538v2iPG_JPEG%2Fupload_f0eeb3fd6c839978f4ff53aed83d14f5.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20200731_183%2F1596186134431w8CmU_JPEG%2Fupload_ef7eca7873c8e4d0454d9cee7a106365.jpeg", "카페, 디저트"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/16660/167390_143416179848913811?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","샌드위치 하우스", "서울 성북구 보문로34가길 2", "week days: 10 to 20:30, weekend: 10 to 20:30", "1.0", "1.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDNfMzEg%2FMDAxNjI1MzExODg5MzQy.Kpkt_RYIbkvztsmvezv6UPAyAz2or_wsJkCiK31kw8Ig.WpRlSP-5V9RR04jRij9MN_-lNKLvIYe6ucRj1wBdxlkg.JPEG.minoak92%2Foutput_2430321182.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20210325_204%2F16166373867533VDuA_JPEG%2Fimage.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20201012_54%2F1602490600817CAcS5_JPEG%2Fimage.jpg", "샌드위치"))
        binding.recyclerView.adapter=adapter

    }

}
