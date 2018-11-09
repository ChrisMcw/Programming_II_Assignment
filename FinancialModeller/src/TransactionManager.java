import java.util.Random;
/**
 * To generate and carry out deposits or withdrawals
 * Add monthly rewards or interest
 */
public class TransactionManager 
{
    
    
    public double genRandomAmount()
    {
        Random rdmGen = new Random();
        double genAmount = rdmGen.nextInt((2000 - 100) +1) + 100;
        System.out.println(genAmount);
        return genAmount;
    }
    
    public boolean genTransactionType()
    {
        Random rdmGen = new Random();
        boolean genType = rdmGen.nextBoolean();
        System.out.println(genType);
        return genType;
    }
    
    
}
