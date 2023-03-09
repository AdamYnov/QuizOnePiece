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

    textScore.setText("$score/3")

    }
}