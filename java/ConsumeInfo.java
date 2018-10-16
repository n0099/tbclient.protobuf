package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
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

    private ConsumeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.content == null) {
                this.content = "";
                return;
            } else {
                this.content = builder.content;
                return;
            }
        }
        this.icon = builder.icon;
        this.title = builder.title;
        this.content = builder.content;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ConsumeInfo> {
        public String content;
        public String icon;
        public String title;

        public Builder() {
        }

        public Builder(ConsumeInfo consumeInfo) {
            super(consumeInfo);
            if (consumeInfo != null) {
                this.icon = consumeInfo.icon;
                this.title = consumeInfo.title;
                this.content = consumeInfo.content;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConsumeInfo build(boolean z) {
            return new ConsumeInfo(this, z);
        }
    }
}
