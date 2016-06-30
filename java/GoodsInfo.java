package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class GoodsInfo extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_CARD_DESC = "";
    public static final String DEFAULT_CARD_TAG = "";
    public static final String DEFAULT_LABEL_TEXT = "";
    public static final String DEFAULT_LEGO_CARD = "";
    public static final String DEFAULT_POP_WINDOW_TEXT = "";
    public static final String DEFAULT_THREAD_CONTENT = "";
    public static final String DEFAULT_THREAD_PIC = "";
    public static final String DEFAULT_THREAD_TITLE = "";
    public static final String DEFAULT_THREAD_TYPE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String card_desc;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String card_tag;
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

    /* synthetic */ GoodsInfo(Builder builder, boolean z, GoodsInfo goodsInfo) {
        this(builder, z);
    }

    private GoodsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.user_portrait == null) {
                this.user_portrait = "";
            } else {
                this.user_portrait = builder.user_portrait;
            }
            if (builder.thread_title == null) {
                this.thread_title = "";
            } else {
                this.thread_title = builder.thread_title;
            }
            if (builder.thread_pic == null) {
                this.thread_pic = "";
            } else {
                this.thread_pic = builder.thread_pic;
            }
            if (builder.pop_window_text == null) {
                this.pop_window_text = "";
            } else {
                this.pop_window_text = builder.pop_window_text;
            }
            if (builder.goods_style == null) {
                this.goods_style = DEFAULT_GOODS_STYLE;
            } else {
                this.goods_style = builder.goods_style;
            }
            if (builder.thread_pic_list == null) {
                this.thread_pic_list = DEFAULT_THREAD_PIC_LIST;
            } else {
                this.thread_pic_list = immutableCopyOf(builder.thread_pic_list);
            }
            if (builder.label_visible == null) {
                this.label_visible = DEFAULT_LABEL_VISIBLE;
            } else {
                this.label_visible = builder.label_visible;
            }
            if (builder.label_text == null) {
                this.label_text = "";
            } else {
                this.label_text = builder.label_text;
            }
            if (builder.rank_level == null) {
                this.rank_level = DEFAULT_RANK_LEVEL;
            } else {
                this.rank_level = builder.rank_level;
            }
            if (builder.thread_type == null) {
                this.thread_type = "";
            } else {
                this.thread_type = builder.thread_type;
            }
            if (builder.button_text == null) {
                this.button_text = "";
            } else {
                this.button_text = builder.button_text;
            }
            if (builder.card_desc == null) {
                this.card_desc = "";
            } else {
                this.card_desc = builder.card_desc;
            }
            if (builder.card_tag == null) {
                this.card_tag = "";
            } else {
                this.card_tag = builder.card_tag;
            }
            if (builder.width == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = builder.width;
            }
            if (builder.height == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = builder.height;
            }
            if (builder.label_measure == null) {
                this.label_measure = DEFAULT_LABEL_MEASURE;
            } else {
                this.label_measure = builder.label_measure;
            }
            if (builder.thread_content == null) {
                this.thread_content = "";
            } else {
                this.thread_content = builder.thread_content;
            }
            if (builder.lego_card == null) {
                this.lego_card = "";
                return;
            } else {
                this.lego_card = builder.lego_card;
                return;
            }
        }
        this.id = builder.id;
        this.user_name = builder.user_name;
        this.user_portrait = builder.user_portrait;
        this.thread_title = builder.thread_title;
        this.thread_pic = builder.thread_pic;
        this.pop_window_text = builder.pop_window_text;
        this.goods_style = builder.goods_style;
        this.thread_pic_list = immutableCopyOf(builder.thread_pic_list);
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
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GoodsInfo> {
        public String button_text;
        public String card_desc;
        public String card_tag;
        public Integer goods_style;
        public Integer height;
        public Integer id;
        public Integer label_measure;
        public String label_text;
        public Integer label_visible;
        public String lego_card;
        public String pop_window_text;
        public Integer rank_level;
        public String thread_content;
        public String thread_pic;
        public List<ThreadPicList> thread_pic_list;
        public String thread_title;
        public String thread_type;
        public String user_name;
        public String user_portrait;
        public Integer width;

        public Builder() {
        }

        public Builder(GoodsInfo goodsInfo) {
            super(goodsInfo);
            if (goodsInfo != null) {
                this.id = goodsInfo.id;
                this.user_name = goodsInfo.user_name;
                this.user_portrait = goodsInfo.user_portrait;
                this.thread_title = goodsInfo.thread_title;
                this.thread_pic = goodsInfo.thread_pic;
                this.pop_window_text = goodsInfo.pop_window_text;
                this.goods_style = goodsInfo.goods_style;
                this.thread_pic_list = GoodsInfo.copyOf(goodsInfo.thread_pic_list);
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GoodsInfo build(boolean z) {
            return new GoodsInfo(this, z, null);
        }
    }
}
