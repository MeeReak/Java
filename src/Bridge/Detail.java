package Bridge;

public class Detail implements infoGenerate {


    /**
     * @param amount
     * @param effection
     * @param texts
     */
    @Override
    public void produceTexts(double amount, Effection effection, String[] texts) {
        double value = effection.isPercentage ? amount * effection.value : effection.value;
        texts[0] = String.format("Detailed: Amount: %.2f, Value: %.2f, Percentage: %s",
                amount, value, effection.isPercentage ? "Yes" : "No");
    }
}
