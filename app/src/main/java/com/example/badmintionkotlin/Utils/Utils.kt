package com.example.badmintionkotlin.Utils

import com.example.badmintionkotlin.R
import com.example.badmintionkotlin.data.PlaceData
import com.example.badmintionkotlin.data.ShopData

class Utils {
    //배드민턴 실내 체육관 관련 정보를 가지고 있는 리스트
    companion object{
        var placeList : ArrayList<PlaceData> = arrayListOf<PlaceData>(
            PlaceData(R.drawable.masuck,"수원시 배드민턴 전용경기장","070-4258-3221","수원시 장안구 정조로 1067","매월 셋째주 금요일"),
            PlaceData(R.drawable.sukji,"숙지다목적체육관","031-207-5313","수원시 팔달구 화양로 68번길 7-2","매월 첫째주 금요일"),
            PlaceData(R.drawable.wastsuwon,"서수원구운체육관","031-278-6492","수원시 권선구 구운로 14번길 42","매월 첫째주 금요일"),
            PlaceData(R.drawable.keonesen,"권선중앙체육관","031-221-2490","수원시 권선구 권선동 1269","매월 첫째주 월요일"),
            PlaceData(R.drawable.metan,"매탄다목적체육관","031-216-4517","수원시 영통구 매탄로 185","매월 셋째주 일요일"),
            PlaceData(R.drawable.younghun,"영흥체육관","031-273-0335","수원시 영통구 영통로 435","매월 첫째주 일요일, 명절연휴")
        )

        var shopList : ArrayList<ShopData> = arrayListOf(
            ShopData(R.drawable.kockoc,"콕콕 배드민턴","031-243-2512","수원시 장안구 조원동 777번지 KR 코너 1층"),
            ShopData(R.drawable.center,"중앙스포츠","031-212-4674","수원시 영통구 매탄동 131-2번지"),
            ShopData(R.drawable.kim,"김광배 스포츠","031-295-4425","수원시 권선구 구운로 14번길 37"),
            ShopData(R.drawable.jihun,"지훈배드민턴","010-3599-4346","수원시 영통구 영통동 번지 103호 1000-15"),
            ShopData(R.drawable.spmart,"스포마트 수원점","031-294-0330","수원시 권선구 금곡로197번길 18-23 해피라움블루 203호"),
            ShopData(R.drawable.metanyonex,"메탄요넥스","031-216-4009","수원시 영통구 매원로 3 1층"),
            ShopData(R.drawable.metanvitro,"메탄 비트로","031-213-1478","경기 수원시 영통구 매원로 2")


        )

    }

}