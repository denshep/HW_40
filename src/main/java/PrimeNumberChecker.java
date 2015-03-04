/**
 * Created by ds on 2/20/15.
 */
public class PrimeNumberChecker{

        public Boolean validate(final Integer primeNumber) {

            for (int i = 2; i < (primeNumber / 2); i++) {

                if (primeNumber % i == 0) {

                    return false;

                }

            }

            return true;


    }
}
