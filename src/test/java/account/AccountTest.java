package account;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AccountTest {

    private Account account;

    @Test
    public void testAccount() {
        account = new Account(10000);
    }

    @Test
    public void testGetBalance() throws Exception {
        assertThat(account.getBalance()).isEqualTo(10000);

        assertThat(account.getBalance()).isEqualTo(1000);

        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void testDeposit() throws Exception {
        account.deposit(1000);
        assertThat(account.getBalance()).isEqualTo(11000);
    }


    @Test
    public void testWithdraw() throws Exception {
        account.withdraw(1000);
        assertThat(account.getBalance()).isEqualTo(9000);
    }
}
