package dora.widget.sidebar.adapter

import android.content.Context
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import dora.widget.sidebar.R

class LetterAdapter @JvmOverloads constructor(private val context: Context,
                                              private val textSize: Float,
                                              @ColorInt private val textColor: Int,
                                              private var indicators: MutableList<String> = arrayListOf()) :
    RecyclerView.Adapter<LetterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.dview_item_side_bar, null))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tvSideBar = holder.itemView.findViewById<TextView>(R.id.tv_side_bar)
        tvSideBar.text = indicators[position]
        tvSideBar.setTextSize(TypedValue.COMPLEX_UNIT_DIP, textSize)
        tvSideBar.setTextColor(textColor)
    }

    fun addData(indicator: String) {
        this.indicators.add(indicator)
        notifyItemInserted(indicators.size - 1)
    }

    fun addData(indicators: List<String>) {
        this.indicators.addAll(indicators)
        notifyDataSetChanged()
    }

    fun setList(indicators: MutableList<String>) {
        this.indicators.clear()
        this.indicators.addAll(indicators)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return indicators.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}