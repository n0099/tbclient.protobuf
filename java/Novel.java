package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    private Novel(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.book_id == null) {
                this.book_id = "";
            } else {
                this.book_id = builder.book_id;
            }
            if (builder.gid == null) {
                this.gid = "";
            } else {
                this.gid = builder.gid;
            }
            if (builder.book_name == null) {
                this.book_name = "";
            } else {
                this.book_name = builder.book_name;
            }
            if (builder.author_id == null) {
                this.author_id = "";
            } else {
                this.author_id = builder.author_id;
            }
            if (builder.author == null) {
                this.author = "";
            } else {
                this.author = builder.author;
            }
            if (builder.description == null) {
                this.description = "";
            } else {
                this.description = builder.description;
            }
            if (builder.last_chapter_id == null) {
                this.last_chapter_id = "";
            } else {
                this.last_chapter_id = builder.last_chapter_id;
            }
            if (builder.last_chapter_index == null) {
                this.last_chapter_index = "";
            } else {
                this.last_chapter_index = builder.last_chapter_index;
            }
            if (builder.last_chapter_title == null) {
                this.last_chapter_title = "";
            } else {
                this.last_chapter_title = builder.last_chapter_title;
            }
            if (builder.last_chapter_page_id == null) {
                this.last_chapter_page_id = "";
            } else {
                this.last_chapter_page_id = builder.last_chapter_page_id;
            }
            if (builder.last_chapter_update_time == null) {
                this.last_chapter_update_time = "";
            } else {
                this.last_chapter_update_time = builder.last_chapter_update_time;
            }
            if (builder.ios_detail_params == null) {
                this.ios_detail_params = "";
            } else {
                this.ios_detail_params = builder.ios_detail_params;
            }
            if (builder.android_detail_params == null) {
                this.android_detail_params = "";
            } else {
                this.android_detail_params = builder.android_detail_params;
            }
            if (builder.ios_last_charpter_params == null) {
                this.ios_last_charpter_params = "";
            } else {
                this.ios_last_charpter_params = builder.ios_last_charpter_params;
            }
            if (builder.android_last_charpter_params == null) {
                this.android_last_charpter_params = "";
            } else {
                this.android_last_charpter_params = builder.android_last_charpter_params;
            }
            if (builder.android_last_read_params == null) {
                this.android_last_read_params = "";
            } else {
                this.android_last_read_params = builder.android_last_read_params;
            }
            if (builder.ios_last_read_params == null) {
                this.ios_last_read_params = "";
                return;
            } else {
                this.ios_last_read_params = builder.ios_last_read_params;
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

    /* loaded from: classes2.dex */
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
            if (novel != null) {
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
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Novel build(boolean z) {
            return new Novel(this, z);
        }
    }
}
