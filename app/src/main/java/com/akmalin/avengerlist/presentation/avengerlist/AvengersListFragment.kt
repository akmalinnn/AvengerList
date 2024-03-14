package com.akmalin.avengerlist.presentation.avengerlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.akmalin.avengerlist.databinding.FragmentAvengersListBinding

class AvengersListFragment : Fragment() {
    private lateinit var binding : FragmentAvengersListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAvengersListBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}