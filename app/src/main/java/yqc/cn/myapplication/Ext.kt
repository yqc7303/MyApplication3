package yqc.cn.myapplication

import android.annotation.SuppressLint
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import androidx.databinding.InverseBindingAdapter
import android.widget.TextView

/**
 * Created by yangqc on 2019-08-13.
 * describe:
 */
@BindingConversion
fun int2string(integer:Int):String{
    return integer.toString()
}

@SuppressLint("SetTextI18n")
@BindingAdapter("textMore")
fun textMore(textView: TextView,s:String){
    textView.text = s+s
}

@BindingAdapter("android:bindName")
fun TextView.setBindName(name:String?){
    if (name.isNullOrEmpty() && name != text) {
        text = name
    }
}

@InverseBindingAdapter(attribute = "android:bindName", event = "cus_event")
fun TextView.getBindName():String{

    // 这里你可以对视图上的数据进行处理最终设置给Model层

    return text.toString()
}



