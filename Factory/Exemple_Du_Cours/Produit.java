package Factory.Exemple_Du_Cours;

public abstract class Produit {
    public abstract void methodeProduit();

    public static class ProduitA extends Produit {
       public  ProduitA(){
       }
        
         public void methodeProduit (){
            System.out.println("Je suis un produit de typeA");
            System.out.println("ProduitA.methoProduit()");
         }
       }

        public static class ProduitB extends Produit{
         public void methodeProduit(){
              System.out.println("Je suis un produit de typeB");
            System.out.println("ProduitB.methoProduit()");
         }
       }

        public static class ProduitC extends Produit{
         public void methodeProduit(){
              System.out.println("Je suis un produit de typeC");
            System.out.println("ProduitC.methoProduit()");
         }
       }
    
}
