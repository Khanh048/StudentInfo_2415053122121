package com.example.studentinfo_2415053122121

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val student = Student(
            mssv = "2415053122121",
            fullName = "Võ Quốc Khánh",
            className = "126TLTTD01",
            age = 20,
            score = 8.5
        )

        val tvMssv = findViewById<TextView>(R.id.tvMssv)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvClass = findViewById<TextView>(R.id.tvClass)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvScore = findViewById<TextView>(R.id.tvScore)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)

        tvMssv.text = "Mã sinh viên: ${student.mssv}"
        tvName.text = "Họ tên: ${student.fullName.toCapitalized()}"
        tvClass.text = "Lớp: ${student.className}"
        tvAge.text = "Tuổi: ${student.age}"
        tvScore.text = "Điểm: ${student.score}"

        tvStatus.text = "Kết quả: ${student.evaluatePerformance()}"
    }
}