package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AiChatCard extends Message {
    public static final String DEFAULT_BTN_LINK = "";
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SUBTITLE_TEXT = "";
    public static final String DEFAULT_TITLE_ICON = "";
    public static final String DEFAULT_TITLE_TEXT = "";
    public static final String DEFAULT_UK = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String btn_link;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String subtitle_text;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String title_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String uk;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AiChatCard> {
        public String btn_link;
        public String btn_text;
        public String portrait;
        public String subtitle_text;
        public String title_icon;
        public String title_text;
        public String uk;

        public Builder() {
        }

        public Builder(AiChatCard aiChatCard) {
            super(aiChatCard);
            if (aiChatCard == null) {
                return;
            }
            this.portrait = aiChatCard.portrait;
            this.title_text = aiChatCard.title_text;
            this.subtitle_text = aiChatCard.subtitle_text;
            this.btn_text = aiChatCard.btn_text;
            this.btn_link = aiChatCard.btn_link;
            this.title_icon = aiChatCard.title_icon;
            this.uk = aiChatCard.uk;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AiChatCard build(boolean z) {
            return new AiChatCard(this, z);
        }
    }

    public AiChatCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.title_text;
            if (str2 == null) {
                this.title_text = "";
            } else {
                this.title_text = str2;
            }
            String str3 = builder.subtitle_text;
            if (str3 == null) {
                this.subtitle_text = "";
            } else {
                this.subtitle_text = str3;
            }
            String str4 = builder.btn_text;
            if (str4 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str4;
            }
            String str5 = builder.btn_link;
            if (str5 == null) {
                this.btn_link = "";
            } else {
                this.btn_link = str5;
            }
            String str6 = builder.title_icon;
            if (str6 == null) {
                this.title_icon = "";
            } else {
                this.title_icon = str6;
            }
            String str7 = builder.uk;
            if (str7 == null) {
                this.uk = "";
                return;
            } else {
                this.uk = str7;
                return;
            }
        }
        this.portrait = builder.portrait;
        this.title_text = builder.title_text;
        this.subtitle_text = builder.subtitle_text;
        this.btn_text = builder.btn_text;
        this.btn_link = builder.btn_link;
        this.title_icon = builder.title_icon;
        this.uk = builder.uk;
    }
}
