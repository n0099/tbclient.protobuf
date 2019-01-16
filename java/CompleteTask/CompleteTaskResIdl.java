package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes4.dex */
public final class CompleteTaskResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private CompleteTaskResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<CompleteTaskResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(CompleteTaskResIdl completeTaskResIdl) {
            super(completeTaskResIdl);
            if (completeTaskResIdl != null) {
                this.error = completeTaskResIdl.error;
                this.data = completeTaskResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CompleteTaskResIdl build(boolean z) {
            return new CompleteTaskResIdl(this, z);
        }
    }
}