package tbclient.Search;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes20.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_APPLY_ID = 0;
    public static final Long DEFAULT_FID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer apply_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5344common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long fid;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5344common = builder.f5345common;
            if (builder.apply_id == null) {
                this.apply_id = DEFAULT_APPLY_ID;
            } else {
                this.apply_id = builder.apply_id;
            }
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
                return;
            } else {
                this.fid = builder.fid;
                return;
            }
        }
        this.f5344common = builder.f5345common;
        this.apply_id = builder.apply_id;
        this.fid = builder.fid;
    }

    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer apply_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5345common;
        public Long fid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5345common = dataReq.f5344common;
                this.apply_id = dataReq.apply_id;
                this.fid = dataReq.fid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
