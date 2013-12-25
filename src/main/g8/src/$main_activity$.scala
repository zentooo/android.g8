package $package$

class $main_activity$ extends SActivity {
    onCreate {
        this.setContentView(R.layout.main)
        findView(TR.textview).setText("hello, world!")
    }
}
