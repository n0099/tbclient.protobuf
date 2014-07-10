package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PbContent extends Message {
    public static final String DEFAULT_BIG_CDN_SRC = "";
    public static final String DEFAULT_BIG_SIZE = "";
    public static final String DEFAULT_BIG_SRC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_CDN_SRC = "";
    public static final String DEFAULT_IMGTYPE = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String big_cdn_src;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String big_size;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String big_src;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String cdn_src;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String imgtype;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;

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
                return;
            } else {
                this.imgtype = builder.imgtype;
                return;
            }
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
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<PbContent> {
        public String big_cdn_src;
        public String big_size;
        public String big_src;
        public String bsize;
        public String cdn_src;
        public String imgtype;
        public String link;
        public String src;
        public String text;
        public Integer type;

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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbContent build(boolean z) {
            return new PbContent(this, z, null);
        }
    }
}
