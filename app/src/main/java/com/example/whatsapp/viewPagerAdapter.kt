package com.example.whatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class viewPagerAdapter(frM : FragmentManager):FragmentPagerAdapter(frM) {

    var fragments = ArrayList<Fragment>()
    var tabTitle = ArrayList<String>()

    fun addFragment(fragment:Fragment,tabtitle:String){
        this.fragments.add(fragment)
        this.tabTitle.add(tabtitle)

    }

    override fun getCount() : Int {
        return this.fragments.size
    }

    override fun getItem(position : Int) : Fragment {
        return this.fragments[position]

    }

    override fun getPageTitle(position : Int) : CharSequence? {
        return this.tabTitle[position]
    }
}