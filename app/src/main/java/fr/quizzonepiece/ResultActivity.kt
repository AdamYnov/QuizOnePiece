package fr.quizzonepiece

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


    var textScore: TextView = findViewById(R.id.text_score)

    val score = intent.getIntExtra("result",0)


        if (score < 4){
            textScore.setText("Dommage !! \n $score/8")
        }else{
            textScore.setText("Felicitation !! \n $score/8")
        }

    }
}