package jp.techacademy.kosuke.kitaoka.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val human= Human("田中",20,"読書")
        human.say()
        Log.d("kotlintest","私の名前は"+human.name+"です。")
        Log.d("kotlintest","年は"+human.age+"歳です。")

        human.think()
        Log.d("kotlintest","私は"+human.hobby+"について考える。")

        val human2=Human("山田",25,"映画鑑賞")
        human2.say()
        Log.d("kotlintest","私の名前は"+human2.name+"です。")
        Log.d("kotlintest","年は"+human2.age+"歳です。")

        human2.think()
        Log.d("kotlintest","私は"+human2.hobby+"について考える。")


    }
}


















