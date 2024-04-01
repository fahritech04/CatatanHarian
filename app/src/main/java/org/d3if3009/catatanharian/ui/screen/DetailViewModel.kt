package org.d3if3009.catatanharian.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if3009.catatanharian.model.Catatan

class DetailViewModel : ViewModel() {

    fun getCatatan(id: Long): Catatan {
        return Catatan(
            id,
            "Kuliah Mobpro $id Feb",
            "Yey, hari ini belajar membuat aplikasi Android counter dan berhasil. Hehe.. Mudah2an modul selanjutnya juga lancar. Aamiin.",
            "2024-02-$id 12:34:56"
        )
    }
}
