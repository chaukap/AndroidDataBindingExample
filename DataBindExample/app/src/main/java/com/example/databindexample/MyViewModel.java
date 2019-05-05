package com.example.databindexample;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    // These are the variables we can actually change. MutableLiveData has a set method,
    // LiveData does not. That is why we work with the mutable versions but bind the
    // immutable versions.
    private MutableLiveData<String> _name = new MutableLiveData<>();
    private MutableLiveData<Integer> _count = new MutableLiveData<>();

    // These variables are bound to the UI elements. The LiveData variables will update
    // the UI every time they are changed.
    public LiveData<Integer> count = _count; // Studio is telling me this is unused which is incorrect.
    public LiveData<String> name = _name;

    // This is not live data, but we can still bind it. However, if we change it the UI will
    // not update.
    public String altText = "Clicky Click Click";

    public MyViewModel(){
        super();
        _name.setValue("Click!");
        _count.setValue(0);
    }

    public void onClick(){
        _count.setValue(_count.getValue() + 1);
        if(_count.getValue() < 4){
            _name.setValue("Keep Going!");
        } else if(_count.getValue() < 10){
            _name.setValue("Why stop now?");
        } else {
            _name.setValue("OK chill...");
        }
        // I'll change altText here to prove the UI doesn't update.
        altText = "Different String";
    }

}
