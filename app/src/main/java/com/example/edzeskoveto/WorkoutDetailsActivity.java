package com.example.edzeskoveto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WorkoutDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_details);

        ImageView imageView = findViewById(R.id.image_workout);
        TextView textView = findViewById(R.id.text_view_workout_details);

        String workoutType = getIntent().getStringExtra("WORKOUT_TYPE");
        textView.setText(getWorkoutDescription(workoutType));
        imageView.setImageResource(getImageResourceId(workoutType));

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }

    private String getWorkoutDescription(String workoutType) {
        switch (workoutType) {
            case "Szabad súlyos edzés":
                return "A szabad súlyos edzés alatt azt értjük, amikor egy szabad, független ellenállást mozgatunk a gravitáció ellenében, általában gondolva itt kézi és rúd súlyzóval végzett gyakorlatokra. Azért „szabad” módja ez az edzésnek, mert a mozgás alatt a gyakorlatot végző személynek magának kell a megfelelő pályán tartani az eszközt. Emiatt a mozgást a fő mozgató izmok végzik és a tartó izmok stabilizálnak közben, ergo nagyon hatékony, sokrétű terhelést kap a teljes vázizomzat. A mozgások természet közelibbek, hiszen arra szoktatják az izomzatot, hogy egymást erősítve kell dolgozniuk. A szabad súlyos edzés egyértelműen minden kezdő számára ajánlott és mondhatni kötelező. A szabad súlyokkal lehet elsajátítania gyakorlatok szabályos végrehajtását és kialakítani az úgy nevezett agy-izom kapcsolatot. Céltól, fejlettségtől függetlenül mindenki számára alapvető, hogy a szabad súlyzókkal végzett edzés az edzésterv legnagyobb részét tegye ki. A súlyzós edzés az izomerő és az izomméret növelésének leghasznosabb eszköze. A szabad súlyzós edzéssel lokálisan gyenge izomrész javítása, erősítése is megvalósítható. Ha izom-keresztmetszet, izmaink méretének növelése a célunk akkor szabad súlyzós edzést semmiképp nem hagyhatjuk ki edzéseinkből.\n" + "Előnyei:\n" +
                        "– Sokrétű terhelést kap az izomzat, úgy fejlődnek, ahogyan az a mozgás végrehajtása szempontjából legelőnyösebb.\n" +
                        "– Természetes mozgáshoz közelebb áll.\n" +
                        "Hátrányai:\n" +
                        "– Sérülés veszélyesebb (lehet) mint a gépek (ezért is lesz a Pulse Gymben mindig segítő személyzet)\n" +
                        "– Gyakran biztosító partnert igényel a nehezebb gyakorlatoknál";
            case "Crosstraining":
                return "A crosstraining során egy olyan programot kell elképzelned, mely számtalan sportág mozgáskészletéből merít, például az atlétikából, a súlyemelésből, az evezésből, az úszásból és a tornából. Az edzés során nem csak egy-egy izomcsoportot, hanem az egész testet átmozgató gyakorlatokat végzel, és lapvetően ez különbözteti meg a köredzéstől.\n" + "Olyan izmokat erősít, amelyeket nem csak sportolás közben, de akár lépcsőzésnél, kisgyerek emelgetésnél, vagy házimunka közben is használsz, így a mindennapi élet is könnyebbé válik tőle. Mind súlyzós, mind saját testsúlyos gimnasztikai elemeket is tartalmaz. Változatos eszköz használat jellemzi a kettlebelltől egészen az ugrálókötélig.";
            case "Funkcionális edzés":
                return "A funkcionális edzés lényege, hogy a testet egészként kezeli. Nem külön izomcsoportokra fókuszál, hanem összetettebb gyakorlatokkal egyszerre mindig több izomcsoportot dolgoztat meg. A minden napi élet során előforduló mozgások adják az alapot a gyakorlatokhoz, tehát guggolások, emelések, húzó és toló mozgások variációi képezik az edzés alapját. Ahhoz, hogy ezeket az összetettebb gyakorlatokat végre tudjuk hajtani, mindig stabilizálni kell a kiinduló testhelyzetünket a tartó izomzat segítségével. Ezért a funkcionális edzés igen hasznos „mellékhatásaként” erősödnek a hasizmok, mély hátizmok is. A hagyományos alakformáló, erősítő edzésekkel ellentétben a funkcionális edzés komolyan igénybe veszi keringési rendszert is, így állóképességünkre is hatással van. Mivel az edzés összetett, szépen formálja az egész testet, tehát alakformálásra is kiválóan használható, és kondíciónkra is jó hatással lesz!";
            case "Erőemelés":
                return "Az erősportok két jeles képviselője az erő-, valamint a súlyemelés. Mindkét sportágban óriási szerepet kap az izmok nagysága, ereje, a robbanékonyság (a szakításhoz, a súly fej fölé emeléséhez). Az izomtömeg nagysága, a teljes testtömeg és az izomerő között összefüggés mutatható ki, ezért az edzésprogramnak kettős célja van: az izomtömeg építés, valamint az erőnövelés. Harmadsorban pedig a robbanékonyság fejlesztése sem hanyagolható el.\n" + "Feltehetjük a kérdést, hogy vajon mi az alapvető különbség a súly- és erőemelés között. Nos, valójában a dinamizmusban, a gyorsaság, ill. robbanékonyság jelentőségében, szerepében térnek el egymástól. Míg a súlyemelés szakítást és lökést különböztet meg, amelyben a lendületből származó energia segíti a súly fej fölé vitelét, addig az erőemelés során a súlyt nyugalmi helyzetből kell a végcélig juttatni. Három különböző gyakorlatot kell kivitelezni: guggolást, fekvenyomást és felhúzást. Nem lendületből mozgatják a súlyokat, ezért gondosan kivitelezett mozgássorra van szükség.\n" +
                        "Mindkét sportágban kitüntetett szerepet kapnak a láb és fenék izmai, hiszen a guggoláshoz, szakításhoz, lökéshez, a súlyok megtartásához rendkívül erős alsó testfélre van szükség. A törzs (derék, hát, has, mellkas) izmai a súly megtartásában, egyensúlyozásában játszanak szerepet. A karok, vállak, nyak, hát a súlyok megemelésének zálogai. A kéz szorítóereje sem nélkülözhető.\n" +
                        "Mindkét sportághoz igen alapos bemelegítés és megfelelő levezetés kell, amely hozzátartozik az edzésprogramhoz, hiszen mivel hatalmas súlyok kerülnek mozgásba, ezért nagy a sérülésveszély.\n" +
                        "Manapság új mozgásformaként bejött crossfit, crosstraining edzésformák merítenek mindkét sportág elemiből, így megtanulások, gyakorlásuk ehhez a két sport műveléséhez és elengedhetetlenek.";
            default:
                return "Nincs leírás ehhez az edzéstípushoz.";
        }
    }

    private int getImageResourceId(String workoutType) {
        switch (workoutType) {
            case "Szabad súlyos edzés":
                return R.drawable.szabadsuly;
            case "Crosstraining":
                return R.drawable.crosstraining;
            case "Funkcionális edzés":
                return R.drawable.funkcionalis;
            case "Erőemelés":
                return R.drawable.eroemeles;
            default:
                return R.drawable.alap;
        }
    }
}