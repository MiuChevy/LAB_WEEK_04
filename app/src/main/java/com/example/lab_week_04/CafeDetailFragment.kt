package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val TAB_CONTENT = "TAB_CONTENT"
private const val ARG_TITLE = "ARG_TITLE"
private const val ARG_DESC = "ARG_DESC"

class CafeDetailFragment : Fragment() {
    private var title: String? = null
    private var desc: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = getString(it.getInt(ARG_TITLE))
            desc = getString(it.getInt(ARG_DESC))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.cafe_title)?.text = title
        view.findViewById<TextView>(R.id.cafe_desc)?.text = desc
    }

    companion object {
        fun newInstance(titleRes: Int, descRes: Int) =
            CafeDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_TITLE, titleRes)
                    putInt(ARG_DESC, descRes)
                }
            }
    }
}