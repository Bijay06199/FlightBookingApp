package com.example.bookingtickets.base

import android.app.Dialog
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.bookingtickets.BR

abstract class BaseActivity<DATA_BINDING : ViewDataBinding, VIEW_MODEL : BaseViewModel> :
    AppCompatActivity() {
    lateinit var viewDataBinding: DATA_BINDING
    var baseViewModel: VIEW_MODEL? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

    fun performDataBinding() {
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutId())
        this.baseViewModel = baseViewModel ?: getViewModel()
        viewDataBinding.apply {
            setVariable(getBindingVariable(), baseViewModel)
            setLifecycleOwner(this@BaseActivity)
            executePendingBindings()
        }
    }

    open fun getBindingVariable(): Int =BR.viewModel

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getViewModel(): VIEW_MODEL
}