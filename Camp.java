public class Camp implements IsCreatingByPeople {
    private String name;

    public Camp(String name) {
        this.name = name;
    }

    public void location(Camp camp, Human human, Foothills foothills){
        System.out.print(camp.getName() + human.pronoun.getPossessive() + "находился в " + foothills.getType());

        foothills.height(foothills);
    }

    public void heightDifference (Human human, Foothills foothills, Peaks peak, Adjectives adjectives){
        if (peak.height/foothills.height <= 2) { System.out.println(", поэтому фактически " + human.pronoun.getObjective() + "нужно было подняться не на такую уж " + adjectives.getName() + "высоту."); }
        else if (peak.height/foothills.height == 1) { System.out.println(", поэтому фактически " + human.pronoun.getObjective() + "не нужно было никуда подниматься."); }
        else if (peak.height/foothills.height > 2) { System.out.println(", поэтому " + human.pronoun.getObjective() + "нужно было подняться на " + adjectives.getName() + "высоту."); }
    }

    String getName() { return name; }
}
