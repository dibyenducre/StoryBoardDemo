package com.app.storyboarddemo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_account.*
import androidx.navigation.findNavController


class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





        btn_next.setOnClickListener {
            var argBundle = Bundle()
            argBundle.putString("argName", ed_Name.text.toString())
            it.findNavController()?.navigate(R.id.action_accountFragment_to_accountInfoFragment, argBundle)
        }

    }

}
