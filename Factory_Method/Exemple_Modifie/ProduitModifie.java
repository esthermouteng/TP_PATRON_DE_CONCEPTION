package Factory_Method.Exemple_Modifie;

public abstract class ProduitModifie {
    public abstract void methodeProduit();

}

    class ProduitA extends ProduitModifie {
       public  ProduitA(){
       }
        
         public void methodeProduit (){
            System.out.println("Je suis un produit de typeA");
            System.out.println("ProduitA.methoProduit()");
         }
       }

        class ProduitB extends ProduitModifie{
         public void methodeProduit(){
              System.out.println("Je suis un produit de typeB");
            System.out.println("ProduitB.methoProduit()");
         }
       }

        class ProduitC extends ProduitModifie{
         public void methodeProduit(){
              System.out.println("Je suis un produit de typeC");
            System.out.println("ProduitC.methoProduit()");
         }
        }

          class ProduitD extends ProduitModifie{
         public void methodeProduit(){
              System.out.println("Je suis un produit de typeD");
            System.out.println("ProduitD.methoProduit()");
         }
    
}
