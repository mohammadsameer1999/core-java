package corejava.sameer.abstracts;
@FunctionalInterface
public interface User {
    public void findByAge();

    default Double findByEmail() {
        return null;
    }

    static void  finByName(){};

}


 class  Addreess implements User {

     @Override
     public void findByAge() {

     }

     @Override
     public Double findByEmail() {
         return User.super.findByEmail();
     }

 }