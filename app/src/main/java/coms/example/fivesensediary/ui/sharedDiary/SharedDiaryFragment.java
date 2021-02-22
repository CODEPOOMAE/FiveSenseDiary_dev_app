package coms.example.fivesensediary.ui.sharedDiary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import coms.example.fivesensediary.R;

public class SharedDiaryFragment extends Fragment {

    private SharedDiaryViewModel sharedDiaryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sharedDiaryViewModel =
                new ViewModelProvider(this).get(SharedDiaryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_shared_diary, container, false);
        final TextView textView = root.findViewById(R.id.text_shared_diary);
        sharedDiaryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}