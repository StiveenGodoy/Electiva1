package com.xidne.happyhealth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the button and set an onClick listener
        val button: Button = view.findViewById(R.id.temperatureButton)
        button.setOnClickListener {
            Toast.makeText(activity, "¡Tienes una alta temperatura!", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}