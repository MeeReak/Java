package Bridge;

abstract class Effection {
    protected double value;
    protected boolean isPercentage;
    protected infoGenerate informationProducer;

    public Effection(double value, boolean isPercentage, infoGenerate informationProducer) {
        this.value = value;
        this.isPercentage = isPercentage;
        this.informationProducer = informationProducer;
    }

    public abstract String getText(double amount);
}
