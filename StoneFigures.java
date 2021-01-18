public class StoneFigures extends Constructions implements IsCreatingByPeople {

    public StoneFigures(String name, Adjectives adjective, String consists1, String consists2, String consists3, String consists4) {
        super(name, adjective, consists1, consists2,  consists3, consists4);
    }

    public void crash(StoneFigures stoneFigure, Times time){
        System.out.print(stoneFigure.getConsists1() + "этих " + stoneFigure.getName() + "за " + time.getName());
        if (adjective.equals(adjective.DURABLE)) {
            System.out.print("ничуть не повредились "); }
        else if (adjective.equals(adjective.FRAGILE)) {
            System.out.print("искрошились и закруглились "); }
    }

}
