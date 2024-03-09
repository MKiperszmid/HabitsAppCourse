package com.mkiperszmid.home_data.local.typeconverter;

import java.lang.System;

@androidx.room.ProvidedTypeConverter
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u0002J\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/mkiperszmid/home_data/local/typeconverter/HomeTypeConverter;", "", "()V", "fromFrequency", "", "days", "", "", "fromcompletedDates", "", "joinIntoString", "input", "splitToLongList", "toFrequency", "value", "tocompletedDates", "home_data_debug"})
public final class HomeTypeConverter {
    
    public HomeTypeConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String fromFrequency(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> days) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.util.List<java.lang.Integer> toFrequency(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String fromcompletedDates(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> days) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.util.List<java.lang.Long> tocompletedDates(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    private final java.util.List<java.lang.Long> splitToLongList(java.lang.String input) {
        return null;
    }
    
    private final java.lang.String joinIntoString(java.util.List<java.lang.Long> input) {
        return null;
    }
}