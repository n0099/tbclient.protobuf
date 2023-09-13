package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_HISTORY = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1339common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String history;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1340common;
        public String history;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1340common = dataReq.f1339common;
            this.history = dataReq.history;
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
            this.f1339common = builder.f1340common;
            String str = builder.history;
            if (str == null) {
                this.history = "";
                return;
            } else {
                this.history = str;
                return;
            }
        }
        this.f1339common = builder.f1340common;
        this.history = builder.history;
    }
}
