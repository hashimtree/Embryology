package com.embrmedia.my;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class em1 extends Activity {
    
    Context context ;
    
    private TextView countLabel;
    private TextView questionLabel;
    private Button ansButton1;
    private Button ansButton2;
    private Button ansButton3;
    private Button ansButton4;
    private String rightAnswer;
    private int rightAnswerCount=0;
    private int quizCount=1;
    private final int QUIZ_COUNT=5;
ArrayList<ArrayList<String>> quizArray =new ArrayList<>();
    
  //////questions here////
  String quizData [][]={
            //{"Country","RightAnswer","Choice1","Choice2","Choice3};
    {"1. Female reproductive system consists of the following except:","Testes ","Uterus ","Ovary","Vagina "},
    {"2. The function of female reproductive system are the followings except:","Formation of  spermatozoa","Formation of the ova","Reception of spermatozoa","Child birth"},

{"3. Female internal genitalia composed of the following except:","Vulva","Uterus","Two utrine tubes ","Vagina"},

{"4. All are Function of Male reproductive system except:","Reception of spermatozoa", "Production of spermatozoa","Delivery of spermatozoa in female reproductive tract","Storage of spermatozoa"},

{"5. Female reproductive  organs includes all of the followings except:","Long hair", "Breast", "External genitalia","Internal Genitalia"},

{"6. Female internal genitalia include the followings except:","Breasts","Uterus","Ovaries","Vagina"},

{"7. Male reproduction system includes the followings except:","Breasts","Seminal Vesicles","Urethera","Testis"},
{"8. Parts of uterus include the followings except:","Vulva","Fundus","Cervix","Body"},
{"9. Functions of female reproductive system include all the followings except:","Production of spermatozoa","Parturition","Reception of sperms","Production of ova"},

{"10. Functions of female reproductive system include the followings except:","No role in feeding","Lactation","Is Suitable environment for pregnancy","Hormones production"},

{"11. All of the followings are true about ovaries except:","Found inside uterus","Produce ova","Produce hormones","Found in Pelvic Cavity"},{"12. All are true except:","Ova are male gametes","Ovary stores ova","Spermatozoa are male gametes","Hypothalamus and pituitary gland control ovulation"},
{"13 Regarding breast all are true except:","Essential organ of reproduction","Has areola and nipple","Consists of glandular tissue","Rudimentary in males"},{"14. All are true about gametogenesis except:","Called spermatogenesis in female","Called oogenesis in female","Occurs in testis","Occurs in ovary"},

{"15. All are true about oogenesis except:","Forms the male gametes","Produces ova","Occurs in ovary","Produces female gamete called ovum"},

{"16. True about Primary oocyte except:","Has  haploid number of chromosomes 23","Divdes by meiosis","Has 44 autosomes or chromosomes","Has 2 sex chromosomes or diploid"},

{"17. True about ovulation except:","Discharges secondary oocyte from Graffian follicle","After ovulation follicle becomes corpus luteum","Controlled by LH hormone","Controlled by pituitary gland"},

//////

////////


{"18. True about fertilization except:","Occurs in ovary","Fusion of sperm and ovum resulting in Zygote","Occurs in uterine tube","Only one sperm enters ovum"},{"19. Stages of Embryology include the followings except:","They are 4 stages","Germinal period", "Embryonic peroid ","Foetal period"},{"20. True about germinal period of embryology except:","Occurs in first to second weeks only","Occurs in first three weeks","From 1st to 3rd week","It is the first stage of embryologic life"},
 {"21. Germinal peroid of embryology includes all the followings except:","Shape and external appearance of embryo","Cleavage division","Blastocyst formation","Blastocyst implantation"},
{"22. True about the embryonic period of embryology except:","Includes  rapid growth of fetus","Occurs in 4th to 8th week","Shape of embryo forms","Baby called embryo during period"},
 
 {"23. True about foetal period of embryology except:","Starts in second month","Baby called fetus during peroid","Extends from 3rd month till birth","Rapid growth and placenta complete formation"},

 
 {"24. Changes of first week include all the followings except:","Oogenesis","Fertilization","Cleavage","Morula and Blastocyst implantation"},
 
 {"25. All are true about cleavage except:","Includes zygote division by meiosis","Includes repeated mitosis of zygote","Increases cells number forming blastomere", "Occurs in uterine tube"},
 
////// Morula/////Blastocyst///

 {"26. True about morula except:","Has 1000 cells","Inner cell mass forms the embryo","Outer cell mass for protection and nutrition of embryo","Zona pellucida forms"},
 
 {"27. All are true about Blastocyst except:","Is formed in second week", "Fluid enters Merula to form blastocele","Merula changes to Blastocyst","Forms in uterus during 1st week"},
 
 {"28. True about Blastocyst except:","Trophoblast is inner cell mass","Trophoblast is the outer cell mass","Trophoblast forms the placenta","Formed on 4th to 5th day of fertilization"},
 
 {"29. True about Blastocyst except:","Blastocele is filled with blood not fluid","Has outer cells mass  called trophoblast to form placenta","Has inner cells mass called embryoblast to form embryo","Fluid filled Blastocyst is called merula"},
 
 //////*/////*///
 
{"30. All of the followings are true about Blastocyst except:","Embryoblast is outer cell mass","Trophoblast is outer cell mass","Embryoblast layer forms the baby","Trophoblast forms the placenta"},
 
 {"31. All are true about Blastocyst except:","Implantation of Blastocyst occurs in second day","Trophoblast is responsible for implantation","Trophoblast regulates exchange of O2 and metabolites","Also called trophoderm"},
 
 
 {"32. True about Trophoblast except:","Is the inner cell mass of Blastocyst", "Primary responsible for implantation","Forms planceta","Control O2 and Metabolites exchange"},
 
 {"33. Regarding implementation the followings are true except:","Occurs at 6th day after ovulation","By Blastocyst","Penetrates endometrium","Blastocyst penetrates fundus of uterus"},
 
 
 {"34. True about implantation except:","Occurs in uterine tube","At 6th day of fertilization","Completed in 5 days","Changes uterine endometrium to decidua"},
 
 {"35. All are true about stages of implantation except:","Zona pelluceda disappears by day 10","Trophoblast penetrates epithelium of endometrium","Blastocyst adheres at 6th day","Blastocyst Embedding in endometrium at 8th day"},
///////*
/////week 2 bilaminar////* 

 {"36. Regarding early development all are true except:","Blastocyst produces merula","Blastocyst produces trophoblast and embryoblast","Zygote produces merula","Merula produces blastocyst"},{"37. True about embryoblast except:","Mass of million cells","Transforms in epiblast and hypoblast","Is epithelial tissue","Forms the baby embryo later"},
 
 {"38. True about embryoblast except:","Forms the placenta later on ","Forms 2 layers before implantation completed","Epiblast has columnar epithelium","Hypoblast has cuboidal epithelium"},
 
 {"39. Important incidents of second gestational week include the followings except:","Trilaminar disc formation","Formation of bilaminar disc which will give rise to all body","Completion of implantation","Decidua reaction"},
 
{"40. True about decidua reaction except:","Occurs in week 3","Syncytiotrophoblast displaces endometrium of uterus", "Syncytiotrophoblast cells fills with nutrients glycogen and fat","Nutrients spills in connective tissue"},
 

 
 
 
 {"41. The following are true about ovulation except:","Process of discharge primary ooccyt","The responsible hormone is LH.","Process of discharge secondary ooccyt","After ovulation the follicle changes into corpus luteum"},
 {"42. Stages of embryology are the the following except:","Ovulation period","Germinal period","Embryonic period","Foetal period"},
 
 {"43. Oogensis is the following except:","Formation of male germs cells","Formation of female germ cells","happens in the ovary","Spherical in shape"},
 


{"44. Male reproductive system consist of the following except:","Ovary","Testis","Prostate gland","Scrotum"},

{"45. The uterus consists of except:","Vagina","Fundus","Cervix","Body"},



 
  {"46. All of the followings are true about spermatogenesis","Includes meiosis only","Produces diploid gametes with 46 chromosomes", "Sprmatids mature into Spermatozoa","Maintains reserve of germ cell population"},
 

 
 ////////*


/////*
{"47. By the end of second week all are true except:","Bilaminar disc is formed after that","Trophoblast grows faster than embryoblast","The 2 layer bilaminar disc is formed","Bilaminar disc gives rise to other tissues and organs"},
 
 ///////*third week////*
 
 ////////***/////
 

 
 {"48. True about Gastrulation except:","All answers are false","Is the process of formation of trilaminar disc","Begins with formation of primitive streak","Trilaminar disc layers are ectoderm, mesoderm and endoderm"},
 
 {"49. Gastrulation contains followings except:","All answers are false","Primitive streak","Primitive node","Buccopharyngeal and cloacal membranes"},
 
 
 {"50. True except:","Trilaminar disc has one layer","Trilaminar disc is source of all germ layers","Trilaminar disc forms all tissues and organs", "Gastrulation includes cells migration"},
 
 {"51. True except:","Cloacal membrane forms future mouth","Oropharyngeal membrane forms in cranial end of trilaminar disc","Oropharyngeal membrane forms future mouth","Cloacal membrane forms future anus"},

{"52. All are true about notochord except:","Develops from trophoblast","Forms Nervous system","Forms vertebral cord","Forms  axial skeleton"},




{"53. All are true about fetal membranes except:","Derived from embryo","Derived from zygote","Include amnion, chorion and yolk sac","Include connecting stalk"},
 
  {"54. True about placenta except:","Derived from mother only","Has fetal portion","Has mother portion","For nutrition, gas and wastes exchange"},
  
  {"55. Functions of placenta include all of the followings except:","All answers are false","Hormones production","Exchange","Antibodies Transmission"},
  
  {"56. True about folding except:","Occurs at week 8","Due to rapid growth of neural tube and somites","There is head and tail folding","There is lateral folding"},
  ///////*organogenesis////
  
  //////
  
  
 
  
  {"57. True about embryonic period except:","Extends over 4th to 12th week","Involves organogenesis","Neural tube forms brain","Neural crest forms cranial and spinal nerves"},
  

  {"58. Derivatives of endoderm include all of the followings except:","Brain","Epithelium of gut","Epithelium of pancreas", "Epithelium of liver and urinary bladder"},
  
  ///_//morula
  {"59. True about merula except:","Formed after Blastocyst","Mullberry appearance with zona pelluceda","Outer cell mass is protective","Inner cells mass forms the embryo"},{"All are true about fetus except:","Forms by week 12","From week 8 organs are formed","Looks human","Fetus forms by the 8th week"},
  
  {"60. All of the followings tissues are derived from ectoderm except:","Notochord","Epidermis","Nervous system","Cornea and lens of eye"},{"All of the followings are derived from mesoderm except:","Nervous system","Notochord","Muscloskeletal system","Circulatory and lymphatic system"},
  
   {"61. All of the followings are derived from endoderm except:","Notochord","Epithelial linings of digestive, respiratory systems","Liver","Pancreas"},
   
   {"62. Embryonic membranes include the followings except:","Amnion surrounds all embryo and placenta", "Chorion surrounds placenta+embryo","Allantois holds wastes","Yolk sac holds nutrients"},
  
  {"63. All are true about gastrula except:","Forms earlier than Blastocyst","Endoderm becomes inner layer of blood vessels","Mesoderm becomes blood","Ectoderm becomes nervous system"},
  {"64. True about notochord except:","Forms the digestive system","Forms axial skeleton","Forms neural tube which will form brain","Forms vertebral column"},
  
   {"65. Stages of embryology include the followings except:","All answers are false","Germinal period from 1- 3 weeks","Embryonic period from 4- 8 weeks","Foetal period from 3rd month till birth"}
   };                

Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_23);
   countLabel = (TextView)findViewById(R.id.countLabel);
        questionLabel = (TextView)findViewById(R.id.questionLabel);
        ansButton1 = (Button)findViewById(R.id.ansButton1);ansButton2 = (Button)findViewById(R.id.ansButton2);ansButton3 = (Button)findViewById(R.id.ansButton3);ansButton4 = (Button)findViewById(R.id.ansButton4);
//////////     
           //Create Quiz Array from Quiz Data
        for (int i=0;i<quizData.length;i++){
            ArrayList<String> tmpArray=new ArrayList<>();
            tmpArray.add(quizData[i][0]);
            tmpArray.add(quizData[i][1]);
            tmpArray.add(quizData[i][2]);
            tmpArray.add(quizData[i][3]);
            tmpArray.add(quizData[i][4]);
   // add tmpArray to QuiArray
 quizArray.add(tmpArray);
        }
        showNextQuiz();
     }
     public  void showNextQuiz(){         countLabel.setText("Question" + quizCount);
         //Generating a random number between 0 and quizArray's length -1
         Random random =new Random();
         int randomNum=random.nextInt(quizArray.size());
         ArrayList<String> Quiz = quizArray.get(randomNum);
         questionLabel.setText("Code:M2H"+ Quiz.get(0)  +"? ");
         rightAnswer=Quiz.get(1);
         Quiz.remove(0);
         Collections.shuffle(Quiz);         ansButton1.setText(Quiz.get(0));         ansButton2.setText(Quiz.get(1));        ansButton3.setText(Quiz.get(2));         ansButton4.setText(Quiz.get(3));
quizArray.remove(randomNum);
     }
public void checkAnswer(View view){
         Button ansButton=(Button) findViewById(view.getId());
         String btntxt= ansButton.getText().toString();
         String alertTitle;         if(btntxt.equals(rightAnswer)){
             alertTitle="Correct";
             rightAnswerCount++;}
else{alertTitle="You are False";}
AlertDialog.Builder builder=new AlertDialog.Builder(this);         builder.setTitle(alertTitle);
         builder.setMessage(rightAnswer);         builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialogInterface, int i) {
if (quizCount == QUIZ_COUNT){
//show result
Intent intent=new Intent(getApplicationContext(),em2.class);  
///////id//////
SharedPreferences settings2 = getSharedPreferences("Quizapp", Context.MODE_PRIVATE);
String myPassword=getIntent().getStringExtra("RIGHT_ANSWER_COUN"); intent.putExtra("RIGHT_ANSWER_COUN",myPassword);  
  //////end////  
  ////name/////
SharedPreferences settings3 = getSharedPreferences("Quizapp", Context.MODE_PRIVATE);
String nname=getIntent().getStringExtra("RIGHT_ANSWER_COU"); intent.putExtra("RIGHT_ANSWER_COU",nname);   
  //////////  
                               intent.putExtra("RIGHT_ANSWER_COUNT",rightAnswerCount);                           startActivity(intent);}
else { quizCount++;                         showNextQuiz();}
             }
         });         builder.setCancelable(false);
        builder.show();
    /////
    
    //////
   ////* send//////
  btn1=(Button)findViewById(R.id.btn1);
    btn1.setOnClickListener(new View.OnClickListener(){
 public void onClick (View v){
 PackageManager pm = em1.this.getPackageManager();
         try {
            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "YOUR TEXT HERE";
            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT,  "http://www.facebook.com/gcmstsudan");
            startActivity(Intent.createChooser(waIntent, "Share with"));
         } catch (PackageManager.NameNotFoundException e) {
               Toast.makeText(em1.this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
               .show();
            }
  

   } 
   });
 
  
  ///////
  ////////     
        
        
        
        
        
        
        
        
        
     }
}
   
   
    


