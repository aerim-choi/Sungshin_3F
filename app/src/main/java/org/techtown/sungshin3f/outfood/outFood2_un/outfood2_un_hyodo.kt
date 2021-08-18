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

class outfood2_un_hyodo : Fragment() {
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

        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/427599/1421461_1628424541863_41706?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","스시도리", "서울 강북구 한천로139길 29", "weekdays: 11-5, weekend: 11-5", "5.0", "5.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODExMjlfMTMg%2FMDAxNTQzNDU4OTYxMDk4.57CbaPDCm8vTDSnP8KSxXPQOwFFf0axm7kKPIj8PHEYg.v7Y0rKnNnnPJB7kz1EIzdyVaA6jNNaDlbIBJ9BwNEVUg.JPEG.judy9538%2Foutput_3392883859.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20201224_211%2F16087765562509P0fg_JPEG%2Fupload_c677dfa310f23c9124ff0863ee62be77.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20200515_146%2F1589541086124cE518_JPEG%2Fupload_1b86869b552a03cd445350c19f42a925.jpg", "초밥, 롤"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/260402_1456772136943707.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","항아리손칼국수", "서울 강북구 한천로139길 7-9", "weekdays: 10:30-21, weekend: 10:30-18", "4.0", "4.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA5MDlfMjUg%2FMDAxNTk5NjMwMjYwOTE1.fFb939RkP21pHVmxgy9BtJqlKYb1iQKCCp3tNXDY4LMg.rI_C5vXaDDEEMq6yYLoKqu_sD_74omKdhOkQU9hrs08g.JPEG.whatboy11%2FIMG_2582.JPG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210318_99%2F1616070962592hm0oz_JPEG%2Fupload_146d471630f3fb828e32d5fb21e2088d.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAyMDJfMjkx%2FMDAxNjEyMjc0NDk1NjIz.nLZNg5U1M0_6Y5PLu4QgQEdHN9_8vkc5G0BluskkOAAg.ASt5qbFw5Wr_ej_Kn1GPWVqKWK7JYabhyQigeZjEG80g.JPEG.hyde0818%2Foutput_325991276.jpg", "칼국수, 만두"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/355180/897636_1605688631062_34895?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","수유리조트카페", "서울 강북구 노해로8가길 45", "weekdays: 10-23, weekend: 9-23", "3.0", "3.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDZfNjAg%2FMDAxNjI1NTgwOTM3NzI2.ERFRWolTFmTgZkJ5cLCLuZPGQcSvqezodpBmS6nxEcEg.uFgL_9YADwHqYWvqe3tNOj4t8GFrQgNJzPHiGgf168Ug.JPEG.goodi950516%2FIMG_9762.JPEG", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210729_169%2F1627547997271gnY8R_JPEG%2Fupload_d6fe353079b3435e1f024be58e317415.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210709_30%2F1625760353373qWFuk_JPEG%2Fupload_73868c77f7c69905b1353b4b9814f45b.jpg", "카페, 디저트"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/238677/515016_1459662700662_1484?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","은행골", "서울 강북구 수유동 190-49 1층", "weekdays: 11:30-23,weekend: 11:30-23", "2.0", "2.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MzBfMjc2%2FMDAxNjI1MDU5MjU1NjYy._RYWYGdFHhwrH_jHSpW6v33HVukK4lYNZmfMhTODE2gg.49YmJXU-KvMUvZAYGRNrqYl5tAFxQCwc_fXF2OK5aJ4g.JPEG.yeezialska%2Fphoto_2021-06-10_15-21-44.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA0MDZfMjIx%2FMDAxNTg2MTM3ODU5MDU3.WiRGPZGR_9yT0-tkAzm1aPkU3oKBnXaDgSvOzAAOmUkg.tfrENV0BWHXOvVgd8tFQydCYYCuwqh-qkI1OvTmZfowg.JPEG.jeongrim1238%2FIMG_5948.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210721_214%2F1626878108705YibTW_JPEG%2Fupload_2bb85ad6f8504b2ba86e9b2a72c13d15.jpg", "초밥, 롤"))
        adapter.items.add(outfood2_profile("https://mp-seoul-image-production-s3.mangoplate.com/14370/139660_143965804313899407?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80","낙지일번지", "서울 강북구 도봉로89길 10", "weekdays: 11-23, weekend: 11-23", "1.0", "1.0", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2F20140316_78%2Fhy010102_1394972274480LaVFJ_JPEG%2F%25BB%25E7%25C1%25F8_424.jpg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210605_15%2F1622866103658Hpcy3_JPEG%2Fupload_2ef9ca726f1362706e5d45b9fbf42e81.jpeg", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20201206_33%2F1607229343979ew0fj_JPEG%2Fupload_55a64ae605ec3344cc104d15243873ad.jpg", "낙지요리"))

        binding.recyclerView.adapter=adapter

    }
}
