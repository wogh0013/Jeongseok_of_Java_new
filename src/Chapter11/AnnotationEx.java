package Chapter11;

public class AnnotationEx {
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;
        System.out.println(nc.getOldField());
    }
}

class NewClass{
    int newField;
    int getNewField(){
        return newField;
    }
    @Deprecated
    int oldField;

    @Deprecated
    int getOldField(){
        return oldField;
    }
}
