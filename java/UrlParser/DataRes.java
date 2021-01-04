package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_LINK_FROM = "";
    public static final String DEFAULT_PRICE_TXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_recognize;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_from;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String price_txt;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer url_type;
    public static final Integer DEFAULT_URL_TYPE = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_IS_RECOGNIZE = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.url_type == null) {
                this.url_type = DEFAULT_URL_TYPE;
            } else {
                this.url_type = builder.url_type;
            }
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = builder.status;
            }
            if (builder.image == null) {
                this.image = "";
            } else {
                this.image = builder.image;
            }
            if (builder.link_from == null) {
                this.link_from = "";
            } else {
                this.link_from = builder.link_from;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.price_txt == null) {
                this.price_txt = "";
            } else {
                this.price_txt = builder.price_txt;
            }
            if (builder.is_recognize == null) {
                this.is_recognize = DEFAULT_IS_RECOGNIZE;
            } else {
                this.is_recognize = builder.is_recognize;
            }
            if (builder.description == null) {
                this.description = "";
                return;
            } else {
                this.description = builder.description;
                return;
            }
        }
        this.url_type = builder.url_type;
        this.status = builder.status;
        this.image = builder.image;
        this.link_from = builder.link_from;
        this.title = builder.title;
        this.price_txt = builder.price_txt;
        this.is_recognize = builder.is_recognize;
        this.description = builder.description;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String description;
        public String image;
        public Integer is_recognize;
        public String link_from;
        public String price_txt;
        public Integer status;
        public String title;
        public Integer url_type;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.url_type = dataRes.url_type;
                this.status = dataRes.status;
                this.image = dataRes.image;
                this.link_from = dataRes.link_from;
                this.title = dataRes.title;
                this.price_txt = dataRes.price_txt;
                this.is_recognize = dataRes.is_recognize;
                this.description = dataRes.description;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
