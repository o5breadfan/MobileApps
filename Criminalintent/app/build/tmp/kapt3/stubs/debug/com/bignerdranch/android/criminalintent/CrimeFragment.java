package com.bignerdranch.android.criminalintent;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010#\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/bignerdranch/android/criminalintent/CrimeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bignerdranch/android/criminalintent/DatePickerFragment$Listener;", "()V", "crime", "Lcom/bignerdranch/android/criminalintent/Crime;", "crimeDetailViewModel", "Lcom/bignerdranch/android/criminalintent/CrimeDetailViewModel;", "getCrimeDetailViewModel", "()Lcom/bignerdranch/android/criminalintent/CrimeDetailViewModel;", "crimeDetailViewModel$delegate", "Lkotlin/Lazy;", "dateButton", "Landroid/widget/Button;", "solvedCheckBox", "Landroid/widget/CheckBox;", "titleText", "Landroid/widget/EditText;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDateSelected", "date", "Ljava/util/Date;", "onStart", "onStop", "onViewCreated", "view", "updateUI", "Companion", "app_debug"})
public final class CrimeFragment extends androidx.fragment.app.Fragment implements com.bignerdranch.android.criminalintent.DatePickerFragment.Listener {
    private com.bignerdranch.android.criminalintent.Crime crime;
    private android.widget.EditText titleText;
    private android.widget.Button dateButton;
    private android.widget.CheckBox solvedCheckBox;
    private final kotlin.Lazy crimeDetailViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.bignerdranch.android.criminalintent.CrimeFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public CrimeFragment() {
        super();
    }
    
    private final com.bignerdranch.android.criminalintent.CrimeDetailViewModel getCrimeDetailViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDateSelected(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
    }
    
    private final void updateUI() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/bignerdranch/android/criminalintent/CrimeFragment$Companion;", "", "()V", "newArguments", "Landroid/os/Bundle;", "crimeId", "Ljava/util/UUID;", "newInstance", "Lcom/bignerdranch/android/criminalintent/CrimeFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bignerdranch.android.criminalintent.CrimeFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.util.UUID crimeId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.VisibleForTesting()
        public final android.os.Bundle newArguments(@org.jetbrains.annotations.NotNull()
        java.util.UUID crimeId) {
            return null;
        }
    }
}