package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes6.dex */
public final class ElectionInfoResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private ElectionInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<ElectionInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ElectionInfoResIdl electionInfoResIdl) {
            super(electionInfoResIdl);
            if (electionInfoResIdl != null) {
                this.error = electionInfoResIdl.error;
                this.data = electionInfoResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ElectionInfoResIdl build(boolean z) {
            return new ElectionInfoResIdl(this, z);
        }
    }
}
