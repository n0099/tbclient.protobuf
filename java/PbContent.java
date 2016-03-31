package tbclient;

import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PbContent extends Message {
    public static final String DEFAULT_BIG_CDN_SRC = "";
    public static final String DEFAULT_BIG_SIZE = "";
    public static final String DEFAULT_BIG_SRC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_C = "";
    public static final String DEFAULT_CDN_SRC = "";
    public static final String DEFAULT_DYNAMIC = "";
    public static final String DEFAULT_IMGTYPE = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_ORIGIN_SRC = "";
    public static final String DEFAULT_PACKET_NAME = "";
    public static final String DEFAULT_PHONETYPE = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_STATIC = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_VOICE_MD5 = "";
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String _static;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String big_cdn_src;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String big_size;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String big_src;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 26, type = Message.Datatype.UINT32)
    public final Integer btn_type;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String c;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String cdn_src;
    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer count;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer during_time;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String dynamic;
    @ProtoField(tag = 24, type = Message.Datatype.UINT32)
    public final Integer e_type;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_PUSH_RECOMMEND_PB)
    public final GraffitiInfo graffiti_info;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String imgtype;
    @ProtoField(tag = 22, type = Message.Datatype.UINT32)
    public final Integer is_native_app;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer is_sub;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 23)
    public final NativeApp native_app;
    @ProtoField(tag = 27, type = Message.Datatype.UINT32)
    public final Integer origin_size;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String origin_src;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String packet_name;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String phonetype;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 15, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String voice_md5;
    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_DURING_TIME = 0;
    public static final Integer DEFAULT_IS_SUB = 0;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_IS_NATIVE_APP = 0;
    public static final Integer DEFAULT_E_TYPE = 0;
    public static final Integer DEFAULT_BTN_TYPE = 0;
    public static final Integer DEFAULT_ORIGIN_SIZE = 0;
    public static final Integer DEFAULT_COUNT = 0;

    /* synthetic */ PbContent(Builder builder, boolean z, PbContent pbContent) {
        this(builder, z);
    }

    private PbContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.src == null) {
                this.src = "";
            } else {
                this.src = builder.src;
            }
            if (builder.bsize == null) {
                this.bsize = "";
            } else {
                this.bsize = builder.bsize;
            }
            if (builder.big_src == null) {
                this.big_src = "";
            } else {
                this.big_src = builder.big_src;
            }
            if (builder.big_size == null) {
                this.big_size = "";
            } else {
                this.big_size = builder.big_size;
            }
            if (builder.cdn_src == null) {
                this.cdn_src = "";
            } else {
                this.cdn_src = builder.cdn_src;
            }
            if (builder.big_cdn_src == null) {
                this.big_cdn_src = "";
            } else {
                this.big_cdn_src = builder.big_cdn_src;
            }
            if (builder.imgtype == null) {
                this.imgtype = "";
            } else {
                this.imgtype = builder.imgtype;
            }
            if (builder.c == null) {
                this.c = "";
            } else {
                this.c = builder.c;
            }
            if (builder.voice_md5 == null) {
                this.voice_md5 = "";
            } else {
                this.voice_md5 = builder.voice_md5;
            }
            if (builder.during_time == null) {
                this.during_time = DEFAULT_DURING_TIME;
            } else {
                this.during_time = builder.during_time;
            }
            if (builder.is_sub == null) {
                this.is_sub = DEFAULT_IS_SUB;
            } else {
                this.is_sub = builder.is_sub;
            }
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.dynamic == null) {
                this.dynamic = "";
            } else {
                this.dynamic = builder.dynamic;
            }
            if (builder._static == null) {
                this._static = "";
            } else {
                this._static = builder._static;
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
            if (builder.packet_name == null) {
                this.packet_name = "";
            } else {
                this.packet_name = builder.packet_name;
            }
            if (builder.phonetype == null) {
                this.phonetype = "";
            } else {
                this.phonetype = builder.phonetype;
            }
            if (builder.is_native_app == null) {
                this.is_native_app = DEFAULT_IS_NATIVE_APP;
            } else {
                this.is_native_app = builder.is_native_app;
            }
            this.native_app = builder.native_app;
            if (builder.e_type == null) {
                this.e_type = DEFAULT_E_TYPE;
            } else {
                this.e_type = builder.e_type;
            }
            if (builder.origin_src == null) {
                this.origin_src = "";
            } else {
                this.origin_src = builder.origin_src;
            }
            if (builder.btn_type == null) {
                this.btn_type = DEFAULT_BTN_TYPE;
            } else {
                this.btn_type = builder.btn_type;
            }
            if (builder.origin_size == null) {
                this.origin_size = DEFAULT_ORIGIN_SIZE;
            } else {
                this.origin_size = builder.origin_size;
            }
            if (builder.count == null) {
                this.count = DEFAULT_COUNT;
            } else {
                this.count = builder.count;
            }
            this.graffiti_info = builder.graffiti_info;
            return;
        }
        this.type = builder.type;
        this.text = builder.text;
        this.link = builder.link;
        this.src = builder.src;
        this.bsize = builder.bsize;
        this.big_src = builder.big_src;
        this.big_size = builder.big_size;
        this.cdn_src = builder.cdn_src;
        this.big_cdn_src = builder.big_cdn_src;
        this.imgtype = builder.imgtype;
        this.c = builder.c;
        this.voice_md5 = builder.voice_md5;
        this.during_time = builder.during_time;
        this.is_sub = builder.is_sub;
        this.uid = builder.uid;
        this.dynamic = builder.dynamic;
        this._static = builder._static;
        this.width = builder.width;
        this.height = builder.height;
        this.packet_name = builder.packet_name;
        this.phonetype = builder.phonetype;
        this.is_native_app = builder.is_native_app;
        this.native_app = builder.native_app;
        this.e_type = builder.e_type;
        this.origin_src = builder.origin_src;
        this.btn_type = builder.btn_type;
        this.origin_size = builder.origin_size;
        this.count = builder.count;
        this.graffiti_info = builder.graffiti_info;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PbContent> {
        public String _static;
        public String big_cdn_src;
        public String big_size;
        public String big_src;
        public String bsize;
        public Integer btn_type;
        public String c;
        public String cdn_src;
        public Integer count;
        public Integer during_time;
        public String dynamic;
        public Integer e_type;
        public GraffitiInfo graffiti_info;
        public Integer height;
        public String imgtype;
        public Integer is_native_app;
        public Integer is_sub;
        public String link;
        public NativeApp native_app;
        public Integer origin_size;
        public String origin_src;
        public String packet_name;
        public String phonetype;
        public String src;
        public String text;
        public Integer type;
        public Long uid;
        public String voice_md5;
        public Integer width;

        public Builder() {
        }

        public Builder(PbContent pbContent) {
            super(pbContent);
            if (pbContent != null) {
                this.type = pbContent.type;
                this.text = pbContent.text;
                this.link = pbContent.link;
                this.src = pbContent.src;
                this.bsize = pbContent.bsize;
                this.big_src = pbContent.big_src;
                this.big_size = pbContent.big_size;
                this.cdn_src = pbContent.cdn_src;
                this.big_cdn_src = pbContent.big_cdn_src;
                this.imgtype = pbContent.imgtype;
                this.c = pbContent.c;
                this.voice_md5 = pbContent.voice_md5;
                this.during_time = pbContent.during_time;
                this.is_sub = pbContent.is_sub;
                this.uid = pbContent.uid;
                this.dynamic = pbContent.dynamic;
                this._static = pbContent._static;
                this.width = pbContent.width;
                this.height = pbContent.height;
                this.packet_name = pbContent.packet_name;
                this.phonetype = pbContent.phonetype;
                this.is_native_app = pbContent.is_native_app;
                this.native_app = pbContent.native_app;
                this.e_type = pbContent.e_type;
                this.origin_src = pbContent.origin_src;
                this.btn_type = pbContent.btn_type;
                this.origin_size = pbContent.origin_size;
                this.count = pbContent.count;
                this.graffiti_info = pbContent.graffiti_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbContent build(boolean z) {
            return new PbContent(this, z, null);
        }
    }
}
