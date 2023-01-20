interface Value {
    public int value();
}

class MyInt implements Value {
    private int val;

    public MyInt(int val) {
            this.val = val;
    }

    @Override
    public int value() {
            return val;
    }
}


