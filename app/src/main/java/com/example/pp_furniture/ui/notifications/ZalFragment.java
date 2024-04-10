package com.example.pp_furniture.ui.notifications;

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


import com.example.pp_furniture.MAdapter;
import com.example.pp_furniture.R;
import com.example.pp_furniture.databinding.FragmentZalBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {
    private FragmentZalBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;

NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_zal);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_zal.add(new FurnitureModel("Гостинная","Трио Супер Стиль", "2820",
                " производство Италия," + " Mario Fabric " + "отделка: атлас и гобелен," +
                        "набивной, специальный состав", R.drawable.purple_1));
        list_zal.add(new FurnitureModel("Гостинная","Диван Flow" ,
                "1860", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.purple_2));
        list_zal.add(new FurnitureModel("Гостинная","Диван marble" ,
                "4560", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.purple_3));
        list_zal.add(new FurnitureModel("Гостинная","Диван Purole" ,
                "2360", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.purple_4));
        list_zal.add(new FurnitureModel("Гостинная","Диван Blue Dream" ,
                "3460", "производство Германия, матрас набивной пружинный, кокосовая стружка" +
                " производство Германия", R.drawable.purple_5));
        list_zal.add(new FurnitureModel("Гостинная","Диван Flow" ,
                "4560", " производство Германия, матрас набивной пружинный, кокосовая стружка" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.purple_6));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

            binding.btnBack.setOnClickListener(v->{
                navController = Navigation.findNavController(requireActivity(),
                        R.id.nav_host_fragment_activity_main);
                navController.navigate(R.id.action_navigation_zal_to_navigation_home);
            });

          

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}