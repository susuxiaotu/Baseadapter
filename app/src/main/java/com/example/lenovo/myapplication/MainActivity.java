package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private GridView gridview;
    private List<Map<String,Object>> datalist;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inint();
        gridview=(GridView) findViewById(R.id.gridview);
        myAdapter=new MyAdapter(datalist,this);
        gridview.setAdapter(myAdapter);
    }

    private void inint() {
        int[] images={R.drawable.cat2,R.drawable.feature1,R.drawable.feature2,R.drawable.feature3,R.drawable.feature4,R.drawable.feature5};
        String[] prices={"￥1","￥2","￥3","￥4","￥5","￥6"};
        String[] contents={"秦时明月汉时关，万里长征人未还。但使龙城飞将在，不教胡马度阴山。","朝辞白帝彩云间，千里江陵一日还。两岸猿声啼不住，轻舟已过万重山。",
                " 月落乌啼霜满天，江枫渔火对愁眠。姑苏城外寒山寺，夜半钟声到客船。"," 远上寒山石径斜，白云深处有人家。停车坐爱枫林晚，霜叶红于二月花。",
                "黑云翻墨未遮山，白雨跳珠乱入船。卷地风来忽吹散，望湖楼下水如天。",
                "竹外桃花三两枝，春江水暖鸭先知。蒌蒿满地芦芽短，正是河豚欲上时。"};
        datalist=new ArrayList<>();
        for (int i=0;i<images.length;i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image", images[i]);
            map.put("price", prices[i]);
            map.put("content", contents[i]);
            datalist.add(map);
        }
    }
}
