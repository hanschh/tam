package com.example.loginfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import javax.security.auth.callback.Callback;

public class MainActivity extends AppCompatActivity implements CallbackFragment {
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragment();
    }
    public void addFragment(){
        LoginFragment fragment = new LoginFragment();
        fragment.setCallbackFragment(this);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }
    public void replaceFragment() {
         fragment = new RegisterFragment();
         fragmentManager = getSupportFragmentManager();
         fragmentTransaction = fragmentManager.beginTransaction();
         fragmentTransaction.addToBackStack(null);
         fragmentTransaction.replace(R.id.fragment_container, fragment);
         fragmentTransaction.commit();
     }

    @Override
    public void changeFragment() {
        replaceFragment();
    }
}