package tbclient.GetDislikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14505common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14505common = builder.f14506common;
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
                return;
            } else {
                this.rn = builder.rn;
                return;
            }
        }
        this.f14505common = builder.f14506common;
        this.user_id = builder.user_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14506common;
        public Integer pn;
        public Integer rn;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14506common = dataReq.f14505common;
                this.user_id = dataReq.user_id;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
