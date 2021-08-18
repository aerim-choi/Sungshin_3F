package org.techtown.sungshin3f.utility

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import org.techtown.sungshin3f.domain.model.Movie

class MovieDataGenerator {
    fun generate(){
        val firestore = Firebase.firestore

        movieData.forEach{
            firestore.collection("movies").add(it)
        }
    }
}

private val movieData = listOf(
    Movie(
        isFeatured = false,
        title = "옥탑방고양이[부산]",
        op_st_dt = "2020-03-12",
        op_ed_dt = "2020-06-07",
        op_at="오픈런 없음.",
        place_nm="BNK부산은행 조은극장",
        pay_at="유료",
        posterUrl = "https://ticketimage.interpark.com/Play/image/large/19/19018396_p.gif",
        averageScore=4.7f,
        numberOfScore = 5,
        releaseYear = 2020,
        country = "부산",
        director = "김지인",
        actors = "출연진",
        genre = "로맨틱"
    ),
    Movie(
        isFeatured = false,
        title = "여자만세2[부산]",
        op_st_dt = "2020-03-19",
        op_ed_dt = "2020-03-20",
        op_at="오픈런 없음.",
        place_nm="부산문화회관",
        pay_at="유료",
        posterUrl = "https://www.sac.or.kr/upfile/uploadfile/asa/goods/goods/2020/11/38036cc75b6207e13321fd07f1502a23.jpg" ,
        averageScore=9.4f,
        numberOfScore = 10,
        releaseYear = 2020,
        country = "부산",
        director = "김땡땡",
        actors = "출연진",
        genre = "로맨틱"
    ),
    Movie(
        isFeatured = false,
        title = "우리는 친구다[부산]",
        op_st_dt = "2020-07-03",
        op_ed_dt = "2020-07-04",
        op_at="오픈런 없음.",
        place_nm="부산시민회관",
        pay_at="유료",
        posterUrl = "http://hakchon.co.kr/wp-content/uploads/2020/03/%EC%9A%B0%EB%A6%AC%EB%8A%94-%EC%B9%9C%EA%B5%AC%EB%8B%A4_%EA%B0%9C%EC%9A%94%EC%97%86%EC%9D%8C%EC%9B%B9%EC%9A%A9.jpg",
        averageScore=9.7f,
        numberOfScore = 10,
        releaseYear = 2020,
        country = "부산",
        director = "김땡땡",
        actors = "출연진",
        genre = "로맨틱"
    ),
    Movie(
        isFeatured = false,
        title = "검정고무신[부산]",
        op_st_dt = "2020-12-20",
        op_ed_dt = "2020-01-19",
        op_at="오픈런 없음.",
        place_nm="에저또소극장",
        pay_at="무료",
        posterUrl = "https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2FMjAxNjEyMjBfNzMg%2FMDAxNDgyMTY2NzQ2NTc4.sVUMl4VpnVXD6SDAGntNBRR-76lQ1_mnwhMppOO5a-Eg.BwR1JN0YNXKKyppyeAenc1w6Fiv3Z7Az1ru5mPU7ulgg.JPEG.rambo627%2FIMG_20161218_165902.jpg&type=a340",
        averageScore=4.9f,
        numberOfScore = 5,
        releaseYear = 2020,
        country = "부산",
        director = "김땡땡",
        actors = "출연진",
        genre = "로맨틱"
    ),
    Movie(
        isFeatured = false,
        title = "자명교 10대교주",
        op_st_dt = "2020-12-06",
        op_ed_dt = "2020-01-31",
        op_at="오픈런 없음.",
        place_nm="바보소극장",
        pay_at="무료",
        posterUrl = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTExMjdfMjIg%2FMDAxNTc0ODM4MzMyMDgw.gSiETPgC0v2tZfEyTDcLIuzkR_VEb2LWa2vGbAYZPRsg.S9HEFv9vSkQys1WfUeBEyN3mAN2MSQClpip7u3CXvb0g.JPEG.akfakf1112%2F%25C0%25DA%25B8%25ED%25B1%25B3_%25C6%25F7%25BD%25BA%25C5%25CD_.jpg&type=sc960_832",
        averageScore=4.5f,
        numberOfScore = 5,
        releaseYear = 2020,
        country = "부산",
        director = "김땡땡",
        actors = "출연진",
        genre = "로맨틱"
    ),
    Movie(
        isFeatured = false,
        title = "연애하기 좋은 날[부산]",
        op_st_dt = "2020-01-02",
        op_ed_dt = "2020-04-05",
        op_at="오픈런 없음.",
        place_nm="BNK부산은행 조은극장",
        pay_at="유료",
        posterUrl = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTExMjdfMjIg%2FMDAxNTc0ODM4MzMyMDgw.gSiETPgC0v2tZfEyTDcLIuzkR_VEb2LWa2vGbAYZPRsg.S9HEFv9vSkQys1WfUeBEyN3mAN2MSQClpip7u3CXvb0g.JPEG.akfakf1112%2F%25C0%25DA%25B8%25ED%25B1%25B3_%25C6%25F7%25BD%25BA%25C5%25CD_.jpg&type=sc960_832",
        averageScore=5f,
        numberOfScore = 5,
        releaseYear = 2020,
        country = "부산",
        director = "김땡땡",
        actors = "출연진",
        genre = "로맨틱"
    ),
    Movie(
        isFeatured = false,
        title = "은규",
        op_st_dt = "2019-12-06",
        op_ed_dt = "2020-03-01",
        op_at="오픈런 없음.",
        place_nm="초콜릿팩토리",
        pay_at="무료",
        posterUrl = "https://search.pstatic.net/common/?src=https%3A%2F%2Fmodo-phinf.pstatic.net%2F20191014_141%2F1571036566758v75Az_JPEG%2FmosajYB13P.jpeg&type=sc960_832" ,
        averageScore=4.3f,
        numberOfScore = 5,
        releaseYear = 2020,
        country = "부산",
        director = "김땡땡",
        actors = "출연진",
        genre = "로맨틱"
    ),
    Movie(
        isFeatured = false,
        title = "뷰티풀라이프[부산]",
        op_st_dt = "2019-10-31",
        op_ed_dt = "2020-01-01",
        op_at="오픈런 없음.",
        place_nm="BNK부산은행 조은극장",
        pay_at="무료",
        posterUrl = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MjBfNjYg%2FMDAxNjI0MTU0MzU4MzM5.-d2-ksMOFKNMxU7hb2MZXhDiJ7V1iYY2cjT-I1AweU0g.8spIdO1aO0MtIsxpQzhT60b3BTZuZJYyNzHwzNXEI8Mg.JPEG.rabbitys0107%2F20210616%25A3%25DF205136.jpg&type=sc960_832",
        averageScore=4.8f,
        numberOfScore = 5,
        releaseYear = 2020,
        country = "부산",
        director = "김땡땡",
        actors = "출연진",
        genre = "로맨틱"
    ),
    Movie(
        isFeatured = false,
        title = "NT Live, 로젠크란츠와 길덴스턴은 죽었다",
        op_st_dt = "2020-02-29",
        op_ed_dt = "2020-02-29",
        op_at="오픈런 없음.",
        place_nm="부산문화회관",
        pay_at="무료",
        posterUrl = "https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F079%2F2018%2F03%2F14%2F0003078762_001_20180314122145698.jpg&type=sc960_832",
        averageScore=5f,
        numberOfScore = 5,
        releaseYear = 2020,
        country = "부산",
        director = "김땡땡",
        actors = "출연진",
        genre = "로맨틱"
    )
)