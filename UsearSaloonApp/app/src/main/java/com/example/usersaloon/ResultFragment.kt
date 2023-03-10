package com.example.usersaloon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.fragment_result, container, false)
        val rvResult = rootView.findViewById<RecyclerView>(R.id.rvResult)
        rvResult.layoutManager = LinearLayoutManager(context)
        val styleList = arguments?.getParcelableArrayList<StyleItem>("styleList")!!
        rvResult.adapter = ResultAdapter(styleList.toMutableList())
        rvResult.adapter?.notifyItemRangeInserted(0,styleList.size)
        return rootView
    }
}