package com.example.viewbinding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewbinding.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {

    private FragmentBlankBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.textView2.setText("IT wala in Fragment");
        return view;
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}