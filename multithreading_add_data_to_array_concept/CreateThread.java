import java.lang.annotation.Target;


public class CreateThread implements Runnable

{

static int threadNumber=0;

Thread t;

IncrementCounterVariable target;

CreateThread(IncrementCounterVariable instanceReference)

{

target=instanceReference;

threadNumber++;

String name="Thread Number #"+threadNumber;

t=new Thread(this,name);

System.out.println(name+" started.");

t.start();

}

public void run()

{

target.incrementCounter();

System.out.println(this.t.getName()+" exiting.");

}

}