import java.sql.Time;

public class Main {
    public static void main(String[] args) {

        Human I = new Human("Я", 25, Human.Male.MALE, Human.Pronoun.I, false);
        Human Danforth = new Human("Денфорт", 21, Human.Male.MALE, Human.Pronoun.HE, true);
            try { Danforth.setName(); }
            catch(DoPersonHaveName doPersonHaveName){ System.out.println("ERROR "+ doPersonHaveName.getMessage()); }
        Human Lake = new Human("Лэйк", 40, Human.Male.MALE, Human.Pronoun.HE, false);
            try { Lake.setName(); }
            catch(DoPersonHaveName doPersonHaveName){ System.out.println("ERROR "+ doPersonHaveName.getMessage()); }
        Human Carroll = new Human("Кэрролл", 35, Human.Male.MALE, Human.Pronoun.HE, false );
            try { Carroll.setName(); }
            catch(DoPersonHaveName doPersonHaveName){ System.out.println("ERROR "+ doPersonHaveName.getMessage()); }
        Human We = new Human("Мы", 0000, Human.Male.UNKNOWN, Human.Pronoun.WE, true);
        Machine plane = new Machine(Machine.Type.PLANE, "R3142", 6600);
        Rocks quartzite = new Rocks("архейский кварцит ", "порода ", Rocks.Age.ANCIENT, Rocks.PhysicalState.WEATHERED, Rocks.Occurrence.RARE, Adjectives.NUDE, Adjectives.LIGHT);
        Rocks stone = new Rocks("камень", "порода ", Rocks.Age.UNKNOWN, Rocks.PhysicalState.PERFECTLY, Rocks.Occurrence.FREQUENT, Adjectives.DURABLE, Adjectives.GLOOMY);
        Rocks volcanic = new Rocks ("Вулканическая ", "порода ", Rocks.Age.UNKNOWN, Rocks.PhysicalState.CRACKED, Rocks.Occurrence.RARE, Adjectives.UNUSUAL, Adjectives.STRANGE);
        Rocks limestone = new Rocks("известняковый слой ", "слой ", Rocks.Age.YOUNG, Rocks.PhysicalState.WEATHERED, Rocks.Occurrence.COMMON, Adjectives.FRAGILE, Adjectives.LIGHT);
        Glacier glacier = new Glacier("льды", Glacier.Age.ETERNAL, Adjectives.NUDE);
        Constructions constructions = new Constructions("конструкции", Adjectives.CORRECT, "кубы ", "пещеры ", "крепостные валы ", "глыба ");
        Event event = new Event();
        Cave cave = new Cave("пещера ");

        Camp camp = new Camp("Лагерь ");
        Foothills foothills = new Foothills("предгорье ", Mountains.Part.FOOTHILLS, 12000, Adjectives.GENTLE);
        camp.location(camp, We, foothills);
        Peaks peak = new Peaks("вершина горы ", Mountains.Part.PEAKS, 24000, Adjectives.GLOOMY);
        camp.heightDifference(We, foothills, peak, Adjectives.BIG);
        We.takingOff(true, IntroductoryWords.NONETHELESS, We, plane);
        We.vision(true, We, Adjectives.EXCRUCIATING);
        event.obviously();
        We.dressed(We, true);
        Human.Pronoun.WE.approaching(peak);
        SnowLine snowLine1 = new SnowLine("снежная линия", Mountains.Part.SNOWLINE, 23000, Adjectives.SNOWY);  //getType
        peak.darkened(Adjectives.FORMIDABLE, snowLine1);
        snowLine1.separating(quartzite, glacier);
        Human.Pronoun.WE.notice(Human.Pronoun.WE, Frequency.MORE);
        Hillside hillside = new Hillside( "горные склоны ", Mountains.Part.HILLSIDE, 0, Adjectives.CORRECT);
        constructions.clenched(hillside, constructions);
        We.remember(We, Frequency.ONCEAGAIN);
        Paintings paintings = new Paintings("Николя Рерих", "азиатская серия", Adjectives.MYSTERIOUS);
        paintings.info(paintings);
        quartzite.conformity(quartzite, true, Sourse.DESCRIPTION, Lake);
        Giants giants = new Giants("гиганты ", Mountains.Part.SYNONYMS, 24000, Adjectives.HIGH);
        giants.towered(IntroductoryWords.PROBABLY, Frequency.SIMILAR, "HERE", "ANCIENT");
        constructions.imagination(We, Frequency.RATHER, constructions);
        Danforth.pilot(Danforth, plane);
        I.considered(I, Instrument.BINOCULARS);
        I.click(Instrument.AERIALCAMERA, Frequency.ASOFTEN);
        I.replace(Danforth, Frequency.SOMETIMES);
        I.toenable(Danforth);
        Danforth.considered(Danforth, Instrument.BINOCULARS);
        I.pilotingDuration(IntroductoryWords.HOWEVER, I);
        We.understood(We, true); //Humans.Pronoun.WE.understood(Humans.Pronoun.WE);
        constructions.consists(Adjectives.STRANGE, constructions, "MOSTLY", quartzite);
        Rocks.Occurrence.RARE.around(Rocks.Occurrence.RARE);
        Lake.liar(Lake, false);
        StoneFigures figure = new StoneFigures("каменные фигуры", Adjectives.FRAGILE, "края ", "центр", "внешнее покрытие", "");
        figure.crash(figure, Times.LONGYEARS);
        stone.strength(stone, Adjectives.EXCEPTIONAL, true);
        Cubes cubes = new Cubes("кубы ", Adjectives.CORRECT, "Нижние части ", "Средние части ", "Верхние части ", "");
        cubes.similar(cubes, hillside, quartzite);
        We.seem(Danforth, 2, true);
        constructions.separately(constructions, Adjectives.GIANT);
        Carroll.seem(Carroll, 1, true);
        Carroll.accompany(Lake);
        event.explanation();
        I.understood(I, false);
        volcanic.tookAShape(volcanic,Frequency.OFTEN, Adjectives.STRANGE);
        event.somethingElse();
        Cave.StoneFormations stoneFormations = new Cave.StoneFormations();
        cave.riddle(Adjectives.UNUSUAL, stoneFormations, Adjectives.OUTLANDISH);
        event.tooMuch();
        Cave.Enter.form(Adjectives.CORRECT);
        Cave.Enter.represents(Frequency.MOREOFTEN);
        event.count(true);
        Cave.Tunnels tunnels = new Cave.Tunnels();
        limestone.riddled(IntroductoryWords.APPARENTLY, limestone, tunnels);
        MountainousSurface mountainousSurface = new MountainousSurface("Горная поверхность ", Mountains.Part.SYNONYMS, 24000, Adjectives.FLAT);
        mountainousSurface.description(mountainousSurface, cave, Adjectives.SMOOTH);
        Danforth.seem(Danforth,1, false);
        constructions.pattern(Adjectives.LITTLE,Adjectives.INCOMPREHENSIBLE, constructions);
    }
}

// Лагерь наш находился в предгорьях, достигавших и так приблизительно двенадцать тысяч футов, поэтому фактически нам нужно было подняться не на такую уж большую высоту.
// Тем не менее, взлетев, мы остро почувствовали нехватку воздуха и мучительный холод: из-за плохой видимости пришлось оставить иллюминаторы открытыми.
// Вряд ли стоит говорить о том, что мы натянули на себя из одежды все, что смогли.
// Приближаясь к мрачным вершинам, грозно темневшим над снежной линией, отделявшей обнаженную породу от вечных льдов, мы замечали все большее количество прилепившихся к горным склонам геометрически правильных конструкций и в очередной раз вспоминали загадочные картины Николая Рериха из его азиатской серии.
// Вид выветрившихся древних пород полностью соответствовал описаниям Лейка: скорей всего эти гиганты точно так же высились здесь и в исключительно давние времена.
// Волновали и дразнили наше воображение скорее уж все эти правильной формы кубы, пещеры и крепостные валы.
// Денфорт вел самолет, а я рассматривал их в бинокль, то и дело щелкая аэрокамерой и иногда замещая у руля своего товарища, чтобы дать и ему возможность полюбоваться в бинокль на все эти диковины.
// Впрочем, ненадолго, ибо мое искусство пилотирования оставляло желать лучшего.
// Мы уже поняли, что странные композиции состояли по большей части из легкого архейского кварцита, которого больше нигде вокруг не было.
// Все, что говорил Лейк оказалось правдой: края этих каменных фигур за долгие годы искрошились и закруглились, но исключительная прочность камня помогла ему выстоять.
// Нижние, примыкающие к склону, части кубов казались схожими с породами хребтов.

// Нам с Денфортом несколько раз почудилось, что все эти конструкции состоят из отдельных гигантских глыб, то же самое померещилось и Кэрроллу, сопровождавшему Лейка в полете.
// Какое объяснение можно дать этому, я не понимал.
// Вулканические породы часто принимают необычные формы, но здесь-то, несмотря на первоначальное предположение Лейка о наличии в горной цепи вулканов, было нечто другое.
// Необычные пещеры, рядом с которыми группировались эти диковинные каменные образования, казались не меньшей загадкой -- слишком уж правильной формы были отверстия.
// Чаще всего они представляли собой квадрат или полукруг, как если бы чья-то волшебная рука придала этим естественным входам более законченную симметричную форму.
// Их насчитывалось на удивление много, видимо, весь известняковый слой был здесь пронизан подземными туннелями.
// Горная поверхность вблизи пещер была необычно ровной и гладкой, а Денфорту чудилось, что небольшие трещины и углубления складывались в непонятный узор.
