
public class Client {
    public static void main (String [] args){
        System.out.println("Bonjour le monde");

        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;

        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();

        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();

        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();

        produit = fabriqueproduit.createProduit(FabriqueProduit.typeD);
        produit.methodeproduit();
        
    }
    
}
