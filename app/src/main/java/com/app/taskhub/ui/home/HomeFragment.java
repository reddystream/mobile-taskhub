package com.app.taskhub.ui.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.app.taskhub.R;
import com.app.taskhub.databinding.FragmentHomeBinding;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final AdView adView = new AdView(binding.getRoot().getContext());
        adView.setAdSize(AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(binding.getRoot().getContext(), 350));
        adView.setAdUnitId("ca-app-pub-5145926574192140/6380980367");
        adView.loadAd(new AdRequest.Builder().build());
        LinearLayout linearLayout = root.findViewById(R.id.teste); // Substitua pelo ID do seu ConstraintLayout
        linearLayout.addView(adView);





        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}