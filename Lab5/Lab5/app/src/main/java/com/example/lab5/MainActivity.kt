package com.example.lab5

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    lateinit var hours: EditText;
    lateinit var textViewError: TextView;
    lateinit var radioButtonCar: RadioButton;
    lateinit var radioButtonWan: RadioButton;
    lateinit var radioButtonBus: RadioButton;
    lateinit var buttonOk: Button;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //components
        hours = findViewById(R.id.hoursText);
        textViewError = findViewById(R.id.textView_error);
        radioButtonCar = findViewById(R.id.radioButton_car);
        radioButtonWan = findViewById(R.id.radioButton_wan);
        radioButtonBus = findViewById(R.id.radioButton_bus);
        buttonOk = findViewById(R.id.button);

        //button settings
        buttonOk.isEnabled = false;

        //editText settings
        hours.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                buttonOk.isEnabled = !s.isNullOrEmpty() && s.toString().toInt() > 0
            }
        })

    }
    fun onClickButtonOk(view: View) {
        if (validateRadioGroup()) {
            val intent = Intent(this, SecondActivity::class.java)
            val hours: Int = hours.text.toString().toInt()

            intent.putExtra("price", calculatePrice(hours))
            startActivity(intent)
        }
    }

    private fun validateRadioGroup() : Boolean {
        if(!radioButtonBus.isChecked && !radioButtonCar.isChecked && !radioButtonWan.isChecked){
            textViewError.setText("Ошибка! Выберите один из видов транспорта!");
            return false
        }
        textViewError.setText("")
        return true;
    }

    private fun calculatePrice(hours: Int) : Int {
        if(radioButtonCar.isChecked) return hours * 2000

        if(radioButtonWan.isChecked) return hours * 2500

        if(radioButtonBus.isChecked) return hours * 3500


        return 0;
    }

}