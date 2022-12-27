package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ForumBookInfo extends Message {
    public static final String DEFAULT_AUTHOR = "";
    public static final String DEFAULT_BOOK_COVER = "";
    public static final String DEFAULT_BOOK_ID = "";
    public static final String DEFAULT_BOOK_TITLE = "";
    public static final String DEFAULT_FORUM_PIC = "";
    public static final String DEFAULT_SHOW_CHAPTER_ID = "";
    public static final String DEFAULT_SHOW_CHAPTER_NO = "";
    public static final String DEFAULT_SHOW_CHAPTER_TITLE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String book_cover;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String book_title;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer book_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String forum_pic;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long history_page_id;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long history_paragraph_id;
    @ProtoField(tag = 13, type = Message.Datatype.INT64)
    public final Long history_percent;
    @ProtoField(tag = 12, type = Message.Datatype.INT64)
    public final Long history_word_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String show_chapter_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String show_chapter_no;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String show_chapter_title;
    @ProtoField(tag = 14, type = Message.Datatype.INT64)
    public final Long show_page_id;
    @ProtoField(tag = 15, type = Message.Datatype.INT64)
    public final Long show_paragraph_id;
    public static final Integer DEFAULT_BOOK_TYPE = 0;
    public static final Long DEFAULT_HISTORY_PAGE_ID = 0L;
    public static final Long DEFAULT_HISTORY_PARAGRAPH_ID = 0L;
    public static final Long DEFAULT_HISTORY_WORD_ID = 0L;
    public static final Long DEFAULT_HISTORY_PERCENT = 0L;
    public static final Long DEFAULT_SHOW_PAGE_ID = 0L;
    public static final Long DEFAULT_SHOW_PARAGRAPH_ID = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumBookInfo> {
        public String author;
        public String book_cover;
        public String book_id;
        public String book_title;
        public Integer book_type;
        public String forum_pic;
        public Long history_page_id;
        public Long history_paragraph_id;
        public Long history_percent;
        public Long history_word_id;
        public String show_chapter_id;
        public String show_chapter_no;
        public String show_chapter_title;
        public Long show_page_id;
        public Long show_paragraph_id;

        public Builder() {
        }

        public Builder(ForumBookInfo forumBookInfo) {
            super(forumBookInfo);
            if (forumBookInfo == null) {
                return;
            }
            this.book_id = forumBookInfo.book_id;
            this.book_type = forumBookInfo.book_type;
            this.book_title = forumBookInfo.book_title;
            this.book_cover = forumBookInfo.book_cover;
            this.author = forumBookInfo.author;
            this.forum_pic = forumBookInfo.forum_pic;
            this.show_chapter_id = forumBookInfo.show_chapter_id;
            this.show_chapter_no = forumBookInfo.show_chapter_no;
            this.show_chapter_title = forumBookInfo.show_chapter_title;
            this.history_page_id = forumBookInfo.history_page_id;
            this.history_paragraph_id = forumBookInfo.history_paragraph_id;
            this.history_word_id = forumBookInfo.history_word_id;
            this.history_percent = forumBookInfo.history_percent;
            this.show_page_id = forumBookInfo.show_page_id;
            this.show_paragraph_id = forumBookInfo.show_paragraph_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumBookInfo build(boolean z) {
            return new ForumBookInfo(this, z);
        }
    }

    public ForumBookInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.book_id;
            if (str == null) {
                this.book_id = "";
            } else {
                this.book_id = str;
            }
            Integer num = builder.book_type;
            if (num == null) {
                this.book_type = DEFAULT_BOOK_TYPE;
            } else {
                this.book_type = num;
            }
            String str2 = builder.book_title;
            if (str2 == null) {
                this.book_title = "";
            } else {
                this.book_title = str2;
            }
            String str3 = builder.book_cover;
            if (str3 == null) {
                this.book_cover = "";
            } else {
                this.book_cover = str3;
            }
            String str4 = builder.author;
            if (str4 == null) {
                this.author = "";
            } else {
                this.author = str4;
            }
            String str5 = builder.forum_pic;
            if (str5 == null) {
                this.forum_pic = "";
            } else {
                this.forum_pic = str5;
            }
            String str6 = builder.show_chapter_id;
            if (str6 == null) {
                this.show_chapter_id = "";
            } else {
                this.show_chapter_id = str6;
            }
            String str7 = builder.show_chapter_no;
            if (str7 == null) {
                this.show_chapter_no = "";
            } else {
                this.show_chapter_no = str7;
            }
            String str8 = builder.show_chapter_title;
            if (str8 == null) {
                this.show_chapter_title = "";
            } else {
                this.show_chapter_title = str8;
            }
            Long l = builder.history_page_id;
            if (l == null) {
                this.history_page_id = DEFAULT_HISTORY_PAGE_ID;
            } else {
                this.history_page_id = l;
            }
            Long l2 = builder.history_paragraph_id;
            if (l2 == null) {
                this.history_paragraph_id = DEFAULT_HISTORY_PARAGRAPH_ID;
            } else {
                this.history_paragraph_id = l2;
            }
            Long l3 = builder.history_word_id;
            if (l3 == null) {
                this.history_word_id = DEFAULT_HISTORY_WORD_ID;
            } else {
                this.history_word_id = l3;
            }
            Long l4 = builder.history_percent;
            if (l4 == null) {
                this.history_percent = DEFAULT_HISTORY_PERCENT;
            } else {
                this.history_percent = l4;
            }
            Long l5 = builder.show_page_id;
            if (l5 == null) {
                this.show_page_id = DEFAULT_SHOW_PAGE_ID;
            } else {
                this.show_page_id = l5;
            }
            Long l6 = builder.show_paragraph_id;
            if (l6 == null) {
                this.show_paragraph_id = DEFAULT_SHOW_PARAGRAPH_ID;
                return;
            } else {
                this.show_paragraph_id = l6;
                return;
            }
        }
        this.book_id = builder.book_id;
        this.book_type = builder.book_type;
        this.book_title = builder.book_title;
        this.book_cover = builder.book_cover;
        this.author = builder.author;
        this.forum_pic = builder.forum_pic;
        this.show_chapter_id = builder.show_chapter_id;
        this.show_chapter_no = builder.show_chapter_no;
        this.show_chapter_title = builder.show_chapter_title;
        this.history_page_id = builder.history_page_id;
        this.history_paragraph_id = builder.history_paragraph_id;
        this.history_word_id = builder.history_word_id;
        this.history_percent = builder.history_percent;
        this.show_page_id = builder.show_page_id;
        this.show_paragraph_id = builder.show_paragraph_id;
    }
}
