import java.math.BigInteger;

class Spiral {
    
    static final BigInteger ZERO = BigInteger.ZERO;
    static final BigInteger ONE = BigInteger.ONE;
    static final BigInteger TWO = BigInteger.TWO;

    public static BigInteger sum(BigInteger size) {
        
        final BigInteger diff = TWO;
        final BigInteger duplicateNum = size.subtract(ONE);
        final BigInteger itemNum = size.divide(TWO);
        final BigInteger firstItem = size;
        final BigInteger lastItem = firstItem.subtract(itemNum.subtract(ONE).multiply(diff));
        final BigInteger sum = firstItem.add(lastItem).multiply(itemNum).divide(TWO);
        
        if(size.mod(TWO).equals(ZERO)) {
            return size.add(sum.multiply(TWO)).subtract(lastItem).subtract(duplicateNum);
        }
        else {
            return size.add(sum.multiply(TWO)).subtract(duplicateNum);
        }
    }
}