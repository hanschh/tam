package com.example.loginfragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterFragment extends Fragment {
       EditText edtUsername, edtPassword;
       Button btnRegister;

       @Nullable
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
           View view = inflater.inflate(R.layout.fragment_register, container, false);
         edtUsername = view.findViewById(R.id.edt_username_reg);
         edtPassword = view.findViewById(R.id.edt_password_reg);

         btnRegister = view.findViewById(R.id.btn_register);

         btnRegister.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(getContext(), "Dosen Telah Login", Toast.LENGTH_SHORT).show();
               }
         });
         return view;
     }
 }