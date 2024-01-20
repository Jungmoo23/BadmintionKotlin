package com.example.badmintionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.badmintionkotlin.Utils.Utils
import com.example.badmintionkotlin.data.PlaceData
import com.example.badmintionkotlin.data.ShopData
import com.example.badmintionkotlin.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    // 전역 변수로 바인딩 객체 선언
    var mBinding : ActivityMainBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    val binding get() = mBinding!!

    val TAG = "jm MainActivity"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Fragment 매니저 호출
        var fragmentManager = supportFragmentManager

        // 첫 번째 두 번째 FragMent
        var firstFragment = FirstFragment()
        var secondFragment = SecondFragment()

        //Fragement를 바꿔 주는 부분

        var transaction = fragmentManager.beginTransaction()

        transaction.add(mBinding!!.attachframelayout.id,firstFragment).commitAllowingStateLoss()


        binding.tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                transaction = fragmentManager.beginTransaction()
                when(tab!!.position){
                    0->  {
                        transaction.replace(mBinding!!.attachframelayout.id,firstFragment).commitAllowingStateLoss()
                    }
                    1-> transaction.replace(mBinding!!.attachframelayout.id,secondFragment).commitAllowingStateLoss()

                }

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

        intent.putExtra("DataList", Utils.placeList)

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}