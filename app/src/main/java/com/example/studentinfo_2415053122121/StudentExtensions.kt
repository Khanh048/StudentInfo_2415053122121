package com.example.studentinfo_2415053122121

fun Student.evaluatePerformance(): String {
    return if (score >= 5.0) {
        val rank = if (score >= 8.0) "Giỏi" else if (score >= 6.5) "Khá" else "Trung Bình"
        "Đạt (Xếp loại: $rank)"
    } else {
        "Chưa đạt"
    }
}

// Extension function cho kiểu String để viết hoa tên
fun String.toCapitalized(): String {
    return this.uppercase()
}