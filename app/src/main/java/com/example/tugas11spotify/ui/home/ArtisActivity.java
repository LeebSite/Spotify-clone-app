package com.example.tugas11spotify.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugas11spotify.R;

public class ArtisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artis);

        // Mengambil intent yang dikirim dari HomeFragment
        Intent intent = getIntent();
        int profileImageResId = intent.getIntExtra("profileImage", R.drawable.taylor_swift);
        String artistName = intent.getStringExtra("artistName");
        String listeners = intent.getStringExtra("listeners");

        // Mengambil referensi ke ImageView dan TextView dari layout
        ImageView profileImage = findViewById(R.id.profileImage);
        TextView artistNameTextView = findViewById(R.id.artistName);
        TextView listenersTextView = findViewById(R.id.listener);

        // Menetapkan gambar profil dan nama artis ke ImageView dan TextView
        profileImage.setImageResource(profileImageResId);
        artistNameTextView.setText(artistName);
        listenersTextView.setText(listeners);
    }
}