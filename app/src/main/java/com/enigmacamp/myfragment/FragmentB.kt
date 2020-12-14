package com.enigmacamp.myfragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentB.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentB : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val bundle = arguments
        val user_name = bundle!!.getString("name")
        val textView = view.findViewById<TextView>(R.id.hello_textView)
        textView?.setText("Hello ${user_name}")
        return view
    }

    /*
    Tidak bisa dilakukan karena hello textview belum terbentuk
     */
//    fun setName(name: String) {
//        Log.d("Fragment B", name)
//        val textView = activity?.findViewById<TextView>(R.id.hello_textView)
//        textView?.setText("Hello ${name}")
//    }

    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = FragmentB()
    }
}