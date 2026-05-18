package test.calculators_net;

public class Main implements
        LaunchInterface,
        BasicOperationsInterface,
        TrigonometryInterface,
        InverseTrigonometryInterface,
        ExtraElementsInterface,
        CalculatorsQuickLikns {

    public static void main(String[] args) throws InterruptedException {

        Main app = new Main();

        app.calculatorsLunch();

        app.numbers();

        app.sin();

        app.cos();

        app.tan();

        app.arcsin();

        app.arccos();

        app.arctan();

        app.extraelement();
        

        app.quickLinks();

        app.footer();
    }



	
}