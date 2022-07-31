package com.example.simpleunitconverter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CustomDialogFragment:DialogFragment(R.layout.fragment_custom_dialog)
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelbt : Button = view.findViewById(R.id.Cancel)
        val submitbt : Button = view.findViewById(R.id.Submit)
        val radioGroup = view.findViewById<RadioGroup>(R.id.RadioGroup)
        cancelbt.setOnClickListener{
            dismiss()
        }

        submitbt.setOnClickListener{
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton=view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text, Toast.LENGTH_SHORT).show()
            val m1:MainActivity=getActivity() as MainActivity
            m1.receiveFeedBack(radioButton.text.toString())
            dismiss()
        }




    }
}