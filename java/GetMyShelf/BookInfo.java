package tbclient.GetMyShelf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class BookInfo extends Message {
    public static final String DEFAULT_AUTHOR_NAME = "";
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final String DEFAULT_COVER_IMG = "";
    public static final String DEFAULT_FIRST_CHAPTER_ID = "";
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String author_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cover_img;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String first_chapter_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_finish;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer total_chapter;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_CARTOON_ID = 0L;
    public static final Integer DEFAULT_TOTAL_CHAPTER = 0;
    public static final Integer DEFAULT_IS_FINISH = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<BookInfo> {
        public String author_name;
        public Long cartoon_id;
        public String cartoon_name;
        public String cover_img;
        public String first_chapter_id;
        public Long forum_id;
        public Integer is_finish;
        public Integer total_chapter;

        public Builder() {
        }

        public Builder(BookInfo bookInfo) {
            super(bookInfo);
            if (bookInfo == null) {
                return;
            }
            this.forum_id = bookInfo.forum_id;
            this.cartoon_id = bookInfo.cartoon_id;
            this.cover_img = bookInfo.cover_img;
            this.cartoon_name = bookInfo.cartoon_name;
            this.total_chapter = bookInfo.total_chapter;
            this.first_chapter_id = bookInfo.first_chapter_id;
            this.is_finish = bookInfo.is_finish;
            this.author_name = bookInfo.author_name;
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.cartoon_id;
            if (l2 == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = l2;
            }
            String str = builder.cover_img;
            if (str == null) {
                this.cover_img = "";
            } else {
                this.cover_img = str;
            }
            String str2 = builder.cartoon_name;
            if (str2 == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = str2;
            }
            Integer num = builder.total_chapter;
            if (num == null) {
                this.total_chapter = DEFAULT_TOTAL_CHAPTER;
            } else {
                this.total_chapter = num;
            }
            String str3 = builder.first_chapter_id;
            if (str3 == null) {
                this.first_chapter_id = "";
            } else {
                this.first_chapter_id = str3;
            }
            Integer num2 = builder.is_finish;
            if (num2 == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num2;
            }
            String str4 = builder.author_name;
            if (str4 == null) {
                this.author_name = "";
                return;
            } else {
                this.author_name = str4;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.cartoon_id = builder.cartoon_id;
        this.cover_img = builder.cover_img;
        this.cartoon_name = builder.cartoon_name;
        this.total_chapter = builder.total_chapter;
        this.first_chapter_id = builder.first_chapter_id;
        this.is_finish = builder.is_finish;
        this.author_name = builder.author_name;
    }
}
