package p0_material;



public interface Mainaderia {
    
    // afegeix una criatura. Excepció si ja hi ha una criatura igual
    public void matricular (Criatura c) throws IllegalArgumentException;
    
    // desmatricula la criatura de nom donat. Retorna la criatura que 
    // es desmatricula. Si no n'hi ha cap amb aquell nom retorna null
    public Criatura desMatricular(String nom);
    
    // Retorna la criatura que té el nom especificat. Retorna null si no
    // n'hi ha cap
    public Criatura buscar(String nom);
    
    // retorna el número de criatures matriculades
    public int numCriatures();
    
    // retorna el número de criatures del sexe especificat com a paràmetre
    public int quantsSexe (int sexe);
    
    // retorna la i-èssima criatura. Excepció si el paràmetre està fora
    // dels límits actuals
    public Criatura get(int i) throws IndexOutOfBoundsException;
        
}
