import java.util.Scanner;


interface Building {
    String getDescription();
}

class Hotel implements Building {
    @Override
    public String getDescription() {
        return "Hotel adalah tempat yang menyediakan penginapan, makanan, hiburan, dan layanan pribadi untuk para tamunya. Hotel juga merupakan bangunan yang dikelola untuk memberikan fasilitas pelayanan barang bawaan, pencucian pakaian, dan dapat menggunakan fasilitas/perabotan dan menikmati hiasan-hiasan yang ada di dalam hotel tersebut.";
    }
}

// Implementasi untuk bangunan Cafe
class Cafe implements Building {
    @Override
    public String getDescription() {
        return "Kafe adalah tempat makan dan minum kecil yang biasanya menyajikan menu terbatas. Kafe biasanya menyajikan kopi dan teh, serta minuman ringan seperti makanan yang dipanggang atau makanan ringan.";
    }
}

class Restaurant implements Building {
    @Override
    public String getDescription() {
        return "Restoran adalah tempat usaha yang menyediakan dan menyajikan makanan dan minuman kepada pelanggan. Restoran biasanya menyajikan makanan di meja pelanggan. Restoran juga menawarkan layanan pesan-antar dan bawa pulang.";
    }
}

class Office implements Building {
    @Override
    public String getDescription() {
        return "IKantor adalah tempat para pegawai suatu organisasi melakukan pekerjaan administratif dalam rangka menunjang dan mewujudkan berbagai tujuan organisasi.";
    }
}

class School implements Building {
    @Override
    public String getDescription() {
        return "Ini adalah sebuah sekolah. Tempat di mana siswa belajar pengetahuan dan keterampilan.";
    }
}

class BuildingFactory {
    public Building createBuilding(String type) {
        if (type.equalsIgnoreCase("hotel")) {
            return new Hotel();
        } else if (type.equalsIgnoreCase("cafe")) {
            return new Cafe();
        } else if (type.equalsIgnoreCase("restoran")) {
            return new Restaurant();
        } else if (type.equalsIgnoreCase("kantor")) {
            return new Office();
        } else if (type.equalsIgnoreCase("sekolah")) {
            return new School();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        BuildingFactory buildingFactory = new BuildingFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama bangunan :");
        String userInput = scanner.nextLine();
        Building building = buildingFactory.createBuilding(userInput);

        if (building != null) {
            System.out.println(building.getDescription());
        } else {
            System.out.println("Jenis bangunan tidak valid.");
        }

        scanner.close();
    }
}
