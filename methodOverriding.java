class Shape {
     void shape(){
        System.out.println("can't tell the shape");
    }
}
class Triangle extends  Shape {
    @Override
    void shape(){
        super.shape();
        System.out.println("Triangle has 3 sides");
    }
}


class methodOverriding {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.shape();
    }
}
