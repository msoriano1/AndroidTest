package com.mattdog.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //VCS tab opens version control settings
    // Select 'Integrate project' and then choose 'Git"
    //Select 'Import into Version Control' and choose 'Share project on Github' to create repo on Github
    // Select 'Git' and select 'Branches' to add branches
}
