public class Dancer extends Performer{
    private int shoeSize;

    public Dancer (String name, int age, Agent agent, int shoeSize)
    {
        super(name, age, agent);
        this.shoeSize = shoeSize;
    }

    @Override
    public String getName()
    {
        return super.getName() + " is a dancer";
    }

    public int getShoeSize()
    {
        return shoeSize;
    }

    public void pirouette(int spins)
    {
        System.out.println("I am spinning " + spins + " times!");
    }

    @Override
    public void rehearse()
    {
        pirouette(3);
        super.rehearse();
    }

    public void perform(boolean warmup)
    {
        if (warmup)
        {
            rehearse();
        }
        super.perform();
    }

    @Override
    public void callAgent()
    {
        super.callAgent();
        System.out.println("My shoes don't fit! Please pick me up a new pair.");
    }

    public void callAgent(int correctSize)
    {
        callAgent();
        System.out.println("I wear a size " + correctSize + " by the way <3");
    }


}
