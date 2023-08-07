package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class NovelChapterInfo extends Message {
    public static final String DEFAULT_CHAPTER_CONTENT = "";
    public static final String DEFAULT_CHAPTER_INDEX = "";
    public static final String DEFAULT_CHAPTER_NAME = "";
    public static final String DEFAULT_IS_LATEST = "";
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String chapter_content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String chapter_index;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String chapter_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String is_latest;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long update_time;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NovelChapterInfo> {
        public String chapter_content;
        public String chapter_index;
        public String chapter_name;
        public String is_latest;
        public Long update_time;

        public Builder() {
        }

        public Builder(NovelChapterInfo novelChapterInfo) {
            super(novelChapterInfo);
            if (novelChapterInfo == null) {
                return;
            }
            this.chapter_index = novelChapterInfo.chapter_index;
            this.chapter_name = novelChapterInfo.chapter_name;
            this.chapter_content = novelChapterInfo.chapter_content;
            this.update_time = novelChapterInfo.update_time;
            this.is_latest = novelChapterInfo.is_latest;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NovelChapterInfo build(boolean z) {
            return new NovelChapterInfo(this, z);
        }
    }

    public NovelChapterInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.chapter_index;
            if (str == null) {
                this.chapter_index = "";
            } else {
                this.chapter_index = str;
            }
            String str2 = builder.chapter_name;
            if (str2 == null) {
                this.chapter_name = "";
            } else {
                this.chapter_name = str2;
            }
            String str3 = builder.chapter_content;
            if (str3 == null) {
                this.chapter_content = "";
            } else {
                this.chapter_content = str3;
            }
            Long l = builder.update_time;
            if (l == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = l;
            }
            String str4 = builder.is_latest;
            if (str4 == null) {
                this.is_latest = "";
                return;
            } else {
                this.is_latest = str4;
                return;
            }
        }
        this.chapter_index = builder.chapter_index;
        this.chapter_name = builder.chapter_name;
        this.chapter_content = builder.chapter_content;
        this.update_time = builder.update_time;
        this.is_latest = builder.is_latest;
    }
}
