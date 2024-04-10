package com.example.pp_furniture.ui.detskaya;

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
import com.example.pp_furniture.databinding.FragmentDetskayaBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class DetskayaFragment extends Fragment {

    FragmentDetskayaBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetskayaBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvDetskaya.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_detskaya_to_navigation_home);

        });

    }
    public void createList(){
        list_g.add(new FurnitureModel("Детская", "Детский гарнитур", "3980",
                "Наш детский гарнитур - это идеальное решение для создания уютной и функциональной обстановки в детской комнате вашего ребенка. Он сочетает в себе стильный дизайн, практичность и безопасность, обеспечивая вашему малышу комфортное пребывание и максимальные возможности для развития и творчества.", "40%",R.drawable.det_g));
        list_g.add(new FurnitureModel("Детская", "Детская кровать ", "1180",
                "Наша детская кровать - это идеальное решение для создания уютного и безопасного места для сна вашего малыша", "60%",R.drawable.det_k));
        list_g.add(new FurnitureModel("Детская", "Детский гарнитур ", "4280",
                "Наш детский гарнитур - это идеальное решение для создания уютной и функциональной обстановки в детской комнате вашего ребенка. Он сочетает в себе стильный дизайн, практичность и безопасность, обеспечивая вашему малышу комфортное пребывание и максимальные возможности для развития и творчества.", "55%",R.drawable.det_g1));
        list_g.add(new FurnitureModel("Детская", "Cтол и стулья", "780",
                "материал - ротанговое дерево", "45%",R.drawable.det_stol2));
        list_g.add(new FurnitureModel("Детская", "Детский гарнитур", "4800",
                "Наш детский гарнитур - это идеальное решение для создания уютной и функциональной обстановки в детской комнате вашего ребенка. Он сочетает в себе стильный дизайн, практичность и безопасность, обеспечивая вашему малышу комфортное пребывание и максимальные возможности для развития и творчества.", "60%",R.drawable.det_g3));
        list_g.add(new FurnitureModel("Детская", "Письменный стол", "660",
                "Наш детский стол - это идеальное решение для создания удобной и функциональной зоны для творчества, учебы и игр вашего ребенка", "70%",R.drawable.det_stol));
        list_g.add(new FurnitureModel("Детская", "Детский гарнитур", "3390",
                "Наш детский гарнитур - это идеальное решение для создания уютной и функциональной обстановки в детской комнате вашего ребенка. Он сочетает в себе стильный дизайн, практичность и безопасность, обеспечивая вашему малышу комфортное пребывание и максимальные возможности для развития и творчества.", "60%",R.drawable.det_g2));
    }
}
