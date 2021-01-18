public class Event {

    public void obviously(){
        System.out.print("Вряд ли стоит говорить о том, что ");
    }

    public void explanation(){
        System.out.print("Какое объяснение можно дать этому ");
    }

    public void somethingElse(){
        System.out.print(", но здесь было нечто другое ");
    }

    public void tooMuch() { System.out.print("-- слишком уж "); }

    public void count(Boolean cou) {
        System.out.print("Их насчитывалось на удивление ");
        if (cou == true) { System.out.print("много "); }
        else  { System.out.print("мало "); }
    }
}
