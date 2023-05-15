package com.postovan.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Car masinaLuiVasile = new Car("Mercedes", "GLE Class",  2022, "Diesel");

        masinaLuiVasile.carPrice = 45546;
        masinaLuiVasile.km = 6500;
        masinaLuiVasile.gearType = "Automatical";

        System.out.println("Masina lui Vasile are probleme dar si proprietati: Make:" + masinaLuiVasile.make +
                ",Model:" + masinaLuiVasile.model + ",Production Year:" + masinaLuiVasile.productionYear + " , Fuel Type:" +
                masinaLuiVasile.fuelType + " , Car Price:" + masinaLuiVasile.carPrice + " , km:" + masinaLuiVasile.km + " , Gear Type:" +
                masinaLuiVasile.gearType);

        Car masinaLuiVasilica = new Car("Mercedes", "GLE Class",  2020, "Diesel");

        masinaLuiVasilica.carPrice = 455333;
        masinaLuiVasilica.km = 6550;
        masinaLuiVasilica.gearType = "Automatical";

        System.out.println("Masina lui Vasilica are probleme dar si proprietati: Make:" + masinaLuiVasilica.make +
                ",Model:" + masinaLuiVasilica.model + ",Production Year:" + masinaLuiVasilica.productionYear + " , Fuel Type:" +
                masinaLuiVasilica.fuelType + " , Car Price:" + masinaLuiVasilica.carPrice + " , km:" + masinaLuiVasilica.km + " , Gear Type:" +
                masinaLuiVasilica.gearType);

        Tool hummerTool = new Tool();
        hummerTool.isUsed = true;
        hummerTool.uniqueCode = 127;
        hummerTool.needsElectricity = false;


        System.out.println("Obiectul hummerTool are proprietatile" + " Cod unic:" + hummerTool.uniqueCode + " , este utilizat:" +
                hummerTool.isUsed + " , foloseste electricitate:" + hummerTool.needsElectricity);

        Tool elevatorTool = new Tool( 23165465);
        elevatorTool.needsElectricity = true;
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;

        System.out.println("Obiectul elevatorTool are proprietatile" + " Cod Unic:" + elevatorTool.uniqueCode + " , este Elevator:" +
                elevatorTool.isElevator + " , foloseste electricitate:" + elevatorTool.needsElectricity + " , este utilizat:" +
                elevatorTool.isUsed);

        Worker lucratorulIon = new Worker();
        lucratorulIon.age = 30;
        lucratorulIon.name = "Ion";
        lucratorulIon.isExperienced = true;
        lucratorulIon.sexType  = "Masculin";
        lucratorulIon.specialization = "Electric Auto";

        System.out.println("Obiectul lucratorulIon are proprietatile" + "Nume:" + lucratorulIon.age + " , Nume:" +
                lucratorulIon.name + " , Experienta:" + lucratorulIon.isExperienced + " , Sex Type:" + lucratorulIon.sexType +
                " , Specializare:" + lucratorulIon.specialization);


        Garage garageLXM = new Garage();
        garageLXM.address = "Calea Orheiului";
        garageLXM.carCapacity = 30;
        garageLXM.hasComputerDiagonstics = true;
        garageLXM.numberId = "468";
        garageLXM.scheduler = "uneori";

        System.out.println("Garajul LXM are urmatoarele proprietati : Adresa" + garageLXM.address + " , Capacitate de masini:" +
                garageLXM.carCapacity + " , has Computer Diagnostics:" + garageLXM.hasComputerDiagonstics + " , numberID:" +
                garageLXM.numberId + " , Scheduler:" + garageLXM.scheduler);

    }
}
