package com.salsa.affirmations.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.salsa.affirmations.R
import com.salsa.affirmations.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */

// TODO 4 : Class sebagai Adapter
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // TODO 5 : Digunakan untuk membuat ItemViewHolder
    //  Digunakan untuk menampilkan data per item
    //  Memberikan referensi ke tampilan untuk setiap item data
    //  Item data kompleks mungkin memerlukan lebih dari satu tampilan per item, dan
    //  Memberikan akses ke semua tampilan untuk item data dalam penampung tampilan.
    //  Setiap item data hanyalah objek Afirmasi
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // Digunakan untuk menghubungkan data ke id view component dari setiap item data
        // di tampilan dengan ID item_title yang Anda tentukan di list_item.xml
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    // Digunakan untuk menghubungkan untuk tampilam per item data
    // Digunakan untuk membuat stub dengan parameter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Digunakan untuk membuat view baru
        // Untuk mengetahui cara meng-inflate tata letak
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        // Digunakan untuk menampilkan instance ItemViewHolder
        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    // Digunakan untuk menempelkan setiap data ke setiap tampilan
    // Untuk membuat stub dengan parameter
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // Mengggunakan Val item dan menggunakan item pada position yang ditentukan dalam dataset
        val item = dataset[position]
        // Digunakan untuk memperbarui holder tampilan untuk menampilkan string afirmasi
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    // Digunakan untuk menghitung data yang di tampilkan, mengembalikan ukuran kumpulan data
    // Untuk membuat stub dengan parameter
    override fun getItemCount() = dataset.size
}