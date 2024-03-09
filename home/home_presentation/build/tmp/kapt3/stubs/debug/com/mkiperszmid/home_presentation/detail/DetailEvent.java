package com.mkiperszmid.home_presentation.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/mkiperszmid/home_presentation/detail/DetailEvent;", "", "FrequencyChange", "HabitSave", "NameChange", "ReminderChange", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent$FrequencyChange;", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent$HabitSave;", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent$NameChange;", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent$ReminderChange;", "home_presentation_debug"})
public abstract interface DetailEvent {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mkiperszmid/home_presentation/detail/DetailEvent$ReminderChange;", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent;", "time", "Ljava/time/LocalTime;", "(Ljava/time/LocalTime;)V", "getTime", "()Ljava/time/LocalTime;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "home_presentation_debug"})
    public static final class ReminderChange implements com.mkiperszmid.home_presentation.detail.DetailEvent {
        @org.jetbrains.annotations.NotNull
        private final java.time.LocalTime time = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.mkiperszmid.home_presentation.detail.DetailEvent.ReminderChange copy(@org.jetbrains.annotations.NotNull
        java.time.LocalTime time) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ReminderChange(@org.jetbrains.annotations.NotNull
        java.time.LocalTime time) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.time.LocalTime component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.time.LocalTime getTime() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mkiperszmid/home_presentation/detail/DetailEvent$FrequencyChange;", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent;", "dayOfWeek", "Ljava/time/DayOfWeek;", "(Ljava/time/DayOfWeek;)V", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "home_presentation_debug"})
    public static final class FrequencyChange implements com.mkiperszmid.home_presentation.detail.DetailEvent {
        @org.jetbrains.annotations.NotNull
        private final java.time.DayOfWeek dayOfWeek = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.mkiperszmid.home_presentation.detail.DetailEvent.FrequencyChange copy(@org.jetbrains.annotations.NotNull
        java.time.DayOfWeek dayOfWeek) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public FrequencyChange(@org.jetbrains.annotations.NotNull
        java.time.DayOfWeek dayOfWeek) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.time.DayOfWeek component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.time.DayOfWeek getDayOfWeek() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/mkiperszmid/home_presentation/detail/DetailEvent$NameChange;", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "home_presentation_debug"})
    public static final class NameChange implements com.mkiperszmid.home_presentation.detail.DetailEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.mkiperszmid.home_presentation.detail.DetailEvent.NameChange copy(@org.jetbrains.annotations.NotNull
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public NameChange(@org.jetbrains.annotations.NotNull
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mkiperszmid/home_presentation/detail/DetailEvent$HabitSave;", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent;", "()V", "home_presentation_debug"})
    public static final class HabitSave implements com.mkiperszmid.home_presentation.detail.DetailEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.mkiperszmid.home_presentation.detail.DetailEvent.HabitSave INSTANCE = null;
        
        private HabitSave() {
            super();
        }
    }
}