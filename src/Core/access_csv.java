package Core;

public interface access_csv<Type> {
    public Type read_csv(int id);
    public int edit_csv(Type T);
    public int append_csv(Type T);
}
