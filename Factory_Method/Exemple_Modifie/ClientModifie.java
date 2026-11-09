package Factory_Method.Exemple_Modifie;

public class ClientModifie {
    public static void main (String [] args){
        System.out.println("Bojour le monde");

        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        ProduitModifie produit = null;

        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        produit.methodeProduit();

        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        produit.methodeProduit();

        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        produit.methodeProduit();

         produit = fabriqueproduit.createProduit(FabriqueProduit.typeD);
        produit.methodeProduit();

        
    }

    
}
