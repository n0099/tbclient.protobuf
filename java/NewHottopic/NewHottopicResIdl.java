package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes22.dex */
public final class NewHottopicResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private NewHottopicResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<NewHottopicResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(NewHottopicResIdl newHottopicResIdl) {
            super(newHottopicResIdl);
            if (newHottopicResIdl != null) {
                this.error = newHottopicResIdl.error;
                this.data = newHottopicResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewHottopicResIdl build(boolean z) {
            return new NewHottopicResIdl(this, z);
        }
    }
}
