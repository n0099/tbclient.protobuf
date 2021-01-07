package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14742common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long fid;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer rn;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_PN = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14742common = builder.f14743common;
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = builder.fid;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = builder.pn;
                return;
            }
        }
        this.f14742common = builder.f14743common;
        this.fid = builder.fid;
        this.rn = builder.rn;
        this.pn = builder.pn;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14743common;
        public Long fid;
        public Integer pn;
        public Integer rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14743common = dataReq.f14742common;
                this.fid = dataReq.fid;
                this.rn = dataReq.rn;
                this.pn = dataReq.pn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
