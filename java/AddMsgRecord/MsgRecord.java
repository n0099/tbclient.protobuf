package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class MsgRecord extends Message {
    public static final String DEFAULT_TASK_IDS = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String task_ids;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<MsgRecord> {
        public String task_ids;
        public Integer type;

        public Builder() {
        }

        public Builder(MsgRecord msgRecord) {
            super(msgRecord);
            if (msgRecord == null) {
                return;
            }
            this.type = msgRecord.type;
            this.task_ids = msgRecord.task_ids;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MsgRecord build(boolean z) {
            return new MsgRecord(this, z);
        }
    }

    public MsgRecord(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.task_ids;
            if (str == null) {
                this.task_ids = "";
                return;
            } else {
                this.task_ids = str;
                return;
            }
        }
        this.type = builder.type;
        this.task_ids = builder.task_ids;
    }
}
