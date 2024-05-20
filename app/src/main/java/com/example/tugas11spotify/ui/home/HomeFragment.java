// HomeFragment.java
package com.example.tugas11spotify.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tugas11spotify.R;
import com.example.tugas11spotify.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Hide the action bar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        }

        LinearLayout the1975Layout = root.findViewById(R.id.the1975);
        the1975Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ArtisActivity.class);
                intent.putExtra("profileImage", R.drawable.the_1975);
                intent.putExtra("artistName", "The 1975");
                intent.putExtra("listeners", "1283.993k Pendengar Bulanan");
                startActivity(intent);
            }
        });

        LinearLayout ArcticmonkeysLayout = root.findViewById(R.id.arcticmonkey);
        ArcticmonkeysLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ArtisActivity.class);
                intent.putExtra("profileImage", R.drawable.arctic_monkeys);
                intent.putExtra("artistName", "Arctic Monkeys");
                intent.putExtra("listeners", "8869.153k Pendengar Bulanan");
                startActivity(intent);
            }
        });

        LinearLayout KendricklamarLayout = root.findViewById(R.id.kendricklamar);
        KendricklamarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ArtisActivity.class);
                intent.putExtra("profileImage", R.drawable.kendrick_lamar);
                intent.putExtra("artistName", "Kendrick Lamar");
                intent.putExtra("listeners", "711.203k Pendengar Bulanan");
                startActivity(intent);
            }
        });

        LinearLayout OneokrockLayout = root.findViewById(R.id.oneokrock);
        OneokrockLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ArtisActivity.class);
                intent.putExtra("profileImage", R.drawable.one_ok_rock);
                intent.putExtra("artistName", "ONE OK ROCK");
                intent.putExtra("listeners", "2983.903k Pendengar Bulanan");
                startActivity(intent);
            }
        });


        return root;
    }
}