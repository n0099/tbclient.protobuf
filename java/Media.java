package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Media extends Message {
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_DYNAMIC_PIC = "";
    public static final String DEFAULT_ORIGIN_PIC = "";
    public static final String DEFAULT_SMALL_PIC = "";
    public static final String DEFAULT_SRC_PIC = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_VHSRC = "";
    public static final String DEFAULT_VPIC = "";
    public static final String DEFAULT_VSRC = "";
    public static final String DEFAULT_WATER_PIC = "";
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
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String origin_pic;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer origin_size;
    @ProtoField(tag = 17, type = Message.Datatype.INT64)
    public final Long post_id;
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
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_DURING_TIME = 0;
    public static final Integer DEFAULT_E_TYPE = 0;
    public static final Integer DEFAULT_ORIGIN_SIZE = 0;
    public static final Long DEFAULT_POST_ID = 0L;

    /* synthetic */ Media(Builder builder, boolean z, Media media) {
        this(builder, z);
    }

    private Media(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.small_pic == null) {
                this.small_pic = "";
            } else {
                this.small_pic = builder.small_pic;
            }
            if (builder.big_pic == null) {
                this.big_pic = "";
            } else {
                this.big_pic = builder.big_pic;
            }
            if (builder.water_pic == null) {
                this.water_pic = "";
            } else {
                this.water_pic = builder.water_pic;
            }
            if (builder.vpic == null) {
                this.vpic = "";
            } else {
                this.vpic = builder.vpic;
            }
            if (builder.vsrc == null) {
                this.vsrc = "";
            } else {
                this.vsrc = builder.vsrc;
            }
            if (builder.vhsrc == null) {
                this.vhsrc = "";
            } else {
                this.vhsrc = builder.vhsrc;
            }
            if (builder.src_pic == null) {
                this.src_pic = "";
            } else {
                this.src_pic = builder.src_pic;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
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
            if (builder.bsize == null) {
                this.bsize = "";
            } else {
                this.bsize = builder.bsize;
            }
            if (builder.during_time == null) {
                this.during_time = DEFAULT_DURING_TIME;
            } else {
                this.during_time = builder.during_time;
            }
            if (builder.e_type == null) {
                this.e_type = DEFAULT_E_TYPE;
            } else {
                this.e_type = builder.e_type;
            }
            if (builder.origin_pic == null) {
                this.origin_pic = "";
            } else {
                this.origin_pic = builder.origin_pic;
            }
            if (builder.origin_size == null) {
                this.origin_size = DEFAULT_ORIGIN_SIZE;
            } else {
                this.origin_size = builder.origin_size;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            if (builder.dynamic_pic == null) {
                this.dynamic_pic = "";
                return;
            } else {
                this.dynamic_pic = builder.dynamic_pic;
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
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Media> {
        public String big_pic;
        public String bsize;
        public Integer during_time;
        public String dynamic_pic;
        public Integer e_type;
        public Integer height;
        public String origin_pic;
        public Integer origin_size;
        public Long post_id;
        public String small_pic;
        public String src_pic;
        public String text;
        public Integer type;
        public String vhsrc;
        public String vpic;
        public String vsrc;
        public String water_pic;
        public Integer width;

        public Builder() {
        }

        public Builder(Media media) {
            super(media);
            if (media != null) {
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Media build(boolean z) {
            return new Media(this, z, null);
        }
    }
}
