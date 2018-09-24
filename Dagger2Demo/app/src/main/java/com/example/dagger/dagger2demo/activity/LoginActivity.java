package com.example.dagger.dagger2demo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dagger.dagger2demo.R;
import com.example.dagger.dagger2demo.compnotent.CommonCompnent;
import com.example.dagger.dagger2demo.compnotent.DaggerCommonCompnent;
import com.example.dagger.dagger2demo.model.ICommonView;
import com.example.dagger.dagger2demo.model.User;
import com.example.dagger.dagger2demo.module.CommonModule;
import com.example.dagger.dagger2demo.pretenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements ICommonView
{


    @BindView(R.id.btn_login)
    Button btn;
    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        DaggerCommonCompnent.
                builder().
                commonModule(new CommonModule(this)).
                build().
                Inject(this);

    }


    @OnClick(R.id.btn_login) void login(){

        presenter.login(new User());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public Context getContext() {
        return this;
    }
}
