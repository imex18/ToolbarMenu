package com.example.toolbarmenu

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_1.*


class Fragment1 : Fragment(R.layout.fragment_1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       //setting the options menu in a Fragment
        setHasOptionsMenu(true)

        button.setOnClickListener {

            findNavController().navigate(R.id.action_fragment1_to_fragment2)

        }

    }

    // Hide menu items if needed
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.findItem(R.id.app_bar_archive).isVisible = false
        super.onCreateOptionsMenu(menu, inflater)
    }

    // execute a task when an item is selected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)

        when(item.itemId){
             R.id.app_bar_search -> Toast.makeText(requireContext(),"Search", Toast.LENGTH_SHORT).show()
             R.id.app_bar_edit -> Toast.makeText(requireContext(),"Edit", Toast.LENGTH_SHORT).show()
        }
        return true
    }


}