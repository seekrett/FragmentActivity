package edu.temple.fragmentactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner

class ColorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false).apply {
            findViewById<Spinner>(R.id.spinner).apply {
                //                        v cannot reference "this" because fragments don't have context
                adapter = ArrayAdapter(context, android.R.layout.simple_spinner_item,
                    arrayOf("Blue", "Red", "White", "Black", "Magenta"))

                // onItemSelectedListener =
            }
        }
    }
}