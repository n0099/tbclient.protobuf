package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class JumpLinkInfo extends Message {
    public static final String DEFAULT_BACKGROUND_COLOR = "";
    public static final String DEFAULT_LINK_COLOR = "";
    public static final String DEFAULT_LINK_ICON = "";
    public static final String DEFAULT_LINK_TEXT = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_TITLE_COLOR = "";
    public static final String DEFAULT_TITLE_ICON = "";
    public static final String DEFAULT_TITLE_TEXT = "";
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String background_color;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String link_color;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title_text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<JumpLinkInfo> {
        public String background_color;
        public String link_color;
        public String link_icon;
        public String link_text;
        public String link_url;
        public String title_color;
        public String title_icon;
        public String title_text;

        public Builder() {
        }

        public Builder(JumpLinkInfo jumpLinkInfo) {
            super(jumpLinkInfo);
            if (jumpLinkInfo == null) {
                return;
            }
            this.title_icon = jumpLinkInfo.title_icon;
            this.title_text = jumpLinkInfo.title_text;
            this.title_color = jumpLinkInfo.title_color;
            this.link_icon = jumpLinkInfo.link_icon;
            this.link_text = jumpLinkInfo.link_text;
            this.link_color = jumpLinkInfo.link_color;
            this.link_url = jumpLinkInfo.link_url;
            this.background_color = jumpLinkInfo.background_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public JumpLinkInfo build(boolean z) {
            return new JumpLinkInfo(this, z);
        }
    }

    public JumpLinkInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title_icon;
            if (str == null) {
                this.title_icon = "";
            } else {
                this.title_icon = str;
            }
            String str2 = builder.title_text;
            if (str2 == null) {
                this.title_text = "";
            } else {
                this.title_text = str2;
            }
            String str3 = builder.title_color;
            if (str3 == null) {
                this.title_color = "";
            } else {
                this.title_color = str3;
            }
            String str4 = builder.link_icon;
            if (str4 == null) {
                this.link_icon = "";
            } else {
                this.link_icon = str4;
            }
            String str5 = builder.link_text;
            if (str5 == null) {
                this.link_text = "";
            } else {
                this.link_text = str5;
            }
            String str6 = builder.link_color;
            if (str6 == null) {
                this.link_color = "";
            } else {
                this.link_color = str6;
            }
            String str7 = builder.link_url;
            if (str7 == null) {
                this.link_url = "";
            } else {
                this.link_url = str7;
            }
            String str8 = builder.background_color;
            if (str8 == null) {
                this.background_color = "";
                return;
            } else {
                this.background_color = str8;
                return;
            }
        }
        this.title_icon = builder.title_icon;
        this.title_text = builder.title_text;
        this.title_color = builder.title_color;
        this.link_icon = builder.link_icon;
        this.link_text = builder.link_text;
        this.link_color = builder.link_color;
        this.link_url = builder.link_url;
        this.background_color = builder.background_color;
    }
}
