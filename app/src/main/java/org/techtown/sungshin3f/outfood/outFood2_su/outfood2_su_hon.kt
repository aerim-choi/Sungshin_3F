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

class outfood2_su_hon : Fragment() {


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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/1594592_1602165204382668.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","인도 이웃", "서울 성북구 보문로34가길 2", "", "5.0", "5.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTEwMjFfMTI5%2FMDAxNTcxNjYzOTIzODQ5.lmws0pYwJP8ZQukHn2vbCqOfTD90B1s926Q2-gYS1C4g.mI74caWtGgbLyv1oqWvt_nmB6fxglKNtn9GTvlg2C7og.JPEG.dldpsdb%2FIMG_6685.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210420_141%2F1618870762197DL2RG_JPEG%2Fupload_4850ebc798fa6dffc957e040e563215f.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDEwMTJfMjM4%2FMDAxNjAyNTAzNDM1Mjc4.Mp8Ri4FZdENtoVQcn1TTFAk790oeR8P5f9gXHTGjzTUg.lDVquhK_pEE2RtXG92m6RQbjd_SOJ5IG7VSK6Kz1gF4g.JPEG.eoalsdhqk%2FIMG_1195.JPG"
            ,"일식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/777980_1619327481907333.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","띵라면", "서울 성북구 동소문로22길 29-8", "week days: 11 to 21, weekend: 11 to 21", "4.0", "4.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA5MTlfMTMw%2FMDAxNTM3MzMwNzcxMjY4.swjn9Ucc0J5wG2mlC08LS7Bzev9KXvzjAftK-YsNcTog.uXHMe-Da2KnGGeufHfP6VpU2rgA_KwDs-Kto4fQTJWUg.JPEG.aram331%2F20180918_131634.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA0MjRfOTQg%2FMDAxNTU2MDMyMzkyNzYx.mRBw5s6OFPRA0M6cjiR5o2u2tkT2m_z66E0N12eEzLkg.HSnM5B4cu5IwdeWliHnD15eOcsE4f2qcXDBZkZASQdog.JPEG.1244819_%2F20190423_190023.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA5MDRfMjUz%2FMDAxNTM2MDY3NjkyOTc5.Cs12IwLY3rr9qpwwHlcd7sSU_f4lZgOs8wd9eOKcc3Eg.5jpwHCsRJKk9ZtOi9Pc3LFkfKuKZ5hWukGrozrw75_Mg.PNG.yjjung34%2Fimage.png"
            ,"분식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/168797_1462080516903934.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","밥풀", "서울 성북구 동소문로20다길 30-10 밥풀", "week days: 11 to 21, weekend: 11 to 20", "3.0", "3.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODA3MDNfMTEx%2FMDAxNTMwNjI0NjM2MTAw.IBVlmMS_2V7WkZTjnis0Mk5iZLgxB8FjqLSOBzQSwY4g.vDi5zudWvF7EVpQ96UqX3Ngf_gy5CWd4nyHCuZBTxdkg.JPEG.gokhj55%2F3472381279378573097_20180703220818689.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDEwMjlfNzMg%2FMDAxNjAzOTQ0MTg0NDk5.8T6gSty6_NnuQcRAcQRE049lf1kDsX1r0vRLDvpARksg.gtwdBi36wFsebNsdXEGP7WSEW4QGQ7RtHS4UmdywYUsg.JPEG.dodlee7%2F20201028_201424.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20200728_234%2F1595906543086zcYDV_JPEG%2Fimage.jpg"
            ,"퓨전식"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/47875_1623410725751291.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","그릭데이", "서울 성북구 보문로34길 66", "week days: 11 to 20, weekend: 12 to 20", "2.0", "2.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA0MjNfMjMw%2FMDAxNjE5MTU1MjU3NzY5.PuCm0xfxwA9P0YQD6xccta_tot5sLNG9pkG7dpwzB_cg.UmGmALLqRIQWejtyKH9AXeWlOqi411U1DtotBHOL8OQg.JPEG.minseo2361%2FIMG_0294.JPG"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210711_186%2F1625989655035y7E2V_JPEG%2Fupload_048e9f5f7645de9fdc1414f48a43484f.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAzMDJfMjUy%2FMDAxNjE0NjY3NTAzMzcx.Pa0lHFM38Nnq6XwTn38CdMnMDyQ0ejY-xvZ5wyfM0Kog.aOpKfd_RC0Ql2LYuXeSazg3RhIiXQP3nYZveYvcreiYg.JPEG.tjrsuqhqk%2F%25BC%25BA%25BD%25C5%25BF%25A9%25B4%25EB_%25B5%25F0%25C0%25FA%25C6%25AE_%25B1%25D7%25B8%25AF%25B5%25A5%25C0%25CC3.jpg"
            ,"카페, 디저트"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/96495/69647_142706078353617247?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","토라돈부리", "서울 성북구 동소문로22길 33-1", "week days: 11:30 to 20, weekend: 11:30 to 20", "1.0", "1.0"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA3MjNfNjQg%2FMDAxNTYzODkzNTk1MzA4.yLworep9iQLIknm6ANnbHboo_BT2SAZZVP7Px4C58cEg.19RHeTVvw-AGXZad0lGPX6QLdXswe82GJjTer3o_C34g.JPEG.miyoung6458%2Fbeauty_1563876718652.jpeg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxNzExMTNfMTk0%2FMDAxNTEwNTgxNjg1ODM2.BTuJ-aS4Oin8HOMaw6Ls5EklWVTfGm8wKy2-8lDmnBEg.hAm8CJMAZ9HwhN4s-HXWz1LP5ln5fdNhMrL62JuTtWUg.JPEG.heart_of_gold%2FIMG_0780.jpg"
            ,"https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTA1MTBfMTQ0%2FMDAxNTU3NDk0ODQzMDA2.ghUtYSBHgdHQDuJSsGzCNsc6j3psZMVGiZCjs0Rs-9Ig.Iyg0hyhxirCzVAzF795YjtX0b0L-hPlsAs0bXPU9BsMg.JPEG.shjhello77%2Ftmp.jpg"
            ,"일식"))

        binding.recyclerView.adapter=adapter

    }

}
