package com.kkontus.vastxmlparser.activities;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kkontus.vastxmlparser.R;
import com.kkontus.vastxmlparser.xmlmodels.VAST;
import com.stanfy.gsonxml.GsonXml;
import com.stanfy.gsonxml.GsonXmlBuilder;
import com.stanfy.gsonxml.XmlParserCreator;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        XmlParserCreator parserCreator = new XmlParserCreator() {
            @Override
            public XmlPullParser createParser() {
                try {
                    return XmlPullParserFactory.newInstance().newPullParser();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };

        GsonXml gsonXml = new GsonXmlBuilder()
                .setXmlParserCreator(parserCreator)
                .setPrimitiveArrays(true)
                .setSameNameLists(true)
                .create();

        String xml = loadXmlFromFile("vast.xml");
        //String xml = loadXmlFromCode();
        System.out.println("Loaded XML file:");
        //System.out.println(xml);

        VAST vastModel = gsonXml.fromXml(xml, VAST.class);

        //http://static.vagrant.dev/6a97888ec52c042c679a36e919843cca/videos/359836/1719100027841900_1.mp4

        System.out.println(vastModel.getVersion());
        System.out.println(vastModel.getAd().size());
        System.out.println(vastModel.getAd().get(0).getId());
        System.out.println(vastModel.getAd().get(0).getInLine());
        System.out.println(vastModel.getAd().get(0).getInLine().getAdSystem());
        System.out.println(vastModel.getAd().get(0).getInLine().getAdTitle());
        System.out.println(vastModel.getAd().get(0).getInLine().getError());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getSequence());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getId());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getSkipoffset());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getDuration());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getTrackingEvents());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getTrackingEvents().getTracking());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getTrackingEvents().getTracking().get(0).getEvent());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getTrackingEvents().getTracking().get(0).getOffset());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getTrackingEvents().getTracking().get(0).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getVideoClicks());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getVideoClicks().getClickThrough());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getMediaFiles().getMediaFile());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getMediaFiles().getMediaFile().get(0).getDelivery());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getMediaFiles().getMediaFile().get(0).getType());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getMediaFiles().getMediaFile().get(0).getValue());

        /*
        System.out.println(vastModel.getVersion());
        System.out.println(vastModel.getAd().size());
        System.out.println(vastModel.getAd().get(0).getInLine().getExtensions());
        System.out.println(vastModel.getAd().get(0).getInLine().getExtensions().getExtension().get(0).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getExtensions().getExtension().get(1).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getExtensions().getExtension().get(2).getValue());
        System.out.println(vastModel.getAd().get(1).getInLine().getExtensions().getExtension().get(0).getValue());
        System.out.println(vastModel.getAd().get(1).getInLine().getExtensions().getExtension().get(1).getValue());
        System.out.println(vastModel.getAd().get(1).getInLine().getExtensions().getExtension().get(2).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getImpression().get(0));
        System.out.println(vastModel.getAd().get(0).getInLine().getImpression().get(1));
        System.out.println(vastModel.getAd().get(0).getInLine().getImpression().get(2));
        System.out.println(vastModel.getAd().get(1).getInLine().getImpression().get(0));
        System.out.println(vastModel.getAd().get(1).getInLine().getImpression().get(1));
        System.out.println(vastModel.getAd().get(1).getInLine().getImpression().get(2));
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getId());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getSequence());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getDuration());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getAdParameters());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getTrackingEvents().getTracking().get(0).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getTrackingEvents().getTracking().get(1).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getMediaFiles().getMediaFile().get(0).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getMediaFiles().getMediaFile().get(1).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getCreativeExtensions().getCreativeExtension().get(0).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getCreativeExtensions().getCreativeExtension().get(1).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getVideoClicks().getClickThrough());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getVideoClicks().getClickTracking().get(0).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getVideoClicks().getClickTracking().get(1).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getVideoClicks().getCustomClick().get(0).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getVideoClicks().getCustomClick().get(0).getValue());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getIcons().getIcon().get(0).getIconViewTracking().get(0));
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getIcons().getIcon().get(0).getIconViewTracking().get(1));
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getIcons().getIcon().get(0).getIconClicks().getIconClickThrough());
        System.out.println(vastModel.getAd().get(0).getInLine().getCreatives().getCreative().get(0).getLinear().get(0).getIcons().getIcon().get(0).getIconClicks().getIconClickTracking().get(0));
        */

        /*
        System.out.println(vastModel.getAd().getId());
        System.out.println(vastModel.getAd().getInLine());
        System.out.println(vastModel.getAd().getInLine().getAdSystem());
        System.out.println(vastModel.getAd().getInLine().getAdTitle());
        System.out.println(vastModel.getAd().getInLine().getError());
        System.out.println(vastModel.getAd().getInLine().getCreatives());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getSequence());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getId());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getSkipoffset());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getDuration());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getTrackingEvents());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getTrackingEvents().getTracking());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getTrackingEvents().getTracking().getEvent());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getTrackingEvents().getTracking().getOffset());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getTrackingEvents().getTracking().getValue());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getVideoClicks());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getVideoClicks().getClickThrough());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getMediaFiles().getMediaFile());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getMediaFiles().getMediaFile().getDelivery());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getMediaFiles().getMediaFile().getType());
        System.out.println(vastModel.getAd().getInLine().getCreatives().getCreative().getLinear().getMediaFiles().getMediaFile().getValue());
        */
    }

    public String loadXmlFromCode() {
        String xml = "<VAST version=\"3.0\">\n" +
                "  <Ad id=\"1413833\">\n" +
                "    <InLine>\n" +
                "      <AdSystem>ExoClick</AdSystem>\n" +
                "      <AdTitle/>\n" +
                "      <Error><![CDATA[http://main.vagrant.dev/view.php?errorcode=[ERRORCODE]&idzone=2051755]]></Error>\n" +
                "      <Creatives>\n" +
                "        <Creative sequence=\"1\" id=\"13803673\">\n" +
                "          <Linear skipoffset=\"00:00:11\">\n" +
                "            <Duration>00:00:13.35</Duration>\n" +
                "            <TrackingEvents>\n" +
                "              <Tracking event=\"progress\" offset=\"00:00:10.000\"><![CDATA[http://main.vagrant.dev/view.php?tracking_event=progress&progress=00:00:10.000&idzone=2051755]]></Tracking>\n" +
                "            </TrackingEvents>\n" +
                "            <VideoClicks>\n" +
                "              <ClickThrough><![CDATA[http://main.vagrant.dev/click.php?data=IHwxNDEzODMzfHxodHRwJTNBJTJGJTJGZ29vZ2xlMS5iZ3x8fDB8fDE0ODcyMzYzNjd8bWFyaW4xLjBjYXRjaC5jb218MTAuNDIuMC4xfHwxMzgwMzY3M3wyMDUxNzU1fDQ3Mnw1MXw0MXwzfDE1fDB8MHx8fDF8MHx8NThhMWFkNTY4OTZkZTUuODgxNDk1ODQyMjY4MjgyMzMyfDE4NTl8fDF8MHx8MHwwfDB8ICB8fDF8T0t8Y2VlMTYyNzQ2MTIyOGMyOGQ5MTE4YTBkM2U0YWRmYTM%3D]]></ClickThrough>\n" +
                "            </VideoClicks>\n" +
                "            <MediaFiles>\n" +
                "              <MediaFile delivery=\"progressive\" type=\"video/mp4\"><![CDATA[http://static.vagrant.dev/6a97888ec52c042c679a36e919843cca/videos/359836/1719100027841900_1.mp4]]></MediaFile>\n" +
                "            </MediaFiles>\n" +
                "          </Linear>\n" +
                "        </Creative>\n" +
                "      </Creatives>\n" +
                "    </InLine>\n" +
                "  </Ad>\n" +
                "</VAST>";

        return xml;
    }

    private String loadXmlFromFile(String filename) {
        String xml = null;
        AssetManager assetManager = getAssets();
        try {
            InputStream is = assetManager.open(filename);
            xml = getStringFromInputStream(is);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();  // TODO: Customise this generated block
        }
        return xml;
    }

    private String getStringFromInputStream(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

}
