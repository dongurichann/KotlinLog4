package jp.techacademy.kosuke.kitaoka.kotlinlog

import android.util.Log

 class Human: Animal {
     //プロパティ
     var hobby:"~"
     var age: Int


     // 引数付きコンストラクタ
     constructor(name: String, age: Int) {
         this.name = "~"
         this.age = "~"
     }






    // Animalクラスのメソッドをオーバーライド
     fun say(){}
        Log.d("kotlintest",this.name+"("+this.age+"歳")
    }


    // thinkableインターフェイスのメソッドをオーバーライド
     fun think() {
        Log.d("kotlintest", "私は" +"~"+"について考える。")

    }




