public class HouseTestDrive {
    public static void main(String[] args) {
        BigHouse bigHouse = new BigHouse();
        SmallHouse smallHouse = new SmallHouse();

        bigHouse.build();
        smallHouse.build();
    }
}

interface House {
    public void build();

    public void demolish();
}

class BigHouse implements House {
    public void build() {
        System.out.println("Building a big house");
    }

    public void demolish() {
        System.out.println("Demolishing a big house");
    }

    public void haveParty() {
        System.out.println("Having a party at a big house");
    }
}

class SmallHouse implements House {
    public void build() {
        System.out.println("Building a small house");
    }

    public void demolish() {
        System.out.println("Demolishing a small house");
    }

    public void playOutside() {
        System.out.println("Playing outside at a small house");
    }
}
