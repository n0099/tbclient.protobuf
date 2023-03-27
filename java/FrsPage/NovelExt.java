package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;
/* loaded from: classes9.dex */
public final class NovelExt extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final Long DEFAULT_CHAPTER_TIME = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 4)
    public final ThemeColorInfo chapter_bg_color;
    @ProtoField(tag = 5)
    public final ThemeColorInfo chapter_name_color;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long chapter_time;
    @ProtoField(tag = 6)
    public final ThemeColorInfo chapter_time_color;
    @ProtoField(tag = 3)
    public final ThemeColorInfo new_labels;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NovelExt> {
        public String _abstract;
        public ThemeColorInfo chapter_bg_color;
        public ThemeColorInfo chapter_name_color;
        public Long chapter_time;
        public ThemeColorInfo chapter_time_color;
        public ThemeColorInfo new_labels;

        public Builder() {
        }

        public Builder(NovelExt novelExt) {
            super(novelExt);
            if (novelExt == null) {
                return;
            }
            this.chapter_time = novelExt.chapter_time;
            this._abstract = novelExt._abstract;
            this.new_labels = novelExt.new_labels;
            this.chapter_bg_color = novelExt.chapter_bg_color;
            this.chapter_name_color = novelExt.chapter_name_color;
            this.chapter_time_color = novelExt.chapter_time_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NovelExt build(boolean z) {
            return new NovelExt(this, z);
        }
    }

    public NovelExt(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.chapter_time;
            if (l == null) {
                this.chapter_time = DEFAULT_CHAPTER_TIME;
            } else {
                this.chapter_time = l;
            }
            String str = builder._abstract;
            if (str == null) {
                this._abstract = "";
            } else {
                this._abstract = str;
            }
            this.new_labels = builder.new_labels;
            this.chapter_bg_color = builder.chapter_bg_color;
            this.chapter_name_color = builder.chapter_name_color;
            this.chapter_time_color = builder.chapter_time_color;
            return;
        }
        this.chapter_time = builder.chapter_time;
        this._abstract = builder._abstract;
        this.new_labels = builder.new_labels;
        this.chapter_bg_color = builder.chapter_bg_color;
        this.chapter_name_color = builder.chapter_name_color;
        this.chapter_time_color = builder.chapter_time_color;
    }
}
