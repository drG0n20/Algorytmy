import Algorithms.*;

/**
 * Created by jake on 21.07.2017.
 */
public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()){
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            case "sumowanieliczbnaturalnych":
                return new SumowanieLiczbNaturalnych();
            case "sumaliczb":
                return new SumaLiczb();
            case "banknoty":
                return new BanknotyZadanie2();

            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
