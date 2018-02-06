package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class ExcContent extends Message {
    public static final String DEFAULT_BIG_CDN_SRC = "";
    public static final String DEFAULT_BIG_SIZE = "";
    public static final String DEFAULT_BIG_SRC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_C = "";
    public static final String DEFAULT_CDN_SRC = "";
    public static final String DEFAULT_COLOR = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer align;
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
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String color;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer size;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long type;
    public static final Long DEFAULT_TYPE = 0L;
    public static final Integer DEFAULT_ALIGN = 0;
    public static final Integer DEFAULT_SIZE = 0;

    private ExcContent(Builder builder, boolean z) {
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
            } else {
                this.c = builder.c;
            }
            if (builder.align == null) {
                this.align = DEFAULT_ALIGN;
            } else {
                this.align = builder.align;
            }
            if (builder.color == null) {
                this.color = "";
            } else {
                this.color = builder.color;
            }
            if (builder.size == null) {
                this.size = DEFAULT_SIZE;
                return;
            } else {
                this.size = builder.size;
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
        this.align = builder.align;
        this.color = builder.color;
        this.size = builder.size;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<ExcContent> {
        public Integer align;
        public String big_cdn_src;
        public String big_size;
        public String big_src;
        public String bsize;
        public String c;
        public String cdn_src;
        public String color;
        public String link;
        public Integer size;
        public String src;
        public String text;
        public Long type;

        public Builder() {
        }

        public Builder(ExcContent excContent) {
            super(excContent);
            if (excContent != null) {
                this.type = excContent.type;
                this.text = excContent.text;
                this.link = excContent.link;
                this.src = excContent.src;
                this.bsize = excContent.bsize;
                this.big_src = excContent.big_src;
                this.big_size = excContent.big_size;
                this.cdn_src = excContent.cdn_src;
                this.big_cdn_src = excContent.big_cdn_src;
                this.c = excContent.c;
                this.align = excContent.align;
                this.color = excContent.color;
                this.size = excContent.size;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcContent build(boolean z) {
            return new ExcContent(this, z);
        }
    }
}
