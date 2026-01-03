package NewPackage;
import JavaPrograms.PublicPrivateProtec;
public class OtherChild extends PublicPrivateProtec{
    public void accessMethods(){
        publicMethod();
        protectedMethod(); //private not allowed
    }

}
