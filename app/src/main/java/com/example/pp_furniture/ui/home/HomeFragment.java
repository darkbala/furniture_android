package com.example.pp_furniture.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.airbnb.lottie.LottieAnimationView;
import com.example.pp_furniture.R;
import com.example.pp_furniture.databinding.FragmentHomeBinding;
import com.example.pp_furniture.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;
    List<CategoryModel> list_category = new ArrayList<>();
    CategoryAdapter adapter;
    LottieAnimationView lotty_sale;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        lotty_sale = binding.lottySale;
        lotty_sale.setAnimation(R.raw.sale_furn4);


        createList();
        adapter = new CategoryAdapter();
        adapter.setMain_list(list_category);
        binding.rvCatalogCategory.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_category.add(new CategoryModel("Спальня", R.drawable.yellow_bad));
        list_category.add(new CategoryModel("Гостинная",R.drawable.gostinaya));
        list_category.add(new CategoryModel("Кухня", R.drawable.kuhnya));
        list_category.add(new CategoryModel("Детская",R.drawable.detskaya));
        list_category.add(new CategoryModel("Сад", R.drawable.sad));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.saleCardView.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_home_to_saleFragment);
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}