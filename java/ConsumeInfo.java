package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ConsumeInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ConsumeInfo> {
        public String content;
        public String icon;
        public String title;

        public Builder() {
        }

        public Builder(ConsumeInfo consumeInfo) {
            super(consumeInfo);
            if (consumeInfo == null) {
                return;
            }
            this.icon = consumeInfo.icon;
            this.title = consumeInfo.title;
            this.content = consumeInfo.content;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConsumeInfo build(boolean z) {
            return new ConsumeInfo(this, z);
        }
    }

    public ConsumeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
                return;
            } else {
                this.content = str3;
                return;
            }
        }
        this.icon = builder.icon;
        this.title = builder.title;
        this.content = builder.content;
    }
}
