package coms.example.fivesensediary.ui.sharedDiary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedDiaryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SharedDiaryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is 공유일기장 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}