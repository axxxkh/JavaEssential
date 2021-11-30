package TaskThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceInput {
    Price[] priceArray = new Price[2];
    Scanner input = new Scanner(System.in);

    public double checkNumber() {
        do {
            try {
                return input.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("it's not a number. try to enter only digits");
                input.nextLine();
            }
        } while (true);
    }

    public void inputPrices() {
        for (int i = 0; i < priceArray.length; i++) {
            priceArray[i] = new Price();
            System.out.println("Enter name of the item");
            priceArray[i].productName = input.next();
            System.out.println("Enter shop where product sells");
            priceArray[i].shopName = input.next();
            System.out.println("Enter price in hryvnas");
            priceArray[i].price = checkNumber();
        }
    }

    public void checkShop(String shopName) throws ShopException {
        boolean check = false;
        for (Price price : priceArray) {
            if (price.shopName.equals(shopName)) {
                check = true;
            }
        }
        if (!check) {
            throw new ShopException();
        }
    }

    public void showShopItems() {
        System.out.println("Enter shop name");
        String shopName = input.next();
        try {
            checkShop(shopName);
            System.out.println("in this shop next products");
            for (Price price : priceArray) {
                if (price.shopName.equals(shopName)) {
                    System.out.println(price);
                }
            }
        } catch (ShopException exception) {
            exception.printStackTrace();
        }
    }
}
