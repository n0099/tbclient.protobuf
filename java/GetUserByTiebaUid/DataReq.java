package tbclient.GetUserByTiebaUid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_UID = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1408common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_uid;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1409common;
        public String tieba_uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1409common = dataReq.f1408common;
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
            this.f1408common = builder.f1409common;
            String str = builder.tieba_uid;
            if (str == null) {
                this.tieba_uid = "";
                return;
            } else {
                this.tieba_uid = str;
                return;
            }
        }
        this.f1408common = builder.f1409common;
        this.tieba_uid = builder.tieba_uid;
    }
}
