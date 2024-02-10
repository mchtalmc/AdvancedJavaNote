package EnumType;

public class Runner {
    public static void main(String[] args) {

        useConstant("DEPOSIT");
        useConstant("TRANSFER");
        useConstant("EFT");//CTE vermez.

        //sadece sınırlı ve sabit değişkenler kullanabilmek için ENUM type kullanmalıyız...

        useEnumType(EnumTypes.TransactionTypeEnum.DEPOSIT);
        useEnumType(EnumTypes.TransactionTypeEnum.TRANSFER);
        //  useEnumType(TransactionTypeEnum.EFT);//CTE




    }

    public static void useConstant(String secim){
        if(secim==TransactionTypeConstant.DEPOSIT){
            System.out.println("Para yatırma işlemi seçildi.");
        } else if (secim==TransactionTypeConstant.WITHDRAW) {
            System.out.println("Para çekme işlemi seçildi.");
        }else if (secim==TransactionTypeConstant.TRANSFER) {
            System.out.println("Para transfer işlemi seçildi.");
        }else if (secim==TransactionTypeConstant.PAYMENT) {
            System.out.println("Ödeme işlemi seçildi.");
        }else if (secim==TransactionTypeConstant.OTHER) {
            System.out.println("Diğer işlemler...");
        }
    }

    //enum type ile aynı metodu oluşturalım
    public static void useEnumType(EnumTypes.TransactionTypeEnum secim){
        if (secim== EnumTypes.TransactionTypeEnum.DEPOSIT){
            System.out.println("Para yatırma işlemi seçildi.");
        } else if (secim== EnumTypes.TransactionTypeEnum.WITHDRAW) {
            System.out.println("Para çekme işlemi seçildi.");
        } else if (secim== EnumTypes.TransactionTypeEnum.PAYMENT) {
            System.out.println("Ödeme işlemi seçildi.");
        } else if (secim== EnumTypes.TransactionTypeEnum.TRANSFER) {
            System.out.println("Para transfer işlemi seçildi.");
        } else if (secim== EnumTypes.TransactionTypeEnum.OTHER) {
            System.out.println("Diğer işlemler...");
        }

//        if (secim.ordinal()==0){
//            System.out.println("Para yatırma işlemi seçildi.");
//        }

        if (secim.getCode()==10){
            System.out.println(" İşlem kodu: "+secim.getCode());
        }

        System.out.println("Enum ismi : "+secim.name());
        System.out.println("Enum ordinal : "+secim.ordinal());


    }


}
