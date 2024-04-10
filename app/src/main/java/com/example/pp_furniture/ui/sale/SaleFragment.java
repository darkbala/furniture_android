package com.example.pp_furniture.ui.sale;

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
import com.example.pp_furniture.databinding.FragmentSaleBinding;
import com.example.pp_furniture.models.CategoryModel;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class SaleFragment extends Fragment {

    FragmentSaleBinding binding;
    NavController navController;
    List<FurnitureModel> list_s = new ArrayList<>();

    MAdapter adapter;

    public SaleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_s);
        binding.rvSale.setAdapter(adapter);
        return root;
    }




    private void createList() {
        list_s.add(new FurnitureModel("Детская", "Детский гарнитур", "3980 + 40%",
                "материал - ротанговое дерево", "40%",R.drawable.det_g));
        list_s.add(new FurnitureModel("Кухня", "Кухонный стол ", "1180 + 60%",
                "Наш кухонный гарнитур - это идеальное решение для создания просторной, функциональной и стильной кухонной зоны в вашем доме. Он сочетает в себе высокое качество материалов, удобство использования и привлекательный дизайн, обеспечивая комфорт и удовольствие от приготовления пищи и проведения времени в кухне.", "60%",R.drawable.kuh_5));
        list_s.add(new FurnitureModel("Гостинная","Диван Sunrise" ,
                "1860 + 40%", " производство Германия, матрас набивной пружинный, кокосовая стружка" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.purple_6));
        list_s.add(new FurnitureModel("Гостинная","Диван Flow" ,
                "5660 + 60%", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.purple_2));
        list_s.add(new FurnitureModel("Кухня", "Кухонный гарнитур", "4280 + 60%",
                "Наш кухонный гарнитур - это идеальное решение для создания просторной, функциональной и стильной кухонной зоны в вашем доме. Он сочетает в себе высокое качество материалов, удобство использования и привлекательный дизайн, обеспечивая комфорт и удовольствие от приготовления пищи и проведения времени в кухне.", "55%",R.drawable.kuh_4));
        list_s.add(new FurnitureModel("Сад", "Cтол и стулья ", "5780 +55%",
                "материал - ротанговое дерево", "45%",R.drawable.sad_3));
        list_s.add(new FurnitureModel("Cпальня","Кровать lottie", "1100 + 40% ",
                " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," +
                        "набивной, специальный состав"
                , R.drawable.pink_5));


    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_saleFragment_to_navigation_home);
        });

    }
}