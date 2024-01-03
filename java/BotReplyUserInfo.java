package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BotReplyUserInfo extends Message {
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BotReplyUserInfo> {
        public String icon_url;
        public String name;
        public String portrait_url;

        public Builder() {
        }

        public Builder(BotReplyUserInfo botReplyUserInfo) {
            super(botReplyUserInfo);
            if (botReplyUserInfo == null) {
                return;
            }
            this.portrait_url = botReplyUserInfo.portrait_url;
            this.name = botReplyUserInfo.name;
            this.icon_url = botReplyUserInfo.icon_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BotReplyUserInfo build(boolean z) {
            return new BotReplyUserInfo(this, z);
        }
    }

    public BotReplyUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.portrait_url;
            if (str == null) {
                this.portrait_url = "";
            } else {
                this.portrait_url = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.icon_url;
            if (str3 == null) {
                this.icon_url = "";
                return;
            } else {
                this.icon_url = str3;
                return;
            }
        }
        this.portrait_url = builder.portrait_url;
        this.name = builder.name;
        this.icon_url = builder.icon_url;
    }
}
