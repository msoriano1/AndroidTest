package com.mattdog.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var occupation = "gangster"
        var name = "Matthew Soriano"
    }

    //VCS tab opens version control settings
    // Select 'Integrate project' and then choose 'Git"
    //Select 'Import into Version Control' and choose 'Share project on Github' to create repo on Github
    // Select 'Git' and select 'Branches' to add/switch branches
    //Select 'VCS' and select 'Commit' to commit any changes made
    //Select 'Git' and 'Pull' to pull the most updated version
    //If there is a merge conflict, select 'Git' and select 'Resolve Conflicts'
    //Select 'Git' and select 'Merge Changes' to merge changes with pulled branch and local branch
    //Select 'VCS' and select 'Commit' to commit the merged changes
    //Select 'Git' and select 'Push' to push the merged version

}
