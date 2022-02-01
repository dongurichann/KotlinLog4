package jp.techacademy.kosuke.kitaoka.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

0

        val human= Human("私の名前は",0,"hobby")
        human.say()
        human.think()

















    }
}


















