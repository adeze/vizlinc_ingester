class Countries {
    // Returns null if country not found.
    public static List lookup(String country) {
        return COUNTRIES_LAT_LONG.get(country)
    }

    // Return true if the given string ends with any of the countries.
    // Assume input string is upper-cased and trimmed.
    public static boolean endsWithACountry(String location) {
        for (String country : COUNTRIES_LAT_LONG.keySet()) {
            // Add a space to avoid non-token mismatches, e.g. "LAO" matching "CALLAO".
            if (location.endsWith(' ' + country)) {
                return true
            }
        }
        return false
    }

    static final COUNTRIES_LAT_LONG = [
        "AFGANISTAN" : [33f, 65f],
        "ISLAS ALAND" : [60.25f, 20f],
        "ALBANIA" : [41f, 20f],
        "ARGELIA" : [28f, 3f],
        "SAMOA" : [-14.3333333333f, -170f],
        "SAMOA AMERICANA" : [-14.3333333333f, -170f],
        "ANDORRA" : [42.5f, 1.5f],
        "ANGOLA" : [-12.5f, 18.5f],
        "ANGUILA" : [18.25f, -63.1666666667f],
        "ANTARTIDA" : [-90f, 0f],
        "ANTIGUA Y BARBUDA" : [17.05f, -61.8f],
        "ANTIGUA" : [17.05f, -61.8f],
        "BARBUDA" : [17.05f, -61.8f],
        "ARGENTINA" : [-34f, -64f],
        "ARMENIA" : [40f, 45f],
        "ARUBA" : [12.5f, -69.9666666667f],
        "AUSTRALIA" : [-27f, 133f],
        "AUSTRIA" : [47.3333333333f, 13.3333333333f],
        "AZERBAIYAN" : [40.5f, 47.5f],
        "BAHAMAS" : [24.25f, -76f],
        "BAHREIN" : [26f, 50.55f],
        "BANGLADESH" : [24f, 90f],
        "BARBADOS" : [13.1666666667f, -59.5333333333f],
        "BELARUS" : [53f, 28f],
        "BELGICA" : [50.8333333333f, 4f],
        "BELICE" : [17.25f, -88.75f],
        "BENIN" : [9.5f, 2.25f],
        "BERMUDA" : [32.3333333333f, -64.75f],
        "BHUTAN" : [27.5f, 90.5f],
        "BOLIVIA" : [-17f, -65f],
        "BONAIRE, SAN ESTAQUIO Y SABA" : [12.1666666667f, -68.25f],
        "BONAIRE" : [12.1666666667f, -68.25f],
        "BOSNIA Y HERZEGOVINA" : [44f, 18f],
        "BOTSWANA" : [-22f, 24f],
        "ISLA BOUVET" : [-54.4333333333f, 3.4f],
        "BOUVET" : [-54.4333333333f, 3.4f],
        "BRASIL" : [-10f, -55f],
        "TERRITORIO BRITANICO DEL OCEANO INDICO" : [-6f, 71.5f],
        "BRUNEI DARUSSALAM" : [4.5f, 114.666666667f],
        "BRUNEI" : [4.5f, 114.666666667f],
        "BULGARIA" : [43f, 25f],
        "BURKINA FASO" : [13f, -2f],
        "BURUNDI" : [-3.5f, 30f],
        "CAMBOYA" : [13f, 105f],
        "CAMERUN" : [6f, 12f],
        "CANADA" : [60f, -95f],
        "CABO VERDE" : [16f, -24f],
        "ISLAS CAIMAN" : [19.5f, -80.5f],
        "REPUBLICA CENTROAFRICANA" : [7f, 21f],
        "CHAD" : [15f, 19f],
        "CHILE" : [-30f, -71f],
        "CHINA" : [35f, 105f],
        "ISLA DE NAVIDAD" : [-10.5f, 105.666666667f],
        "ISLAS COCOS [KEELING]" : [-12.5f, 96.8333333333f],
        "COLOMBIA" : [4f, -72f],
        "COMORAS" : [-12.1666666667f, 44.25f],
        "CONGO" : [-1f, 15f],
        "REPUBLICA DEMOCRATICA DEL CONGO" : [0.0166666667f, 25f],
        "ISLAS COOK" : [-21.2333333333f, -159.766666667f],
        "COSTA RICA" : [10f, -84f],
        "COTE D'IVOIRE" : [8f, -5f],
        "CROACIA" : [45.1666666667f, 15.5f],
        "CUBA" : [21.5f, -80f],
        "CURACAO" : [12.1666666667f, -69f],
        "CHIPRE" : [35f, 33f],
        "REPUBLICA CHECA" : [49.75f, 15.5f],
        "DINAMARCA" : [56f, 10f],
        "DJIBOUTI" : [11.5f, 43f],
        "DOMINICA" : [15.4166666667f, -61.3333333333f],
        "REPUBLICA DOMINICANA" : [19f, -70.6666666667f],
        "ECUADOR" : [-2f, -77.5f],
        "EGIPTO" : [27f, 30f],
        "EL SALVADOR" : [13.8333333333f, -88.9166666667f],
        "GUINEA ECUATORIAL" : [2f, 10f],
        "ERITREA" : [15f, 39f],
        "ESTONIA" : [59f, 26f],
        "ETIOPIA" : [8f, 38f],
        "ISLAS FALKLAND [MALVINAS]" : [-51.75f, -59f],
        "ISLAS FALKLAND" : [-51.75f, -59f],
        "MALVINAS" : [-51.75f, -59f],
        "ISLAS FEROE" : [62f, -7f],
        "FIJI" : [-18f, 175f],
        "FINLANDIA" : [64f, 26f],
        "FRANCIA" : [46f, 2f],
        "GUAYANA FRANCESA" : [4f, -53f],
        "POLINESIA FRANCESA" : [-15f, -140f],
        "TERRITORIOS AUSTRALES FRANCESES" : [-37.8333333333f, 77.5333333333f],
        "GABON" : [-1f, 11.75f],
        "GAMBIA" : [13.4666666667f, -16.5666666667f],
        "GEORGIA" : [42f, 43.5f],
        "ALEMANIA" : [51f, 9f],
        "GHANA" : [8f, -2f],
        "GIBRALTAR" : [36.1333333333f, -5.35f],
        "GRECIA" : [39f, 22f],
        "GROENLANDIA" : [72f, -40f],
        "GRANADA" : [12.1166666667f, -61.6666666667f],
        "GUADALUPE" : [16.25f, -61.5833333333f],
        "GUAM" : [13.4666666667f, 144.783333333f],
        "GUATEMALA" : [15.5f, -90.25f],
        "GUERNSEY" : [49.4666666667f, -2.5833333333f],
        "GUINEA" : [11f, -10f],
        "GUINEA-BISSAU" : [12f, -15f],
        "GUYANA" : [5f, -59f],
        "HAITI" : [19f, -72.4166666667f],
        "ISLAS DE HEARD Y MCDONALD" : [-53.1f, 72.5166666667f],
        "SANTA SEDE" : [41.9f, 12.45f],
        "HONDURAS" : [15f, -86.5f],
        "HONG KONG" : [22.25f, 114.166666667f],
        "HUNGRIA" : [47f, 20f],
        "ISLANDIA" : [65f, -18f],
        "INDIA" : [20f, 77f],
        "INDONESIA" : [-5f, 120f],
        "IRAN" : [32, 53f],
        "IRAQ" : [33f, 44f],
        "IRLANDA" : [53f, -8f],
        "ISLA DE MAN" : [54.25f, -4.5f],
        "ISRAEL" : [31.5f, 34.75f],
        "ITALIA" : [42.8333333333f, 12.8333333333f],
        "JAMAICA" : [18.25f, -77.5f],
        "JAPON" : [36f, 138f],
        "JERSEY" : [49.25f, -2.1666666667f],
        "JORDANIA" : [31f, 36f],
        "KAZAJSTAN" : [48f, 68f],
        "KENYA" : [1f, 38f],
        "KIRIBATI" : [1.4166666667f, 173f],
        "REPUBLICA POPULAR DEMOCRATICA DE COREA" : [40f, 127f],
        "REPUBLICA DE COREA" : [37f, 127.5f],
        "COREA" : [37f, 127.5f],
        "KUWAIT" : [29.366667f, 47.966667f],
        "KIRGUISTAN" : [41f, 75f],
        "REPUBLICA DEMOCRATICA POPULAR LAO" : [18f, 105f],
        "LAO" : [18f, 105f],
        "LETONIA" : [57f, 25f],
        "LIBANO" : [33.8333333333f, 35.8333333333f],
        "LESOTHO" : [-29.5f, 28.5f],
        "LIBERIA" : [6.5f, -9.5f],
        "JAMAHIRIYA ARABE LIBIA" : [25f, 17f],
        "LIECHTENSTEIN" : [47.2666666667f, 9.5333333333f],
        "LITUANIA" : [56f, 24f],
        "LUXEMBURGO" : [49.75f, 6.1666666667f],
        "MACAO" : [22.1666666667f, 113.55f],
        "EX REPUBLICA YUGOSLAVA DE MACEDONIA" : [41.8333333333f, 22f],
        "MACEDONIA" : [41.8333333333f, 22f],
        "MADAGASCAR" : [-20f, 47f],
        "MALAWI" : [-13.5f, 34f],
        "MALASIA" : [2.5f, 112.5f],
        "MALDIVAS" : [3.25f, 73f],
        "MALI" : [17f, -4f],
        "MALTA" : [35.8333333333f, 14.5833333333f],
        "ISLAS MARSHALL" : [9f, 168f],
        "MARTINICA" : [14.6f, -61.0833333333f],
        "MAURITANIA" : [20f, -12f],
        "MAURICIO" : [-20.2833333333f, 57.55f],
        "MAYOTTE" : [-12.8333333333f, 45.1666666667f],
        "MEXICO" : [23f, -102f],
        "MICRONESIA ESTADOS FEDERADOS DE" : [6.9166666667f,158.25f],
        "MICRONESIA" : [6.9166666667f,158.25f],
        "REPUBLICA DE MOLDOVA" : [47f, 29f],
        "MOLDOVA" : [47f, 29f],
        "MONACO" : [43.732778f, 7.419722f],
        "MONGOLIA" : [46f, 105f],
        "MONTENEGRO" : [42.5f, 19.3f],
        "MONTSERRAT" : [16.75f, -62.2f],
        "MARRUECOS" : [32f, -5f],
        "MOZAMBIQUE" : [-18.25f, 35f],
        "MYANMAR" : [22f, 98f],
        "NAMIBIA" : [-22f, 17f],
        "NAURU" : [-0.5333333333f, 166.916666667f],
        "NEPAL" : [28f, 84f],
        "PAISES BAJOS" : [52.5f, 5.75f],
        "NUEVA CALEDONIA" : [-21.5f, 165.5f],
        "NUEVA ZELANDIA" : [-41f, 174f],
        "NICARAGUA" : [13f, -85f],
        "NIGER" : [16f, 8f],
        "NIGERIA" : [10f, 8f],
        "NIUE" : [-19.0333333333f, -169.866666667f],
        "ISLAS NORFOLK" : [-29.0333333333f, 167.95f],
        "ISLAS MARIANAS SEPTENTRIONALES" : [15.2f, 145.75f],
        "NORUEGA" : [62f, 10f],
        "TERRITORI PALESTINA OCUPAT" : [32f, 35.25f],
        "OMAN" : [21f, 57f],
        "PAKISTAN" : [30f, 70f],
        "PALAU" : [7.5f, 134.5f],
        "PANAMA" : [9f, -80f],
        "PAPUA NUEVA GUINEA" : [-6f, 147f],
        "PARAGUAY" : [-23f, -58f],
        "PERU" : [-10f, -76f],
        "FILIPINAS" : [13f, 122f],
        "PITCAIRN" : [-25.0666666667f, -130.1f],
        "POLONIA" : [52f, 20f],
        "PORTUGAL" : [39.5f, -8f],
        "PUERTO RICO" : [18.25f, -66.5f],
        "QATAR" : [25.5f, 51.25f],
        "REUNION" : [-21.1f, 55.6f],
        "RUMANIA" : [46f, 25f],
        "FEDERACION DE RUSIA" : [60f, 100f],
        "RWANDA" : [-2f, 30f],
        "SAINT-BARTHELEMY" : [17.9f, -62.833333f],
        "SANTA ELENA ASCENSION Y TRISTAN DA CUNHA" : [-15.95f,-5.7f],
        "SANTA ELENA" : [-15.95f,-5.7f],
        "ASCENSION" : [-15.95f,-5.7f],
        "TRISTAN DA CUNHA" : [-15.95f,-5.7f],
        "SAINT KITTS Y NEVIS" : [17.3333333333f, -62.75f],
        "SAINT KITTS" : [17.3333333333f, -62.75f],
        "NEVIS" : [17.3333333333f, -62.75f],
        "SANTA LUCIA" : [13.8833333333f, -60.9666666667f],
        "SAINT MARTIN [PARTE FRANCESA]" : [18.075278f, -63.06f],
        "SAINT MARTIN" : [18.075278f, -63.06f],
        "SAN PEDRO Y MIQUELON" : [46.8333333333f, -56.3333333333f],
        "SAN VICENTE Y LAS GRANADINAS" : [13.25f, -61.2f],
        "SAMOA" : [-13.5833333333f, -172.333333333f],
        "SAN MARINO" : [43.933333f, 12.4166666667f],
        "SANTO TOME Y PRINCIPE" : [1f, 7f],
        "ARABIA SAUDITA" : [25f, 45f],
        "SENEGAL" : [14f, -14f],
        "SERBIA" : [44f, 21f],
        "SEYCHELLES" : [-4.5833333333f, 55.6666666667f],
        "SIERRA LEONA" : [8.5f, -11.5f],
        "SINGAPUR" : [1.3666666667f, 103.8f],
        "SAN MARTIN [PARTE HOLANDESA]" : [18.04167f, -63.06667f],
        "SAN MARTIN" : [18.04167f, -63.06667f],
        "REPUBLICA ESLOVACA" : [48.6666666667f, 19.5f],
        "ESLOVACA" : [48.6666666667f, 19.5f],
        "ESLOVENIA" : [46.1166666667f, 14.8166666667f],
        "ISLAS SALOMON" : [-8f, 159f],
        "SOMALI" : [10f, 49f],
        "SUDAFRICA" : [-29f, 24f],
        "GEORGIA DEL SUR E ISLAS SANDWICH DEL SUR" : [-54.5f, -37f],
        "SUDAN DEL SUR" : [8f, 30f],
        "ESPANA" : [40f, -4f],
        "SRI LANKA" : [7f, 81f],
        "SRILANKA" : [7f, 81f],
        "SUDAN" : [15f, 30f],
        "SURINAME" : [4f, -56f],
        "ISLAS SVALBARD Y JAN MAYEN" : [78f, 20f],
        "SVALBARD" : [78f, 20f],
        "SWAZILANDIA" : [-26.5f, 31.5f],
        "SUECIA" : [62f, 15f],
        "SUIZA" : [47f, 8f],
        "REPUBLICA ARABE SIRIA" : [35f, 38f],
        "SIRIA" : [35f, 38f],
        "PROVINCIA CHINA DE TAIWAN" : [23.5f, 121f],
        "TAIWAN" : [23.5f, 121f],
        "TAYIKISTAN" : [39f, 71f],
        "REPUBLICA UNIDA DE TANZANIA" : [-6f, 35f],
        "TANZANIA" : [-6f, 35f],
        "TAILANDIA" : [15f, 100f],
        "TIMOR-LESTE" : [-8.8333333333f, 125.916666667f],
        "TOGO" : [8f, 1.1666666667f],
        "TOKELAU" : [-9f, -172f],
        "TONGA" : [-20f, -175f],
        "TRINIDAD Y TABAGO" : [11f, -61f],
        "TRINIDAD" : [11f, -61f],
        "TABAGO" : [11f, -61f],
        "TUNEZ" : [34f, 9f],
        "TURQUIA" : [39f, 35f],
        "TURKMENISTAN" : [40f, 60f],
        "ISLAS TURCAS Y CAICOS" : [21.75f, -71.5833333333f],
        "TURCAS Y CAICOS" : [21.75f, -71.5833333333f],
        "TURCAS" : [21.75f, -71.5833333333f],
        "TUVALU" : [-8f, 178f],
        "UGANDA" : [1f, 32f],
        "UCRANIA" : [49f, 32f],
        "EMIRATOS ARABES UNIDOS" : [24f, 54f],
        "EL REINO UNIDO DE GRAN BRETANA E IRLANDA DEL NORTE" : [54f, -2f],
        "ESTADOS UNIDOS DE AMERICA" : [38f, -97f],
        "ESTADOS UNIDOS" : [38f, -97f],
        "ESTADOS UNIDOS ISLAS MENORES" : [16.75f, -169.516666667f],
        "URUGUAY" : [-33f, -56f],
        "UZBEKISTAN" : [41f, 64f],
        "VANUATU" : [-16f, 167f],
        "VENEZUELA" : [8f, -66f],
        "VIET NAM" : [16.1666666667f, 107.833333333f],
        "VIETNAM" : [16.1666666667f, 107.833333333f],
        "ISLAS VIRGENES BRITANICAS" : [18.5f, -64.5f],
        "ISLAS VIRGENES DE LOS ESTADOS UNIDOS" : [18.3333333333f, -64.8333333333f],
        "ISLAS WALLIS Y FUTUNA" : [-13.3f, -176.2f],
        "SAHARA OCCIDENTAL" : [24.5f, -13f],
        "YEMEN" : [15f, 48f],
        "ZAMBIA" : [-15f, 30f],
        "ZIMBABWE" : [-20f, 30f]
    ]

    static final COUNTRIES = COUNTRIES_LAT_LONG.keySet()
    }