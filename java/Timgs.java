package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Timgs extends Message {
    public static final String DEFAULT_BIG_CDN_URL = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_DES_MAIN = "";
    public static final String DEFAULT_DES_SUB = "";
    public static final Integer DEFAULT_FLAG = 0;
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String big_cdn_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String des_main;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String des_sub;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer flag;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* synthetic */ Timgs(Builder builder, boolean z, Timgs timgs) {
        this(builder, z);
    }

    private Timgs(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.flag == null) {
                this.flag = DEFAULT_FLAG;
            } else {
                this.flag = builder.flag;
            }
            if (builder.des_main == null) {
                this.des_main = "";
            } else {
                this.des_main = builder.des_main;
            }
            if (builder.des_sub == null) {
                this.des_sub = "";
            } else {
                this.des_sub = builder.des_sub;
            }
            if (builder.bsize == null) {
                this.bsize = "";
            } else {
                this.bsize = builder.bsize;
            }
            if (builder.big_cdn_url == null) {
                this.big_cdn_url = "";
                return;
            } else {
                this.big_cdn_url = builder.big_cdn_url;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.url = builder.url;
        this.flag = builder.flag;
        this.des_main = builder.des_main;
        this.des_sub = builder.des_sub;
        this.bsize = builder.bsize;
        this.big_cdn_url = builder.big_cdn_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Timgs> {
        public String big_cdn_url;
        public String bsize;
        public String des_main;
        public String des_sub;
        public Integer flag;
        public String img_url;
        public String url;

        public Builder() {
        }

        public Builder(Timgs timgs) {
            super(timgs);
            if (timgs != null) {
                this.img_url = timgs.img_url;
                this.url = timgs.url;
                this.flag = timgs.flag;
                this.des_main = timgs.des_main;
                this.des_sub = timgs.des_sub;
                this.bsize = timgs.bsize;
                this.big_cdn_url = timgs.big_cdn_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Timgs build(boolean z) {
            return new Timgs(this, z, null);
        }
    }
}
