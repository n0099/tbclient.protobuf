package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class NovelRecomCard extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AUTHOR = "";
    public static final String DEFAULT_BOTTOM_GUIDE = "";
    public static final String DEFAULT_BOTTOM_SCHEME = "";
    public static final String DEFAULT_BOTTOM_TITLE = "";
    public static final String DEFAULT_BUTTON_NAME = "";
    public static final String DEFAULT_BUTTON_SCHEME = "";
    public static final String DEFAULT_CARD_SCHEME = "";
    public static final String DEFAULT_CHAPTER_NAME = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String bottom_guide;
    @ProtoField(tag = 13)
    public final ThemeColorInfo bottom_left_icon;
    @ProtoField(tag = 16)
    public final ThemeColorInfo bottom_right_icon;
    @ProtoField(tag = 19)
    public final ThemeColorInfo bottom_right_icon_2;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String bottom_scheme;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String bottom_title;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String button_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String button_scheme;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String card_scheme;
    @ProtoField(tag = 17)
    public final ThemeColorInfo chapter_bg_color;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String chapter_name;
    @ProtoField(tag = 18)
    public final ThemeColorInfo chapter_name_color;
    @ProtoField(tag = 8)
    public final ThemeColorInfo chapter_new_labels;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long chapter_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ThemeColorInfo> title_labels;
    public static final List<ThemeColorInfo> DEFAULT_TITLE_LABELS = Collections.emptyList();
    public static final Long DEFAULT_CHAPTER_TIME = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NovelRecomCard> {
        public String _abstract;
        public String author;
        public String bottom_guide;
        public ThemeColorInfo bottom_left_icon;
        public ThemeColorInfo bottom_right_icon;
        public ThemeColorInfo bottom_right_icon_2;
        public String bottom_scheme;
        public String bottom_title;
        public String button_name;
        public String button_scheme;
        public String card_scheme;
        public ThemeColorInfo chapter_bg_color;
        public String chapter_name;
        public ThemeColorInfo chapter_name_color;
        public ThemeColorInfo chapter_new_labels;
        public Long chapter_time;
        public String icon_url;
        public String title;
        public List<ThemeColorInfo> title_labels;

        public Builder() {
        }

        public Builder(NovelRecomCard novelRecomCard) {
            super(novelRecomCard);
            if (novelRecomCard == null) {
                return;
            }
            this.icon_url = novelRecomCard.icon_url;
            this.title = novelRecomCard.title;
            this.title_labels = Message.copyOf(novelRecomCard.title_labels);
            this.author = novelRecomCard.author;
            this._abstract = novelRecomCard._abstract;
            this.chapter_name = novelRecomCard.chapter_name;
            this.chapter_time = novelRecomCard.chapter_time;
            this.chapter_new_labels = novelRecomCard.chapter_new_labels;
            this.button_name = novelRecomCard.button_name;
            this.button_scheme = novelRecomCard.button_scheme;
            this.card_scheme = novelRecomCard.card_scheme;
            this.bottom_title = novelRecomCard.bottom_title;
            this.bottom_left_icon = novelRecomCard.bottom_left_icon;
            this.bottom_scheme = novelRecomCard.bottom_scheme;
            this.bottom_guide = novelRecomCard.bottom_guide;
            this.bottom_right_icon = novelRecomCard.bottom_right_icon;
            this.chapter_bg_color = novelRecomCard.chapter_bg_color;
            this.chapter_name_color = novelRecomCard.chapter_name_color;
            this.bottom_right_icon_2 = novelRecomCard.bottom_right_icon_2;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NovelRecomCard build(boolean z) {
            return new NovelRecomCard(this, z);
        }
    }

    public NovelRecomCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            List<ThemeColorInfo> list = builder.title_labels;
            if (list == null) {
                this.title_labels = DEFAULT_TITLE_LABELS;
            } else {
                this.title_labels = Message.immutableCopyOf(list);
            }
            String str3 = builder.author;
            if (str3 == null) {
                this.author = "";
            } else {
                this.author = str3;
            }
            String str4 = builder._abstract;
            if (str4 == null) {
                this._abstract = "";
            } else {
                this._abstract = str4;
            }
            String str5 = builder.chapter_name;
            if (str5 == null) {
                this.chapter_name = "";
            } else {
                this.chapter_name = str5;
            }
            Long l = builder.chapter_time;
            if (l == null) {
                this.chapter_time = DEFAULT_CHAPTER_TIME;
            } else {
                this.chapter_time = l;
            }
            this.chapter_new_labels = builder.chapter_new_labels;
            String str6 = builder.button_name;
            if (str6 == null) {
                this.button_name = "";
            } else {
                this.button_name = str6;
            }
            String str7 = builder.button_scheme;
            if (str7 == null) {
                this.button_scheme = "";
            } else {
                this.button_scheme = str7;
            }
            String str8 = builder.card_scheme;
            if (str8 == null) {
                this.card_scheme = "";
            } else {
                this.card_scheme = str8;
            }
            String str9 = builder.bottom_title;
            if (str9 == null) {
                this.bottom_title = "";
            } else {
                this.bottom_title = str9;
            }
            this.bottom_left_icon = builder.bottom_left_icon;
            String str10 = builder.bottom_scheme;
            if (str10 == null) {
                this.bottom_scheme = "";
            } else {
                this.bottom_scheme = str10;
            }
            String str11 = builder.bottom_guide;
            if (str11 == null) {
                this.bottom_guide = "";
            } else {
                this.bottom_guide = str11;
            }
            this.bottom_right_icon = builder.bottom_right_icon;
            this.chapter_bg_color = builder.chapter_bg_color;
            this.chapter_name_color = builder.chapter_name_color;
            this.bottom_right_icon_2 = builder.bottom_right_icon_2;
            return;
        }
        this.icon_url = builder.icon_url;
        this.title = builder.title;
        this.title_labels = Message.immutableCopyOf(builder.title_labels);
        this.author = builder.author;
        this._abstract = builder._abstract;
        this.chapter_name = builder.chapter_name;
        this.chapter_time = builder.chapter_time;
        this.chapter_new_labels = builder.chapter_new_labels;
        this.button_name = builder.button_name;
        this.button_scheme = builder.button_scheme;
        this.card_scheme = builder.card_scheme;
        this.bottom_title = builder.bottom_title;
        this.bottom_left_icon = builder.bottom_left_icon;
        this.bottom_scheme = builder.bottom_scheme;
        this.bottom_guide = builder.bottom_guide;
        this.bottom_right_icon = builder.bottom_right_icon;
        this.chapter_bg_color = builder.chapter_bg_color;
        this.chapter_name_color = builder.chapter_name_color;
        this.bottom_right_icon_2 = builder.bottom_right_icon_2;
    }
}
