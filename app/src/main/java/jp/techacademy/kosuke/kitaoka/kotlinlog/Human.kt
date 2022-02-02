package jp.techacademy.kosuke.kitaoka.kotlinlog

import android.util.Log

 class Human: Animal,Thinkable {
     //プロパティ
     var hobby: String

     // 引数付きコンストラクタ
     constructor(name: String, age: Int, hobby: String) : super(name, age) {
         this.hobby = hobby


     }


     // Animalクラスのメソッドをオーバーライド
     override fun say() {
         Log.d("kotlintest", this.name+this.age+"歳"+this.hobby)


     }


     // thinkableインターフェイスのメソッドをオーバーライド
     override fun think() {
         Log.d("kotlintest", this.hobby )
     }
 }




