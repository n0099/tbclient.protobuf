package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class DataReq extends Message {
    public static final List<MsgRecord> DEFAULT_RECORDS = Collections.emptyList();
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5142common;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<MsgRecord> records;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5142common = builder.f5143common;
            if (builder.records == null) {
                this.records = DEFAULT_RECORDS;
                return;
            } else {
                this.records = immutableCopyOf(builder.records);
                return;
            }
        }
        this.f5142common = builder.f5143common;
        this.records = immutableCopyOf(builder.records);
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5143common;
        public List<MsgRecord> records;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5143common = dataReq.f5142common;
                this.records = DataReq.copyOf(dataReq.records);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
