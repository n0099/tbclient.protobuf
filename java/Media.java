package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Media extends Message {
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_DYNAMIC_PIC = "";
    public static final Double DEFAULT_HTH_MID_LOC;
    public static final String DEFAULT_ORIGIN_PIC = "";
    public static final String DEFAULT_SMALL_PIC = "";
    public static final String DEFAULT_SRC_PIC = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_VHSRC = "";
    public static final String DEFAULT_VPIC = "";
    public static final String DEFAULT_VSRC = "";
    public static final String DEFAULT_WATER_PIC = "";
    public static final Double DEFAULT_WTH_MID_LOC;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String big_pic;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer during_time;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String dynamic_pic;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer e_type;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 23, type = Message.Datatype.DOUBLE)
    public final Double hth_mid_loc;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer is_blocked_pic;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer is_long_pic;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String origin_pic;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer origin_size;
    @ProtoField(tag = 17, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 20, type = Message.Datatype.UINT32)
    public final Integer show_original_btn;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String small_pic;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String src_pic;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String vhsrc;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String vpic;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String vsrc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String water_pic;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer width;
    @ProtoField(tag = 22, type = Message.Datatype.DOUBLE)
    public final Double wth_mid_loc;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_DURING_TIME = 0;
    public static final Integer DEFAULT_E_TYPE = 0;
    public static final Integer DEFAULT_ORIGIN_SIZE = 0;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_IS_LONG_PIC = 0;
    public static final Integer DEFAULT_SHOW_ORIGINAL_BTN = 0;
    public static final Integer DEFAULT_IS_BLOCKED_PIC = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Media> {
        public String big_pic;
        public String bsize;
        public Integer during_time;
        public String dynamic_pic;
        public Integer e_type;
        public Integer height;
        public Double hth_mid_loc;
        public Integer is_blocked_pic;
        public Integer is_long_pic;
        public String origin_pic;
        public Integer origin_size;
        public Long post_id;
        public Integer show_original_btn;
        public String small_pic;
        public String src_pic;
        public String text;
        public Integer type;
        public String vhsrc;
        public String vpic;
        public String vsrc;
        public String water_pic;
        public Integer width;
        public Double wth_mid_loc;

        public Builder() {
        }

        public Builder(Media media) {
            super(media);
            if (media == null) {
                return;
            }
            this.type = media.type;
            this.small_pic = media.small_pic;
            this.big_pic = media.big_pic;
            this.water_pic = media.water_pic;
            this.vpic = media.vpic;
            this.vsrc = media.vsrc;
            this.vhsrc = media.vhsrc;
            this.src_pic = media.src_pic;
            this.text = media.text;
            this.width = media.width;
            this.height = media.height;
            this.bsize = media.bsize;
            this.during_time = media.during_time;
            this.e_type = media.e_type;
            this.origin_pic = media.origin_pic;
            this.origin_size = media.origin_size;
            this.post_id = media.post_id;
            this.dynamic_pic = media.dynamic_pic;
            this.is_long_pic = media.is_long_pic;
            this.show_original_btn = media.show_original_btn;
            this.is_blocked_pic = media.is_blocked_pic;
            this.wth_mid_loc = media.wth_mid_loc;
            this.hth_mid_loc = media.hth_mid_loc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Media build(boolean z) {
            return new Media(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_WTH_MID_LOC = valueOf;
        DEFAULT_HTH_MID_LOC = valueOf;
    }

    public Media(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.small_pic;
            if (str == null) {
                this.small_pic = "";
            } else {
                this.small_pic = str;
            }
            String str2 = builder.big_pic;
            if (str2 == null) {
                this.big_pic = "";
            } else {
                this.big_pic = str2;
            }
            String str3 = builder.water_pic;
            if (str3 == null) {
                this.water_pic = "";
            } else {
                this.water_pic = str3;
            }
            String str4 = builder.vpic;
            if (str4 == null) {
                this.vpic = "";
            } else {
                this.vpic = str4;
            }
            String str5 = builder.vsrc;
            if (str5 == null) {
                this.vsrc = "";
            } else {
                this.vsrc = str5;
            }
            String str6 = builder.vhsrc;
            if (str6 == null) {
                this.vhsrc = "";
            } else {
                this.vhsrc = str6;
            }
            String str7 = builder.src_pic;
            if (str7 == null) {
                this.src_pic = "";
            } else {
                this.src_pic = str7;
            }
            String str8 = builder.text;
            if (str8 == null) {
                this.text = "";
            } else {
                this.text = str8;
            }
            Integer num2 = builder.width;
            if (num2 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num2;
            }
            Integer num3 = builder.height;
            if (num3 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num3;
            }
            String str9 = builder.bsize;
            if (str9 == null) {
                this.bsize = "";
            } else {
                this.bsize = str9;
            }
            Integer num4 = builder.during_time;
            if (num4 == null) {
                this.during_time = DEFAULT_DURING_TIME;
            } else {
                this.during_time = num4;
            }
            Integer num5 = builder.e_type;
            if (num5 == null) {
                this.e_type = DEFAULT_E_TYPE;
            } else {
                this.e_type = num5;
            }
            String str10 = builder.origin_pic;
            if (str10 == null) {
                this.origin_pic = "";
            } else {
                this.origin_pic = str10;
            }
            Integer num6 = builder.origin_size;
            if (num6 == null) {
                this.origin_size = DEFAULT_ORIGIN_SIZE;
            } else {
                this.origin_size = num6;
            }
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l;
            }
            String str11 = builder.dynamic_pic;
            if (str11 == null) {
                this.dynamic_pic = "";
            } else {
                this.dynamic_pic = str11;
            }
            Integer num7 = builder.is_long_pic;
            if (num7 == null) {
                this.is_long_pic = DEFAULT_IS_LONG_PIC;
            } else {
                this.is_long_pic = num7;
            }
            Integer num8 = builder.show_original_btn;
            if (num8 == null) {
                this.show_original_btn = DEFAULT_SHOW_ORIGINAL_BTN;
            } else {
                this.show_original_btn = num8;
            }
            Integer num9 = builder.is_blocked_pic;
            if (num9 == null) {
                this.is_blocked_pic = DEFAULT_IS_BLOCKED_PIC;
            } else {
                this.is_blocked_pic = num9;
            }
            Double d = builder.wth_mid_loc;
            if (d == null) {
                this.wth_mid_loc = DEFAULT_WTH_MID_LOC;
            } else {
                this.wth_mid_loc = d;
            }
            Double d2 = builder.hth_mid_loc;
            if (d2 == null) {
                this.hth_mid_loc = DEFAULT_HTH_MID_LOC;
                return;
            } else {
                this.hth_mid_loc = d2;
                return;
            }
        }
        this.type = builder.type;
        this.small_pic = builder.small_pic;
        this.big_pic = builder.big_pic;
        this.water_pic = builder.water_pic;
        this.vpic = builder.vpic;
        this.vsrc = builder.vsrc;
        this.vhsrc = builder.vhsrc;
        this.src_pic = builder.src_pic;
        this.text = builder.text;
        this.width = builder.width;
        this.height = builder.height;
        this.bsize = builder.bsize;
        this.during_time = builder.during_time;
        this.e_type = builder.e_type;
        this.origin_pic = builder.origin_pic;
        this.origin_size = builder.origin_size;
        this.post_id = builder.post_id;
        this.dynamic_pic = builder.dynamic_pic;
        this.is_long_pic = builder.is_long_pic;
        this.show_original_btn = builder.show_original_btn;
        this.is_blocked_pic = builder.is_blocked_pic;
        this.wth_mid_loc = builder.wth_mid_loc;
        this.hth_mid_loc = builder.hth_mid_loc;
    }
}
