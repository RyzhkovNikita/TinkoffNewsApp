package com.aura.project.tinkoffnewsapp.all_news

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aura.project.tinkoffnewsapp.R

class AllNewsFragment : Fragment() {

    companion object {
        fun newInstance() = AllNewsFragment()
    }

    private lateinit var viewModel: AllNewsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.all_news_fragment, container, false)


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AllNewsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
