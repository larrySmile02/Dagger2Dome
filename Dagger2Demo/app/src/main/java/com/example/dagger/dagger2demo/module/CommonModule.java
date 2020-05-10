package com.example.dagger.dagger2demo.module;

import android.content.Context;

import com.example.dagger.dagger2demo.model.ICommonView;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule
{

    private ICommonView iView;

    public CommonModule(ICommonView iView){
        this.iView = iView;
    }


    @Provides
    public ICommonView provideIcommonView(){
        return this.iView;
    }

}
