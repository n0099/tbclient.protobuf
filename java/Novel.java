package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Novel extends Message {
    public static final String DEFAULT_ANDROID_DETAIL_PARAMS = "";
    public static final String DEFAULT_ANDROID_LAST_CHARPTER_PARAMS = "";
    public static final String DEFAULT_ANDROID_LAST_READ_PARAMS = "";
    public static final String DEFAULT_AUTHOR = "";
    public static final String DEFAULT_AUTHOR_ID = "";
    public static final String DEFAULT_BOOK_ID = "";
    public static final String DEFAULT_BOOK_NAME = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_GID = "";
    public static final String DEFAULT_IOS_DETAIL_PARAMS = "";
    public static final String DEFAULT_IOS_LAST_CHARPTER_PARAMS = "";
    public static final String DEFAULT_IOS_LAST_READ_PARAMS = "";
    public static final String DEFAULT_LAST_CHAPTER_ID = "";
    public static final String DEFAULT_LAST_CHAPTER_INDEX = "";
    public static final String DEFAULT_LAST_CHAPTER_PAGE_ID = "";
    public static final String DEFAULT_LAST_CHAPTER_TITLE = "";
    public static final String DEFAULT_LAST_CHAPTER_UPDATE_TIME = "";
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String android_detail_params;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String android_last_charpter_params;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String android_last_read_params;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String book_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gid;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String ios_detail_params;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String ios_last_charpter_params;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String ios_last_read_params;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String last_chapter_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String last_chapter_index;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String last_chapter_page_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String last_chapter_title;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String last_chapter_update_time;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Novel> {
        public String android_detail_params;
        public String android_last_charpter_params;
        public String android_last_read_params;
        public String author;
        public String author_id;
        public String book_id;
        public String book_name;
        public String description;
        public String gid;
        public String ios_detail_params;
        public String ios_last_charpter_params;
        public String ios_last_read_params;
        public String last_chapter_id;
        public String last_chapter_index;
        public String last_chapter_page_id;
        public String last_chapter_title;
        public String last_chapter_update_time;

        public Builder() {
        }

        public Builder(Novel novel) {
            super(novel);
            if (novel == null) {
                return;
            }
            this.book_id = novel.book_id;
            this.gid = novel.gid;
            this.book_name = novel.book_name;
            this.author_id = novel.author_id;
            this.author = novel.author;
            this.description = novel.description;
            this.last_chapter_id = novel.last_chapter_id;
            this.last_chapter_index = novel.last_chapter_index;
            this.last_chapter_title = novel.last_chapter_title;
            this.last_chapter_page_id = novel.last_chapter_page_id;
            this.last_chapter_update_time = novel.last_chapter_update_time;
            this.ios_detail_params = novel.ios_detail_params;
            this.android_detail_params = novel.android_detail_params;
            this.ios_last_charpter_params = novel.ios_last_charpter_params;
            this.android_last_charpter_params = novel.android_last_charpter_params;
            this.android_last_read_params = novel.android_last_read_params;
            this.ios_last_read_params = novel.ios_last_read_params;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Novel build(boolean z) {
            return new Novel(this, z);
        }
    }

    public Novel(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.book_id;
            if (str == null) {
                this.book_id = "";
            } else {
                this.book_id = str;
            }
            String str2 = builder.gid;
            if (str2 == null) {
                this.gid = "";
            } else {
                this.gid = str2;
            }
            String str3 = builder.book_name;
            if (str3 == null) {
                this.book_name = "";
            } else {
                this.book_name = str3;
            }
            String str4 = builder.author_id;
            if (str4 == null) {
                this.author_id = "";
            } else {
                this.author_id = str4;
            }
            String str5 = builder.author;
            if (str5 == null) {
                this.author = "";
            } else {
                this.author = str5;
            }
            String str6 = builder.description;
            if (str6 == null) {
                this.description = "";
            } else {
                this.description = str6;
            }
            String str7 = builder.last_chapter_id;
            if (str7 == null) {
                this.last_chapter_id = "";
            } else {
                this.last_chapter_id = str7;
            }
            String str8 = builder.last_chapter_index;
            if (str8 == null) {
                this.last_chapter_index = "";
            } else {
                this.last_chapter_index = str8;
            }
            String str9 = builder.last_chapter_title;
            if (str9 == null) {
                this.last_chapter_title = "";
            } else {
                this.last_chapter_title = str9;
            }
            String str10 = builder.last_chapter_page_id;
            if (str10 == null) {
                this.last_chapter_page_id = "";
            } else {
                this.last_chapter_page_id = str10;
            }
            String str11 = builder.last_chapter_update_time;
            if (str11 == null) {
                this.last_chapter_update_time = "";
            } else {
                this.last_chapter_update_time = str11;
            }
            String str12 = builder.ios_detail_params;
            if (str12 == null) {
                this.ios_detail_params = "";
            } else {
                this.ios_detail_params = str12;
            }
            String str13 = builder.android_detail_params;
            if (str13 == null) {
                this.android_detail_params = "";
            } else {
                this.android_detail_params = str13;
            }
            String str14 = builder.ios_last_charpter_params;
            if (str14 == null) {
                this.ios_last_charpter_params = "";
            } else {
                this.ios_last_charpter_params = str14;
            }
            String str15 = builder.android_last_charpter_params;
            if (str15 == null) {
                this.android_last_charpter_params = "";
            } else {
                this.android_last_charpter_params = str15;
            }
            String str16 = builder.android_last_read_params;
            if (str16 == null) {
                this.android_last_read_params = "";
            } else {
                this.android_last_read_params = str16;
            }
            String str17 = builder.ios_last_read_params;
            if (str17 == null) {
                this.ios_last_read_params = "";
                return;
            } else {
                this.ios_last_read_params = str17;
                return;
            }
        }
        this.book_id = builder.book_id;
        this.gid = builder.gid;
        this.book_name = builder.book_name;
        this.author_id = builder.author_id;
        this.author = builder.author;
        this.description = builder.description;
        this.last_chapter_id = builder.last_chapter_id;
        this.last_chapter_index = builder.last_chapter_index;
        this.last_chapter_title = builder.last_chapter_title;
        this.last_chapter_page_id = builder.last_chapter_page_id;
        this.last_chapter_update_time = builder.last_chapter_update_time;
        this.ios_detail_params = builder.ios_detail_params;
        this.android_detail_params = builder.android_detail_params;
        this.ios_last_charpter_params = builder.ios_last_charpter_params;
        this.android_last_charpter_params = builder.android_last_charpter_params;
        this.android_last_read_params = builder.android_last_read_params;
        this.ios_last_read_params = builder.ios_last_read_params;
    }
}
