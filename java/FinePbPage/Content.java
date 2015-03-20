package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Content extends Message {
    public static final String DEFAULT_BIG_CDN_SRC = "";
    public static final String DEFAULT_BIG_SIZE = "";
    public static final String DEFAULT_BIG_SRC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_C = "";
    public static final String DEFAULT_CDN_SRC = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    public static final Long DEFAULT_TYPE = 0L;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String big_cdn_src;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String big_size;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String big_src;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String c;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String cdn_src;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long type;

    /* synthetic */ Content(Builder builder, boolean z, Content content) {
        this(builder, z);
    }

    private Content(Builder builder, boolean z) {
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
            if (builder.c == null) {
                this.c = "";
                return;
            } else {
                this.c = builder.c;
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
        this.c = builder.c;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Content> {
        public String big_cdn_src;
        public String big_size;
        public String big_src;
        public String bsize;
        public String c;
        public String cdn_src;
        public String link;
        public String src;
        public String text;
        public Long type;

        public Builder(Content content) {
            super(content);
            if (content != null) {
                this.type = content.type;
                this.text = content.text;
                this.link = content.link;
                this.src = content.src;
                this.bsize = content.bsize;
                this.big_src = content.big_src;
                this.big_size = content.big_size;
                this.cdn_src = content.cdn_src;
                this.big_cdn_src = content.big_cdn_src;
                this.c = content.c;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Content build(boolean z) {
            return new Content(this, z, null);
        }
    }
}
