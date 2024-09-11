public interface Order
{
    public <T extends Order> boolean greaterThan(T a);
}
