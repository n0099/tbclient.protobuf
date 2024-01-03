package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AiChatBotInfo;
/* loaded from: classes2.dex */
public final class AiChatroomGuide extends Message {
    public static final String DEFAULT_BG_TOP_ANIMATION_URL = "";
    public static final List<AiChatBotInfo> DEFAULT_BOT_LIST = Collections.emptyList();
    public static final String DEFAULT_BUTTON_URL = "";
    public static final String DEFAULT_GUIDE_TEXT = "";
    public static final String DEFAULT_H5_URL = "";
    public static final String DEFAULT_NEW_BOT_GUIDE_TEXT = "";
    public static final String DEFAULT_TITLE_IMG = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String bg_top_animation_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<AiChatBotInfo> bot_list;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String button_url;
    @ProtoField(tag = 9)
    public final AiChatBotInfo default_bot_info;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String guide_text;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String h5_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String new_bot_guide_text;
    @ProtoField(tag = 3)
    public final AiChatBotInfo new_bot_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title_img;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AiChatroomGuide> {
        public String bg_top_animation_url;
        public List<AiChatBotInfo> bot_list;
        public String button_url;
        public AiChatBotInfo default_bot_info;
        public String guide_text;
        public String h5_url;
        public String new_bot_guide_text;
        public AiChatBotInfo new_bot_info;
        public String title_img;

        public Builder() {
        }

        public Builder(AiChatroomGuide aiChatroomGuide) {
            super(aiChatroomGuide);
            if (aiChatroomGuide == null) {
                return;
            }
            this.guide_text = aiChatroomGuide.guide_text;
            this.new_bot_guide_text = aiChatroomGuide.new_bot_guide_text;
            this.new_bot_info = aiChatroomGuide.new_bot_info;
            this.title_img = aiChatroomGuide.title_img;
            this.button_url = aiChatroomGuide.button_url;
            this.bg_top_animation_url = aiChatroomGuide.bg_top_animation_url;
            this.bot_list = Message.copyOf(aiChatroomGuide.bot_list);
            this.h5_url = aiChatroomGuide.h5_url;
            this.default_bot_info = aiChatroomGuide.default_bot_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AiChatroomGuide build(boolean z) {
            return new AiChatroomGuide(this, z);
        }
    }

    public AiChatroomGuide(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.guide_text;
            if (str == null) {
                this.guide_text = "";
            } else {
                this.guide_text = str;
            }
            String str2 = builder.new_bot_guide_text;
            if (str2 == null) {
                this.new_bot_guide_text = "";
            } else {
                this.new_bot_guide_text = str2;
            }
            this.new_bot_info = builder.new_bot_info;
            String str3 = builder.title_img;
            if (str3 == null) {
                this.title_img = "";
            } else {
                this.title_img = str3;
            }
            String str4 = builder.button_url;
            if (str4 == null) {
                this.button_url = "";
            } else {
                this.button_url = str4;
            }
            String str5 = builder.bg_top_animation_url;
            if (str5 == null) {
                this.bg_top_animation_url = "";
            } else {
                this.bg_top_animation_url = str5;
            }
            List<AiChatBotInfo> list = builder.bot_list;
            if (list == null) {
                this.bot_list = DEFAULT_BOT_LIST;
            } else {
                this.bot_list = Message.immutableCopyOf(list);
            }
            String str6 = builder.h5_url;
            if (str6 == null) {
                this.h5_url = "";
            } else {
                this.h5_url = str6;
            }
            this.default_bot_info = builder.default_bot_info;
            return;
        }
        this.guide_text = builder.guide_text;
        this.new_bot_guide_text = builder.new_bot_guide_text;
        this.new_bot_info = builder.new_bot_info;
        this.title_img = builder.title_img;
        this.button_url = builder.button_url;
        this.bg_top_animation_url = builder.bg_top_animation_url;
        this.bot_list = Message.immutableCopyOf(builder.bot_list);
        this.h5_url = builder.h5_url;
        this.default_bot_info = builder.default_bot_info;
    }
}
