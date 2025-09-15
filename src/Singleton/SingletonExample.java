package Singleton;

public class SingletonExample {
    public static SingletonExample singletonExample=null;

    private SingletonExample(){

    }
    public synchronized static SingletonExample getInstance(){
        if(singletonExample==null){
            singletonExample=new SingletonExample();
        }
        return singletonExample;
    }
}
