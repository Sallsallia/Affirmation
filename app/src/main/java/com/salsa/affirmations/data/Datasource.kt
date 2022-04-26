package com.salsa.affirmations.data

 import com.salsa.affirmations.R
 import com.salsa.affirmations.model.Affirmation
// TODO 3: Merupakan class dari DataSource
//  Digunakan untuk mengisikan sumber data dari Affirmations
class Datasource {
    // Digunakan untuk menampilkan daftar Affirmations
    fun loadAffirmations(): List<Affirmation> {
        // List<Affirmation> Digunakan sebagai jenis nilai yang ditampilkan loadAffirmations()
        // Digunakan untuk membuat list
        return listOf<Affirmation>(
            // Digunakan sebagai ID resource
            // Digunakan untuk membuat beberapa objek
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}