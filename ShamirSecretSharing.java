import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.lang.constant.*;

public class ShamirSecretSharing {

    public static BigInteger findConstantTerm(Map<Integer, String> roots) {
        int n = roots.size();
        int k = Integer.parseInt(roots.get("keys").get("k"));

        if (n < k) {
            System.err.println("Insufficient roots provided.");
            return null; // Return null or handle the error differently
        }

        Map<Integer, BigInteger> decodedRoots = new HashMap<>();
        for (Map.Entry<Integer, String> entry : roots.entrySet()) {
            if (!entry.getKey().equals("keys")) {
                decodedRoots.put(entry.getKey(), decodeRoot(entry.getValue()));
            }
        }

        BigInteger[] xValues = new BigInteger[n];
        BigInteger[] yValues = new BigInteger[n];
        int index = 0;
        for (Map.Entry<Integer, BigInteger> entry : decodedRoots.entrySet()) {
            xValues[index] = BigInteger.valueOf(entry.getKey());
            yValues[index] = entry.getValue();
            index++;
        }

        BigInteger constantTerm = lagrangeInterpolation(xValues, yValues);
        return constantTerm;
    }

    private static BigInteger decodeRoot(String rootData) {
        Map<String,String> root = (Map<String, String>) rootData;
        BigInteger base = new BigInteger(root.get("base"));
        BigInteger value = new BigInteger(root.get("value"), base.intValue());
        return value;
    }

    private static BigInteger lagrangeInterpolation(BigInteger[] xValues, BigInteger[] yValues) {
        int n = xValues.length;
        BigInteger constantTerm = BigInteger.ZERO;

        for (int i = 0; i < n; i++) {
            BigInteger l_i = BigInteger.ONE;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    l_i = l_i.multiply(xValues[j].subtract(xValues[i]).modInverse(BigInteger.valueOf(n)));
                    l_i = l_i.multiply(xValues[j].subtract(BigInteger.ZERO));
                }
            }
            constantTerm = constantTerm.add(yValues[i].multiply(l_i));
        }

        return constantTerm;
    }

    public static void main(String[] args) {
        Map<Integer, String> roots = new HashMap<>();
        // Add roots to the map here

        BigInteger constantTerm = findConstantTerm(roots);

        if (constantTerm != null) {
            System.out.println("Constant term: " + constantTerm);
        } else {
            System.err.println("Error: Could not calculate constant term.");
        }
    }
}