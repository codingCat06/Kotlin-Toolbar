# Kotlin-Toolbar
#  
## toolbar_init
    fun toolbar_init() {
        // values > themes > parents 를 Theme.MaterialComponents.Light.NoActionBar 로 변경.
        // res 에서 menu 폴더 제작 -> option.xml 생성 , 각 Item 에 app:showAsAction="always" 설정 해줘야함
        var toolbar = binding.toolbar
        setSupportActionBar(toolbar);
        var actionBar = getSupportActionBar()
        actionBar?.setDisplayShowCustomEnabled(true) // Customize 허용
        actionBar?.setDisplayShowTitleEnabled(false) //기본 제목 제거
        actionBar?.setDisplayHomeAsUpEnabled(true) // 기본 Home 버튼 사용 여
    }
#  
##  onOptionsItemSelected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.information -> Toast.makeText(this, "information", Toast.LENGTH_SHORT).show()
            R.id.profile -> Toast.makeText(this,"profile",Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(this,"setting",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

#### Icon Menu 를 생성 후 Toolbar 와 연결시킴.
#### inflate() 함수는 xml 파일을 view 와 연동시켜줌.( = 필요 인자 2개 )
#### ( ActivityBinding 은 관습적(?)으로 쓰기에 인자 1개만 써도 됨 ) 
