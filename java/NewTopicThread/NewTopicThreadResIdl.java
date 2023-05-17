package tbclient.NewTopicThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class NewTopicThreadResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<NewTopicThreadResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(NewTopicThreadResIdl newTopicThreadResIdl) {
            super(newTopicThreadResIdl);
            if (newTopicThreadResIdl == null) {
                return;
            }
            this.error = newTopicThreadResIdl.error;
            this.data = newTopicThreadResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewTopicThreadResIdl build(boolean z) {
            return new NewTopicThreadResIdl(this, z);
        }
    }

    public NewTopicThreadResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
