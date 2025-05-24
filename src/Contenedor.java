import java.util.Arrays;

public class Contenedor<T> {

    private T[] elementos;
    private int size = 0;

    public Contenedor(int capacidad) {
        elementos = (T[]) new Object[capacidad];
    }

    public void agregar(T elemento) {
        if (size >= elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length + 1); // O duplicar capacidad
        }
        elementos[size++] = elemento;
    }

    public T obtener(int indice) {
        return elementos[indice];
    }

    public void quitar(int indice) {
        if (indice< 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        @SuppressWarnings("unchecked")
        T[] nuevo = (T[]) new Object[size - 1];

        for (int i = 0, j = 0; i < size; i++) {
            if (i != indice) {
                nuevo[j++] = elementos[i];
            }
        }
        elementos = nuevo;
        size--;
    }

    public void verificar(int indice) {
        if (elementos[indice] == null) {
            System.out.println("indice vacio");
        } else {
            System.out.println("indice ocupado");
            System.out.println("el elemento es: " + elementos[indice]);
        }
    }

    public void visualizar() {
        for (int i = 0; i < size; i++) {
            System.out.println(elementos[i]);
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Contenedor<?> otro = (Contenedor<?>) obj;
        return Arrays.equals(this.elementos, otro.elementos);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elementos);
    }
}

