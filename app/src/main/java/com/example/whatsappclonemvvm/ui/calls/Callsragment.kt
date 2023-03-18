package com.example.whatsappclonemvvm.ui.calls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsappclonemvvm.R
import com.example.whatsappclonemvvm.databinding.FragmentCallsBinding
class Callsragment : Fragment() {

    private var _binding : FragmentCallsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false)
    }

}