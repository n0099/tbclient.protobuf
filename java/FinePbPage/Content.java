package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Content extends Message {
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

    /* renamed from: c  reason: collision with root package name */
    public final String f68562c;
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Content> {
        public Integer align;
        public String big_cdn_src;
        public String big_size;
        public String big_src;
        public String bsize;

        /* renamed from: c  reason: collision with root package name */
        public String f68563c;
        public String cdn_src;
        public String color;
        public String link;
        public Integer size;
        public String src;
        public String text;
        public Long type;

        public Builder() {
        }

        public Builder(Content content) {
            super(content);
            if (content == null) {
                return;
            }
            this.type = content.type;
            this.text = content.text;
            this.link = content.link;
            this.src = content.src;
            this.bsize = content.bsize;
            this.big_src = content.big_src;
            this.big_size = content.big_size;
            this.cdn_src = content.cdn_src;
            this.big_cdn_src = content.big_cdn_src;
            this.f68563c = content.f68562c;
            this.align = content.align;
            this.color = content.color;
            this.size = content.size;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Content build(boolean z) {
            return new Content(this, z);
        }
    }

    public Content(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.type;
            if (l == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = l;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.link;
            if (str2 == null) {
                this.link = "";
            } else {
                this.link = str2;
            }
            String str3 = builder.src;
            if (str3 == null) {
                this.src = "";
            } else {
                this.src = str3;
            }
            String str4 = builder.bsize;
            if (str4 == null) {
                this.bsize = "";
            } else {
                this.bsize = str4;
            }
            String str5 = builder.big_src;
            if (str5 == null) {
                this.big_src = "";
            } else {
                this.big_src = str5;
            }
            String str6 = builder.big_size;
            if (str6 == null) {
                this.big_size = "";
            } else {
                this.big_size = str6;
            }
            String str7 = builder.cdn_src;
            if (str7 == null) {
                this.cdn_src = "";
            } else {
                this.cdn_src = str7;
            }
            String str8 = builder.big_cdn_src;
            if (str8 == null) {
                this.big_cdn_src = "";
            } else {
                this.big_cdn_src = str8;
            }
            String str9 = builder.f68563c;
            if (str9 == null) {
                this.f68562c = "";
            } else {
                this.f68562c = str9;
            }
            Integer num = builder.align;
            if (num == null) {
                this.align = DEFAULT_ALIGN;
            } else {
                this.align = num;
            }
            String str10 = builder.color;
            if (str10 == null) {
                this.color = "";
            } else {
                this.color = str10;
            }
            Integer num2 = builder.size;
            if (num2 == null) {
                this.size = DEFAULT_SIZE;
                return;
            } else {
                this.size = num2;
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
        this.f68562c = builder.f68563c;
        this.align = builder.align;
        this.color = builder.color;
        this.size = builder.size;
    }
}
