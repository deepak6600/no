package com.my.spy.app.ui.fragments.base

interface IOnFragmentListener {
    fun onBackPressed(): Boolean
    fun onHideFragment()
}