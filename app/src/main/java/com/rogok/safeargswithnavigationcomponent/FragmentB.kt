package com.rogok.safeargswithnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_b.view.*

class FragmentB : Fragment(R.layout.fragment_b) {

    private val args by navArgs<FragmentBArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        view.textView.text =
            "FirstName: ${args.currentUser.firstName}\n LastName: ${args.currentUser.lastName}"



        return view
    }


}