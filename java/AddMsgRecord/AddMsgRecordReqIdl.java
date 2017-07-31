package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AddMsgRecordReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private AddMsgRecordReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AddMsgRecordReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AddMsgRecordReqIdl addMsgRecordReqIdl) {
            super(addMsgRecordReqIdl);
            if (addMsgRecordReqIdl != null) {
                this.data = addMsgRecordReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddMsgRecordReqIdl build(boolean z) {
            return new AddMsgRecordReqIdl(this, z);
        }
    }
}
