public class Samovar<T,V,K> {

    T topor;
    V vodka;
    K kartoha;

    public Samovar() {

    }

    public T getTopor() {
        return topor;
    }

    public void setTopor(T topor) {
        this.topor = topor;
    }

    public V getVodka() {
        return vodka;
    }

    public void setVodka(V vodka) {
        this.vodka = vodka;
    }

    public K getKartoha() {
        return kartoha;
    }

    public void setKartoha(K kartoha) {
        this.kartoha = kartoha;
    }


    public Samovar(T topor, V vodka, K kartoha) {
        this.topor = topor;
        this.vodka = vodka;
        this.kartoha = kartoha;
    }

    @Override
    public String toString() {
        return "Samovar содержит вещи: " +
                "   topor, " + topor +
                "   vodka,   " + vodka +
                "   и kartoha   " + kartoha +
                '}';
    }
}