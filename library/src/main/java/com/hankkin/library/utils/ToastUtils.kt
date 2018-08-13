package com.hankkin.library.utils

import android.content.Context
import android.widget.Toast
import com.hankkin.library.R
import es.dmoral.toasty.Toasty

/**
 * Created by huanghaijie on 2018/8/13.
 */
object ToastUtils{

    fun init(context: Context) {
        Toasty.Config.getInstance().setErrorColor(context.resources.getColor(R.color.md_color_red))
                .setInfoColor(context.resources.getColor(R.color.md_color_light_blue))
                .setSuccessColor(context.resources.getColor(R.color.md_color_green))
                .setWarningColor(context.resources.getColor(R.color.md_color_amber))
                .apply()
    }

    fun showToast(context: Context,str: String){
        Toasty.normal(context,str).show()
    }

    fun showSuccess(context: Context,str: String){
        Toasty.success(context,str).show()
    }

    fun showInfo(context: Context,str: String){
        Toasty.info(context,str).show()
    }

    fun showError(context: Context,str: String){
        Toasty.error(context,str).show()
    }

    fun showWarning(context: Context,str: String){
        Toasty.warning(context,str)
    }

}