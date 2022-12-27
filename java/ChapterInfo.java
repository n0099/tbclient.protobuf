package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ChapterInfo extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long chapter_id;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer chapter_no;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer is_buy;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer level;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer orignal_price;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer page_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer pages;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer paragraph_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.UINT32)
    public final List<Integer> paragraphs;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer price;
    @ProtoField(tag = 13, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer words;
    public static final Long DEFAULT_CHAPTER_ID = 0L;
    public static final Integer DEFAULT_LEVEL = 0;
    public static final Integer DEFAULT_WORDS = 0;
    public static final Integer DEFAULT_PAGE_ID = 0;
    public static final Integer DEFAULT_PARAGRAPH_ID = 0;
    public static final Integer DEFAULT_PAGES = 0;
    public static final List<Integer> DEFAULT_PARAGRAPHS = Collections.emptyList();
    public static final Integer DEFAULT_PRICE = 0;
    public static final Integer DEFAULT_IS_BUY = 0;
    public static final Integer DEFAULT_ORIGNAL_PRICE = 0;
    public static final Integer DEFAULT_CHAPTER_NO = 0;
    public static final Long DEFAULT_THREAD_ID = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChapterInfo> {
        public Long chapter_id;
        public Integer chapter_no;
        public Integer is_buy;
        public Integer level;
        public Integer orignal_price;
        public Integer page_id;
        public Integer pages;
        public Integer paragraph_id;
        public List<Integer> paragraphs;
        public Integer price;
        public Long thread_id;
        public String title;
        public Integer words;

        public Builder() {
        }

        public Builder(ChapterInfo chapterInfo) {
            super(chapterInfo);
            if (chapterInfo == null) {
                return;
            }
            this.chapter_id = chapterInfo.chapter_id;
            this.title = chapterInfo.title;
            this.level = chapterInfo.level;
            this.words = chapterInfo.words;
            this.page_id = chapterInfo.page_id;
            this.paragraph_id = chapterInfo.paragraph_id;
            this.pages = chapterInfo.pages;
            this.paragraphs = Message.copyOf(chapterInfo.paragraphs);
            this.price = chapterInfo.price;
            this.is_buy = chapterInfo.is_buy;
            this.orignal_price = chapterInfo.orignal_price;
            this.chapter_no = chapterInfo.chapter_no;
            this.thread_id = chapterInfo.thread_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChapterInfo build(boolean z) {
            return new ChapterInfo(this, z);
        }
    }

    public ChapterInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.chapter_id;
            if (l == null) {
                this.chapter_id = DEFAULT_CHAPTER_ID;
            } else {
                this.chapter_id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.level;
            if (num == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num;
            }
            Integer num2 = builder.words;
            if (num2 == null) {
                this.words = DEFAULT_WORDS;
            } else {
                this.words = num2;
            }
            Integer num3 = builder.page_id;
            if (num3 == null) {
                this.page_id = DEFAULT_PAGE_ID;
            } else {
                this.page_id = num3;
            }
            Integer num4 = builder.paragraph_id;
            if (num4 == null) {
                this.paragraph_id = DEFAULT_PARAGRAPH_ID;
            } else {
                this.paragraph_id = num4;
            }
            Integer num5 = builder.pages;
            if (num5 == null) {
                this.pages = DEFAULT_PAGES;
            } else {
                this.pages = num5;
            }
            List<Integer> list = builder.paragraphs;
            if (list == null) {
                this.paragraphs = DEFAULT_PARAGRAPHS;
            } else {
                this.paragraphs = Message.immutableCopyOf(list);
            }
            Integer num6 = builder.price;
            if (num6 == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = num6;
            }
            Integer num7 = builder.is_buy;
            if (num7 == null) {
                this.is_buy = DEFAULT_IS_BUY;
            } else {
                this.is_buy = num7;
            }
            Integer num8 = builder.orignal_price;
            if (num8 == null) {
                this.orignal_price = DEFAULT_ORIGNAL_PRICE;
            } else {
                this.orignal_price = num8;
            }
            Integer num9 = builder.chapter_no;
            if (num9 == null) {
                this.chapter_no = DEFAULT_CHAPTER_NO;
            } else {
                this.chapter_no = num9;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
                return;
            } else {
                this.thread_id = l2;
                return;
            }
        }
        this.chapter_id = builder.chapter_id;
        this.title = builder.title;
        this.level = builder.level;
        this.words = builder.words;
        this.page_id = builder.page_id;
        this.paragraph_id = builder.paragraph_id;
        this.pages = builder.pages;
        this.paragraphs = Message.immutableCopyOf(builder.paragraphs);
        this.price = builder.price;
        this.is_buy = builder.is_buy;
        this.orignal_price = builder.orignal_price;
        this.chapter_no = builder.chapter_no;
        this.thread_id = builder.thread_id;
    }
}
