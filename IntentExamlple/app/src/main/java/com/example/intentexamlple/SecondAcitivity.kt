package com.example.intentexamlple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class SecondAcitivity : AppCompatActivity() {
    lateinit var nameEt:EditText
    lateinit var emailEdt:EditText

    lateinit var iAgreeCB : CheckBox
    lateinit var loginBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_acitivity)

        nameEt = findViewById(R.id.nameEdt)
        emailEdt = findViewById(R.id.emailEdt)
        iAgreeCB = findViewById(R.id.iAgreeCb)
        loginBtn = findViewById(R.id.loginBtn)

        loginBtn.setOnClickListener {
            if (iAgreeCB.isChecked){
                //show the toast name,email
                var name = nameEt.text.toString()
                var email = emailEdt.text.toString()

                if (name != "" && email!=""){
                    Toast.makeText(this,
                        "$name $email",
                        Toast.LENGTH_SHORT).show()

                    var i = Intent(this,
                        ThirdActivity::class.java)
                    startActivity(i)
                }else{
                    Toast.makeText(this,
                        "Please enter name and email",
                        Toast.LENGTH_SHORT).show()
                }

            }else{
                //show error
                 Toast.makeText(this,
                     "Please check I agree to proceed",
                     Toast.LENGTH_SHORT).show()
            }
        }
    }
}