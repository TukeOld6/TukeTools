package com.tuke.tools.ui.adbhelper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tuke.tools.databinding.FragmentAdbHelperBinding;

/**
 * AdbHelperFragment - Screen mirroring functionality using scrcpy
 * This fragment provides ADB helper tools and screen mirroring capabilities.
 */
public class AdbHelperFragment extends Fragment {

    private FragmentAdbHelperBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AdbHelperViewModel adbHelperViewModel =
                new ViewModelProvider(this).get(AdbHelperViewModel.class);

        binding = FragmentAdbHelperBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Inflate the scrcpy configuration UI into the container
        View scrcpyConfigView = inflater.inflate(com.tuke.tools.R.layout.scrcpy_fragment_adb_helper, 
                binding.adbHelperContainer, false);
        binding.adbHelperContainer.addView(scrcpyConfigView);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
