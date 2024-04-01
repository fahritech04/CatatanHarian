package org.d3if3009.catatanharian.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.d3if3009.catatanharian.database.CatatanDao
import org.d3if3009.catatanharian.model.Catatan
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DetailViewModel(private val dao: CatatanDao) : ViewModel() {

    private val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)

    fun insert(judul: String, isi: String) {
        val catatan = Catatan(
            tanggal = formatter.format(Date()),
            judul   = judul,
            catatan = isi
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(catatan)
        }
    }
}
