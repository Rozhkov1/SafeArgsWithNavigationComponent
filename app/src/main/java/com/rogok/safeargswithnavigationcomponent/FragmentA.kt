package com.rogok.safeargswithnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rogok.safeargswithnavigationcomponent.model.User
import kotlinx.android.synthetic.main.fragment_a.view.*

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        view.send_btn.setOnClickListener {
            val firstName = view.first_name_et.text.toString()
            val lastName = view.last_name_et.text.toString()
            val user = User(firstName, lastName)

            val action = FragmentADirections.actionFragmentAToFragmentB(user)
            findNavController().navigate(action)

        }


        return view
    }
}