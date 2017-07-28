import Algorithms.*;

/**
 * Created by jake on 21.07.2017.
 */
public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()) {
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
            case "rokprzestepny":
                return new RokPrzestepny();
            case "silnia":
                return new Silnia();
            case "sumasilni":
                return new SumaSilni();
            case "silniadziesiatkijednosci":
                return new SilniaDziesiatkiJednosci();
            case "ciagfibonacciego":
                return new CiagFibonacciego();
            case "szyfrcezara":
                return new SzyfrCezara();
            case "algorytmbabelkowy":
                return new AlgorytmBabelkowy();
            case "sortowaniepktow2":
                return new SortowaniePuktow2();
            case "sortowaniepunktow":
                return new SortowaniePunktow();
            case "sortowanieprzezzlicznie":
                return new SortowaniePrzezZliczanie();
            case "algorytmkzryzowka":
                return new AlgorytmKzryzowka();
            case "generatorplanszywarcaby":
                return new GeneratorPlanszyWarcaby();
            case "najwiekszywspolnydzielnik":
                return new NajwiekszyWspolnyDzielnik();
            case "zadanie3tablice":
                return new Zadanie3Tablice();
            case "interpretacjatekstu":
                return new InterpretacjaTekstu();

            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
