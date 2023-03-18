package com.example.whatsappclonemvvm.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsappclonemvvm.databinding.FragmentUserSelectionBinding

class UserSelectionFragment : Fragment() {

    private var _binding : FragmentUserSelectionBinding? = null
    private val binding : FragmentUserSelectionBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentUserSelectionBinding.inflate(inflater, container, false)

        return  binding.root
    }

}