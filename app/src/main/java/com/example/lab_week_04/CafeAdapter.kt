package com.example.lab_week_04


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    Pair(R.string.starbucks_title, R.string.starbucks_desc),
    Pair(R.string.janjijiwa_title, R.string.janjijiwa_desc),
    Pair(R.string.kopikenangan_title, R.string.kopikenangan_desc),
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val (titleRes, descRes) = TABS_FIXED[position]
        return CafeDetailFragment.newInstance(
            titleRes,
            descRes
        )
    }
}