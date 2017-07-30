package Algorithms;


public class InterpretacjaTekstu extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "interpretacjatekstu";
    }


    @Override

    public void runAlgorithm(String[] input) {

        String ZenekAnswers = input[1];
        String BogdanAnswers = input[2];
        String KubaAnswers = input[3];

        if (!(KubaAnswers.length() == ZenekAnswers.length()) &&
                !(KubaAnswers.length() == BogdanAnswers.length())) {
            System.out.println("Długości odpowiedzi się nie zgadzają!");
//            if ((KubaAnswers.length(),ZenekAnswers.length()),BogdanAnswers.length() > 20 )
//            System.out.println("Za dlugie, kurde!");
            return;
        }

        char[] ZenekCharAnswers = ZenekAnswers.toCharArray();
        char[] BogdanCharAnswers = BogdanAnswers.toCharArray();
        char[] KubaCharAnswers = KubaAnswers.toCharArray();

        int licznikOdpowiedzi = 0;

        for (int i = 0; i < KubaAnswers.length(); i++) {
            if (KubaCharAnswers != BogdanCharAnswers)
                licznikOdpowiedzi++;

            if (KubaCharAnswers != ZenekCharAnswers)
                licznikOdpowiedzi++;
        }
        System.out.printf("%d ", licznikOdpowiedzi);
    }
}
