 package com.example.helloworld


 import android.content.Intent
 import android.os.Bundle

 import androidx.appcompat.app.AppCompatActivity
 import kotlinx.android.synthetic.main.activity_main.*
 import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener({
            val msg = message.text.toString()
            val intent = Intent(this,Activity2::class.java)
            intent.putExtra("msg",msg)
            startActivity(intent)

        })
    }
}