package com.example.tugas11spotify.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tugas11spotify.databinding.FragmentNotificationsBinding;
import com.example.tugas11spotify.ui.LikedsongActivity;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Hide the action bar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        }

        // Set OnClickListener for Liked Song ImageView
        binding.ivLikedsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LikedSongActivity when Liked Song ImageView is clicked
                startActivity(new Intent(getActivity(), LikedsongActivity.class));
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

        // Show the action bar when the view is destroyed
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        }
    }
}
