package com.example.checkinternetconnection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val networkConnection = NetworkConnection(applicationContext)
        networkConnection.observe(this, Observer { isConnected ->
            if(isConnected){
        layoutDisconnected.visibility = View.GONE
                layoutConnected.visibility = View.VISIBLE
            }else{
                layoutDisconnected.visibility = View.VISIBLE
                layoutConnected.visibility = View.GONE
            }
        })
    }
}