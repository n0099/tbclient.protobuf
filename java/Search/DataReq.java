package tbclient.Search;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_APPLY_ID = 0;
    public static final Long DEFAULT_FID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer apply_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1340common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long fid;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer apply_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1341common;
        public Long fid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1341common = dataReq.f1340common;
            this.apply_id = dataReq.apply_id;
            this.fid = dataReq.fid;
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
            this.f1340common = builder.f1341common;
            Integer num = builder.apply_id;
            if (num == null) {
                this.apply_id = DEFAULT_APPLY_ID;
            } else {
                this.apply_id = num;
            }
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
                return;
            } else {
                this.fid = l;
                return;
            }
        }
        this.f1340common = builder.f1341common;
        this.apply_id = builder.apply_id;
        this.fid = builder.fid;
    }
}
