package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class NovelInfo extends Message {
    public static final String DEFAULT_AUTHOR = "";
    public static final String DEFAULT_BOTTOM_TEXT = "";
    public static final String DEFAULT_BUY_URL = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DISCOUNT_PRICE = "";
    public static final String DEFAULT_FROM = "";
    public static final String DEFAULT_H5_URL = "";
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_IS_PAY = "";
    public static final String DEFAULT_MEMBER_IMG = "";
    public static final String DEFAULT_MEMBER_TEXT = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_READER_TEXT = "";
    public static final String DEFAULT_STORY_CHANNEL_TEXT = "";
    public static final String DEFAULT_STORY_CHANNEL_URL = "";
    public static final String DEFAULT_TOURIST_TEXT = "";
    public static final String DEFAULT_TOURIST_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String bottom_text;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String buy_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 14, type = Message.Datatype.STRING)
    public final List<String> category;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long chapters;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String discount_price;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String from;
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
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String reader_text;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String story_channel_text;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String story_channel_url;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String tourist_text;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String tourist_url;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer yab_type;
    public static final Long DEFAULT_NOVEL_ID = 0L;
    public static final Long DEFAULT_PERCENT = 0L;
    public static final Long DEFAULT_CHAPTERS = 0L;
    public static final List<String> DEFAULT_CATEGORY = Collections.emptyList();
    public static final Integer DEFAULT_YAB_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NovelInfo> {
        public String author;
        public String bottom_text;
        public String buy_url;
        public List<String> category;
        public Long chapters;
        public String desc;
        public String discount_price;
        public String from;
        public String h5_url;
        public String img;
        public String is_pay;
        public String member_img;
        public String member_text;
        public String name;
        public Long novel_id;
        public Long percent;
        public String reader_text;
        public String story_channel_text;
        public String story_channel_url;
        public String tourist_text;
        public String tourist_url;
        public Integer yab_type;

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
            this.category = Message.copyOf(novelInfo.category);
            this.story_channel_text = novelInfo.story_channel_text;
            this.story_channel_url = novelInfo.story_channel_url;
            this.tourist_text = novelInfo.tourist_text;
            this.tourist_url = novelInfo.tourist_url;
            this.reader_text = novelInfo.reader_text;
            this.from = novelInfo.from;
            this.yab_type = novelInfo.yab_type;
            this.bottom_text = novelInfo.bottom_text;
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
            } else {
                this.buy_url = str10;
            }
            List<String> list = builder.category;
            if (list == null) {
                this.category = DEFAULT_CATEGORY;
            } else {
                this.category = Message.immutableCopyOf(list);
            }
            String str11 = builder.story_channel_text;
            if (str11 == null) {
                this.story_channel_text = "";
            } else {
                this.story_channel_text = str11;
            }
            String str12 = builder.story_channel_url;
            if (str12 == null) {
                this.story_channel_url = "";
            } else {
                this.story_channel_url = str12;
            }
            String str13 = builder.tourist_text;
            if (str13 == null) {
                this.tourist_text = "";
            } else {
                this.tourist_text = str13;
            }
            String str14 = builder.tourist_url;
            if (str14 == null) {
                this.tourist_url = "";
            } else {
                this.tourist_url = str14;
            }
            String str15 = builder.reader_text;
            if (str15 == null) {
                this.reader_text = "";
            } else {
                this.reader_text = str15;
            }
            String str16 = builder.from;
            if (str16 == null) {
                this.from = "";
            } else {
                this.from = str16;
            }
            Integer num = builder.yab_type;
            if (num == null) {
                this.yab_type = DEFAULT_YAB_TYPE;
            } else {
                this.yab_type = num;
            }
            String str17 = builder.bottom_text;
            if (str17 == null) {
                this.bottom_text = "";
                return;
            } else {
                this.bottom_text = str17;
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
        this.category = Message.immutableCopyOf(builder.category);
        this.story_channel_text = builder.story_channel_text;
        this.story_channel_url = builder.story_channel_url;
        this.tourist_text = builder.tourist_text;
        this.tourist_url = builder.tourist_url;
        this.reader_text = builder.reader_text;
        this.from = builder.from;
        this.yab_type = builder.yab_type;
        this.bottom_text = builder.bottom_text;
    }
}
