package fundamentals;
public class SmartTV {

    public static void main(String[] args) {
        SmartTv minhaTv = new SmartTv();

        System.out.println(minhaTv.ligada);
        System.out.println(minhaTv.canal);
        System.out.println(minhaTv.volume);

        minhaTv.ligaDesliga();
        minhaTv.mudarCanal(199);
        minhaTv.diminuirVolume();
        minhaTv.aumentarVolume();
    }

    public static class SmartTv {
        boolean ligada = false;
        int canal = 12;
        int volume = 10;

        public void ligaDesliga() {
            if (this.ligada) {
                this.ligada = false;
                System.out.println("Desligou a TV!");
            } else {
                this.ligada = true;
                System.out.println("Ligou a TV!");
            }
        }

        public void diminuirVolume() {
            this.volume--;
            System.out.println("O Volume agora é: " + this.volume);
        }

        public void aumentarVolume() {
            this.volume++;
            System.out.println("O Volume agora é: " + this.volume);
        }

        public void mudarCanalMais() {
            this.canal++;
            System.out.println("Está agora no canal: " + this.canal);
        }

        public void mudarCanalMenos() {
            this.canal--;
            System.out.println("Está agora no canal: " + this.canal);
        }

        public void mudarCanal(int canal) {
            this.canal = canal;
            System.out.println("Está agora no canal: " + this.canal);
        }

    }
}
