package tbclient.GetUserByTiebaUid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_UID = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72742common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_uid;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72743common;
        public String tieba_uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72743common = dataReq.f72742common;
            this.tieba_uid = dataReq.tieba_uid;
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
            this.f72742common = builder.f72743common;
            String str = builder.tieba_uid;
            if (str == null) {
                this.tieba_uid = "";
                return;
            } else {
                this.tieba_uid = str;
                return;
            }
        }
        this.f72742common = builder.f72743common;
        this.tieba_uid = builder.tieba_uid;
    }
}
