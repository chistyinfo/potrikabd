package example.potrikabd.Tab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import example.potrikabd.InterListAdapter1;
import example.potrikabd.R;
import example.potrikabd.WebActivity;


public class TwoFragment extends Fragment {
    private ListView list1;
    String[] itemname ={
            "আনন্দ আলো",
            "অনন্যা",
            " অবসর",
            " বিনোদন প্লাস ",
            "ঢাকা ম্যাগাজিন"

    };
    Integer[] imgid={
            R.drawable.andoalo,
            R.drawable.anona,
            R.drawable.aboshor,
            R.drawable.binodonplus,
            R.drawable.dhakamagazine

    };
    String[] urlStrArray={"http://ananda-alo.com/",
            "http://anannya.com.bd/","http://www.abasar.net/",
            "http://binodonplus.com/",
            "http://dhakamagazine.com/"
           };

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_two, container, false);

//        AdView mAdView = (AdView) rootView.findViewById(R.id.adView2);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);
//
//        WebView webView3= (WebView) rootView.findViewById(R.id.webView3);
//        webView3.loadUrl("http://www.cse.com.bd/market_depth.php");
//        webView3.getSettings().setJavaScriptEnabled(true);
//        webView3.setWebViewClient(new WebViewClient());
        InterListAdapter1 adapter = new InterListAdapter1(getActivity(), itemname, imgid);
        list1 = (ListView) rootView.findViewById(R.id.list1);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                        @Override
                                        public void onItemClick(AdapterView<?> parent, View view,
                                                                int position, long id) {


                                            String Slecteditem = itemname[+position];
                                            view.setSelected(true);
                                            Intent intent = new Intent(getActivity(), WebActivity.class);
                                            intent.putExtra("url", urlStrArray[position]);
                                            TwoFragment.this.startActivity(intent);

                                        }






                                    }

        );


        return rootView;

    }

}
