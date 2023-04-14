public class Animais {
    public class Animal {
        public void emitirSom() {
            System.out.println("Som do Animal");
        }
    }
    public class Cachorro extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("AuAu");
        }
    }
    public class Gato extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("Miau");
        }
    }
}
