package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FeedContentCustom extends Message {
    public static final String DEFAULT_DATA = "";
    public static final String DEFAULT_STYLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String data;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String style;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedContentCustom> {
        public String data;
        public String style;

        public Builder() {
        }

        public Builder(FeedContentCustom feedContentCustom) {
            super(feedContentCustom);
            if (feedContentCustom == null) {
                return;
            }
            this.style = feedContentCustom.style;
            this.data = feedContentCustom.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedContentCustom build(boolean z) {
            return new FeedContentCustom(this, z);
        }
    }

    public FeedContentCustom(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.style;
            if (str == null) {
                this.style = "";
            } else {
                this.style = str;
            }
            String str2 = builder.data;
            if (str2 == null) {
                this.data = "";
                return;
            } else {
                this.data = str2;
                return;
            }
        }
        this.style = builder.style;
        this.data = builder.data;
    }
}
