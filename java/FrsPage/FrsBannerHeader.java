package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.IconUrlInfo;
import tbclient.ThemeColorInfo;
/* loaded from: classes9.dex */
public final class FrsBannerHeader extends Message {
    public static final String DEFAULT_CONTENT1 = "";
    public static final String DEFAULT_CONTENT2 = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_JUMP_LINK = "";
    public static final String DEFAULT_JUMP_TIPS = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 7)
    public final ThemeColorInfo background_color;
    @ProtoField(tag = 12)
    public final IconUrlInfo brand_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content1;
    @ProtoField(tag = 4)
    public final ThemeColorInfo content1_color;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content2;
    @ProtoField(tag = 5)
    public final ThemeColorInfo content2_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String jump_link;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String jump_tips;
    @ProtoField(tag = 6)
    public final ThemeColorInfo jump_tips_color;
    @ProtoField(tag = 11)
    public final IconUrlInfo jump_tips_icon;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FrsBannerHeader> {
        public ThemeColorInfo background_color;
        public IconUrlInfo brand_icon;
        public String content1;
        public ThemeColorInfo content1_color;
        public String content2;
        public ThemeColorInfo content2_color;
        public String icon_url;
        public String jump_link;
        public String jump_tips;
        public ThemeColorInfo jump_tips_color;
        public IconUrlInfo jump_tips_icon;
        public String type;

        public Builder() {
        }

        public Builder(FrsBannerHeader frsBannerHeader) {
            super(frsBannerHeader);
            if (frsBannerHeader == null) {
                return;
            }
            this.icon_url = frsBannerHeader.icon_url;
            this.content1 = frsBannerHeader.content1;
            this.content2 = frsBannerHeader.content2;
            this.content1_color = frsBannerHeader.content1_color;
            this.content2_color = frsBannerHeader.content2_color;
            this.jump_tips_color = frsBannerHeader.jump_tips_color;
            this.background_color = frsBannerHeader.background_color;
            this.jump_tips = frsBannerHeader.jump_tips;
            this.jump_link = frsBannerHeader.jump_link;
            this.type = frsBannerHeader.type;
            this.jump_tips_icon = frsBannerHeader.jump_tips_icon;
            this.brand_icon = frsBannerHeader.brand_icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsBannerHeader build(boolean z) {
            return new FrsBannerHeader(this, z);
        }
    }

    public FrsBannerHeader(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.content1;
            if (str2 == null) {
                this.content1 = "";
            } else {
                this.content1 = str2;
            }
            String str3 = builder.content2;
            if (str3 == null) {
                this.content2 = "";
            } else {
                this.content2 = str3;
            }
            this.content1_color = builder.content1_color;
            this.content2_color = builder.content2_color;
            this.jump_tips_color = builder.jump_tips_color;
            this.background_color = builder.background_color;
            String str4 = builder.jump_tips;
            if (str4 == null) {
                this.jump_tips = "";
            } else {
                this.jump_tips = str4;
            }
            String str5 = builder.jump_link;
            if (str5 == null) {
                this.jump_link = "";
            } else {
                this.jump_link = str5;
            }
            String str6 = builder.type;
            if (str6 == null) {
                this.type = "";
            } else {
                this.type = str6;
            }
            this.jump_tips_icon = builder.jump_tips_icon;
            this.brand_icon = builder.brand_icon;
            return;
        }
        this.icon_url = builder.icon_url;
        this.content1 = builder.content1;
        this.content2 = builder.content2;
        this.content1_color = builder.content1_color;
        this.content2_color = builder.content2_color;
        this.jump_tips_color = builder.jump_tips_color;
        this.background_color = builder.background_color;
        this.jump_tips = builder.jump_tips;
        this.jump_link = builder.jump_link;
        this.type = builder.type;
        this.jump_tips_icon = builder.jump_tips_icon;
        this.brand_icon = builder.brand_icon;
    }
}
