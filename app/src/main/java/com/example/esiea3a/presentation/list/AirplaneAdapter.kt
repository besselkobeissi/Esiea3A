package com.example.esiea3a.presentation.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.esiea3a.R

class AirplaneAdapter(private var dataSet: List<Airplane>):
    RecyclerView.Adapter<AirplaneAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            // Define click listener for thjs ViewHolder's View.
            textView = view.findViewById(R.id.airplane_name)
        }
    }

    fun updateList(list: List<Airplane>){
        dataSet = list
        notifyDataSetChanged()
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.airplane_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int)
    {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        val airplane : Airplane = dataSet[position]
        viewHolder.textView.text = airplane.name
    }

    //Return the size of your dataSet (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}