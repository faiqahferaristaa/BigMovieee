package com.kelompok3.bigmovieee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Sinopsi extends Fragment {
    View view;

    public Sinopsi() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.sinopsi, container, false);
        return view;
    }
}
