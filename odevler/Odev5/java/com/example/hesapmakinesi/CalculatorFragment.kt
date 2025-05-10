package com.example.hesapmakinesi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.hesapmakinesi.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {

    private var _binding: FragmentCalculatorBinding? = null
    private val binding get() = _binding!!

    private var currentInput = StringBuilder()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCalculatorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setListeners() {
        val numberClickListener = View.OnClickListener { v: View ->
            val value = (v as Button).text.toString()
            currentInput.append(value)
            binding.textViewResult.text = currentInput.toString()
        }

        val operatorClickListener = View.OnClickListener { v: View ->
            val value = (v as Button).text.toString()
            currentInput.append(" ").append(value).append(" ")
            binding.textViewResult.text = currentInput.toString()
        }

        val equalClickListener = View.OnClickListener {
            try {
                val result = eval(currentInput.toString())
                binding.textViewResult.text = result.toString()
                currentInput = StringBuilder(result.toString())
            } catch (e: Exception) {
                binding.textViewResult.text = "Hata"
            }
        }

        val clearClickListener = View.OnClickListener {
            currentInput.setLength(0)
            binding.textViewResult.text = ""
        }

        binding.button0.setOnClickListener(numberClickListener)
        binding.button1.setOnClickListener(numberClickListener)
        binding.button2.setOnClickListener(numberClickListener)
        binding.button3.setOnClickListener(numberClickListener)
        binding.button4.setOnClickListener(numberClickListener)
        binding.button5.setOnClickListener(numberClickListener)
        binding.button6.setOnClickListener(numberClickListener)
        binding.button7.setOnClickListener(numberClickListener)
        binding.button8.setOnClickListener(numberClickListener)
        binding.button9.setOnClickListener(numberClickListener)

        binding.buttonAdd.setOnClickListener(operatorClickListener)
        binding.buttonSubtract.setOnClickListener(operatorClickListener)
        binding.buttonMultiply.setOnClickListener(operatorClickListener)
        binding.buttonDivide.setOnClickListener(operatorClickListener)

        binding.buttonEquals.setOnClickListener(equalClickListener)
        binding.buttonClear.setOnClickListener(clearClickListener)
    }

    companion object {
        fun eval(str: String): Double {
            return object : Any() {
                var pos = -1
                var ch = 0

                fun nextChar() {
                    ch = if (++pos < str.length) str[pos].code else -1
                }

                fun eat(charToEat: Int): Boolean {
                    while (ch == ' '.code) nextChar()
                    if (ch == charToEat) {
                        nextChar()
                        return true
                    }
                    return false
                }

                fun parse(): Double {
                    nextChar()
                    val x = parseExpression()
                    if (pos < str.length) throw RuntimeException("Beklenmeyen: ${ch.toChar()}")
                    return x
                }

                fun parseExpression(): Double {
                    var x = parseTerm()
                    while (true) {
                        x = when {
                            eat('+'.code) -> x + parseTerm()
                            eat('-'.code) -> x - parseTerm()
                            else -> return x
                        }
                    }
                }

                fun parseTerm(): Double {
                    var x = parseFactor()
                    while (true) {
                        x = when {
                            eat('*'.code) -> x * parseFactor()
                            eat('/'.code) -> x / parseFactor()
                            else -> return x
                        }
                    }
                }

                fun parseFactor(): Double {
                    if (eat('+'.code)) return parseFactor()
                    if (eat('-'.code)) return -parseFactor()

                    val startPos = pos
                    if ((ch in '0'.code..'9'.code) || ch == '.'.code) {
                        while ((ch in '0'.code..'9'.code) || ch == '.'.code) nextChar()
                        return str.substring(startPos, pos).toDouble()
                    }

                    throw RuntimeException("Beklenmeyen karakter: ${ch.toChar()}")
                }
            }.parse()
        }
    }
}
