package shortcuts.android.com.mvp_demo.example.mvp;

import com.android.basecomment.BasePresenter;
import com.android.basecomment.BaseView;

public class ThirdConstract {
    public interface View extends BaseView {
          void showNumber(String s);
    }

    public interface Presenter extends BasePresenter<ThirdConstract.View> {
        void setNumber(String number);
    }

    public interface requestCallBack {
        void requestSuccessed(String success);

        void requestFailed(String fail);
    }
}
