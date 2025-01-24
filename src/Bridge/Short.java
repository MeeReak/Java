package Bridge;

public class Short implements infoGenerate {
    /**
     * @param amount
     * @param effection
     * @param texts
     */
    @Override
    public void produceTexts(double amount, Effection effection, String[] texts) {
        double value = effection.isPercentage ? amount * effection.value : effection.value;
        texts[0] = String.format("Amount: %.2f, Value: %.2f", amount, value);
    }
}
