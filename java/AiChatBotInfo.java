package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AiChatBotInfo extends Message {
    public static final String DEFAULT_BACKGROUND_URL = "";
    public static final String DEFAULT_NAME = "";
    public static final Long DEFAULT_PA = 0L;
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PROLOGUE = "";
    public static final String DEFAULT_UK = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String background_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long pa;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String prologue;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String uk;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AiChatBotInfo> {
        public String background_url;
        public String name;
        public Long pa;
        public String portrait;
        public String prologue;
        public String uk;

        public Builder() {
        }

        public Builder(AiChatBotInfo aiChatBotInfo) {
            super(aiChatBotInfo);
            if (aiChatBotInfo == null) {
                return;
            }
            this.uk = aiChatBotInfo.uk;
            this.pa = aiChatBotInfo.pa;
            this.name = aiChatBotInfo.name;
            this.portrait = aiChatBotInfo.portrait;
            this.background_url = aiChatBotInfo.background_url;
            this.prologue = aiChatBotInfo.prologue;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AiChatBotInfo build(boolean z) {
            return new AiChatBotInfo(this, z);
        }
    }

    public AiChatBotInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.uk;
            if (str == null) {
                this.uk = "";
            } else {
                this.uk = str;
            }
            Long l = builder.pa;
            if (l == null) {
                this.pa = DEFAULT_PA;
            } else {
                this.pa = l;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            String str4 = builder.background_url;
            if (str4 == null) {
                this.background_url = "";
            } else {
                this.background_url = str4;
            }
            String str5 = builder.prologue;
            if (str5 == null) {
                this.prologue = "";
                return;
            } else {
                this.prologue = str5;
                return;
            }
        }
        this.uk = builder.uk;
        this.pa = builder.pa;
        this.name = builder.name;
        this.portrait = builder.portrait;
        this.background_url = builder.background_url;
        this.prologue = builder.prologue;
    }
}
