package com.mkiperszmid.home_presentation.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/mkiperszmid/home_presentation/home/HomeEvent;", "", "ChangeDate", "CompleteHabit", "Lcom/mkiperszmid/home_presentation/home/HomeEvent$ChangeDate;", "Lcom/mkiperszmid/home_presentation/home/HomeEvent$CompleteHabit;", "home_presentation_debug"})
public abstract interface HomeEvent {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mkiperszmid/home_presentation/home/HomeEvent$ChangeDate;", "Lcom/mkiperszmid/home_presentation/home/HomeEvent;", "date", "Ljava/time/ZonedDateTime;", "(Ljava/time/ZonedDateTime;)V", "getDate", "()Ljava/time/ZonedDateTime;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "home_presentation_debug"})
    public static final class ChangeDate implements com.mkiperszmid.home_presentation.home.HomeEvent {
        @org.jetbrains.annotations.NotNull
        private final java.time.ZonedDateTime date = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.mkiperszmid.home_presentation.home.HomeEvent.ChangeDate copy(@org.jetbrains.annotations.NotNull
        java.time.ZonedDateTime date) {
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
        
        public ChangeDate(@org.jetbrains.annotations.NotNull
        java.time.ZonedDateTime date) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.time.ZonedDateTime component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.time.ZonedDateTime getDate() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mkiperszmid/home_presentation/home/HomeEvent$CompleteHabit;", "Lcom/mkiperszmid/home_presentation/home/HomeEvent;", "habit", "Lcom/mkiperszmid/home_domain/models/Habit;", "(Lcom/mkiperszmid/home_domain/models/Habit;)V", "getHabit", "()Lcom/mkiperszmid/home_domain/models/Habit;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "home_presentation_debug"})
    public static final class CompleteHabit implements com.mkiperszmid.home_presentation.home.HomeEvent {
        @org.jetbrains.annotations.NotNull
        private final com.mkiperszmid.home_domain.models.Habit habit = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.mkiperszmid.home_presentation.home.HomeEvent.CompleteHabit copy(@org.jetbrains.annotations.NotNull
        com.mkiperszmid.home_domain.models.Habit habit) {
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
        
        public CompleteHabit(@org.jetbrains.annotations.NotNull
        com.mkiperszmid.home_domain.models.Habit habit) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.mkiperszmid.home_domain.models.Habit component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.mkiperszmid.home_domain.models.Habit getHabit() {
            return null;
        }
    }
}