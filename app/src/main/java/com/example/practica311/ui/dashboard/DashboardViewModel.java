package com.example.practica311.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> aText,bText,cText,dText,eText,fText,gText,hText,iText,jText,kText,lText,mText,nText,oText,pText,qText;

    public DashboardViewModel() {
        aText = new MutableLiveData<>();

        aText.setValue("Gato. Aunque el perro puede parecer el animal doméstico por " +
                "excelencia, el gato convive con el ser humano desde hace más de 9 mil años." +
                "Tienen una gran destreza, gracias a la flexibilidad de sus patas, la utilización " +
                "de su cola y su “reflejo de enderezamiento” que les permite girar su cuerpo " +
                "en el aire cuando caen y así caer siempre sobre sus patas, que por su extraordinaria " +
                "flexibilidad resisten caídas de alturas importantes.");

        bText = new MutableLiveData<>();
        bText.setValue("León. Mamífero felino que vive en África subsahariana y en el noroeste " +
                "de la India. Es una especie en peligro, por eso muchos ejemplares viven en reservas. " +
                "Es un animal carnívoro, depredador principalmente de otros mamíferos grandes como " +
                "ñus, impalas, cebras, búfalos, nilgós, jabalíes y ciervos. Para alimentarse de estos " +
                "animales, suelen cazar en grupos.");

        cText = new MutableLiveData<>();
        cText.setValue("Ornitorrinco. Monotrema, es decir que es uno de los pocos mamíferos " +
                "(junto con los equidnas) que pone huevos. Es venenoso y llamativo por su aspecto, " +
                "ya que aunque tiene el cuerpo cubierto de pelos como la mayor parte de los mamíferos, " +
                "tiene un hocico con una forma muy similar al pico de los patos. Viven únicamente en " +
                "el este de Australia y en la isla de Tasmania.");

        dText = new MutableLiveData<>();
        dText.setValue("Los quirópteros (Chiroptera), conocidos comúnmente como murciélagos, son un " +
                "orden de mamíferos placentarios cuyas extremidades superiores se desarrollaron como alas. " +
                "Con unas 1400 especies actuales, representan aproximadamente un 20 % de todas las especies " +
                "de mamíferos, lo que los convierte, tras los roedores, en el segundo orden más diverso de esta " +
                "clase. Están presentes en todos los continentes, excepto en la Antártida. " +
                "Son los únicos mamíferos capaces de volar, se han extendido por casi todo el mundo y han ocupado " +
                "una gran variedad de nichos ecológicos diferentes.");

        eText = new MutableLiveData<>();
        eText.setValue("Gorila. Es el primate de mayor tamaño. Vive en bosques africanos. Son herbívoros y sus " +
                "genes son 97% iguales a los genes humanos. Pueden llegar a medir 1,75 m de altura y pesar hasta 200 kg.");

        fText = new MutableLiveData<>();
        fText.setValue("El lución o enánago (Anguis fragilis) es un lagarto ápodo (sin patas) común en Europa y el " +
                "este de Asia. También se le conoce como culebrilla de cristal." +
                "Ocurre frecuentemente que se confunde al lución con una serpiente, a pesar de que, en realidad, el lución " +
                "es un lagarto que normalmente carece de patas. En ocasiones no queda nada de sus miembros externos, " +
                "aunque subsisten algunos vestigios en su esqueleto. Algunos luciones tienen miembros externos no " +
                "funcionales. Los adultos miden de 30 a 40 cm, pero en el caso de las hembras pueden llegar a alcanzar hasta 50 cm.");

        gText = new MutableLiveData<>();
        gText.setValue("Draco volans (traducido del latín como \"Dragón volador\") es un miembro del género de lagartos Draco. " +
                "Tiene la capacidad de extender los pliegues de la piel (denominados patagio), las cuales están " +
                "pegada a sus costillas móviles para formar \"alas\" que utiliza para ´planear de un árbol a otro hacia " +
                "abajo, sin embargo, como todos los reptiles modernos, carece de la capacidad de mantenerse en " +
                "vuelo, pero sí puede planear igual que otros reptiles arborícolas. Sus \"alas\" son de colores brillantes " +
                "anaranjados con manchas rojas, azules y rayas, que proporcionan el camuflaje cuando se doblan. " +
                "El dragón volador puede alcanzar una longitud de 19 a 23 cm. Se alimenta de hormigas y termitas arbóreas.");

        hText = new MutableLiveData<>();
        hText.setValue("Los pitónidos o pitones (Pythonidae) son una familia de serpientes constrictoras propias del " +
                "paleotrópico. Otras fuentes consideran a este grupo una subfamilia de la familia de las boas (Boidae) " +
                "(subfamilia Pythoninae). Las pitones se pueden distinguir de las boas en que tienen dientes en el premaxilar, " +
                "un pequeño hueso en la parte frontal de la mandíbula superior. La mayoría de las boas dan a luz crías vivas, " +
                "mientras que las pitones ponen huevos. Algunas variedades pueden llegar a ser muy largas: hasta ocho metros. " +
                "Ciertas especies de boas de arena (subfamilia Ericinae) son llamadas erróneamente pitones.");

        iText = new MutableLiveData<>();
        iText.setValue("Los pitónidos o pitones (Pythonidae) son una familia de serpientes constrictoras propias del " +
                "paleotrópico. Otras fuentes consideran a este grupo una subfamilia de la familia de las boas (Boidae) " +
                "(subfamilia Pythoninae). Las pitones se pueden distinguir de las boas en que tienen dientes en el premaxilar, " +
                "un pequeño hueso en la parte frontal de la mandíbula superior. La mayoría de las boas dan a luz crías vivas, " +
                "mientras que las pitones ponen huevos. Algunas variedades pueden llegar a ser muy largas: hasta ocho metros. " +
                "Ciertas especies de boas de arena (subfamilia Ericinae) son llamadas erróneamente pitones.");

        jText = new MutableLiveData<>();
        jText.setValue("Los pitónidos o pitones (Pythonidae) son una familia de serpientes constrictoras propias del " +
                "paleotrópico. Otras fuentes consideran a este grupo una subfamilia de la familia de las boas (Boidae) " +
                "(subfamilia Pythoninae). Las pitones se pueden distinguir de las boas en que tienen dientes en el premaxilar, " +
                "un pequeño hueso en la parte frontal de la mandíbula superior. La mayoría de las boas dan a luz crías vivas, " +
                "mientras que las pitones ponen huevos. Algunas variedades pueden llegar a ser muy largas: hasta ocho metros. " +
                "Ciertas especies de boas de arena (subfamilia Ericinae) son llamadas erróneamente pitones.");

        kText = new MutableLiveData<>();
        kText.setValue("Caretta caretta, también conocida como tortuga boba, tortuga caguama, cayume, o cabezona,6 " +
                "es la única especie del género Caretta, que pertenece a la familia Cheloniidae, dentro de la superfamilia " +
                "de las tortugas marinas. Habita en el océano Atlántico, Pacífico e Índico, así como el Mediterráneo.");

        lText = new MutableLiveData<>();
        lText.setValue("Caiman yacare, llamado comúnmente Yacaré o Caimán del Para, es un caimánido endémico de las " +
                "regiones subtropicales y tropicales de Sudamérica que puede alcanzar los tres metros de longitud. " +
                "Fuertemente acorazado en el lomo, de color negruzco u oliva muy oscuro, la piel delicadamente jaspeada de " +
                "los flancos y de los ejemplares juveniles lo convirtió en un favorito de la industria del calzado durante mucho " +
                "tiempo. Las medidas de protección han permitido su recuperación; se encuentra registrado en el Apéndice II del " +
                "listado de especies protegidas de CITES (Convención sobre el Comercio Internacional de Especies Amenazadas de " +
                "Fauna y Flora Silvestres).");

        mText = new MutableLiveData<>();
        mText.setValue("Se llama comúnmente gansos u ocas a algunas aves de la subfamilia Anserinae, de la familia Anatidae, " +
                "aunque también se denomina así a algunas aves de la subfamilia Tadorninae, así como a la especie Anseranas " +
                "semipalmata, de la familia Anseranatidae.");

        nText = new MutableLiveData<>();
        nText.setValue("En bosques de montañas del suroeste, este tímido pájaro nocturno es bastante común en el verano. " +
                "Hasta hace poco tiempo, era considerado parte de la misma especie del chotacabras cuerporruín; el sonido " +
                "que emite es similar pero más grave y con un tono más bajo.");

        oText = new MutableLiveData<>();
        oText.setValue("El pinzón vulgar (Fringilla coelebs) es uno de los Passeriformes más comunes de Europa, estando " +
                "también presente en Asia, Norte de África y Macaronesia.");

        pText = new MutableLiveData<>();
        pText.setValue("El mosquitero común (Phylloscopus collybita) es una especie de ave paseriforme de la familia " +
                "Phylloscopidae propia de los bosques abiertos de las regiones templadas del norte de Europa y Asia. " +
                "Posee una longitud aproximada de 10 cm, una envergadura de 15-21 cm, un peso de 6-9 g. Acostumbra un modo " +
                "de vida solitario y se alimenta capturando insectos y arañas del follaje, en vuelo.");

        qText = new MutableLiveData<>();
        qText.setValue("El cardenal norteño (Cardinalis cardinalis), también conocido como cardenal rojo, Rey Guajiro " +
                "(en la costa caribe de Colombia). O simplemente cardenal, es una especie de ave paseriforme de la familia " +
                "Cardinalidae que vive en Centro y Norteamérica. Habita desde el sur de Canadá y Belice hasta el centro " +
                "occidente de Venezuela, pasando por la parte oriental de los Estados Unidos desde Maine hasta Texas y por México. " +
                "Se le puede encontrar en bosques, jardines y pantanos.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}