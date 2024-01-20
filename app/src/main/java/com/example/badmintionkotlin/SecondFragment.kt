package com.example.badmintionkotlin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.badmintionkotlin.Adapter.RecyclerAdapter
import com.example.badmintionkotlin.Adapter.ShopRecyclerAdapter
import com.example.badmintionkotlin.data.PlaceData
import com.example.badmintionkotlin.databinding.FragmentFirstBinding
import com.example.badmintionkotlin.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var mFragmentSecondBinding : FragmentSecondBinding? =null
    private var mShopRecyclerAdapter : ShopRecyclerAdapter? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mFragmentSecondBinding =FragmentSecondBinding.inflate(layoutInflater)
        return mFragmentSecondBinding!!.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var list :ArrayList<PlaceData> = requireActivity().intent!!.extras!!.get("DataList") as ArrayList<PlaceData>
        Log.e("FirstFragment"," Data List : ${list}")

        mShopRecyclerAdapter = ShopRecyclerAdapter()
        mFragmentSecondBinding!!.shoplistview.layoutManager = LinearLayoutManager(activity)
        mFragmentSecondBinding!!.shoplistview.adapter = mShopRecyclerAdapter
    }


}