package com.androidproject1.firstproject

import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Matcher
import java.util.regex.Pattern


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Login_button.setOnClickListener {
            Login_button.setOnClickListener {
                var Name = edtFirstName.text.toString()
                var password = edtPassword.text.toString()
                var email = edtEmail.text.toString()



                  validateFormName(Name)
                  validateFormpass(password)
                validateFormemail(email)

                if (password.isEmpty()) {
                    edtEmail.error="password Required"
                  return@setOnClickListener
              }
                 if (email.isEmpty()){
                    edtEmail.error="Email Required"
                     return@setOnClickListener
           }

                var i= Intent(this,insert_img::class.java)
                startActivity(i)
            }}}

    private fun validateFormemail(email: String) {
        val EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
        fun isValidString(str: String): Boolean{
            return EMAIL_ADDRESS_PATTERN.matcher(str).matches()
        }

        if (!isValidString(email)) {
            edtEmail.error="Email is inValid"
    }
        MoveToinsert_imgid(email)
 }

    private fun validateFormpass(password: String) {
        if(edtPassword.getText().toString().length<8 &&!isValidPassword(edtPassword.getText().toString())){
           edtPassword.error="Not valid"
        }else{
            System.out.println("Valid");
        }

    }

    fun isValidPassword(password: String?): Boolean {
        val pattern:Pattern
        val matcher:Matcher
        val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$"
        pattern = Pattern.compile(PASSWORD_PATTERN)
        matcher = pattern.matcher(password)
        return matcher.matches()
    }


    private fun  validateFormName(name: String) {

        if(name.length==0)
        {
            edtFirstName.requestFocus();
            edtFirstName.setError("FIELD CANNOT BE EMPTY")
            return
        }
        else

            Toast.makeText(this@MainActivity, "Clicked", Toast. LENGTH_SHORT).show()

}

    private fun MoveToinsert_imgid(email: String) {
        val i= Intent(this,MainActivity::class.java)
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        i.putExtra("UserEmail",email)
        i.putExtra("userName",edtFirstName.text.toString())
        startActivity(i)
    }
}






