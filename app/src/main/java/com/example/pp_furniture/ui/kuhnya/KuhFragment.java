package com.example.pp_furniture.ui.kuhnya;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pp_furniture.MAdapter;
import com.example.pp_furniture.R;
import com.example.pp_furniture.databinding.FragmentKuhBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class KuhFragment extends Fragment {

    FragmentKuhBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKuhBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvKyh.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_kuh_fragment_to_navigation_home);

        });

    }
    public void createList(){
        list_g.add(new FurnitureModel("Кухня", "Кухонный гарнитур", "3980",
                "Наш кухонный гарнитур - это идеальное решение для создания просторной, функциональной и стильной кухонной зоны в вашем доме. Он сочетает в себе высокое качество материалов, удобство использования и привлекательный дизайн, обеспечивая комфорт и удовольствие от приготовления пищи и проведения времени в кухне.", "40%",R.drawable.kuh_1));
        list_g.add(new FurnitureModel("Кухня", "Кухонный стол ", "1180",
                "Наш кухонный стол - это не просто функциональная мебель для приема пищи, это центральный элемент вашей кухни, который сочетает в себе удобство, функциональность и стиль. Сочетая в себе высокое качество материалов, элегантный дизайн и удобство использования, наш кухонный стол станет идеальным дополнением для вашей кухонной зоны.", "60%",R.drawable.kuh_5));
        list_g.add(new FurnitureModel("Кухня", "Кухонный гарнитур", "4280",
                "Наш кухонный гарнитур - это идеальное решение для создания просторной, функциональной и стильной кухонной зоны в вашем доме. Он сочетает в себе высокое качество материалов, удобство использования и привлекательный дизайн, обеспечивая комфорт и удовольствие от приготовления пищи и проведения времени в кухне.", "55%",R.drawable.kuh_4));
        list_g.add(new FurnitureModel("Кухня", "Кухонный гарнитур", "4800",
                "Наш кухонный гарнитур - это идеальное решение для создания просторной, функциональной и стильной кухонной зоны в вашем доме. Он сочетает в себе высокое качество материалов, удобство использования и привлекательный дизайн, обеспечивая комфорт и удовольствие от приготовления пищи и проведения времени в кухне.", "60%",R.drawable.kuh_2));
        list_g.add(new FurnitureModel("Кухня", "Кухонный гарнитур", "660",
                "Наш кухонный гарнитур - это идеальное решение для создания просторной, функциональной и стильной кухонной зоны в вашем доме. Он сочетает в себе высокое качество материалов, удобство использования и привлекательный дизайн, обеспечивая комфорт и удовольствие от приготовления пищи и проведения времени в кухне.", "70%",R.drawable.kuh_3));
        list_g.add(new FurnitureModel("Кухня", "Кухонный гарнитур", "3390",
                "Наш кухонный гарнитур - это идеальное решение для создания просторной, функциональной и стильной кухонной зоны в вашем доме. Он сочетает в себе высокое качество материалов, удобство использования и привлекательный дизайн, обеспечивая комфорт и удовольствие от приготовления пищи и проведения времени в кухне.", "60%",R.drawable.kuhnya));
    }
}
