package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class NovelInfo extends Message {
    public static final String DEFAULT_AUTHOR = "";
    public static final String DEFAULT_BUY_URL = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DISCOUNT_PRICE = "";
    public static final String DEFAULT_H5_URL = "";
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_IS_PAY = "";
    public static final String DEFAULT_MEMBER_IMG = "";
    public static final String DEFAULT_MEMBER_TEXT = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String buy_url;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long chapters;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String discount_price;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String h5_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String is_pay;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String member_img;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String member_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long novel_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long percent;
    public static final Long DEFAULT_NOVEL_ID = 0L;
    public static final Long DEFAULT_PERCENT = 0L;
    public static final Long DEFAULT_CHAPTERS = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NovelInfo> {
        public String author;
        public String buy_url;
        public Long chapters;
        public String desc;
        public String discount_price;
        public String h5_url;
        public String img;
        public String is_pay;
        public String member_img;
        public String member_text;
        public String name;
        public Long novel_id;
        public Long percent;

        public Builder() {
        }

        public Builder(NovelInfo novelInfo) {
            super(novelInfo);
            if (novelInfo == null) {
                return;
            }
            this.novel_id = novelInfo.novel_id;
            this.img = novelInfo.img;
            this.name = novelInfo.name;
            this.author = novelInfo.author;
            this.desc = novelInfo.desc;
            this.discount_price = novelInfo.discount_price;
            this.percent = novelInfo.percent;
            this.h5_url = novelInfo.h5_url;
            this.is_pay = novelInfo.is_pay;
            this.chapters = novelInfo.chapters;
            this.member_text = novelInfo.member_text;
            this.member_img = novelInfo.member_img;
            this.buy_url = novelInfo.buy_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NovelInfo build(boolean z) {
            return new NovelInfo(this, z);
        }
    }

    public NovelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.novel_id;
            if (l == null) {
                this.novel_id = DEFAULT_NOVEL_ID;
            } else {
                this.novel_id = l;
            }
            String str = builder.img;
            if (str == null) {
                this.img = "";
            } else {
                this.img = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.author;
            if (str3 == null) {
                this.author = "";
            } else {
                this.author = str3;
            }
            String str4 = builder.desc;
            if (str4 == null) {
                this.desc = "";
            } else {
                this.desc = str4;
            }
            String str5 = builder.discount_price;
            if (str5 == null) {
                this.discount_price = "";
            } else {
                this.discount_price = str5;
            }
            Long l2 = builder.percent;
            if (l2 == null) {
                this.percent = DEFAULT_PERCENT;
            } else {
                this.percent = l2;
            }
            String str6 = builder.h5_url;
            if (str6 == null) {
                this.h5_url = "";
            } else {
                this.h5_url = str6;
            }
            String str7 = builder.is_pay;
            if (str7 == null) {
                this.is_pay = "";
            } else {
                this.is_pay = str7;
            }
            Long l3 = builder.chapters;
            if (l3 == null) {
                this.chapters = DEFAULT_CHAPTERS;
            } else {
                this.chapters = l3;
            }
            String str8 = builder.member_text;
            if (str8 == null) {
                this.member_text = "";
            } else {
                this.member_text = str8;
            }
            String str9 = builder.member_img;
            if (str9 == null) {
                this.member_img = "";
            } else {
                this.member_img = str9;
            }
            String str10 = builder.buy_url;
            if (str10 == null) {
                this.buy_url = "";
                return;
            } else {
                this.buy_url = str10;
                return;
            }
        }
        this.novel_id = builder.novel_id;
        this.img = builder.img;
        this.name = builder.name;
        this.author = builder.author;
        this.desc = builder.desc;
        this.discount_price = builder.discount_price;
        this.percent = builder.percent;
        this.h5_url = builder.h5_url;
        this.is_pay = builder.is_pay;
        this.chapters = builder.chapters;
        this.member_text = builder.member_text;
        this.member_img = builder.member_img;
        this.buy_url = builder.buy_url;
    }
}
