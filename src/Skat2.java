public class Skat2{
    public static void main(String[] args){
        int indkomst = 120000;
        double ambi, pension, bundskat, pensionsfradrag;


        pensionsfradrag = 33400;
        ambi = indkomst * 8.0 / 100.0;
        pension = indkomst * 1.0 / 100.0;
        bundskat = (indkomst - (ambi + pension + pensionsfradrag));

        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.println("Bundskat: ");
        System.out.println(bundskat);
    }
}
