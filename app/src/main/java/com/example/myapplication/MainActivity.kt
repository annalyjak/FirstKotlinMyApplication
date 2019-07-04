package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Action for onClick in [button_toast]
     */
    fun toastMe(view: View) {
        toast("Hello")
    }

    /**
     * Action for onClick in [button_count]
     */
    fun countMe(view: View) {
        val showCountTextView = findViewById<TextView>(R.id.textView)

        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        showCountTextView.text = count.toString()
    }

    /**
     * Action for onClick in [button_random]
     */
    fun randomMe (view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countStr = textView.text.toString()
        val count = Integer.parseInt(countStr)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }

    /**
     * Generic method for making Toast on MainActivity
     *
     * @param message is the text to display in Toast
     */
    fun toast(message: String) {
        val myToast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        myToast.show()
    }
}
