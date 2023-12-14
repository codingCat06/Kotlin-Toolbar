package com.example.appbar
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appbar.databinding.ActivityMainBinding
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toolbar_init()
    }
    fun toolbar_init() {
        // values > themes > parents 를 Theme.MaterialComponents.Light.NoActionBar 로 변경.
        // res 에서 menu 폴더 제작 -> option.xml 생성 , 각 Item 에 app:showAsAction="always" 설정 해줘야함
        var toolbar = binding.toolbar
        setSupportActionBar(toolbar);
        var actionBar = getSupportActionBar()
        actionBar?.setDisplayShowCustomEnabled(true)
        actionBar?.setDisplayShowTitleEnabled(false)//기본 제목을 없애줍니다.
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Error 뜰 시 함수 이름의 Options 를 파일 이름으로 바꿀 것!
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.information -> Toast.makeText(this, "information", Toast.LENGTH_SHORT).show()
            R.id.profile -> Toast.makeText(this,"profile",Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(this,"setting",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

}