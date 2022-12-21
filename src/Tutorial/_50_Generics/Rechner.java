package Tutorial._50_Generics;

public interface Rechner<U, V extends Koerper<? super Double,? super Double>>
{
    public U rechne(V v);
}
