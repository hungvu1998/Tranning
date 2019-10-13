package com.example.tranning.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$J\u001c\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020$0)J\u0014\u0010*\u001a\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020$0)J\u0006\u0010,\u001a\u00020&J\u0006\u0010-\u001a\u00020&R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R0\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u0013j\b\u0012\u0004\u0012\u00020\r`\u00140\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006."}, d2 = {"Lcom/example/tranning/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "main2Api", "Lcom/example/tranning/network/MainApi;", "utils", "Lcom/example/tranning/util/Utils;", "breedDao", "Lcom/example/tranning/data/local/BreedDao;", "(Lcom/example/tranning/network/MainApi;Lcom/example/tranning/util/Utils;Lcom/example/tranning/data/local/BreedDao;)V", "getBreedDao", "()Lcom/example/tranning/data/local/BreedDao;", "dogs", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/tranning/data/model/BreedModel;", "getDogs", "()Landroidx/lifecycle/MutableLiveData;", "setDogs", "(Landroidx/lifecycle/MutableLiveData;)V", "dogsList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDogsList", "setDogsList", "i", "", "getI", "()I", "setI", "(I)V", "getMain2Api", "()Lcom/example/tranning/network/MainApi;", "getUtils", "()Lcom/example/tranning/util/Utils;", "download_img", "Landroid/graphics/Bitmap;", "url", "", "getDetailBreed", "", "name", "listImg", "", "getListImglBreed", "listName", "getObjectBreedRoot", "observeObject", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tranning.data.model.BreedModel> dogs;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.tranning.data.model.BreedModel>> dogsList;
    private int i;
    @org.jetbrains.annotations.NotNull()
    private final com.example.tranning.network.MainApi main2Api = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.tranning.util.Utils utils = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.tranning.data.local.BreedDao breedDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tranning.data.model.BreedModel> getDogs() {
        return null;
    }
    
    public final void setDogs(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tranning.data.model.BreedModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.tranning.data.model.BreedModel>> getDogsList() {
        return null;
    }
    
    public final void setDogsList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.tranning.data.model.BreedModel>> p0) {
    }
    
    public final void observeObject() {
    }
    
    public final void getObjectBreedRoot() {
    }
    
    public final void getListImglBreed(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listName) {
    }
    
    public final int getI() {
        return 0;
    }
    
    public final void setI(int p0) {
    }
    
    public final void getDetailBreed(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listImg) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap download_img(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tranning.network.MainApi getMain2Api() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tranning.util.Utils getUtils() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tranning.data.local.BreedDao getBreedDao() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tranning.network.MainApi main2Api, @org.jetbrains.annotations.NotNull()
    com.example.tranning.util.Utils utils, @org.jetbrains.annotations.NotNull()
    com.example.tranning.data.local.BreedDao breedDao) {
        super();
    }
}