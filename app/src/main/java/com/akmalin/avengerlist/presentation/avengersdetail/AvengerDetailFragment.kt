package com.akmalin.avengerlist.presentation.avengersdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.akmalin.avengerlist.databinding.FragmentAvengerDetailBinding

class AvengerDetailFragment : Fragment(){
    private lateinit var binding : FragmentAvengerDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAvengerDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}