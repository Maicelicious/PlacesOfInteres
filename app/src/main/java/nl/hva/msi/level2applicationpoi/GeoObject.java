package nl.hva.msi.level2applicationpoi;

public class GeoObject {
    private String geoName;
    private int geoImageName;

    public GeoObject(String geoName, int geoImageName) {
        this.geoName = geoName;
        this.geoImageName = geoImageName;
    }

    public String getGeoName() {
        return geoName;
    }

    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }

    public int getGeoImageName() {
        return geoImageName;
    }

    public void setGeoImageName(int geoImageName) {
        this.geoImageName = geoImageName;
    }

    public static final String[] PRE_DEFINED_GEO_OBJECT_NAMES = {

            "Amsterdam Dam",

            "Amsterdam Weesperplein",

            "Rotterdam Euromast",

            "Den Haag Binnenhof",

            "Utrecht Dom",

            "Groningen Martinitoren",

            "Maastricht Vrijthof",

            "New York Vrijheidsbeeld",

            "San Francisco Golden Gate",

            "Yellowstone Old Faithful",

            "Yosemite Half Dome",

            "Washington White House",

            "Ottawa Parliament Hill",

            "Londen Tower Bridge",

            "Brussel Manneken Pis",

            "Berlijn Reichstag",

            "Parijs Eiffeltoren",

            "Barcelona Sagrada Familia",

            "Rome Colosseum",

            "Pompeii",

            "Kopenhagen",

            "Oslo",

            "Stockholm",

            "Helsinki",

            "Moskou Rode Plein",

            "Beijing Verboden Stad",

            "Kaapstad Tafelberg",

            "Rio de Janeiro Copacabana",

            "Sydney Opera",

            "Hawaii Honolulu",

            "Alaska Denali"

    };

    public static final int[] PRE_DEFINED_GEO_OBJECT_IMAGE_IDS = {

            R.drawable.amsterdam_dam,

            R.drawable.amsterdam_weesperplein,

            R.drawable.rotterdam_euromast,

            R.drawable.den_haag_binnenhof,

            R.drawable.utrecht_dom,

            R.drawable.groningen_martinitoren,

            R.drawable.maastricht_vrijthof,

            R.drawable.new_york_vrijheidsbeeld,

            R.drawable.san_francisco_golden_gate,

            R.drawable.yellowstone_old_faithful,

            R.drawable.yosemite_half_dome,

            R.drawable.washington_white_house,

            R.drawable.ottawa_parliament_hill,

            R.drawable.london_tower_bridge,

            R.drawable.brussel_manneken_pis,

            R.drawable.berlijn_reichstag,

            R.drawable.parijs_eiffeltoren,

            R.drawable.barcelona_sagrada_familia,

            R.drawable.rome_colosseum,

            R.drawable.pompeii,

            R.drawable.kopenhagen,

            R.drawable.oslo,

            R.drawable.stockholm,

            R.drawable.helsinki,

            R.drawable.moskou_rode_plein,

            R.drawable.beijing_verboden_stad,

            R.drawable.kaapstad_tafelberg,

            R.drawable.rio_de_janeiro_copacabana,

            R.drawable.sydney_opera,

            R.drawable.hawaii,

            R.drawable.alaska_denali

    };
}
