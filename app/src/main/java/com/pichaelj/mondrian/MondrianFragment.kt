package com.pichaelj.mondrian

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.pichaelj.mondrian.databinding.MondrianFragBinding

class MondrianFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, sIS: Bundle?): View? {

        val binding: MondrianFragBinding = DataBindingUtil.inflate(inflater, R.layout.mondrian_frag, container, false)

        return binding.root
    }
}