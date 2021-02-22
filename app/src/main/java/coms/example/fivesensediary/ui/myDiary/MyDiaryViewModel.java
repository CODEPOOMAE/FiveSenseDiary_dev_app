package coms.example.fivesensediary.ui.myDiary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyDiaryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyDiaryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is 나의 일기장 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}