package com.beyzakutlu.hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.beyzakutlu.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun toplama (view: View){
        val birincisayi= binding.editTextNum.text.toString().toDoubleOrNull()
        val ikincisayi = binding.editTextNum2.text.toString().toDoubleOrNull()

        if(birincisayi==null || ikincisayi==null){
            binding.textView2.text="SAYIYI GİRMEDİN AŞKO! "
        }else{
            binding.textView2.text="SONUÇ: "+ (birincisayi+ikincisayi)
        }
    }
    fun cikarma (view: View){
        val birincisayi= binding.editTextNum.text.toString().toDoubleOrNull()
        val ikincisayi = binding.editTextNum2.text.toString().toDoubleOrNull()

        if(birincisayi==null || ikincisayi==null){
        binding.textView2.text="SAYIYI GİRMEDİN AŞKO! "
    }else{
        binding.textView2.text="SONUÇ: "+ (birincisayi-ikincisayi)
        }

    }
    fun carpma (view: View){
        val birincisayi= binding.editTextNum.text.toString().toDoubleOrNull()
        val ikincisayi = binding.editTextNum2.text.toString().toDoubleOrNull()

        if(birincisayi==null || ikincisayi==null){
            binding.textView2.text="SAYIYI GİRMEDİN AŞKO! "
        }else{
            binding.textView2.text=" SONUÇ: ${birincisayi*ikincisayi}"
        }

    }
    fun bolme (view: View){
        val birincisayi= binding.editTextNum.text.toString().toDoubleOrNull()
        val ikincisayi = binding.editTextNum2.text.toString().toDoubleOrNull()

        if(birincisayi==null || ikincisayi==null){
            binding.textView2.text="SAYIYI GİRMEDİN AŞKO! "
        }else{
            binding.textView2.text="SONUÇ: "+ (birincisayi/ikincisayi).toDouble()
        }
    }
}