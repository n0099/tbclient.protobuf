package tbclient.GetUserBookMarkList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Mark extends Message {
    public static final String DEFAULT_BOOK_ID = "";
    public static final String DEFAULT_CHAPTER_TITLE = "";
    public static final String DEFAULT_CONTENT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long chapter_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String chapter_title;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer page_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer paragraph_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long position;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer update_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer word_id;
    public static final Long DEFAULT_CHAPTER_ID = 0L;
    public static final Integer DEFAULT_PAGE_ID = 0;
    public static final Integer DEFAULT_PARAGRAPH_ID = 0;
    public static final Integer DEFAULT_WORD_ID = 0;
    public static final Long DEFAULT_POSITION = 0L;
    public static final Integer DEFAULT_UPDATE_TIME = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Mark> {
        public String book_id;
        public Long chapter_id;
        public String chapter_title;
        public String content;
        public Integer page_id;
        public Integer paragraph_id;
        public Long position;
        public Integer update_time;
        public Integer word_id;

        public Builder() {
        }

        public Builder(Mark mark) {
            super(mark);
            if (mark == null) {
                return;
            }
            this.book_id = mark.book_id;
            this.chapter_id = mark.chapter_id;
            this.chapter_title = mark.chapter_title;
            this.page_id = mark.page_id;
            this.paragraph_id = mark.paragraph_id;
            this.word_id = mark.word_id;
            this.position = mark.position;
            this.content = mark.content;
            this.update_time = mark.update_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Mark build(boolean z) {
            return new Mark(this, z);
        }
    }

    public Mark(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.book_id;
            if (str == null) {
                this.book_id = "";
            } else {
                this.book_id = str;
            }
            Long l = builder.chapter_id;
            if (l == null) {
                this.chapter_id = DEFAULT_CHAPTER_ID;
            } else {
                this.chapter_id = l;
            }
            String str2 = builder.chapter_title;
            if (str2 == null) {
                this.chapter_title = "";
            } else {
                this.chapter_title = str2;
            }
            Integer num = builder.page_id;
            if (num == null) {
                this.page_id = DEFAULT_PAGE_ID;
            } else {
                this.page_id = num;
            }
            Integer num2 = builder.paragraph_id;
            if (num2 == null) {
                this.paragraph_id = DEFAULT_PARAGRAPH_ID;
            } else {
                this.paragraph_id = num2;
            }
            Integer num3 = builder.word_id;
            if (num3 == null) {
                this.word_id = DEFAULT_WORD_ID;
            } else {
                this.word_id = num3;
            }
            Long l2 = builder.position;
            if (l2 == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = l2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            Integer num4 = builder.update_time;
            if (num4 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
                return;
            } else {
                this.update_time = num4;
                return;
            }
        }
        this.book_id = builder.book_id;
        this.chapter_id = builder.chapter_id;
        this.chapter_title = builder.chapter_title;
        this.page_id = builder.page_id;
        this.paragraph_id = builder.paragraph_id;
        this.word_id = builder.word_id;
        this.position = builder.position;
        this.content = builder.content;
        this.update_time = builder.update_time;
    }
}
