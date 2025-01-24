package Bridge;

public class Discount extends Effection {

    public Discount(double value, boolean isPercentage, infoGenerate informationProducer) {
        super(value, isPercentage, informationProducer);
    }

    /**
     * @param amount
     * @return
     */
    @Override
    public String getText(double amount) {
        String[] texts = new String[1];
        informationProducer.produceTexts(amount, this, texts);
        return "Discount: " + texts[0];
    }
}
