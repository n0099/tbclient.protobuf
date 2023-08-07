package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.NovelChapterInfo;
import tbclient.NovelInfo;
import tbclient.ThemeColorInfo;
/* loaded from: classes2.dex */
public final class NovelCard extends Message {
    public static final String DEFAULT_CHAPTER_SCHEME = "";
    public static final String DEFAULT_ENTRY_TEXT = "";
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 10)
    public final ThemeColorInfo background_image;
    @ProtoField(tag = 3)
    public final NovelChapterInfo chapter_info;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String chapter_scheme;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<ThemeColorInfo> chapter_tags;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String entry_text;
    @ProtoField(tag = 2)
    public final NovelInfo novel_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThemeColorInfo> novel_tags;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer offset;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long reader_cnt;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String target_scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    public static final List<ThemeColorInfo> DEFAULT_NOVEL_TAGS = Collections.emptyList();
    public static final List<ThemeColorInfo> DEFAULT_CHAPTER_TAGS = Collections.emptyList();
    public static final Long DEFAULT_READER_CNT = 0L;
    public static final Integer DEFAULT_OFFSET = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NovelCard> {
        public ThemeColorInfo background_image;
        public NovelChapterInfo chapter_info;
        public String chapter_scheme;
        public List<ThemeColorInfo> chapter_tags;
        public String entry_text;
        public NovelInfo novel_info;
        public List<ThemeColorInfo> novel_tags;
        public Integer offset;
        public Long reader_cnt;
        public String target_scheme;
        public String title;

        public Builder() {
        }

        public Builder(NovelCard novelCard) {
            super(novelCard);
            if (novelCard == null) {
                return;
            }
            this.title = novelCard.title;
            this.novel_info = novelCard.novel_info;
            this.chapter_info = novelCard.chapter_info;
            this.novel_tags = Message.copyOf(novelCard.novel_tags);
            this.chapter_tags = Message.copyOf(novelCard.chapter_tags);
            this.reader_cnt = novelCard.reader_cnt;
            this.entry_text = novelCard.entry_text;
            this.target_scheme = novelCard.target_scheme;
            this.chapter_scheme = novelCard.chapter_scheme;
            this.background_image = novelCard.background_image;
            this.offset = novelCard.offset;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NovelCard build(boolean z) {
            return new NovelCard(this, z);
        }
    }

    public NovelCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            this.novel_info = builder.novel_info;
            this.chapter_info = builder.chapter_info;
            List<ThemeColorInfo> list = builder.novel_tags;
            if (list == null) {
                this.novel_tags = DEFAULT_NOVEL_TAGS;
            } else {
                this.novel_tags = Message.immutableCopyOf(list);
            }
            List<ThemeColorInfo> list2 = builder.chapter_tags;
            if (list2 == null) {
                this.chapter_tags = DEFAULT_CHAPTER_TAGS;
            } else {
                this.chapter_tags = Message.immutableCopyOf(list2);
            }
            Long l = builder.reader_cnt;
            if (l == null) {
                this.reader_cnt = DEFAULT_READER_CNT;
            } else {
                this.reader_cnt = l;
            }
            String str2 = builder.entry_text;
            if (str2 == null) {
                this.entry_text = "";
            } else {
                this.entry_text = str2;
            }
            String str3 = builder.target_scheme;
            if (str3 == null) {
                this.target_scheme = "";
            } else {
                this.target_scheme = str3;
            }
            String str4 = builder.chapter_scheme;
            if (str4 == null) {
                this.chapter_scheme = "";
            } else {
                this.chapter_scheme = str4;
            }
            this.background_image = builder.background_image;
            Integer num = builder.offset;
            if (num == null) {
                this.offset = DEFAULT_OFFSET;
                return;
            } else {
                this.offset = num;
                return;
            }
        }
        this.title = builder.title;
        this.novel_info = builder.novel_info;
        this.chapter_info = builder.chapter_info;
        this.novel_tags = Message.immutableCopyOf(builder.novel_tags);
        this.chapter_tags = Message.immutableCopyOf(builder.chapter_tags);
        this.reader_cnt = builder.reader_cnt;
        this.entry_text = builder.entry_text;
        this.target_scheme = builder.target_scheme;
        this.chapter_scheme = builder.chapter_scheme;
        this.background_image = builder.background_image;
        this.offset = builder.offset;
    }
}
