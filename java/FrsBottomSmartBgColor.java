package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FrsBottomSmartBgColor extends Message {
    public static final String DEFAULT_AT_FONT_COLOR = "";
    public static final String DEFAULT_BALL_BG_COLOR = "";
    public static final String DEFAULT_MODULE1_BG_COLOR = "";
    public static final String DEFAULT_MODULE2_BG_COLOR = "";
    public static final String DEFAULT_MODULE3_BG_COLOR = "";
    public static final String DEFAULT_MODULE4_BG_COLOR = "";
    public static final String DEFAULT_POST_BUTTON_COLOR = "";
    public static final String DEFAULT_POST_BUTTON_SHADOW_COLOR = "";
    public static final String DEFAULT_TAB_LINE_COLOR = "";
    public static final String DEFAULT_TAG_COLOR = "";
    public static final String DEFAULT_THEME_COLOR = "";
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String at_font_color;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ball_bg_color;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String module1_bg_color;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String module2_bg_color;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String module3_bg_color;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String module4_bg_color;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String post_button_color;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String post_button_shadow_color;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_line_color;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tag_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String theme_color;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsBottomSmartBgColor> {
        public String at_font_color;
        public String ball_bg_color;
        public String module1_bg_color;
        public String module2_bg_color;
        public String module3_bg_color;
        public String module4_bg_color;
        public String post_button_color;
        public String post_button_shadow_color;
        public String tab_line_color;
        public String tag_color;
        public String theme_color;

        public Builder() {
        }

        public Builder(FrsBottomSmartBgColor frsBottomSmartBgColor) {
            super(frsBottomSmartBgColor);
            if (frsBottomSmartBgColor == null) {
                return;
            }
            this.theme_color = frsBottomSmartBgColor.theme_color;
            this.ball_bg_color = frsBottomSmartBgColor.ball_bg_color;
            this.tab_line_color = frsBottomSmartBgColor.tab_line_color;
            this.tag_color = frsBottomSmartBgColor.tag_color;
            this.post_button_color = frsBottomSmartBgColor.post_button_color;
            this.post_button_shadow_color = frsBottomSmartBgColor.post_button_shadow_color;
            this.module1_bg_color = frsBottomSmartBgColor.module1_bg_color;
            this.module2_bg_color = frsBottomSmartBgColor.module2_bg_color;
            this.module3_bg_color = frsBottomSmartBgColor.module3_bg_color;
            this.module4_bg_color = frsBottomSmartBgColor.module4_bg_color;
            this.at_font_color = frsBottomSmartBgColor.at_font_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsBottomSmartBgColor build(boolean z) {
            return new FrsBottomSmartBgColor(this, z);
        }
    }

    public FrsBottomSmartBgColor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.theme_color;
            if (str == null) {
                this.theme_color = "";
            } else {
                this.theme_color = str;
            }
            String str2 = builder.ball_bg_color;
            if (str2 == null) {
                this.ball_bg_color = "";
            } else {
                this.ball_bg_color = str2;
            }
            String str3 = builder.tab_line_color;
            if (str3 == null) {
                this.tab_line_color = "";
            } else {
                this.tab_line_color = str3;
            }
            String str4 = builder.tag_color;
            if (str4 == null) {
                this.tag_color = "";
            } else {
                this.tag_color = str4;
            }
            String str5 = builder.post_button_color;
            if (str5 == null) {
                this.post_button_color = "";
            } else {
                this.post_button_color = str5;
            }
            String str6 = builder.post_button_shadow_color;
            if (str6 == null) {
                this.post_button_shadow_color = "";
            } else {
                this.post_button_shadow_color = str6;
            }
            String str7 = builder.module1_bg_color;
            if (str7 == null) {
                this.module1_bg_color = "";
            } else {
                this.module1_bg_color = str7;
            }
            String str8 = builder.module2_bg_color;
            if (str8 == null) {
                this.module2_bg_color = "";
            } else {
                this.module2_bg_color = str8;
            }
            String str9 = builder.module3_bg_color;
            if (str9 == null) {
                this.module3_bg_color = "";
            } else {
                this.module3_bg_color = str9;
            }
            String str10 = builder.module4_bg_color;
            if (str10 == null) {
                this.module4_bg_color = "";
            } else {
                this.module4_bg_color = str10;
            }
            String str11 = builder.at_font_color;
            if (str11 == null) {
                this.at_font_color = "";
                return;
            } else {
                this.at_font_color = str11;
                return;
            }
        }
        this.theme_color = builder.theme_color;
        this.ball_bg_color = builder.ball_bg_color;
        this.tab_line_color = builder.tab_line_color;
        this.tag_color = builder.tag_color;
        this.post_button_color = builder.post_button_color;
        this.post_button_shadow_color = builder.post_button_shadow_color;
        this.module1_bg_color = builder.module1_bg_color;
        this.module2_bg_color = builder.module2_bg_color;
        this.module3_bg_color = builder.module3_bg_color;
        this.module4_bg_color = builder.module4_bg_color;
        this.at_font_color = builder.at_font_color;
    }
}
