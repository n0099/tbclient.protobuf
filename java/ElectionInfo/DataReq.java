package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1136common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long fid;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer rn;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_PN = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1137common;
        public Long fid;
        public Integer pn;
        public Integer rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1137common = dataReq.f1136common;
            this.fid = dataReq.fid;
            this.rn = dataReq.rn;
            this.pn = dataReq.pn;
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
            this.f1136common = builder.f1137common;
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l;
            }
            Integer num = builder.rn;
            if (num == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = num2;
                return;
            }
        }
        this.f1136common = builder.f1137common;
        this.fid = builder.fid;
        this.rn = builder.rn;
        this.pn = builder.pn;
    }
}
