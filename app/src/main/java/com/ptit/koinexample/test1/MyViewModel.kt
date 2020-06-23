package com.ptit.koinexample.test1

import androidx.lifecycle.ViewModel

class MyViewModel(val repository: HelloRepository): ViewModel() {

    fun sayHello() = "${repository.giveHello()} from $this"
}
