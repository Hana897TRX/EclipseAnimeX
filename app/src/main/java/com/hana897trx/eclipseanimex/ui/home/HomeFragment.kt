package com.hana897trx.eclipseanimex.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.hana897trx.eclipseanimex.databinding.FragmentHomeBinding
import com.hana897trx.eclipseanimex.ui.home.adapter.HomeAdapter
import com.hana897trx.eclipseanimex.ui.home.event.AnimeHomeTileEvent
import com.hana897trx.eclipseanimex.ui.home.viewModel.HomeVM
import com.hana897trx.lib.share.data.dataTile.DataTile
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private val vm : HomeVM by viewModels()
    private val homeAdapter: HomeAdapter = HomeAdapter()

    private var _binding: FragmentHomeBinding? = null
    private val binding get() =
        _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setViews()
        homeTileObserver()
    }

    private fun setViews() = binding.apply {
        rvContent.adapter = homeAdapter
    }

    private fun homeTileObserver() {
        vm.animeState.onEach { response ->
            when(response) {
                is AnimeHomeTileEvent.Error -> {}
                is AnimeHomeTileEvent.Loading -> {}
                is AnimeHomeTileEvent.Success -> {
                    val list = listOf((vm.animeState.value as AnimeHomeTileEvent.Success).data)
                    homeAdapter.submitList(
                        list as List<DataTile<Any>>
                    )
                }
            }
        }.launchIn(lifecycleScope)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}