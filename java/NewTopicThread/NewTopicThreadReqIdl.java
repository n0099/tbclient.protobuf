package tbclient.NewTopicThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class NewTopicThreadReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NewTopicThreadReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(NewTopicThreadReqIdl newTopicThreadReqIdl) {
            super(newTopicThreadReqIdl);
            if (newTopicThreadReqIdl == null) {
                return;
            }
            this.data = newTopicThreadReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewTopicThreadReqIdl build(boolean z) {
            return new NewTopicThreadReqIdl(this, z);
        }
    }

    public NewTopicThreadReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
