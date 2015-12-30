package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final List<MsgRecord> DEFAULT_RECORDS = Collections.emptyList();
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<MsgRecord> records;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.records == null) {
                this.records = DEFAULT_RECORDS;
                return;
            } else {
                this.records = immutableCopyOf(builder.records);
                return;
            }
        }
        this.common = builder.common;
        this.records = immutableCopyOf(builder.records);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public List<MsgRecord> records;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.records = DataReq.copyOf(dataReq.records);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
