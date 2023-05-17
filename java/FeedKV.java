package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FeedKV extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String value;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeedKV> {
        public String key;
        public String value;

        public Builder() {
        }

        public Builder(FeedKV feedKV) {
            super(feedKV);
            if (feedKV == null) {
                return;
            }
            this.key = feedKV.key;
            this.value = feedKV.value;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedKV build(boolean z) {
            return new FeedKV(this, z);
        }
    }

    public FeedKV(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.key;
            if (str == null) {
                this.key = "";
            } else {
                this.key = str;
            }
            String str2 = builder.value;
            if (str2 == null) {
                this.value = "";
                return;
            } else {
                this.value = str2;
                return;
            }
        }
        this.key = builder.key;
        this.value = builder.value;
    }
}
