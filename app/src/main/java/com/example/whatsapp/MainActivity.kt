package com.example.whatsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mActionMode:ActionMode?=null
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        whatstoolbar.title="whatsApp"
        setSupportActionBar(whatstoolbar)



        var viewPagerAdapter=viewPagerAdapter(supportFragmentManager)
        var fraChats = chatsFragment()
        var frastatus = statusFragment()
        var fraCalls = callsFragment()

        viewPagerAdapter.addFragment(fraChats,"CHATS")
        viewPagerAdapter.addFragment(frastatus,"STATUS")
        viewPagerAdapter.addFragment(fraCalls,"CALLS")

        viewPager.adapter=viewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setTabTextColors(Color.parseColor("#84afab"),Color.parseColor("#ffffff"))
        var contexualmenu = contexualMenu()
        startSupportActionMode(contexualmenu)






    }

    override fun onCreateOptionsMenu(menu : Menu?) : Boolean {
        menuInflater.inflate(R.menu.menu_whats_app,menu)

        return true
    }

    override fun onOptionsItemSelected(item : MenuItem) : Boolean {
        var id = item.itemId
        if (id==R.id.searchWhat)
        {
            Toast.makeText(applicationContext, "search", Toast.LENGTH_LONG).show()
        }
        else if (id==R.id.newGroup)
        {
            Toast.makeText(applicationContext, "new Group", Toast.LENGTH_LONG).show()
        }
        else if (id==R.id.newBroadcast)
        {
            Toast.makeText(applicationContext, "new Broadcast", Toast.LENGTH_LONG).show()
        }
        else if (id==R.id.starredMessages)
        {
            Toast.makeText(applicationContext, "starred Messages", Toast.LENGTH_LONG).show()
        }
        else if (id==R.id.settings)
        {
            Toast.makeText(applicationContext, "settings", Toast.LENGTH_LONG).show()
        }

        return true
    }

    inner class contexualMenu :ActionMode.Callback, androidx.appcompat.view.ActionMode.Callback {
        override fun onCreateActionMode(mode : ActionMode?, menu : Menu?) : Boolean {
            mode?.menuInflater?.inflate(R.menu.contexual_menu,menu)
            return true
        }

        override fun onPrepareActionMode(mode : ActionMode?, menu : Menu?) : Boolean {
            mode?.title=" contexual menu"

            return true
        }

        override fun onActionItemClicked(mode : ActionMode?, item : MenuItem?) : Boolean {
            TODO("Not yet implemented")
        }

        override fun onDestroyActionMode(mode : ActionMode?) {
            TODO("Not yet implemented")
        }

        override fun onCreateActionMode(
            mode : androidx.appcompat.view.ActionMode?,
            menu : Menu?
        ) : Boolean {
            TODO("Not yet implemented")
        }

        override fun onPrepareActionMode(
            mode : androidx.appcompat.view.ActionMode?,
            menu : Menu?
        ) : Boolean {
            TODO("Not yet implemented")
        }

        override fun onActionItemClicked(
            mode : androidx.appcompat.view.ActionMode?,
            item : MenuItem?
        ) : Boolean {
            TODO("Not yet implemented")
        }

        override fun onDestroyActionMode(mode : androidx.appcompat.view.ActionMode?) {
            TODO("Not yet implemented")
        }


    }
}