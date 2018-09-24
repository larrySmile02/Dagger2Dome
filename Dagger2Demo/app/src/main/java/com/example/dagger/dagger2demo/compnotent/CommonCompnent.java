package com.example.dagger.dagger2demo.compnotent;

import com.example.dagger.dagger2demo.activity.LoginActivity;
import com.example.dagger.dagger2demo.module.CommonModule;
import com.example.dagger.dagger2demo.scope.ActivityScope;

import dagger.Component;
import dagger.Module;

@ActivityScope
@Component (modules = CommonModule.class)
public interface CommonCompnent
{
    void Inject(LoginActivity activity);
}
