package jp.techacademy.kosuke.kitaoka.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val human= Human("私の名前は",20,"hobby")
        human.say()
        val human2=Human("私は",0,"hobby")
        human.think()







    }
}


















