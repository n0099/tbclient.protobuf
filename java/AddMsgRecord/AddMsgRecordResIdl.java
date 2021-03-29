package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class AddMsgRecordResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AddMsgRecordResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AddMsgRecordResIdl addMsgRecordResIdl) {
            super(addMsgRecordResIdl);
            if (addMsgRecordResIdl == null) {
                return;
            }
            this.error = addMsgRecordResIdl.error;
            this.data = addMsgRecordResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddMsgRecordResIdl build(boolean z) {
            return new AddMsgRecordResIdl(this, z);
        }
    }

    public AddMsgRecordResIdl(Builder builder, boolean z) {
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
