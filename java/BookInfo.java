package tbclient;

import com.baidu.tieba.r;
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
    @ProtoField(tag = r.n.PullToRefresh_mode, type = Message.Datatype.STRING)
    public final String cp_id;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String discount_icon;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String discount_ratio;
    @ProtoField(tag = 32, type = Message.Datatype.UINT32)
    public final Integer discount_type;
    @ProtoField(tag = r.n.PullToRefresh_headerTextColor, type = Message.Datatype.STRING)
    public final String discuss;
    @ProtoField(tag = 43, type = Message.Datatype.UINT32)
    public final Integer first_chapter;
    @ProtoField(tag = r.n.PullToRefresh_adapterViewBackground, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = r.n.PullToRefresh_headerBackground, type = Message.Datatype.STRING)
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

    /* synthetic */ BookInfo(Builder builder, boolean z, BookInfo bookInfo) {
        this(builder, z);
    }

    private BookInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.book_id == null) {
                this.book_id = "";
            } else {
                this.book_id = builder.book_id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.cover == null) {
                this.cover = "";
            } else {
                this.cover = builder.cover;
            }
            if (builder.book_type == null) {
                this.book_type = DEFAULT_BOOK_TYPE;
            } else {
                this.book_type = builder.book_type;
            }
            if (builder.class_id == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = builder.class_id;
            }
            if (builder.class_name == null) {
                this.class_name = "";
            } else {
                this.class_name = builder.class_name;
            }
            if (builder.sub_class_id == null) {
                this.sub_class_id = DEFAULT_SUB_CLASS_ID;
            } else {
                this.sub_class_id = builder.sub_class_id;
            }
            if (builder.sub_class_name == null) {
                this.sub_class_name = "";
            } else {
                this.sub_class_name = builder.sub_class_name;
            }
            if (builder.book_size == null) {
                this.book_size = DEFAULT_BOOK_SIZE;
            } else {
                this.book_size = builder.book_size;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.author == null) {
                this.author = "";
            } else {
                this.author = builder.author;
            }
            if (builder.author_intro == null) {
                this.author_intro = "";
            } else {
                this.author_intro = builder.author_intro;
            }
            if (builder.tags == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = immutableCopyOf(builder.tags);
            }
            if (builder.total_chapter == null) {
                this.total_chapter = DEFAULT_TOTAL_CHAPTER;
            } else {
                this.total_chapter = builder.total_chapter;
            }
            if (builder.words == null) {
                this.words = DEFAULT_WORDS;
            } else {
                this.words = builder.words;
            }
            if (builder.orignal_price == null) {
                this.orignal_price = DEFAULT_ORIGNAL_PRICE;
            } else {
                this.orignal_price = builder.orignal_price;
            }
            if (builder.price == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = builder.price;
            }
            if (builder.discount_ratio == null) {
                this.discount_ratio = "";
            } else {
                this.discount_ratio = builder.discount_ratio;
            }
            if (builder.is_finish == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = builder.is_finish;
            }
            if (builder.ad_code == null) {
                this.ad_code = "";
            } else {
                this.ad_code = builder.ad_code;
            }
            if (builder.is_buy == null) {
                this.is_buy = DEFAULT_IS_BUY;
            } else {
                this.is_buy = builder.is_buy;
            }
            if (builder.free_info == null) {
                this.free_info = "";
            } else {
                this.free_info = builder.free_info;
            }
            if (builder.publisher == null) {
                this.publisher = "";
            } else {
                this.publisher = builder.publisher;
            }
            if (builder.isbn == null) {
                this.isbn = "";
            } else {
                this.isbn = builder.isbn;
            }
            if (builder.copyright == null) {
                this.copyright = "";
            } else {
                this.copyright = builder.copyright;
            }
            if (builder.publish_text == null) {
                this.publish_text = "";
            } else {
                this.publish_text = builder.publish_text;
            }
            if (builder.copyright_text == null) {
                this.copyright_text = "";
            } else {
                this.copyright_text = builder.copyright_text;
            }
            if (builder.publish_time == null) {
                this.publish_time = "";
            } else {
                this.publish_time = builder.publish_time;
            }
            if (builder.publish_type == null) {
                this.publish_type = "";
            } else {
                this.publish_type = builder.publish_type;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.big_cover == null) {
                this.big_cover = "";
            } else {
                this.big_cover = builder.big_cover;
            }
            if (builder.discount_type == null) {
                this.discount_type = DEFAULT_DISCOUNT_TYPE;
            } else {
                this.discount_type = builder.discount_type;
            }
            if (builder.discount_icon == null) {
                this.discount_icon = "";
            } else {
                this.discount_icon = builder.discount_icon;
            }
            if (builder.read_count == null) {
                this.read_count = DEFAULT_READ_COUNT;
            } else {
                this.read_count = builder.read_count;
            }
            if (builder.total_page == null) {
                this.total_page = DEFAULT_TOTAL_PAGE;
            } else {
                this.total_page = builder.total_page;
            }
            if (builder.book_ver == null) {
                this.book_ver = "";
            } else {
                this.book_ver = builder.book_ver;
            }
            if (builder.chapter_ver == null) {
                this.chapter_ver = "";
            } else {
                this.chapter_ver = builder.chapter_ver;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.discuss == null) {
                this.discuss = "";
            } else {
                this.discuss = builder.discuss;
            }
            if (builder.cp_id == null) {
                this.cp_id = "";
            } else {
                this.cp_id = builder.cp_id;
            }
            if (builder.paper_price == null) {
                this.paper_price = "";
            } else {
                this.paper_price = builder.paper_price;
            }
            if (builder.first_chapter == null) {
                this.first_chapter = DEFAULT_FIRST_CHAPTER;
                return;
            } else {
                this.first_chapter = builder.first_chapter;
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
        this.tags = immutableCopyOf(builder.tags);
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
    }

    /* loaded from: classes.dex */
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
            if (bookInfo != null) {
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
                this.tags = BookInfo.copyOf(bookInfo.tags);
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BookInfo build(boolean z) {
            return new BookInfo(this, z, null);
        }
    }
}
