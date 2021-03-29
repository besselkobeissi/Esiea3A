package com.example.esiea3a.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esiea3a.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class AirplaneListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val adapter = AirplaneAdapter(listOf())
    private val layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_airplane_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.airplane_recyclerview)

        recyclerView.apply {
            layoutManager = this@AirplaneListFragment.layoutManager
            adapter = this@AirplaneListFragment.adapter
        }

        val airplaneList : ArrayList<Airplane> = arrayListOf<Airplane>().apply {
            add(Airplane("Airbus A320"))
            add(Airplane("Airbus A330"))
            add(Airplane("Airbus A350"))
            add(Airplane("Boeing B777"))
            add(Airplane("Boeing B787"))
            add(Airplane("Boeing B747"))
        }

        adapter.updateList(airplaneList)

        }
}