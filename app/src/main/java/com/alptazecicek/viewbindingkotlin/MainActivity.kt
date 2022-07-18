package com.alptazecicek.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.alptazecicek.viewbindingkotlin.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //kotlin-android-extensions gerekli.

    //private lateinit var textView: TextView //lateinit sonradan tanımlanıcak merak etme anlamına geliyor. önceden tanımlandığından
    //dolayı textView onCreate ya da diğer fonksiyonlarda kullanılabilir.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //binding.textView.text = "on Create Altındaki Kod"
        //textView = findViewById<TextView>(R.id.textView) //<TextView> a gerek olmayabilir bakılacak?

    }


    fun ismiDegistir(view: View){
        println("Degistir Tıklandı")
        //val textView = findViewById<TextView>(R.id.textView)    //kotlin android extensions olmasa da bu şekilde textview erişilebilir.
        //textView.text = "lol"       //kotlin android extentions eklendiğinde bu şekilde kullanılabilir

        binding.textView.text = "Merhaba kotlin"
    }
}