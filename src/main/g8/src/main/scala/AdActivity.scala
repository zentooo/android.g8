package $package$

import android.view.View

trait AdActivity extends TypedActivity {
    private lazy val nendView = this.findView(TR.nend)

    def reloadAd = {
        nendView.setVisibility(View.VISIBLE)
        nendView.resume
    }
}
