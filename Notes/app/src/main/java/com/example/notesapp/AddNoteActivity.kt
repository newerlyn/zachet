package com.example.notesapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddNoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        val saveButton: Button = findViewById(R.id.saveButton)
        saveButton.setOnClickListener {
            val noteText = "Новая заметка" // Здесь можно добавить логику для ввода текста заметки
            val newNote = Note(noteText, "") // Создание новой заметки (пока без изображения)
            
            val resultIntent = Intent()
            resultIntent.putExtra(EXTRA_NOTE, newNote)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }

    companion object {
        const val EXTRA_NOTE = "com.example.notesapp.EXTRA_NOTE"
    }
}
