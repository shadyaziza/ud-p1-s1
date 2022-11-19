package com.udacity.shoestore.ui.shoes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

data class Shoe(
    var name:String="",
    var description:String="",
    var company:String="",
    var size:Int=0,
)

class ShoeListViewModel : ViewModel() {
    private var _shoes = mutableListOf<Shoe>()
    private var _shoesList =  MutableLiveData<List<Shoe>>(_shoes)

    val shoesList: LiveData<List<Shoe>>
        get() = _shoesList

    fun add(shoe: Shoe) {
        _shoes.add(shoe)


        _shoesList.postValue(_shoes)
    }
}