package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class MsgRecord extends Message {
    public static final String DEFAULT_TASK_IDS = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String task_ids;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    private MsgRecord(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.task_ids == null) {
                this.task_ids = "";
                return;
            } else {
                this.task_ids = builder.task_ids;
                return;
            }
        }
        this.type = builder.type;
        this.task_ids = builder.task_ids;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<MsgRecord> {
        public String task_ids;
        public Integer type;

        public Builder() {
        }

        public Builder(MsgRecord msgRecord) {
            super(msgRecord);
            if (msgRecord != null) {
                this.type = msgRecord.type;
                this.task_ids = msgRecord.task_ids;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MsgRecord build(boolean z) {
            return new MsgRecord(this, z);
        }
    }
}
