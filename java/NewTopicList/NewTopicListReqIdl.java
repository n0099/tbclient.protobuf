package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class NewTopicListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NewTopicListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(NewTopicListReqIdl newTopicListReqIdl) {
            super(newTopicListReqIdl);
            if (newTopicListReqIdl == null) {
                return;
            }
            this.data = newTopicListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewTopicListReqIdl build(boolean z) {
            return new NewTopicListReqIdl(this, z);
        }
    }

    public NewTopicListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
