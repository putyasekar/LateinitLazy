package com.diki.idn.lateinitlazy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var tag = "LateinitLazy"
    private var uo: UnaryOperator? = null
    private var lo: LogicalOperator? = null
    private lateinit var ao: ArithmaticOperator
    private val name: String by lazy { "Putya" }
    private val age: Int by lazy { 16 }
    private val address: String by lazy { "Batam, Indonesia" }

    lateinit var result: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        uo = UnaryOperator()
        lo = LogicalOperator()
        ao = ArithmaticOperator()

        result = "$name, $age, $address"

        helloworld.setText(result)
    }
}
