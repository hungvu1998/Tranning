package com.example.tranning.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.tranning.R
import com.example.tranning.ViewModelProvidersFactory
import com.example.tranning.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {
    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel= ViewModelProviders.of(this,providerFactory).get(MainViewModel::class.java)
        mainViewModel.observeObject()

        mainViewModel.dogs.observe(this, Observer {
            Log.d("kiemtra_",""+it.id)
        })
    }
}
