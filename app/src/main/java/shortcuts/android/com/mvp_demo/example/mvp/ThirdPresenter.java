package shortcuts.android.com.mvp_demo.example.mvp;

import android.util.Log;

import com.android.basecomment.BasePresenterImp;

public class ThirdPresenter extends BasePresenterImp<ThirdConstract.View> implements ThirdConstract.Presenter {


    @Override
    public void setNumber(String number) {
        if (view==null){
            Log.d("hhj", "setNumber: "+number);

        }else {
            view.showNumber(number);
        }

    }
}
