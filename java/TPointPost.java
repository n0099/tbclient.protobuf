package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class TPointPost extends Message {
    public static final String DEFAULT_MONITOR_ID = "";
    public static final String DEFAULT_POSITION = "";
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<ActBtn> act_btn;
    @ProtoField(tag = 7)
    public final DetailInfo detail_info;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer hidden_day;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_tuiguang;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String monitor_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String position;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<Timgs> t_imgs;
    @ProtoField(tag = 10)
    public final VideoInfo t_video;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long template_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer template_type;
    public static final Integer DEFAULT_IS_TUIGUANG = 0;
    public static final Long DEFAULT_TEMPLATE_ID = 0L;
    public static final Integer DEFAULT_TEMPLATE_TYPE = 0;
    public static final List<ActBtn> DEFAULT_ACT_BTN = Collections.emptyList();
    public static final List<Timgs> DEFAULT_T_IMGS = Collections.emptyList();
    public static final Integer DEFAULT_HIDDEN_DAY = 0;

    private TPointPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_tuiguang == null) {
                this.is_tuiguang = DEFAULT_IS_TUIGUANG;
            } else {
                this.is_tuiguang = builder.is_tuiguang;
            }
            if (builder.position == null) {
                this.position = "";
            } else {
                this.position = builder.position;
            }
            if (builder.template_id == null) {
                this.template_id = DEFAULT_TEMPLATE_ID;
            } else {
                this.template_id = builder.template_id;
            }
            if (builder.template_type == null) {
                this.template_type = DEFAULT_TEMPLATE_TYPE;
            } else {
                this.template_type = builder.template_type;
            }
            if (builder.act_btn == null) {
                this.act_btn = DEFAULT_ACT_BTN;
            } else {
                this.act_btn = immutableCopyOf(builder.act_btn);
            }
            if (builder.t_imgs == null) {
                this.t_imgs = DEFAULT_T_IMGS;
            } else {
                this.t_imgs = immutableCopyOf(builder.t_imgs);
            }
            this.detail_info = builder.detail_info;
            if (builder.monitor_id == null) {
                this.monitor_id = "";
            } else {
                this.monitor_id = builder.monitor_id;
            }
            if (builder.hidden_day == null) {
                this.hidden_day = DEFAULT_HIDDEN_DAY;
            } else {
                this.hidden_day = builder.hidden_day;
            }
            this.t_video = builder.t_video;
            if (builder.tag_name == null) {
                this.tag_name = "";
                return;
            } else {
                this.tag_name = builder.tag_name;
                return;
            }
        }
        this.is_tuiguang = builder.is_tuiguang;
        this.position = builder.position;
        this.template_id = builder.template_id;
        this.template_type = builder.template_type;
        this.act_btn = immutableCopyOf(builder.act_btn);
        this.t_imgs = immutableCopyOf(builder.t_imgs);
        this.detail_info = builder.detail_info;
        this.monitor_id = builder.monitor_id;
        this.hidden_day = builder.hidden_day;
        this.t_video = builder.t_video;
        this.tag_name = builder.tag_name;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TPointPost> {
        public List<ActBtn> act_btn;
        public DetailInfo detail_info;
        public Integer hidden_day;
        public Integer is_tuiguang;
        public String monitor_id;
        public String position;
        public List<Timgs> t_imgs;
        public VideoInfo t_video;
        public String tag_name;
        public Long template_id;
        public Integer template_type;

        public Builder() {
        }

        public Builder(TPointPost tPointPost) {
            super(tPointPost);
            if (tPointPost != null) {
                this.is_tuiguang = tPointPost.is_tuiguang;
                this.position = tPointPost.position;
                this.template_id = tPointPost.template_id;
                this.template_type = tPointPost.template_type;
                this.act_btn = TPointPost.copyOf(tPointPost.act_btn);
                this.t_imgs = TPointPost.copyOf(tPointPost.t_imgs);
                this.detail_info = tPointPost.detail_info;
                this.monitor_id = tPointPost.monitor_id;
                this.hidden_day = tPointPost.hidden_day;
                this.t_video = tPointPost.t_video;
                this.tag_name = tPointPost.tag_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TPointPost build(boolean z) {
            return new TPointPost(this, z);
        }
    }
}
