package com.kenruizinoue.customviewtemplate02

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.content.withStyledAttributes
import kotlinx.android.synthetic.main.custom_layout.view.*

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.custom_layout, this, true)
        orientation = VERTICAL

        // access to attributes
        context.withStyledAttributes(attrs, R.styleable.custom_attributes) {
            textView1.text = getString(R.styleable.custom_attributes_title_1)
            textView2.text = getString(R.styleable.custom_attributes_title_2)
        }
    }
}