package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_HISTORY = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1082common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String history;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1082common = builder.f1083common;
            if (builder.history == null) {
                this.history = "";
                return;
            } else {
                this.history = builder.history;
                return;
            }
        }
        this.f1082common = builder.f1083common;
        this.history = builder.history;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1083common;
        public String history;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1083common = dataReq.f1082common;
                this.history = dataReq.history;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
