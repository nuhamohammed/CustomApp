package com.mohammednuha.customapp.customapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    public Button btn1, btn2, btn3, btn4, home;
    ImageView img;
    HashMap map;
    Object[] birds;
    int currentBird=0;
    int score=0;
    TextView currscore;
    TextView name;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);
        currscore= findViewById(R.id.score);
        img= findViewById(R.id.imageView);
        name = findViewById(R.id.username);

        String jsonString = "{0: 'Black footed Albatross', 1: 'Laysan Albatross', 2: 'Sooty Albatross', 3: 'Groove billed Ani', 4: 'Crested Auklet', 5: 'Least Auklet', 6: 'Parakeet Auklet', 7: 'Rhinoceros Auklet', 8: 'Brewer Blackbird', 9: 'Red winged Blackbird', 10: 'Rusty Blackbird', 11: 'Yellow headed Blackbird', 12: 'Bobolink', 13: 'Indigo Bunting', 14: 'Lazuli Bunting', 15: 'Painted Bunting', 16: 'Cardinal', 17: 'Spotted Catbird', 18: 'Gray Catbird', 19: 'Yellow breasted Chat', 20: 'Eastern Towhee', 21: 'Chuck will Widow', 22: 'Brandt Cormorant', 23: 'Red faced Cormorant', 24: 'Pelagic Cormorant', 25: 'Bronzed Cowbird', 26: 'Shiny Cowbird', 27: 'Brown Creeper', 28: 'American Crow', 29: 'Fish Crow', 30: 'Black billed Cuckoo', 31: 'Mangrove Cuckoo', 32: 'Yellow billed Cuckoo', 33: 'Gray crowned Rosy Finch', 34: 'Purple Finch', 35: 'Northern Flicker', 36: 'Acadian Flycatcher', 37: 'Great Crested Flycatcher', 38: 'Least Flycatcher', 39: 'Olive sided Flycatcher', 40: 'Scissor tailed Flycatcher', 41: 'Vermilion Flycatcher', 42: 'Yellow bellied Flycatcher', 43: 'Frigatebird', 44: 'Northern Fulmar', 45: 'Gadwall', 46: 'American Goldfinch', 47: 'European Goldfinch', 48: 'Boat tailed Grackle', 49: 'Eared Grebe', 50: 'Horned Grebe', 51: 'Pied billed Grebe', 52: 'Western Grebe', 53: 'Blue Grosbeak', 54: 'Evening Grosbeak', 55: 'Pine Grosbeak', 56: 'Rose breasted Grosbeak', 57: 'Pigeon Guillemot', 58: 'California Gull', 59: 'Glaucous winged Gull', 60: 'Heermann Gull', 61: 'Herring Gull', 62: 'Ivory Gull', 63: 'Ring billed Gull', 64: 'Slaty backed Gull', 65: 'Western Gull', 66: 'Anna Hummingbird', 67: 'Ruby throated Hummingbird', 68: 'Rufous Hummingbird', 69: 'Green Violetear', 70: 'Long tailed Jaeger', 71: 'Pomarine Jaeger', 72: 'Blue Jay', 73: 'Florida Jay', 74: 'Green Jay', 75: 'Dark eyed Junco', 76: 'Tropical Kingbird', 77: 'Gray Kingbird', 78: 'Belted Kingfisher', 79: 'Green Kingfisher', 80: 'Pied Kingfisher', 81: 'Ringed Kingfisher', 82: 'White breasted Kingfisher', 83: 'Red legged Kittiwake', 84: 'Horned Lark', 85: 'Pacific Loon', 86: 'Mallard', 87: 'Western Meadowlark', 88: 'Hooded Merganser', 89: 'Red breasted Merganser', 90: 'Mockingbird', 91: 'Nighthawk', 92: 'Clark Nutcracker', 93: 'White breasted Nuthatch', 94: 'Baltimore Oriole', 95: 'Hooded Oriole', 96: 'Orchard Oriole', 97: 'Scott Oriole', 98: 'Ovenbird', 99: 'Brown Pelican', 100: 'White Pelican', 101: 'Western Wood Pewee', 102: 'Sayornis', 103: 'American Pipit', 104: 'Whip poor Will', 105: 'Horned Puffin', 106: 'Common Raven', 107: 'White necked Raven', 108: 'American Redstart', 109: 'Geococcyx', 110: 'Loggerhead Shrike', 111: 'Great Grey Shrike', 112: 'Baird Sparrow', 113: 'Black throated Sparrow', 114: 'Brewer Sparrow', 115: 'Chipping Sparrow', 116: 'Clay colored Sparrow', 117: 'House Sparrow', 118: 'Field Sparrow', 119: 'Fox Sparrow', 120: 'Grasshopper Sparrow', 121: 'Harris Sparrow', 122: 'Henslow Sparrow', 123: 'Le Conte Sparrow', 124: 'Lincoln Sparrow', 125: 'Nelson Sharp tailed Sparrow', 126: 'Savannah Sparrow', 127: 'Seaside Sparrow', 128: 'Song Sparrow', 129: 'Tree Sparrow', 130: 'Vesper Sparrow', 131: 'White crowned Sparrow', 132: 'White throated Sparrow', 133: 'Cape Glossy Starling', 134: 'Bank Swallow', 135: 'Barn Swallow', 136: 'Cliff Swallow', 137: 'Tree Swallow', 138: 'Scarlet Tanager', 139: 'Summer Tanager', 140: 'Artic Tern', 141: 'Black Tern', 142: 'Caspian Tern', 143: 'Common Tern', 144: 'Elegant Tern', 145: 'Forsters Tern', 146: 'Least Tern', 147: 'Green tailed Towhee', 148: 'Brown Thrasher', 149: 'Sage Thrasher', 150: 'Black capped Vireo', 151: 'Blue headed Vireo', 152: 'Philadelphia Vireo', 153: 'Red eyed Vireo', 154: 'Warbling Vireo', 155: 'White eyed Vireo', 156: 'Yellow throated Vireo', 157: 'Bay breasted Warbler', 158: 'Black and white Warbler', 159: 'Black throated Blue Warbler', 160: 'Blue winged Warbler', 161: 'Canada Warbler', 162: 'Cape May Warbler', 163: 'Cerulean Warbler', 164: 'Chestnut sided Warbler', 165: 'Golden winged Warbler', 166: 'Hooded Warbler', 167: 'Kentucky Warbler', 168: 'Magnolia Warbler', 169: 'Mourning Warbler', 170: 'Myrtle Warbler', 171: 'Nashville Warbler', 172: 'Orange crowned Warbler', 173: 'Palm Warbler', 174: 'Pine Warbler', 175: 'Prairie Warbler', 176: 'Prothonotary Warbler', 177: 'Swainson Warbler', 178: 'Tennessee Warbler', 179: 'Wilson Warbler', 180: 'Worm eating Warbler', 181: 'Yellow Warbler', 182: 'Northern Waterthrush', 183: 'Louisiana Waterthrush', 184: 'Bohemian Waxwing', 185: 'Cedar Waxwing', 186: 'American Three toed Woodpecker', 187: 'Pileated Woodpecker', 188: 'Red bellied Woodpecker', 189: 'Red cockaded Woodpecker', 190: 'Red headed Woodpecker', 191: 'Downy Woodpecker', 192: 'Bewick Wren', 193: 'Cactus Wren', 194: 'Carolina Wren', 195: 'House Wren', 196: 'Marsh Wren', 197: 'Rock Wren', 198: 'Winter Wren', 199: 'Common Yellowthroat'}";
        Gson gson = new Gson();
        map = gson.fromJson(jsonString, HashMap.class);
        birds = map.values().toArray();
        Bundle bundle = getIntent().getExtras();

       // user = bundle.getString("username");
      //  System.out.println(user);
      //  name.setText(user);
    }

    public void changeQuestion(){
        currentBird++;
      //  img.setImageResource();
    }
    public void restart(){
        setContentView(R.layout.activity_main2);
    }
    @Override
    public void onClick(View view) {
        //change image and options
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        if(buttonText.equalsIgnoreCase((String)birds[currentBird])){
            //change button color to green
            b.setBackgroundColor(Color.GREEN);
            score+=1;
            currscore.setText(score);
            changeQuestion();
        }
        else{
            //change button color to red
            b.setBackgroundColor(Color.RED);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            restart();
        }
    }
}
