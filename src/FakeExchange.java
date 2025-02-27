public class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        return 7.2f;
    }
}

