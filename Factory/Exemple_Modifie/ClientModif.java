package Factory.Exemple_Modifie;

public class ClientModif{

public static void main (String [] args){
        System.out.println("........Methode2: Abstract factory.......");

        ProduitFactory produitFactoryA = new ProduitFactoryA();
        ProduitFactory produitFactoryB = new ProduitFactoryB();
        ProduitFactory produitFactoryC = new ProduitFactoryC();
        ProduitFactory produitFactoryD = new ProduitFactoryD();
        ProduitModif produit = null;

        produit = produitFactoryA.getProduit();
        produit.methodeProduit();

         produit = produitFactoryB.getProduit();
        produit.methodeProduit();

         produit = produitFactoryC.getProduit();
        produit.methodeProduit();
        
         produit = produitFactoryD.getProduit();
        produit.methodeProduit();
        
        
        

    }
}
    