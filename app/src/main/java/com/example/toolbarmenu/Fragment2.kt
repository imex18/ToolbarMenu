package com.example.toolbarmenu

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment


class Fragment2 : Fragment(R.layout.fragment_2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //setting the options menu in a Fragment
        setHasOptionsMenu(true)
    }

 // Hide menu items if needed
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.findItem(R.id.app_bar_search).isVisible = false
        super.onCreateOptionsMenu(menu, inflater)
    }

}



