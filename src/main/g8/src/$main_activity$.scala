package $package$

class $main_activity$ extends BaseActivity {
    onCreate {
        this.setContentView(R.layout.main)
        findView(TR.textview).setText("Hello, world!")
    }
}
