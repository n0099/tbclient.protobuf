package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes16.dex */
public final class NewTopicListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private NewTopicListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<NewTopicListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(NewTopicListResIdl newTopicListResIdl) {
            super(newTopicListResIdl);
            if (newTopicListResIdl != null) {
                this.error = newTopicListResIdl.error;
                this.data = newTopicListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewTopicListResIdl build(boolean z) {
            return new NewTopicListResIdl(this, z);
        }
    }
}
