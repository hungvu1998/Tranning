package com.example.tranning.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/tranning/di/AppModule;", "", "()V", "provideBreedDao", "Lcom/example/tranning/data/local/BreedDao;", "database", "Lcom/example/tranning/data/local/Database;", "provideDatabase", "application", "Landroid/app/Application;", "provideDatabase$app_debug", "provideRetrofitInstance", "Lretrofit2/Retrofit;", "provideRetrofitInstance$app_debug", "provideUtils", "Lcom/example/tranning/util/Utils;", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.tranning.data.local.Database provideDatabase$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.tranning.data.local.BreedDao provideBreedDao(@org.jetbrains.annotations.NotNull()
    com.example.tranning.data.local.Database database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.tranning.util.Utils provideUtils(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofitInstance$app_debug() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}