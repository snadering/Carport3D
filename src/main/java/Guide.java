public class Guide {
    public static void walkthrough(int raftersAmount){
        System.out.println("#############################");
        System.out.println("Materialerne til din carport er nu gemt i 'OpenSCAD'-mappen.");
        System.out.println("");
        System.out.println("1) Åbn filerne i OpenSCAD og gem dem som .STL");
        System.out.println("2) Åbn .STL-filerne i Cura eller en hver anden applikation til 3D-print");
        System.out.println("3) Dupliker dine dele så du har 4 stolper, 2 remme og " + (Math.max(raftersAmount, 2)) + " spær.");
        System.out.println("4) Tilpas størrelsen på delene så de passer til printerens størrelse.");
        System.out.println("5) Print dine dele");
        System.out.println("6) Saml din carport");
        System.out.println("");
        System.out.println("#############################");
    }
}
