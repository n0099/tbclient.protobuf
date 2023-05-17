package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CardLinkInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_LINK_FROM = "";
    public static final String DEFAULT_PRICE_TXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 9)
    public final CardLinkInfo card_link_info;
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public CardLinkInfo card_link_info;
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
            if (dataRes == null) {
                return;
            }
            this.url_type = dataRes.url_type;
            this.status = dataRes.status;
            this.image = dataRes.image;
            this.link_from = dataRes.link_from;
            this.title = dataRes.title;
            this.price_txt = dataRes.price_txt;
            this.is_recognize = dataRes.is_recognize;
            this.description = dataRes.description;
            this.card_link_info = dataRes.card_link_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.url_type;
            if (num == null) {
                this.url_type = DEFAULT_URL_TYPE;
            } else {
                this.url_type = num;
            }
            Integer num2 = builder.status;
            if (num2 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num2;
            }
            String str = builder.image;
            if (str == null) {
                this.image = "";
            } else {
                this.image = str;
            }
            String str2 = builder.link_from;
            if (str2 == null) {
                this.link_from = "";
            } else {
                this.link_from = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.price_txt;
            if (str4 == null) {
                this.price_txt = "";
            } else {
                this.price_txt = str4;
            }
            Integer num3 = builder.is_recognize;
            if (num3 == null) {
                this.is_recognize = DEFAULT_IS_RECOGNIZE;
            } else {
                this.is_recognize = num3;
            }
            String str5 = builder.description;
            if (str5 == null) {
                this.description = "";
            } else {
                this.description = str5;
            }
            this.card_link_info = builder.card_link_info;
            return;
        }
        this.url_type = builder.url_type;
        this.status = builder.status;
        this.image = builder.image;
        this.link_from = builder.link_from;
        this.title = builder.title;
        this.price_txt = builder.price_txt;
        this.is_recognize = builder.is_recognize;
        this.description = builder.description;
        this.card_link_info = builder.card_link_info;
    }
}
