package coms.example.fivesensediary.ui.diaryMap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DiaryMapViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DiaryMapViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is 일기지도 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}