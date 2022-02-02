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
         Log.d("kotlintest", "私の名前は"+"nameです。" )
         Log.d("kotlintest","年は"+"ageです。" )

     }


     // thinkableインターフェイスのメソッドをオーバーライド
     override fun think() {
         Log.d("kotlintest", "私は" +  "hobby" + "について考える。")
     }
 }




