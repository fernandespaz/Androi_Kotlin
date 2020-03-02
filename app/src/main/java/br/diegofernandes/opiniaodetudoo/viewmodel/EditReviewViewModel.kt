package br.diegofernandes.opiniaodetudoo.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import br.diegofernandes.opiniaodetudoo.model.Review

/**
 * Created by DiegoPaz on 05/11/19.
 */
class EditReviewViewModel : ViewModel() {
    var data:MutableLiveData<Review> = MutableLiveData()
}