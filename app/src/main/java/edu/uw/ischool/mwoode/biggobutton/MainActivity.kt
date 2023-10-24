package edu.uw.ischool.mwoode.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.Log

class MainActivity : AppCompatActivity() {
    var clickedCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makeButtonClickable()
    }

    fun makeButtonClickable() {
        val textView = findViewById<TextView>(R.id.textView);
        textView.setOnClickListener {
            Log.i("INFO", "CLICKED BUTTON");
            clickedCount += 1;
            if (clickedCount > 1) {
                textView.text = "You have clicked me " + clickedCount + " times!";
            } else {
                textView.text = "You have clicked me 1 time";
            }
        }
    }
}