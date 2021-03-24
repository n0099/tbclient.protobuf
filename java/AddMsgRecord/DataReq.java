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

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68309common;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<MsgRecord> records;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68310common;
        public List<MsgRecord> records;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68310common = dataReq.f68309common;
            this.records = Message.copyOf(dataReq.records);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f68309common = builder.f68310common;
            List<MsgRecord> list = builder.records;
            if (list == null) {
                this.records = DEFAULT_RECORDS;
                return;
            } else {
                this.records = Message.immutableCopyOf(list);
                return;
            }
        }
        this.f68309common = builder.f68310common;
        this.records = Message.immutableCopyOf(builder.records);
    }
}
