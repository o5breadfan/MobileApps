package com.bignerdranch.android.criminalintent;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/bignerdranch/android/criminalintent/DatePickerFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Listener", "app_debug"})
public final class DatePickerFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.bignerdranch.android.criminalintent.DatePickerFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public DatePickerFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/bignerdranch/android/criminalintent/DatePickerFragment$Listener;", "", "onDateSelected", "", "date", "Ljava/util/Date;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onDateSelected(@org.jetbrains.annotations.NotNull()
        java.util.Date date);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/bignerdranch/android/criminalintent/DatePickerFragment$Companion;", "", "()V", "newInstance", "Lcom/bignerdranch/android/criminalintent/DatePickerFragment;", "date", "Ljava/util/Date;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bignerdranch.android.criminalintent.DatePickerFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.util.Date date) {
            return null;
        }
    }
}