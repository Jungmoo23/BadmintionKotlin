package com.example.badmintionkotlin.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.badmintionkotlin.MainActivity
import com.example.badmintionkotlin.Utils.Utils
import com.example.badmintionkotlin.data.PlaceData
import com.example.badmintionkotlin.data.ShopData
import com.example.badmintionkotlin.databinding.PlaceItemBinding
import com.example.badmintionkotlin.databinding.ShopItemBinding

class ShopRecyclerAdapter : RecyclerView.Adapter<ShopRecyclerAdapter.Holder>()  {

    private val TAG = "JM ShopRecyclerAdapter.kt"

    private var list : ArrayList<ShopData>?= Utils.shopList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ShopItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        Log.d(TAG, "onCreateViewHolder")

        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Log.d(TAG, "onBindViewHolder ")
        holder.putData(list!!.get(position))

    }

    override fun getItemCount(): Int {
        Log.d(TAG, "getItemCount ")

        return list!!.size
    }

    inner class Holder(val binding: ShopItemBinding) : RecyclerView.ViewHolder(binding.root){
        init {
            Log.d(TAG, "Holder init")

        }
         fun putData( put: ShopData){
            binding!!.placeimg.setBackgroundResource(put.shopimg)
            binding!!.placeCenter.text = "장소: ${put.shopName}"
            binding!!.palceAdress.text = "주소: ${put.shopAdress}"
            binding!!.palceTel.text    = "번호: ${put.shopTel}"
        }



    }
}