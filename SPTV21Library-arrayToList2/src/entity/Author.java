

package entity;

import java.io.Serializable;


public class Author implements Serializable{
    private int summa; 

    public Author() {
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    @Override
    public String toString() {
        return "Oborot{" + "summa=" + summa + '}';
    }


}
