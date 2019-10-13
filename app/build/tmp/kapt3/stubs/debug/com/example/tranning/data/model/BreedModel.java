package com.example.tranning.data.model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/example/tranning/data/model/BreedModel;", "Ljava/io/Serializable;", "id", "", "breedName", "", "img", "", "(ILjava/lang/String;[B)V", "getBreedName", "()Ljava/lang/String;", "setBreedName", "(Ljava/lang/String;)V", "getId", "()I", "getImg", "()[B", "setImg", "([B)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class BreedModel implements java.io.Serializable {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "breedName")
    private java.lang.String breedName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(typeAffinity = androidx.room.ColumnInfo.BLOB)
    private byte[] img;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBreedName() {
        return null;
    }
    
    public final void setBreedName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getImg() {
        return null;
    }
    
    public final void setImg(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    public BreedModel(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String breedName, @org.jetbrains.annotations.Nullable()
    byte[] img) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tranning.data.model.BreedModel copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String breedName, @org.jetbrains.annotations.Nullable()
    byte[] img) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}