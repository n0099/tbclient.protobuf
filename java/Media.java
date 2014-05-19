package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Media extends Message {
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_SMALL_PIC = "";
    public static final String DEFAULT_SRC_PIC = "";
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_VHSRC = "";
    public static final String DEFAULT_VPIC = "";
    public static final String DEFAULT_VSRC = "";
    public static final String DEFAULT_WATER_PIC = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String big_pic;
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
                return;
            } else {
                this.text = builder.text;
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
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Media> {
        public String big_pic;
        public String small_pic;
        public String src_pic;
        public String text;
        public Integer type;
        public String vhsrc;
        public String vpic;
        public String vsrc;
        public String water_pic;

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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Media build(boolean z) {
            return new Media(this, z, null);
        }
    }
}
