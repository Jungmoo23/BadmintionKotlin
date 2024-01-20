package com.example.badmintionkotlin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.badmintionkotlin.Adapter.RecyclerAdapter
import com.example.badmintionkotlin.data.PlaceData
import com.example.badmintionkotlin.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var mFlagmentBinding :FragmentFirstBinding? =null

    private var mRecyclerAdapter : RecyclerAdapter? =null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mFlagmentBinding = FragmentFirstBinding.inflate(layoutInflater)
        return mFlagmentBinding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var list :ArrayList<PlaceData> = requireActivity().intent!!.extras!!.get("DataList") as ArrayList<PlaceData>
        Log.e("FirstFragment"," Data List : ${list}")

        mRecyclerAdapter = RecyclerAdapter()
        mFlagmentBinding!!.listview.layoutManager = LinearLayoutManager(activity)
        mFlagmentBinding!!.listview.adapter = mRecyclerAdapter
    }

}