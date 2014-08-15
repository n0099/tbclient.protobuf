package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GoodsInfo extends Message {
    public static final String DEFAULT_POP_WINDOW_TEXT = "";
    public static final String DEFAULT_THREAD_PIC = "";
    public static final String DEFAULT_THREAD_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer goods_style;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pop_window_text;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_pic;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thread_title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_portrait;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_GOODS_STYLE = 0;

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
                return;
            } else {
                this.goods_style = builder.goods_style;
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
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GoodsInfo> {
        public Integer goods_style;
        public Integer id;
        public String pop_window_text;
        public String thread_pic;
        public String thread_title;
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GoodsInfo build(boolean z) {
            return new GoodsInfo(this, z, null);
        }
    }
}
