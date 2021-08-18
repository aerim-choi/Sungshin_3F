package com.example.foodcate

// outFood3 데이터 파일


data class outFood3Review (
    val objectId:String,
    val name:String , // 후기 작성한 사용자의 닉네임
    val rating:Long , // 후기 작성한 사용자가 매긴 별점
    val contents:String // 후기 작성한 사용자가 작성한 후기글
) {

}