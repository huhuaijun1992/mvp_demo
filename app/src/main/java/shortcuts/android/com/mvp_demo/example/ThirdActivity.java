package shortcuts.android.com.mvp_demo.example;

import android.widget.TextView;

import com.android.basecomment.BaseActivity;

import shortcuts.android.com.mvp_demo.R;
import shortcuts.android.com.mvp_demo.example.mvp.ThirdConstract;
import shortcuts.android.com.mvp_demo.example.mvp.ThirdPresenter;

public class ThirdActivity extends BaseActivity<ThirdConstract.Presenter> implements ThirdConstract.View {
    private TextView textView;

    @Override
    public void initData() {
        presenter.setNumber("11111");

    }

    @Override
    public void initView() {
        textView = findViewById(R.id.text);

    }

    @Override
    public int getContentViewId() {
        return R.layout.third_activity;
    }

    @Override
    public void showNumber(String s) {
        textView.setText(s);
    }

    @Override
    public void setPresenter() {

        presenter = new ThirdPresenter();
    }
}
