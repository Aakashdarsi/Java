interface animal{
     void willWalk();
}
class example implements animal {
    public void willWalk(){
        System.out.println("Will walk");
    }
}
class interfaceEx {
    public static void main(String[] args) {
        example e = new example();
        e.willWalk();
    }
}