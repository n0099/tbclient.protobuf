package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class BookInfo extends Message {
    public static final String DEFAULT_AD_CODE = "";
    public static final String DEFAULT_AUTHOR = "";
    public static final String DEFAULT_AUTHOR_INTRO = "";
    public static final String DEFAULT_BIG_COVER = "";
    public static final String DEFAULT_BOOK_ID = "";
    public static final String DEFAULT_BOOK_VER = "";
    public static final String DEFAULT_CHAPTER_VER = "";
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_COPYRIGHT = "";
    public static final String DEFAULT_COPYRIGHT_TEXT = "";
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_CP_ID = "";
    public static final String DEFAULT_DISCOUNT_ICON = "";
    public static final String DEFAULT_DISCOUNT_RATIO = "";
    public static final String DEFAULT_DISCUSS = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_FREE_INFO = "";
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_ISBN = "";
    public static final String DEFAULT_PAPER_PRICE = "";
    public static final String DEFAULT_PUBLISHER = "";
    public static final String DEFAULT_PUBLISH_TEXT = "";
    public static final String DEFAULT_PUBLISH_TIME = "";
    public static final String DEFAULT_PUBLISH_TYPE = "";
    public static final String DEFAULT_SUB_CLASS_NAME = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String ad_code;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String author_intro;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String big_cover;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer book_size;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer book_type;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String book_ver;
    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String chapter_ver;
    @ProtoField(tag = 44, type = Message.Datatype.UINT32)
    public final Integer charge_type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer class_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String copyright;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String copyright_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 41, type = Message.Datatype.STRING)
    public final String cp_id;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String discount_icon;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String discount_ratio;
    @ProtoField(tag = 32, type = Message.Datatype.UINT32)
    public final Integer discount_type;
    @ProtoField(tag = 40, type = Message.Datatype.STRING)
    public final String discuss;
    @ProtoField(tag = 43, type = Message.Datatype.UINT32)
    public final Integer first_chapter;
    @ProtoField(tag = 38, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 39, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String free_info;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer is_buy;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer is_finish;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String isbn;
    @ProtoField(tag = 45, type = Message.Datatype.UINT32)
    public final Integer member_show_type;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer orignal_price;
    @ProtoField(tag = 42, type = Message.Datatype.STRING)
    public final String paper_price;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer price;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String publish_text;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String publish_time;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String publish_type;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String publisher;
    @ProtoField(tag = 34, type = Message.Datatype.UINT32)
    public final Integer read_count;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer sub_class_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String sub_class_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<BookTag> tags;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer total_chapter;
    @ProtoField(tag = 35, type = Message.Datatype.UINT32)
    public final Integer total_page;
    @ProtoField(tag = 30, type = Message.Datatype.UINT32)
    public final Integer update_time;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer words;
    public static final Integer DEFAULT_BOOK_TYPE = 0;
    public static final Integer DEFAULT_CLASS_ID = 0;
    public static final Integer DEFAULT_SUB_CLASS_ID = 0;
    public static final Integer DEFAULT_BOOK_SIZE = 0;
    public static final List<BookTag> DEFAULT_TAGS = Collections.emptyList();
    public static final Integer DEFAULT_TOTAL_CHAPTER = 0;
    public static final Integer DEFAULT_WORDS = 0;
    public static final Integer DEFAULT_ORIGNAL_PRICE = 0;
    public static final Integer DEFAULT_PRICE = 0;
    public static final Integer DEFAULT_IS_FINISH = 0;
    public static final Integer DEFAULT_IS_BUY = 0;
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Integer DEFAULT_DISCOUNT_TYPE = 0;
    public static final Integer DEFAULT_READ_COUNT = 0;
    public static final Integer DEFAULT_TOTAL_PAGE = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_FIRST_CHAPTER = 0;
    public static final Integer DEFAULT_CHARGE_TYPE = 0;
    public static final Integer DEFAULT_MEMBER_SHOW_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<BookInfo> {
        public String ad_code;
        public String author;
        public String author_intro;
        public String big_cover;
        public String book_id;
        public Integer book_size;
        public Integer book_type;
        public String book_ver;
        public String chapter_ver;
        public Integer charge_type;
        public Integer class_id;
        public String class_name;
        public String copyright;
        public String copyright_text;
        public String cover;
        public String cp_id;
        public String discount_icon;
        public String discount_ratio;
        public Integer discount_type;
        public String discuss;
        public Integer first_chapter;
        public Long forum_id;
        public String forum_name;
        public String free_info;
        public String intro;
        public Integer is_buy;
        public Integer is_finish;
        public String isbn;
        public Integer member_show_type;
        public Integer orignal_price;
        public String paper_price;
        public Integer price;
        public String publish_text;
        public String publish_time;
        public String publish_type;
        public String publisher;
        public Integer read_count;
        public Integer sub_class_id;
        public String sub_class_name;
        public List<BookTag> tags;
        public String title;
        public Integer total_chapter;
        public Integer total_page;
        public Integer update_time;
        public Integer words;

        public Builder() {
        }

        public Builder(BookInfo bookInfo) {
            super(bookInfo);
            if (bookInfo == null) {
                return;
            }
            this.book_id = bookInfo.book_id;
            this.title = bookInfo.title;
            this.cover = bookInfo.cover;
            this.book_type = bookInfo.book_type;
            this.class_id = bookInfo.class_id;
            this.class_name = bookInfo.class_name;
            this.sub_class_id = bookInfo.sub_class_id;
            this.sub_class_name = bookInfo.sub_class_name;
            this.book_size = bookInfo.book_size;
            this.intro = bookInfo.intro;
            this.author = bookInfo.author;
            this.author_intro = bookInfo.author_intro;
            this.tags = Message.copyOf(bookInfo.tags);
            this.total_chapter = bookInfo.total_chapter;
            this.words = bookInfo.words;
            this.orignal_price = bookInfo.orignal_price;
            this.price = bookInfo.price;
            this.discount_ratio = bookInfo.discount_ratio;
            this.is_finish = bookInfo.is_finish;
            this.ad_code = bookInfo.ad_code;
            this.is_buy = bookInfo.is_buy;
            this.free_info = bookInfo.free_info;
            this.publisher = bookInfo.publisher;
            this.isbn = bookInfo.isbn;
            this.copyright = bookInfo.copyright;
            this.publish_text = bookInfo.publish_text;
            this.copyright_text = bookInfo.copyright_text;
            this.publish_time = bookInfo.publish_time;
            this.publish_type = bookInfo.publish_type;
            this.update_time = bookInfo.update_time;
            this.big_cover = bookInfo.big_cover;
            this.discount_type = bookInfo.discount_type;
            this.discount_icon = bookInfo.discount_icon;
            this.read_count = bookInfo.read_count;
            this.total_page = bookInfo.total_page;
            this.book_ver = bookInfo.book_ver;
            this.chapter_ver = bookInfo.chapter_ver;
            this.forum_id = bookInfo.forum_id;
            this.forum_name = bookInfo.forum_name;
            this.discuss = bookInfo.discuss;
            this.cp_id = bookInfo.cp_id;
            this.paper_price = bookInfo.paper_price;
            this.first_chapter = bookInfo.first_chapter;
            this.charge_type = bookInfo.charge_type;
            this.member_show_type = bookInfo.member_show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BookInfo build(boolean z) {
            return new BookInfo(this, z);
        }
    }

    public BookInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.book_id;
            if (str == null) {
                this.book_id = "";
            } else {
                this.book_id = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.cover;
            if (str3 == null) {
                this.cover = "";
            } else {
                this.cover = str3;
            }
            Integer num = builder.book_type;
            if (num == null) {
                this.book_type = DEFAULT_BOOK_TYPE;
            } else {
                this.book_type = num;
            }
            Integer num2 = builder.class_id;
            if (num2 == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = num2;
            }
            String str4 = builder.class_name;
            if (str4 == null) {
                this.class_name = "";
            } else {
                this.class_name = str4;
            }
            Integer num3 = builder.sub_class_id;
            if (num3 == null) {
                this.sub_class_id = DEFAULT_SUB_CLASS_ID;
            } else {
                this.sub_class_id = num3;
            }
            String str5 = builder.sub_class_name;
            if (str5 == null) {
                this.sub_class_name = "";
            } else {
                this.sub_class_name = str5;
            }
            Integer num4 = builder.book_size;
            if (num4 == null) {
                this.book_size = DEFAULT_BOOK_SIZE;
            } else {
                this.book_size = num4;
            }
            String str6 = builder.intro;
            if (str6 == null) {
                this.intro = "";
            } else {
                this.intro = str6;
            }
            String str7 = builder.author;
            if (str7 == null) {
                this.author = "";
            } else {
                this.author = str7;
            }
            String str8 = builder.author_intro;
            if (str8 == null) {
                this.author_intro = "";
            } else {
                this.author_intro = str8;
            }
            List<BookTag> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list);
            }
            Integer num5 = builder.total_chapter;
            if (num5 == null) {
                this.total_chapter = DEFAULT_TOTAL_CHAPTER;
            } else {
                this.total_chapter = num5;
            }
            Integer num6 = builder.words;
            if (num6 == null) {
                this.words = DEFAULT_WORDS;
            } else {
                this.words = num6;
            }
            Integer num7 = builder.orignal_price;
            if (num7 == null) {
                this.orignal_price = DEFAULT_ORIGNAL_PRICE;
            } else {
                this.orignal_price = num7;
            }
            Integer num8 = builder.price;
            if (num8 == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = num8;
            }
            String str9 = builder.discount_ratio;
            if (str9 == null) {
                this.discount_ratio = "";
            } else {
                this.discount_ratio = str9;
            }
            Integer num9 = builder.is_finish;
            if (num9 == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num9;
            }
            String str10 = builder.ad_code;
            if (str10 == null) {
                this.ad_code = "";
            } else {
                this.ad_code = str10;
            }
            Integer num10 = builder.is_buy;
            if (num10 == null) {
                this.is_buy = DEFAULT_IS_BUY;
            } else {
                this.is_buy = num10;
            }
            String str11 = builder.free_info;
            if (str11 == null) {
                this.free_info = "";
            } else {
                this.free_info = str11;
            }
            String str12 = builder.publisher;
            if (str12 == null) {
                this.publisher = "";
            } else {
                this.publisher = str12;
            }
            String str13 = builder.isbn;
            if (str13 == null) {
                this.isbn = "";
            } else {
                this.isbn = str13;
            }
            String str14 = builder.copyright;
            if (str14 == null) {
                this.copyright = "";
            } else {
                this.copyright = str14;
            }
            String str15 = builder.publish_text;
            if (str15 == null) {
                this.publish_text = "";
            } else {
                this.publish_text = str15;
            }
            String str16 = builder.copyright_text;
            if (str16 == null) {
                this.copyright_text = "";
            } else {
                this.copyright_text = str16;
            }
            String str17 = builder.publish_time;
            if (str17 == null) {
                this.publish_time = "";
            } else {
                this.publish_time = str17;
            }
            String str18 = builder.publish_type;
            if (str18 == null) {
                this.publish_type = "";
            } else {
                this.publish_type = str18;
            }
            Integer num11 = builder.update_time;
            if (num11 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num11;
            }
            String str19 = builder.big_cover;
            if (str19 == null) {
                this.big_cover = "";
            } else {
                this.big_cover = str19;
            }
            Integer num12 = builder.discount_type;
            if (num12 == null) {
                this.discount_type = DEFAULT_DISCOUNT_TYPE;
            } else {
                this.discount_type = num12;
            }
            String str20 = builder.discount_icon;
            if (str20 == null) {
                this.discount_icon = "";
            } else {
                this.discount_icon = str20;
            }
            Integer num13 = builder.read_count;
            if (num13 == null) {
                this.read_count = DEFAULT_READ_COUNT;
            } else {
                this.read_count = num13;
            }
            Integer num14 = builder.total_page;
            if (num14 == null) {
                this.total_page = DEFAULT_TOTAL_PAGE;
            } else {
                this.total_page = num14;
            }
            String str21 = builder.book_ver;
            if (str21 == null) {
                this.book_ver = "";
            } else {
                this.book_ver = str21;
            }
            String str22 = builder.chapter_ver;
            if (str22 == null) {
                this.chapter_ver = "";
            } else {
                this.chapter_ver = str22;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str23 = builder.forum_name;
            if (str23 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str23;
            }
            String str24 = builder.discuss;
            if (str24 == null) {
                this.discuss = "";
            } else {
                this.discuss = str24;
            }
            String str25 = builder.cp_id;
            if (str25 == null) {
                this.cp_id = "";
            } else {
                this.cp_id = str25;
            }
            String str26 = builder.paper_price;
            if (str26 == null) {
                this.paper_price = "";
            } else {
                this.paper_price = str26;
            }
            Integer num15 = builder.first_chapter;
            if (num15 == null) {
                this.first_chapter = DEFAULT_FIRST_CHAPTER;
            } else {
                this.first_chapter = num15;
            }
            Integer num16 = builder.charge_type;
            if (num16 == null) {
                this.charge_type = DEFAULT_CHARGE_TYPE;
            } else {
                this.charge_type = num16;
            }
            Integer num17 = builder.member_show_type;
            if (num17 == null) {
                this.member_show_type = DEFAULT_MEMBER_SHOW_TYPE;
                return;
            } else {
                this.member_show_type = num17;
                return;
            }
        }
        this.book_id = builder.book_id;
        this.title = builder.title;
        this.cover = builder.cover;
        this.book_type = builder.book_type;
        this.class_id = builder.class_id;
        this.class_name = builder.class_name;
        this.sub_class_id = builder.sub_class_id;
        this.sub_class_name = builder.sub_class_name;
        this.book_size = builder.book_size;
        this.intro = builder.intro;
        this.author = builder.author;
        this.author_intro = builder.author_intro;
        this.tags = Message.immutableCopyOf(builder.tags);
        this.total_chapter = builder.total_chapter;
        this.words = builder.words;
        this.orignal_price = builder.orignal_price;
        this.price = builder.price;
        this.discount_ratio = builder.discount_ratio;
        this.is_finish = builder.is_finish;
        this.ad_code = builder.ad_code;
        this.is_buy = builder.is_buy;
        this.free_info = builder.free_info;
        this.publisher = builder.publisher;
        this.isbn = builder.isbn;
        this.copyright = builder.copyright;
        this.publish_text = builder.publish_text;
        this.copyright_text = builder.copyright_text;
        this.publish_time = builder.publish_time;
        this.publish_type = builder.publish_type;
        this.update_time = builder.update_time;
        this.big_cover = builder.big_cover;
        this.discount_type = builder.discount_type;
        this.discount_icon = builder.discount_icon;
        this.read_count = builder.read_count;
        this.total_page = builder.total_page;
        this.book_ver = builder.book_ver;
        this.chapter_ver = builder.chapter_ver;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.discuss = builder.discuss;
        this.cp_id = builder.cp_id;
        this.paper_price = builder.paper_price;
        this.first_chapter = builder.first_chapter;
        this.charge_type = builder.charge_type;
        this.member_show_type = builder.member_show_type;
    }
}
