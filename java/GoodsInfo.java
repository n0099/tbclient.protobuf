package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class GoodsInfo extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_LABEL_TEXT = "";
    public static final String DEFAULT_POP_WINDOW_TEXT = "";
    public static final String DEFAULT_THREAD_PIC = "";
    public static final String DEFAULT_THREAD_TITLE = "";
    public static final String DEFAULT_THREAD_TYPE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer goods_style;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String label_text;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer label_visible;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pop_window_text;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer rank_level;
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
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_GOODS_STYLE = 0;
    public static final List<ThreadPicList> DEFAULT_THREAD_PIC_LIST = Collections.emptyList();
    public static final Integer DEFAULT_LABEL_VISIBLE = 0;
    public static final Integer DEFAULT_RANK_LEVEL = 0;

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
                return;
            } else {
                this.button_text = builder.button_text;
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
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GoodsInfo> {
        public String button_text;
        public Integer goods_style;
        public Integer id;
        public String label_text;
        public Integer label_visible;
        public String pop_window_text;
        public Integer rank_level;
        public String thread_pic;
        public List<ThreadPicList> thread_pic_list;
        public String thread_title;
        public String thread_type;
        public String user_name;
        public String user_portrait;

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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GoodsInfo build(boolean z) {
            return new GoodsInfo(this, z, null);
        }
    }
}
