package com.malkinfo.fragmenttofragmentpassdata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.view.*
class FirstFragment : Fragment() {
    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_first, container, false) as ViewGroup
        communicator = activity as Communicator
        rootView.btnSend.setOnClickListener {
            communicator.passData(rootView.editText.text.toString())
        }
        return rootView
    }
}