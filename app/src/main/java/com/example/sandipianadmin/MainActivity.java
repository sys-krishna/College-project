package com.example.sandipianadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sandipianadmin.faculty.UpdateFaculty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice , addGlleryImage, addEbook, faculty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNotice);
        addGlleryImage = findViewById(R.id.addGalleryImage);
        addEbook = findViewById(R.id.addEbook);
        faculty = findViewById(R.id.faculty);

        uploadNotice.setOnClickListener(this);
        addGlleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.addNotice:
                 intent = new Intent(MainActivity.this,UploadNotice.class);
                startActivity(intent);
                break;
            //-------------------------------------UPLOAD IMAGE INTENT---------------------
            case R.id.addGalleryImage:
                 intent = new Intent(MainActivity.this,UploadImage.class);
                startActivity(intent);
                break;
            //-----------------------------------------UPLOAD NOTES INTENT--------------------
            case R.id.addEbook:
                 intent = new Intent(MainActivity.this,UploadPdfActivity.class);
                 startActivity(intent);
                break;
            //-----------------------------------------UPLOAD faculty INTENT--------------------
            case R.id.faculty:
                 intent = new Intent(MainActivity.this, UpdateFaculty.class);
                startActivity(intent);
                break;

        }
    }
}