package com.example.dagger.dagger2demo.compnotent;

import com.example.dagger.dagger2demo.activity.LoginActivity;
import com.example.dagger.dagger2demo.module.CommonModule;

import dagger.Component;

@Component (modules = CommonModule.class)
public interface CommonCompnent
{
    void Inject(LoginActivity activity);
}
