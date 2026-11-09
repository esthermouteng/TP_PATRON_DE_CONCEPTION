package Factory.Exemple_Modifie;

public abstract class ProduitModif {
    public abstract void methodeProduit();

    public static class ProduitA extends ProduitModif {
       public  ProduitA(){
       }
        
         public void methodeProduit (){
            System.out.println("Je suis un produit de typeA");
            System.out.println("ProduitA.methoProduit()");
         }
       }

        public static class ProduitB extends ProduitModif{
         public void methodeProduit(){
              System.out.println("Je suis un produit de typeB");
            System.out.println("ProduitB.methoProduit()");
         }
       }

        public static class ProduitC extends ProduitModif{
         public void methodeProduit(){
              System.out.println("Je suis un produit de typeC");
            System.out.println("ProduitC.methoProduit()");
         }
       }

        public static class ProduitD extends ProduitModif{
         public void methodeProduit(){
              System.out.println("Je suis un produit de typeD");
            System.out.println("ProduitD.methoProduit()");
         }
       }
}
