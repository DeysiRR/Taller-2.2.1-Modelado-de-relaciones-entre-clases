public class Main {
    public static void main(String[] args) {
        ElementosBioticos bioticos = new ElementosBioticos("Animal:Perro", "Planta:Rosa", "Bacteria: Bacteria", "Hongo: Azul", "Alga: Marina");
        ElementosAbioticos abioticos = new ElementosAbioticos(1, 2, "Agua");
        AreaGeografica area = new AreaGeografica("Area");
        Ecosistema ecosistema = new Ecosistema(bioticos.toString(), abioticos.toString(), area.toString());
        System.out.println("Elementos de un ecosistema: ");
        System.out.println(ecosistema);

    }


}