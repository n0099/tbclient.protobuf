package tbclient;

import com.baidu.swan.game.guide.GameGuideConfigInfo;
import com.baidu.tbadk.core.atomData.MissonDetailsActivityConfig;
import com.baidu.tbadk.core.atomData.WriteActivityConfig;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes8.dex */
public final class GoodsInfo extends Message {
    public static final String DEFAULT_AD_SOURCE = "";
    public static final String DEFAULT_BRAND_ICON = "";
    public static final String DEFAULT_BRAND_ICON_WH = "";
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_BUTTON_URL = "";
    public static final String DEFAULT_CARD_DESC = "";
    public static final String DEFAULT_CARD_TAG = "";
    public static final String DEFAULT_LABEL_TEXT = "";
    public static final String DEFAULT_LEGO_CARD = "";
    public static final String DEFAULT_POP_WINDOW_TEXT = "";
    public static final String DEFAULT_TAG_NAME = "";
    public static final String DEFAULT_TAG_NAME_URL = "";
    public static final String DEFAULT_TAG_NAME_WH = "";
    public static final String DEFAULT_THREAD_CONTENT = "";
    public static final String DEFAULT_THREAD_PIC = "";
    public static final String DEFAULT_THREAD_TITLE = "";
    public static final String DEFAULT_THREAD_TYPE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String ad_source;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String brand_icon;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String brand_icon_wh;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String button_url;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String card_desc;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String card_tag;
    @ProtoField(tag = 29)
    public final AdCloseInfo close_info;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer goods_style;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer height;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer label_measure;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String label_text;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer label_visible;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String lego_card;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pop_window_text;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer rank_level;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String thread_content;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_pic;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ThreadPicList> thread_pic_list;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thread_title;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String thread_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_portrait;
    @ProtoField(tag = 21)
    public final VideoInfo video_info;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer width;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_GOODS_STYLE = 0;
    public static final List<ThreadPicList> DEFAULT_THREAD_PIC_LIST = Collections.emptyList();
    public static final Integer DEFAULT_LABEL_VISIBLE = 0;
    public static final Integer DEFAULT_RANK_LEVEL = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_LABEL_MEASURE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GoodsInfo> {
        public String ad_source;
        public String brand_icon;
        public String brand_icon_wh;
        public String button_text;
        public String button_url;
        public String card_desc;
        public String card_tag;
        public AdCloseInfo close_info;
        public Integer goods_style;
        public Integer height;
        public Integer id;
        public Integer label_measure;
        public String label_text;
        public Integer label_visible;
        public String lego_card;
        public String pop_window_text;
        public Integer rank_level;
        public String tag_name;
        public String tag_name_url;
        public String tag_name_wh;
        public String thread_content;
        public String thread_pic;
        public List<ThreadPicList> thread_pic_list;
        public String thread_title;
        public String thread_type;
        public String user_name;
        public String user_portrait;
        public VideoInfo video_info;
        public Integer width;

        public Builder() {
        }

        public Builder(GoodsInfo goodsInfo) {
            super(goodsInfo);
            if (goodsInfo == null) {
                return;
            }
            this.id = goodsInfo.id;
            this.user_name = goodsInfo.user_name;
            this.user_portrait = goodsInfo.user_portrait;
            this.thread_title = goodsInfo.thread_title;
            this.thread_pic = goodsInfo.thread_pic;
            this.pop_window_text = goodsInfo.pop_window_text;
            this.goods_style = goodsInfo.goods_style;
            this.thread_pic_list = Message.copyOf(goodsInfo.thread_pic_list);
            this.label_visible = goodsInfo.label_visible;
            this.label_text = goodsInfo.label_text;
            this.rank_level = goodsInfo.rank_level;
            this.thread_type = goodsInfo.thread_type;
            this.button_text = goodsInfo.button_text;
            this.card_desc = goodsInfo.card_desc;
            this.card_tag = goodsInfo.card_tag;
            this.width = goodsInfo.width;
            this.height = goodsInfo.height;
            this.label_measure = goodsInfo.label_measure;
            this.thread_content = goodsInfo.thread_content;
            this.lego_card = goodsInfo.lego_card;
            this.video_info = goodsInfo.video_info;
            this.tag_name = goodsInfo.tag_name;
            this.button_url = goodsInfo.button_url;
            this.ad_source = goodsInfo.ad_source;
            this.tag_name_url = goodsInfo.tag_name_url;
            this.tag_name_wh = goodsInfo.tag_name_wh;
            this.brand_icon = goodsInfo.brand_icon;
            this.brand_icon_wh = goodsInfo.brand_icon_wh;
            this.close_info = goodsInfo.close_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GoodsInfo build(boolean z) {
            return new GoodsInfo(this, z);
        }
    }

    public static GoodsInfo parseFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        builder.id = Integer.valueOf(jSONObject.optInt("id"));
        builder.user_name = jSONObject.optString("user_name");
        builder.user_portrait = jSONObject.optString("user_portrait");
        builder.thread_title = jSONObject.optString(MissonDetailsActivityConfig.THREAD_TITLE);
        builder.thread_pic = jSONObject.optString("thread_pic");
        builder.pop_window_text = jSONObject.optString("pop_window_text");
        builder.goods_style = Integer.valueOf(jSONObject.optInt("goods_style"));
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("thread_pic_list");
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(ThreadPicList.parseFromJson(optJSONArray.optJSONObject(i2)));
        }
        builder.thread_pic_list = arrayList;
        builder.label_visible = Integer.valueOf(jSONObject.optInt("label_visible"));
        builder.label_text = jSONObject.optString("label_text");
        builder.rank_level = Integer.valueOf(jSONObject.optInt("rank_level"));
        builder.thread_type = jSONObject.optString("thread_type");
        builder.button_text = jSONObject.optString(GameGuideConfigInfo.KEY_BUTTON_TEXT);
        builder.card_desc = jSONObject.optString("card_desc");
        builder.card_tag = jSONObject.optString("card_tag");
        builder.width = Integer.valueOf(jSONObject.optInt("width"));
        builder.height = Integer.valueOf(jSONObject.optInt("height"));
        builder.label_measure = Integer.valueOf(jSONObject.optInt("label_measure"));
        builder.thread_content = jSONObject.optString("thread_content");
        builder.lego_card = jSONObject.optString("lego_card");
        builder.video_info = VideoInfo.parseFromJson(jSONObject.optJSONObject(WriteActivityConfig.VIDEO_INFO));
        builder.tag_name = jSONObject.optString("tag_name");
        builder.button_url = jSONObject.optString("button_url");
        builder.ad_source = jSONObject.optString("ad_source");
        builder.tag_name_url = jSONObject.optString("tag_name_url");
        builder.tag_name_wh = jSONObject.optString("tag_name_wh");
        builder.brand_icon = jSONObject.optString("brand_icon");
        builder.brand_icon_wh = jSONObject.optString("brand_icon_wh");
        builder.close_info = AdCloseInfo.parseFromJson(jSONObject.optJSONObject(GameGuideConfigInfo.KEY_CLOSE_INFO));
        return builder.build(false);
    }

    public static JSONObject toJson(GoodsInfo goodsInfo) {
        if (goodsInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", goodsInfo.id);
            jSONObject.put("user_name", goodsInfo.user_name);
            jSONObject.put("user_portrait", goodsInfo.user_portrait);
            jSONObject.put(MissonDetailsActivityConfig.THREAD_TITLE, goodsInfo.thread_title);
            jSONObject.put("thread_pic", goodsInfo.thread_pic);
            jSONObject.put("pop_window_text", goodsInfo.pop_window_text);
            jSONObject.put("goods_style", goodsInfo.goods_style);
            JSONArray jSONArray = new JSONArray();
            for (ThreadPicList threadPicList : goodsInfo.thread_pic_list) {
                jSONArray.put(ThreadPicList.toJson(threadPicList));
            }
            jSONObject.put("thread_pic_list", jSONArray);
            jSONObject.put("label_visible", goodsInfo.label_visible);
            jSONObject.put("label_text", goodsInfo.label_text);
            jSONObject.put("rank_level", goodsInfo.rank_level);
            jSONObject.put("thread_type", goodsInfo.thread_type);
            jSONObject.put(GameGuideConfigInfo.KEY_BUTTON_TEXT, goodsInfo.button_text);
            jSONObject.put("card_desc", goodsInfo.card_desc);
            jSONObject.put("card_tag", goodsInfo.card_tag);
            jSONObject.put("width", goodsInfo.width);
            jSONObject.put("height", goodsInfo.height);
            jSONObject.put("label_measure", goodsInfo.label_measure);
            jSONObject.put("thread_content", goodsInfo.thread_content);
            jSONObject.put("lego_card", goodsInfo.lego_card);
            jSONObject.put(WriteActivityConfig.VIDEO_INFO, VideoInfo.toJson(goodsInfo.video_info));
            jSONObject.put("tag_name", goodsInfo.tag_name);
            jSONObject.put("button_url", goodsInfo.button_url);
            jSONObject.put("ad_source", goodsInfo.ad_source);
            jSONObject.put("tag_name_url", goodsInfo.tag_name_url);
            jSONObject.put("tag_name_wh", goodsInfo.tag_name_wh);
            jSONObject.put("brand_icon", goodsInfo.brand_icon);
            jSONObject.put("brand_icon_wh", goodsInfo.brand_icon_wh);
            jSONObject.put(GameGuideConfigInfo.KEY_CLOSE_INFO, AdCloseInfo.toJson(goodsInfo.close_info));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public GoodsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.user_portrait;
            if (str2 == null) {
                this.user_portrait = "";
            } else {
                this.user_portrait = str2;
            }
            String str3 = builder.thread_title;
            if (str3 == null) {
                this.thread_title = "";
            } else {
                this.thread_title = str3;
            }
            String str4 = builder.thread_pic;
            if (str4 == null) {
                this.thread_pic = "";
            } else {
                this.thread_pic = str4;
            }
            String str5 = builder.pop_window_text;
            if (str5 == null) {
                this.pop_window_text = "";
            } else {
                this.pop_window_text = str5;
            }
            Integer num2 = builder.goods_style;
            if (num2 == null) {
                this.goods_style = DEFAULT_GOODS_STYLE;
            } else {
                this.goods_style = num2;
            }
            List<ThreadPicList> list = builder.thread_pic_list;
            if (list == null) {
                this.thread_pic_list = DEFAULT_THREAD_PIC_LIST;
            } else {
                this.thread_pic_list = Message.immutableCopyOf(list);
            }
            Integer num3 = builder.label_visible;
            if (num3 == null) {
                this.label_visible = DEFAULT_LABEL_VISIBLE;
            } else {
                this.label_visible = num3;
            }
            String str6 = builder.label_text;
            if (str6 == null) {
                this.label_text = "";
            } else {
                this.label_text = str6;
            }
            Integer num4 = builder.rank_level;
            if (num4 == null) {
                this.rank_level = DEFAULT_RANK_LEVEL;
            } else {
                this.rank_level = num4;
            }
            String str7 = builder.thread_type;
            if (str7 == null) {
                this.thread_type = "";
            } else {
                this.thread_type = str7;
            }
            String str8 = builder.button_text;
            if (str8 == null) {
                this.button_text = "";
            } else {
                this.button_text = str8;
            }
            String str9 = builder.card_desc;
            if (str9 == null) {
                this.card_desc = "";
            } else {
                this.card_desc = str9;
            }
            String str10 = builder.card_tag;
            if (str10 == null) {
                this.card_tag = "";
            } else {
                this.card_tag = str10;
            }
            Integer num5 = builder.width;
            if (num5 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num5;
            }
            Integer num6 = builder.height;
            if (num6 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num6;
            }
            Integer num7 = builder.label_measure;
            if (num7 == null) {
                this.label_measure = DEFAULT_LABEL_MEASURE;
            } else {
                this.label_measure = num7;
            }
            String str11 = builder.thread_content;
            if (str11 == null) {
                this.thread_content = "";
            } else {
                this.thread_content = str11;
            }
            String str12 = builder.lego_card;
            if (str12 == null) {
                this.lego_card = "";
            } else {
                this.lego_card = str12;
            }
            this.video_info = builder.video_info;
            String str13 = builder.tag_name;
            if (str13 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str13;
            }
            String str14 = builder.button_url;
            if (str14 == null) {
                this.button_url = "";
            } else {
                this.button_url = str14;
            }
            String str15 = builder.ad_source;
            if (str15 == null) {
                this.ad_source = "";
            } else {
                this.ad_source = str15;
            }
            String str16 = builder.tag_name_url;
            if (str16 == null) {
                this.tag_name_url = "";
            } else {
                this.tag_name_url = str16;
            }
            String str17 = builder.tag_name_wh;
            if (str17 == null) {
                this.tag_name_wh = "";
            } else {
                this.tag_name_wh = str17;
            }
            String str18 = builder.brand_icon;
            if (str18 == null) {
                this.brand_icon = "";
            } else {
                this.brand_icon = str18;
            }
            String str19 = builder.brand_icon_wh;
            if (str19 == null) {
                this.brand_icon_wh = "";
            } else {
                this.brand_icon_wh = str19;
            }
            this.close_info = builder.close_info;
            return;
        }
        this.id = builder.id;
        this.user_name = builder.user_name;
        this.user_portrait = builder.user_portrait;
        this.thread_title = builder.thread_title;
        this.thread_pic = builder.thread_pic;
        this.pop_window_text = builder.pop_window_text;
        this.goods_style = builder.goods_style;
        this.thread_pic_list = Message.immutableCopyOf(builder.thread_pic_list);
        this.label_visible = builder.label_visible;
        this.label_text = builder.label_text;
        this.rank_level = builder.rank_level;
        this.thread_type = builder.thread_type;
        this.button_text = builder.button_text;
        this.card_desc = builder.card_desc;
        this.card_tag = builder.card_tag;
        this.width = builder.width;
        this.height = builder.height;
        this.label_measure = builder.label_measure;
        this.thread_content = builder.thread_content;
        this.lego_card = builder.lego_card;
        this.video_info = builder.video_info;
        this.tag_name = builder.tag_name;
        this.button_url = builder.button_url;
        this.ad_source = builder.ad_source;
        this.tag_name_url = builder.tag_name_url;
        this.tag_name_wh = builder.tag_name_wh;
        this.brand_icon = builder.brand_icon;
        this.brand_icon_wh = builder.brand_icon_wh;
        this.close_info = builder.close_info;
    }
}
