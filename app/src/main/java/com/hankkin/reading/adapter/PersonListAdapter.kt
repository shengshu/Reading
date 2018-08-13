package com.hankkin.reading.adapter

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.hankkin.library.utils.ToastUtils
import com.hankkin.library.view.RippleView
import com.hankkin.reading.R
import com.hankkin.reading.adapter.base.BaseRecyclerViewAdapter
import com.hankkin.reading.adapter.base.BaseRecyclerViewHolder
import com.hankkin.reading.domain.PersonListBean

/**
 * Created by huanghaijie on 2018/6/28.
 */
class PersonListAdapter : BaseRecyclerViewAdapter<PersonListBean>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseRecyclerViewHolder<*> {
        return ViewHolder(parent,R.layout.adapter_person_list_item)
    }

    class ViewHolder(parent: ViewGroup?,layoutId: Int) : BaseRecyclerViewHolder<PersonListBean>(parent,layoutId) {

        val tvText by lazy { itemView.findViewById<TextView>(R.id.tv_adapter_person_text) }
        val ivIcon by lazy { itemView.findViewById<ImageView>(R.id.iv_adapter_person_icon) }
        val rlItem by lazy { itemView.findViewById<RippleView>(R.id.rl_adapter_person) }

        override fun onBindViewHolder(bean: PersonListBean?, position: Int) {
            tvText.text = bean!!.text
            ivIcon.setImageResource(bean.icon)
            rlItem.setOnRippleCompleteListener{ ToastUtils.showToast(ivIcon.context,bean.text) }
        }

    }

}